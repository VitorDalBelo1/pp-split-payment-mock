package br.gov.serpro.ppsplit.resource;

import br.gov.serpro.ppsplit.mock.MockResponses;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
public class StreamResource {

    @GET
    @Path("/out/boleto/{cnpjRaizPspRecDir}/transacoes/stream/start")
    public Response outBoletoStart(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.stream("BOL");
    }

    @GET
    @Path("/out/boleto/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response outBoletoToken(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.stream("BOL");
    }

    @DELETE
    @Path("/out/boleto/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response outBoletoDelete(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.ok();
    }

    @GET
    @Path("/out/pix-automatico/{cnpjRaizPspRecDir}/transacoes/stream/start")
    public Response outPixAutomaticoStart(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.stream("PXA");
    }

    @GET
    @Path("/out/pix-automatico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response outPixAutomaticoToken(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.stream("PXA");
    }

    @DELETE
    @Path("/out/pix-automatico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response outPixAutomaticoDelete(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.ok();
    }

    @GET
    @Path("/out/pix-dinamico/{cnpjRaizPspRecDir}/transacoes/stream/start")
    public Response outPixDinamicoStart(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.stream("PXD");
    }

    @GET
    @Path("/out/pix-dinamico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response outPixDinamicoToken(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.stream("PXD");
    }

    @DELETE
    @Path("/out/pix-dinamico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response outPixDinamicoDelete(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.ok();
    }

    @GET
    @Path("/retroativo/boleto/{cnpjRaizPspRecDir}/transacoes/stream/start")
    public Response retroBoletoStart(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.stream("BOL");
    }

    @GET
    @Path("/retroativo/boleto/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response retroBoletoToken(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.stream("BOL");
    }

    @DELETE
    @Path("/retroativo/boleto/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response retroBoletoDelete(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.ok();
    }

    @GET
    @Path("/retroativo/pix-automatico/{cnpjRaizPspRecDir}/transacoes/stream/start")
    public Response retroPixAutomaticoStart(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.stream("PXA");
    }

    @GET
    @Path("/retroativo/pix-automatico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response retroPixAutomaticoToken(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.stream("PXA");
    }

    @DELETE
    @Path("/retroativo/pix-automatico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response retroPixAutomaticoDelete(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.ok();
    }

    @GET
    @Path("/retroativo/pix-dinamico/{cnpjRaizPspRecDir}/transacoes/stream/start")
    public Response retroPixDinamicoStart(@PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir) {
        return MockResponses.stream("PXD");
    }

    @GET
    @Path("/retroativo/pix-dinamico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response retroPixDinamicoToken(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.stream("PXD");
    }

    @DELETE
    @Path("/retroativo/pix-dinamico/{cnpjRaizPspRecDir}/transacoes/stream/{token}")
    public Response retroPixDinamicoDelete(
            @PathParam("cnpjRaizPspRecDir") String cnpjRaizPspRecDir,
            @PathParam("token") String token) {
        return MockResponses.ok();
    }
}
