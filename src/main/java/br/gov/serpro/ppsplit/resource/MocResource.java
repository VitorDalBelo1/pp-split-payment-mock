package br.gov.serpro.ppsplit.resource;

import br.gov.serpro.ppsplit.mock.MockResponses;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
public class MocResource {

    @POST
    @Path("/moc/solicitacao")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postSolicitacao(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/moc/notificacao")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postNotificacao(JsonNode body) {
        return MockResponses.ok();
    }

    @GET
    @Path("/moc/{cnpjRaizPspRecDir}/ocorrencias")
    public Response getOcorrencias(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.moc();
    }
}
