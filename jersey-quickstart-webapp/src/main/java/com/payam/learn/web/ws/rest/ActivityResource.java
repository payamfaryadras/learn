package com.payam.learn.web.ws.rest;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.model.User;
import com.payam.learn.web.ws.rest.repository.ActivityRepository;
import com.payam.learn.web.ws.rest.repository.ActivityRepositoryStub;
import org.eclipse.persistence.annotations.DeleteAll;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("activities")
public class ActivityResource {
    private ActivityRepository activityRepository = new ActivityRepositoryStub();


    @DELETE
    @Path("{activityId}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("activityId") String activityId){
        activityRepository.delete(activityId);
        return Response.ok().build();
    }



    @PUT
    @Path("{activityId}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Activity activity){
        return  Response.ok().entity(activityRepository.update(activity)).build();
    }




    @POST
    @Path("activity")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    public Activity createActivity(Activity activity) {
        activityRepository.create(activity);
        return activity;
    }


    @POST
    @Path("activity")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Activity createActivityParams(MultivaluedMap<String, String> formParams) {
        Activity activity = new Activity();
        activity.setDescription(formParams.getFirst("description"));
        activity.setDuration(Integer.parseInt(formParams.getFirst("duration")));
        activityRepository.create(activity);
        return activity;
    }


    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Activity> getAllActivites() {
        return activityRepository.findAllActivites();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("{activityId}")
    public Response getActivity(@PathParam("activityId") String activityId) {

        if (activityId == null || activityId.length() < 4) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        Activity activity = activityRepository.findActivity(activityId);
        if (activity == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.status(Response.Status.OK).entity(activity).build();

    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("{activityId}/user")
    public User getUserActivity(@PathParam("activityId") String activityId) {
        return activityRepository.findActivity(activityId).getUser();
    }
}
