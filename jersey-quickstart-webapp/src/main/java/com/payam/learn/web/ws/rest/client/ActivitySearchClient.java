package com.payam.learn.web.ws.rest.client;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.model.ActivitySearch;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;

public class ActivitySearchClient {

    private Client client;

    public ActivitySearchClient() {
        this.client = ClientBuilder.newClient();
    }

    public List<Activity> search(String param, List<String> searchValues, String secondParam, int durationFrom, String thirdParam, int durationTo) {
        URI uri = UriBuilder.fromUri("http://localhost:8080/exercise_services_war_exploded/webapi/")
                .path("search/activities")
                .queryParam(param, searchValues)
                .queryParam(secondParam, durationFrom)
                .queryParam(thirdParam, durationTo)
                .build();
        WebTarget target = client.target(uri);
        return target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Activity>>() {
        });
    }

    public List<Activity> search(ActivitySearch activitySearch) {
        URI uri = UriBuilder.fromUri("http://localhost:8080/exercise_services_war_exploded/webapi/")
                .path("search/activities")
                .build();
        WebTarget target = client.target(uri);
        Response response = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(activitySearch, MediaType.APPLICATION_JSON));
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new RuntimeException(response.getStatus() + ": There was an error an the server");
        }
        return response.readEntity(new GenericType<List<Activity>>(){});

    }
}
