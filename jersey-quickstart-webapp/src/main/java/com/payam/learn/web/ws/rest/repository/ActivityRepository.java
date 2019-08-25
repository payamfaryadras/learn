package com.payam.learn.web.ws.rest.repository;

import com.payam.learn.web.ws.rest.model.Activity;

import java.util.List;

public interface ActivityRepository {
    List<Activity> findAllActivites();
}
