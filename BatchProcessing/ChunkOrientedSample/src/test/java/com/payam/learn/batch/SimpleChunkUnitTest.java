package com.payam.learn.batch;


import org.junit.Test;
import org.junit.runner.RunWith;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobExecution;

import java.util.Properties;

import static org.junit.Assert.*;


public class SimpleChunkUnitTest {

    @Test
    public void givenChunk_thenBatch_completesWithSuccess() throws Exception {
        JobOperator jobOperator = BatchRuntime.getJobOperator();
        long executionId = jobOperator.start("simpleChunk", new Properties());
      //  JobExecution jobExecution = jobOperator.getJobExecution(executionId);

    }

}
