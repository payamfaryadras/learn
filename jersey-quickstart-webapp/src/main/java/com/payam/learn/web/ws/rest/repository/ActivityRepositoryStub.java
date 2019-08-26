package com.payam.learn.web.ws.rest.repository;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.model.User;

import java.util.ArrayList;
import java.util.List;

public class ActivityRepositoryStub implements ActivityRepository {

    @Override
    public List<Activity> findAllActivites() {

        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Swimming", 88));
        activities.add(new Activity("Cycling", 30));
        return activities;
    }

    @Override
    public Activity findActivity(String activityId) {
        Activity activity = new Activity("Cycling", 30);
        activity.setId("1234");
        User user = new User();
        user.setId("20");
        user.setName("Payam");
        activity.setUser(user);
        return activity;
    }

    @Override
    public void create(Activity activity) {
        //should issue insert a Activity into db
    }

    @Override
    public Activity update(Activity activity) {
        return activity;
    }

    @Override
    public void delete(String activityId) {

    }

}
