package com.payam.learn.web.ws.rest.repository;

import com.payam.learn.web.ws.rest.model.Activity;

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

}
