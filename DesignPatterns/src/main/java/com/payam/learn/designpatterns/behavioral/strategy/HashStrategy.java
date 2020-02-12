package com.payam.learn.designpatterns.behavioral.strategy;

import java.security.NoSuchAlgorithmException;

@FunctionalInterface
public interface HashStrategy {
    byte[] hash(String raw);
}
