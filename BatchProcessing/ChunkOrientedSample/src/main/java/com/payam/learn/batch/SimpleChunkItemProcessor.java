package com.payam.learn.batch;

import javax.batch.api.chunk.ItemProcessor;

public class SimpleChunkItemProcessor implements ItemProcessor {
    @Override
    public Object processItem(Object o) throws Exception {
        int item = (Integer) o;
        return item % 2 == 0 ? item : 0;
    }
}
