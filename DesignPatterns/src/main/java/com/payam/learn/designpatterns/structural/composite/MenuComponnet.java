package com.payam.learn.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class MenuComponnet {

    private final String url;
    private final String name;
    private List<MenuComponnet> children = new ArrayList<>();

    public MenuComponnet(String url, String name) {
        this.url = url;
        this.name = name;
    }


    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public List<MenuComponnet> getChildren() {
        return children;
    }

    public MenuComponnet add(MenuComponnet menuComponnet) {
        throw new IllegalStateException("Not supported in this level");
    }

    public MenuComponnet remove(MenuComponnet menuComponnet) {
        throw new IllegalStateException("Not supported in this level");
    }

    protected String print(){
        return String.format("%s->%s \n",name,url);
    }

    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuComponnet)) return false;
        MenuComponnet that = (MenuComponnet) o;
        return url.equals(that.url) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name);
    }

}
