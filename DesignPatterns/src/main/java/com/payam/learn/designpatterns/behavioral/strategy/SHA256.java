package com.payam.learn.designpatterns.behavioral.strategy;

import org.apache.commons.codec.digest.DigestUtils;

public class SHA256 implements HashStrategy {
    @Override
    public byte[] hash(String raw) {
        return DigestUtils.sha256(raw);
    }
}
