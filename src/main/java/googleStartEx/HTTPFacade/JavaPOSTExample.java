package googleStartEx.HTTPFacade;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class JavaPOSTExample {
    public String postRequest() throws IOException {

        HttpPost putRequest = new HttpPost("https://reqres.in/api/users");
        String result = "";

        UserHTTPRequest myUserTRequest = new UserHTTPRequest("morpheus", "leader");
        final String messageContent = myUserTRequest.getUserJsonString();
        StringEntity entity = new StringEntity(messageContent, ContentType.APPLICATION_JSON);

        putRequest.setEntity(entity);
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(putRequest)){

            result = EntityUtils.toString(response.getEntity());
            if(response.getCode() == 201){
                return result;
            }
            else {
                return "POST Request did not work.";
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}