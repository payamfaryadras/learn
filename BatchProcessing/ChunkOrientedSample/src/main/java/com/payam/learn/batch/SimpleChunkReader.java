package com.payam.learn.batch;

import javax.batch.api.chunk.AbstractItemReader;
import java.io.Serializable;

public class SimpleChunkReader extends AbstractItemReader {

    private Integer[] tokens;
    private int count;

    @Override
    public Object readItem() throws Exception {
        if(count >= tokens.length)
            return null;
        return tokens[count++];
    }

    @Override
    public void open(Serializable checkpoint) throws Exception {
        tokens = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        count = 0;
    }
}
