import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class apiRequest {


    String apikey = "8d417e5c4b366fd6ccd0a0ab";
    String direcc = "https://v6.exchangerate-api.com/v6/"+apikey+"/latest/";


    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(direccion))
            .build();



    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    String json = response.body();
        System.out.println(json);
}
