package com;



import java.util.List;


public class Route {
    private String id;
    private List steps;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}