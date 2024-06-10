package br.alura.screenmatch.Principal;

import br.alura.screenmatch.modelos.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import static java.net.http.HttpClient.newHttpClient;

public class PrincipalBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual filme quer pesquisar?");
        String busca = leitura.nextLine();
        var endereco = "https://www.omdbapi.com/?t=" +busca+ "&apikey=438f5d24";

        HttpClient cliente = newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = cliente
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new Gson();
        Title titulo = gson.fromJson(json, Title.class);
        System.out.println(titulo);
    }
}
