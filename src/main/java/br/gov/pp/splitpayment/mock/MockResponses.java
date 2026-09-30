package br.gov.pp.splitpayment.mock;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.UUID;

/**
 * Fabrica das respostas de sucesso do mock.
 *
 * Nada aqui valida payload, assina JWS de verdade ou aplica regra de negocio:
 * o objetivo e apenas devolver o "contrato feliz" com os headers previstos no
 * OpenAPI (X-JWS-Signature, streamId, proximoToken).
 */
@ApplicationScoped
public class MockResponses {

    public static final String HEADER_JWS = "X-JWS-Signature";
    public static final String HEADER_STREAM_ID = "streamId";
    public static final String HEADER_PROXIMO_TOKEN = "proximoToken";

    /** Assinatura JWS ficticia - mesmo exemplo publicado no contrato. */
    private static final String JWS_EXEMPLO =
            "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXUyIsImtpZCI6IjIwMjYtMDYta2V5LTEiLCJiNjQiOmZhbHNlLCJjcml0IjpbImI2NCJdfQ"
            + "..dR4M8pVh8kS2b3H1N0aYzQ2vJj5mXw7sK1qP9fL6nE3cU8tI0rB4wD7gF2hL9mN5pQ1sT6uV3xY8zA0bC4dE7w";

    @Inject
    MockStore store;

    @ConfigProperty(name = "mock.delay-ms", defaultValue = "0")
    long delayMs;

    /** 201 Created com corpo vindo de mocks/{mockName}.json */
    public Response created(String mockName) {
        return base(Response.status(Response.Status.CREATED), mockName).build();
    }

    /** 200 OK com corpo vindo de mocks/{mockName}.json */
    public Response ok(String mockName) {
        return base(Response.ok(), mockName).build();
    }

    /** 200 OK de abertura de stream: devolve streamId e proximoToken. */
    public Response streamStart(String mockName) {
        return base(Response.ok(), mockName)
                .header(HEADER_STREAM_ID, "stream-" + UUID.randomUUID())
                .header(HEADER_PROXIMO_TOKEN, novoToken())
                .build();
    }

    /** 200 OK de continuacao de stream: devolve apenas o proximoToken. */
    public Response streamNext(String mockName) {
        return base(Response.ok(), mockName)
                .header(HEADER_PROXIMO_TOKEN, novoToken())
                .build();
    }

    /** 204 No Content (usado no DELETE de stream). */
    public Response noContent() {
        sleep();
        return Response.noContent()
                .header(HEADER_JWS, JWS_EXEMPLO)
                .build();
    }

    private Response.ResponseBuilder base(Response.ResponseBuilder builder, String mockName) {
        sleep();
        return builder
                .entity(store.json(mockName))
                .type(MediaType.APPLICATION_JSON)
                .header(HEADER_JWS, JWS_EXEMPLO);
    }

    private String novoToken() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    private void sleep() {
        if (delayMs <= 0) {
            return;
        }
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
