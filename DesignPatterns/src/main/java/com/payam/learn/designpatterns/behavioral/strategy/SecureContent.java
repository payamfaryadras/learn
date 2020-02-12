package com.payam.learn.designpatterns.behavioral.strategy;

import java.util.Objects;

public class SecureContent {
    private String raw;

    public SecureContent(String raw) {
        Objects.requireNonNull(raw);
        this.raw = raw;
    }

    public byte[] hashContent(HashStrategy hashStrategy) {
        return hashStrategy.hash(raw);
    }
}
