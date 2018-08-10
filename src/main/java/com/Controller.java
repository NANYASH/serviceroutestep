package com;

public class Controller {
    private Route route;
    private Step step;
    private Service service;


    public void callByBean(){
        route.getId();
        route.getSteps();

        step.getId();
        step.getGetParamServiceTo();
        step.getParamServiceFrom();
        step.getServiceFrom();
        step.getServiceTo();

        service.getId();
        service.getName();
        service.getParamsToCall();





    }
}
