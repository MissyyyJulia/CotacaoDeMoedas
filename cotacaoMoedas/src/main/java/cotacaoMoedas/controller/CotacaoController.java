package cotacaoMoedas.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import cotacaoMoedas.model.entities.Cotacao;

public class CotacaoController {

    private static final String URLapi = "https://economia.awesomeapi.com.br/json/last/";

    private HttpClient httpClient;
    private ObjectMapper objectMapper; //para converter o json pra um objeto

    public CotacaoController() {
        this.httpClient = HttpClient.newHttpClient();
        this.objectMapper = new ObjectMapper();
    }

    public Cotacao buscarCotacao(String codigoMoeda) throws IOException, InterruptedException {
        String url = URLapi + codigoMoeda.toUpperCase() + "-BRL";

        //request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        //Pega a resposta e transforma em String
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        JsonNode rootNode = objectMapper.readTree(response.body());
        JsonNode cotacaoNode = rootNode.path(codigoMoeda.toUpperCase() + "BRL");

        // Mapeia o JSON para objeto Cotacao
        return objectMapper.treeToValue(cotacaoNode, Cotacao.class);
    }
}
