package com.payam.learn.web.ws.rest.client;

import com.payam.learn.web.ws.rest.model.Activity;
import com.payam.learn.web.ws.rest.model.ActivitySearch;
import com.payam.learn.web.ws.rest.model.ActivitySearchType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActivitySearchClientTest {

    @Test
    public void TEST_CLIENT_SEARCH_ACTIVITY_FIND() {
        ActivitySearchClient client = new ActivitySearchClient();
        String param = "description";
        String secondParam = "durationFrom";
        String thirdParam = "durationTo";
        List<String> searchValues = new ArrayList<>();
        searchValues.add("Cycling");
        searchValues.add("Swimming");
        List<Activity> activities = client.search(param, searchValues,secondParam,10,thirdParam,3000);
        Assert.assertEquals(2, activities.size());
    }

    @Test
    public void TEST_CLIENT_SEARCH_ACTIVITY_FIND_BY_OBJECT(){
        ActivitySearchClient client = new ActivitySearchClient();
        List<String> searchValues = new ArrayList<>();
        searchValues.add("Running");
        searchValues.add("Swimming");
        ActivitySearch activitySearch = new ActivitySearch();
        activitySearch.setDescriptions(searchValues);
        activitySearch.setDurationFrom(10);
        activitySearch.setDurationTo(400);
        activitySearch.setActivitySearchType(ActivitySearchType.SEARCH_BY_DESCRIPTION);
        List<Activity> activities = client.search(activitySearch);
        Assert.assertEquals(2, activities.size());
    }
}