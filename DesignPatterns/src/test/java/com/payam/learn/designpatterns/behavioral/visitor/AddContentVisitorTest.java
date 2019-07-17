package com.payam.learn.designpatterns.behavioral.visitor;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class AddContentVisitorTest {
    private Content content;
    @Before
    public void setUp()  {

        content  = new Content(50);
    }

    @Test
    public void ADD_10_AFTER_ADD_VISITOR_CALL() {

        content.accept(new AddContentVisitor());
        Assert.assertEquals(60,content.getDate().intValue());

    }
}