package com.payam.learn.web.ws.rest.repository;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.model.ActivitySearch;

import java.util.List;

public interface ActivityRepository {
    List<Activity> findAllActivites();

    Activity findActivity(String activityId);

    void create(Activity activity);

    Activity update(Activity activity);

    void delete(String activityId);

    List findByDescription(List descriptions, int durationFrom, int durationTo);

    List<Activity> findByConstrains(ActivitySearch search);
}
