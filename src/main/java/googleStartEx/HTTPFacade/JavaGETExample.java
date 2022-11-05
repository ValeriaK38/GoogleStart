package googleStartEx.HTTPFacade;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;

public class JavaGETExample {

    public String getRequest() throws IOException {
//            String urlName = "https://reqres.in/api/users/2";
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {

            HttpGet request = new HttpGet("https://reqres.in/api/users/2");
            CloseableHttpResponse response = httpClient.execute(request);

            try {

                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity);
                if (response.getCode() == 200) {
                    return result;
                } else {
                    return "Error 400 - GET Request did not work.";
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
    }

}