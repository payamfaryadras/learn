package com.payam.learn.designpatterns.structural.composite;

public class App {
    public static void main(String[] args) {
        Menu root = new Menu("transfer", "Transfer Money");
        root.add(new MenuItem("card-to-card", "Card to Card"));
        root.add(new MenuItem("account", "By Account Number"));

        Menu subMenu =
                new Menu("iban", "by IBan");
        subMenu.add(new MenuItem("paya", "Paya"))
                .add(new MenuItem("satna", "Satna"));
        root.add(subMenu);
        System.out.println(root.toString());
    }
}
