package com.payam.learn.designpatterns.structural.decorator;

public class App {

    public static void main(String[] args) {
        Render submitInputElement =  new SubmitInputElement(new Attribute("id","id21")
                ,new Attribute("value","save"));
        System.out.println(submitInputElement.write());
        StyleSheetDecorator styleSheetDecorator = new StyleSheetDecorator(submitInputElement,new Attribute("height","200px"));
        System.out.println(styleSheetDecorator.write());

    }
}
