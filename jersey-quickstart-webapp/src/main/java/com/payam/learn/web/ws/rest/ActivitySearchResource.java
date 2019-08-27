package com.payam.learn.web.ws.rest;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.model.ActivitySearch;
import com.payam.learn.web.ws.rest.repository.ActivityRepository;
import com.payam.learn.web.ws.rest.repository.ActivityRepositoryStub;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("search/activities")
public class ActivitySearchResource {
    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Response searchForActivities(ActivitySearch search){
        List<Activity> activities = activityRepository.findByConstrains(search);
        if(activities==null || activities.size()<1){
           return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok().entity(new GenericEntity<List<Activity>>(activities){}).build();
    }



    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response searchForActivity(@QueryParam(value = "description") List<String> descriptions,
                                      @QueryParam(value = "durationFrom") int durationFrom,
                                      @QueryParam(value = "durationTo") int durationTo) {
        List<Activity> activities = activityRepository.findByDescription(descriptions,durationFrom,durationTo);
        return Response.ok().entity(new GenericEntity<List<Activity>>(activities) {
        }).build();
    }

}
