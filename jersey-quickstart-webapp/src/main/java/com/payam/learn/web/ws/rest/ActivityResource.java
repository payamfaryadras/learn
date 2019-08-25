package com.payam.learn.web.ws.rest;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.repository.ActivityRepository;
import com.payam.learn.web.ws.rest.repository.ActivityRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("activites")
public class ActivityResource {
    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Activity> getAllActivites() {
        return activityRepository.findAllActivites();
    }
}
