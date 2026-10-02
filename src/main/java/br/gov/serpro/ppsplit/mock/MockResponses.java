package br.gov.serpro.ppsplit.mock;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import jakarta.ws.rs.core.Response;

public final class MockResponses {

    private MockResponses() {
    }

    public static Response ok() {
        return Response.ok(Map.of(
                "title", "Sucesso",
                "status", 200,
                "detail", "Solicitação processada com sucesso",
                "numValidos", 1,
                "numErros", 0,
                "errors", List.of(),
                "resourceId", "UEkBbgR-78VqKK-uvuq9O0r9-bqXyBH9Ur"
        )).build();
    }

    public static Response stream(String arranjo) {
        return Response.ok(Map.of("transacoes", List.of(transacao(arranjo))))
                .header("streamId", UUID.randomUUID().toString())
                .header("proximoToken", "mock-proximo-token")
                .build();
    }

    public static Response moc() {
        return Response.ok(Map.of("ocorrencias", List.of(Map.of(
                "arrj", "BOL",
                "idDda", "123A512312312312FAS1",
                "numIdentcBaixa", "1",
                "vlPago", 10.02,
                "vlCbsSegr", 10.02,
                "vlIbsSegr", 10.02,
                "docFiscal", "1234567890123456789B123A5678901234567891123412345",
                "cnpjRaizPspRecDir", "12345678"
        )))).build();
    }

    private static Map<String, Object> transacao(String arranjo) {
        return Map.of(
                "codMsg", "RSI",
                "nsuId", "1234567890123456789",
                "dtHrDisp", "2026-03-20T10:33:46-03:00",
                "idDda", "123A512312312312FAS1",
                "numCtrlOrig", "123A512312312312FAS1",
                "vlInf", 10.02,
                "arrj", arranjo
        );
    }
}
