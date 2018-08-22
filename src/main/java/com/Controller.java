package com;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
    @Autowired
    private Route route;
    @Autowired
    private Step step;
    @Autowired
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
