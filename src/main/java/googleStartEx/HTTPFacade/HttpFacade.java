package googleStartEx.HTTPFacade;


import java.io.IOException;


public class HttpFacade {

    private JavaGETExample getObj = new JavaGETExample();
    private JavaPOSTExample postObj = new JavaPOSTExample();
    private JavaPUTExample putObj = new JavaPUTExample();
    private JavaPATCHExample patchObj = new JavaPATCHExample();
    private JavaDELETEExample deleteObj = new JavaDELETEExample();
    public void getRequest() throws IOException {
        String response = getObj.getRequest();
        if (response.equals("Bad request")) {
            System.out.println("Error 400 - Bad request status code");
        } else {
            System.out.println(response);
        }
    }

    public void postRequest() throws IOException {
        String response = postObj.postRequest();
        if (response.equals("POST Request did not work.")) {
            System.out.println("Error 400 - POST Request did not work.");
        } else {
            System.out.println(response);
        }
    }

    public void putRequest() throws IOException {
        String response = putObj.putRequest();
        if (response.equals("PUT Request did not work.")) {
            System.out.println("Error 400 - PUT Request did not work.");
        } else {
            System.out.println(response);
        }
    }

    public void deleteRequest()throws IOException {
        String response = deleteObj.deleteRequest();
        if (response.equals("Delete Request did not work.")) {
            System.out.println("Error 400 - Delete Request did not work.");
        } else {
            System.out.println("Successfully deleted ! 204!");
        }
    }

    public void patchRequest() throws IOException {
        String response = patchObj.patchRequest();
        if (response.equals("PATCH Request did not work.")) {
            System.out.println("Error 400 - PATCH Request did not work.");
        } else {
            System.out.println(response);
        }
    }



}
