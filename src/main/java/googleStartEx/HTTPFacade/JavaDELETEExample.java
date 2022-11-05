package googleStartEx.HTTPFacade;

import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;

import java.io.IOException;

public class JavaDELETEExample {
    public String deleteRequest() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpDelete request = new HttpDelete("https://reqres.in/api/users/2");
            CloseableHttpResponse response = httpClient.execute(request);

            if (response.getCode() == 204) {
                return "204 successfully deleted";
            } else {
                return "Error 400 - Delete Request did not work.";
            }
        } finally {
            httpClient.close();
        }
    }

}
