package googleStartEx.HTTPFacade;


import org.apache.hc.client5.http.classic.methods.HttpPatch;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;

import java.io.IOException;

public class JavaPATCHExample {
    public String patchRequest() throws IOException {

        HttpPatch patchRequest = new HttpPatch("https://reqres.in/api/users/2");
        String result = "";

        UserHTTPRequest myUserToPostRequest = new UserHTTPRequest("morpheus", "zion resident");
        final String messageContent = myUserToPostRequest.getUserJsonString();
        StringEntity entity = new StringEntity(messageContent, ContentType.APPLICATION_JSON);

        patchRequest.setEntity(entity);

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(patchRequest)){

            result = EntityUtils.toString(response.getEntity());
            if(response.getCode() == 200){
                return result;
            }
            else {
                return "Error 400 - PATCH Request did not work.";
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}