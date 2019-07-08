package LinkedinLearningPath_Learn.Basics_WebParsing_JSON;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Basics_WebParsing_01_FromInternet {

    private static final String DATA_URL = "http://services.hanselandpetal.com/feeds/flowers.json";

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(new URI(DATA_URL)).GET().build(); //OBJECT CREATION USING BUILDER

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
        System.out.println(response.body());
    }


}
