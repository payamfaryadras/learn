package com.payam.learn.jsonb.model;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class App {

    public static void main(String[] args) {
        Person person = new Person("payam","faryadras");
        Jsonb jsonb = JsonbBuilder.create();
        System.out.println(jsonb.toJson(person));

    }
}
