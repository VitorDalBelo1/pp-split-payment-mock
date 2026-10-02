package br.gov.serpro.ppsplit.resource;

import br.gov.serpro.ppsplit.mock.MockResponses;
import com.fasterxml.jackson.databind.JsonNode;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SegregacaoResource {

    @POST
    @Path("/segregacao")
    public Response postSegregacao(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/segregacao/finalizacao")
    public Response postFinalizacao(JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/boleto/segregacao/{idInfSegr}/lotes")
    public Response postBoletoLote(@PathParam("idInfSegr") String idInfSegr, JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-automatico/segregacao/{idInfSegr}/lotes")
    public Response postPixAutomaticoLote(@PathParam("idInfSegr") String idInfSegr, JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-dinamico/segregacao/{idInfSegr}/lotes")
    public Response postPixDinamicoLote(@PathParam("idInfSegr") String idInfSegr, JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/pix-estatico/segregacao/{idInfSegr}/lotes")
    public Response postPixEstaticoLote(@PathParam("idInfSegr") String idInfSegr, JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/ted/segregacao/{idInfSegr}/lotes")
    public Response postTedLote(@PathParam("idInfSegr") String idInfSegr, JsonNode body) {
        return MockResponses.ok();
    }

    @POST
    @Path("/tef/segregacao/{idInfSegr}/lotes")
    public Response postTefLote(@PathParam("idInfSegr") String idInfSegr, JsonNode body) {
        return MockResponses.ok();
    }
}
