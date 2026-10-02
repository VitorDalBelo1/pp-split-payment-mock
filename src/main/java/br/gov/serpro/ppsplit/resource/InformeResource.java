package br.gov.serpro.ppsplit.resource;

import br.gov.serpro.ppsplit.mock.MockResponses;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InformeResource {

    @POST
    @Path("/boleto")
    public Response postBoleto(JsonNode body) {
        return MockResponses.ok();
    }

    @PATCH
    @Path("/boleto")
    public Response patchBoleto(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-automatico")
    public Response postPixAutomatico(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-dinamico")
    public Response postPixDinamico(JsonNode body) {
        return MockResponses.ok();
    }

    @PATCH
    @Path("/pix-dinamico")
    public Response patchPixDinamico(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/boleto/informe-preliminar-pagamento")
    public Response postBoletoPreliminar(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-automatico/informe-preliminar-pagamento")
    public Response postPixAutomaticoPreliminar(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-dinamico/informe-preliminar-pagamento")
    public Response postPixDinamicoPreliminar(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-estatico/informe-preliminar-pagamento")
    public Response postPixEstaticoPreliminar(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/ted/informe-preliminar-pagamento")
    public Response postTedPreliminar(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/tef/informe-preliminar-pagamento")
    public Response postTefPreliminar(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/boleto/baixa-exceto-pagamento")
    public Response postBoletoBaixa(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-automatico/baixa-exceto-pagamento")
    public Response postPixAutomaticoBaixa(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-dinamico/baixa-exceto-pagamento")
    public Response postPixDinamicoBaixa(JsonNode body) {
        return MockResponses.ok();
    }
}
