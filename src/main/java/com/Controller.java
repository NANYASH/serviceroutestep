package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Route route;
    @Autowired
    private Step step;
    @Autowired
    private Service service;


    @RequestMapping(method = RequestMethod.GET, value = "/call", produces = "text/plain")
    public @ResponseBody
    void callByBean(){
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
