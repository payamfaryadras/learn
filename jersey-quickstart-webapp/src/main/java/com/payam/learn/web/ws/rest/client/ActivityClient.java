package com.payam.learn.web.ws.rest.client;

import com.payam.learn.web.ws.rest.model.Activity;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

public class ActivityClient {

    private Client client;

    public ActivityClient() {
        this.client = ClientBuilder.newClient();
    }

    public Activity get(int activityId) {
        WebTarget target = client.target("http://localhost:8080/exercise_services_war_exploded/webapi/");
        Response response = target.path("activities/" + activityId).request(MediaType.APPLICATION_JSON).get(Response.class);
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new RuntimeException(response.getStatus() + ": there was an error on the server.");
        }
        return response.readEntity(Activity.class);
    }

    public List<Activity> get() {
        WebTarget target = client.target("http://localhost:8080/exercise_services_war_exploded/webapi/");
        return target.path("activities").request(MediaType.APPLICATION_JSON).get(new GenericType<List<Activity>>() {
        });
    }

    public Activity createActivity(Activity activity) {
        WebTarget target = client.target("http://localhost:8080/exercise_services_war_exploded/webapi/");
        Response response = target.path("activities/activity")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.entity(activity, MediaType.APPLICATION_JSON));
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new RuntimeException(response.getStatus() + ": there was an error on the server.");
        }
        return response.readEntity(Activity.class);
    }

    public Activity update(Activity activity) {
        WebTarget target = client.target("http://localhost:8080/exercise_services_war_exploded/webapi/");
        Response response = target.path("activities/" + activity.getId())
                .request(MediaType.APPLICATION_JSON)
                .put(Entity.entity(activity, MediaType.APPLICATION_JSON));
        return response.readEntity(Activity.class);
    }

    public Response delete(String activityId) {
        WebTarget target = client.target("http://localhost:8080/exercise_services_war_exploded/webapi/");
        Response response = target.path("activities/" + activityId).request(MediaType.APPLICATION_JSON).delete();
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new RuntimeException(response.getStatus() + ": there was an error on the server.");
        }
        return response;
    }
}
