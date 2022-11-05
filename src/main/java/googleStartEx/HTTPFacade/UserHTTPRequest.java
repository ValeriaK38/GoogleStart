package googleStartEx.HTTPFacade;

import com.google.gson.Gson;

public class UserHTTPRequest {
    String name;
    String job;

    public UserHTTPRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getUserJsonString(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }
    @Override
    public String toString() {
        return "UserPostRequest{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }


}
