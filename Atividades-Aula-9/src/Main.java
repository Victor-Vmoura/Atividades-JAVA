import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(100))
                .build();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Livro que você deseja Buscar...");
        String tituloLivro = input.next();

        String tituloCodificado = URLEncoder.encode(tituloLivro, StandardCharsets.UTF_8);
        String urlApi = "https://www.googleapis.com/books/v1/volumes?q=" + tituloCodificado;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlApi))
                .GET()
                .build();

        System.out.println("Buscando Seu livro...");


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());




    }
}