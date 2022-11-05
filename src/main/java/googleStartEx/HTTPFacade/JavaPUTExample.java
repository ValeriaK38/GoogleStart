package googleStartEx.HTTPFacade;

import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class JavaPUTExample {

    public String putRequest() throws IOException {

        HttpPut putRequest = new HttpPut("https://reqres.in/api/users/2");
        String result = "";

        UserHTTPRequest myUserTRequest = new UserHTTPRequest("morpheus", "zion resident");
        final String messageContent = myUserTRequest.getUserJsonString();
        StringEntity entity = new StringEntity(messageContent, ContentType.APPLICATION_JSON);

        putRequest.setEntity(entity);

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(putRequest)){

            result = EntityUtils.toString(response.getEntity());
            if(response.getCode() == 200){
                return result;
            }
            else {
                return "PUT Request did not work.";
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}