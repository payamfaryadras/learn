package com.payam.learn.web.ws.rest.client;


import com.payam.learn.web.ws.rest.model.Activity;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;

public class ActivityClientTest {


    @Test
    public void TEST_CLIENT_DELETE_ACTIVITY() {
        ActivityClient client = new ActivityClient();
        Response response = client.delete("1234");
        Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }


    @Test
    public void TEST_CLIENT_UPDATE_ACTIVITY() {
        Activity activity = new Activity();
        activity.setDuration(90);
        activity.setDescription("Yoga");
        activity.setId("12345");
        ActivityClient client = new ActivityClient();
        activity = client.update(activity);
        Assert.assertNotNull(activity);
    }


    @Test
    public void TEST_CLINET_GET_ACTIVITY() {
        ActivityClient client = new ActivityClient();
        Assert.assertNotNull(client.get(1234));
    }


    @Test
    public void TEST_CLIENT_GET_LIST_ACTIVITY() {
        ActivityClient client = new ActivityClient();
        Assert.assertNotNull(client.get());


    }

    @Test(expected = RuntimeException.class)
    public void TEST_CLIENT_GET_EXCEPTION_WHEN_CALL_WITH_INVALID_ACTIVIY_ID() {
        ActivityClient client = new ActivityClient();
        Assert.assertNotNull(client.get(123));
    }

    @Test
    public void TEST_CLIENT_CREATE_ACTIVITY() {
        ActivityClient client = new ActivityClient();
        Activity activity = new Activity("driving", 12);
        activity = client.createActivity(activity);
        Assert.assertNotNull(activity);
    }
}