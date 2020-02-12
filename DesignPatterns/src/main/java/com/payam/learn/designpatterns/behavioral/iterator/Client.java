package com.payam.learn.designpatterns.behavioral.iterator;

import java.io.FileNotFoundException;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        try {
            FileContantReader reader = new FileContantReader("");
            Iterator<String> iterator = reader.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
