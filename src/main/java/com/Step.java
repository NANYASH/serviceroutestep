package com;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class Step {
    private Long id;
    @Autowired
    private Service serviceFrom;
    @Autowired
    private Service serviceTo;
    private Map paramServiceFrom;
    private Map paramServiceTo;

    public Step(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Service getServiceFrom() {
        return serviceFrom;
    }

    public void setServiceFrom(Service serviceFrom) {
        this.serviceFrom = serviceFrom;
    }

    public Service getServiceTo() {
        return serviceTo;
    }

    public void setServiceTo(Service serviceTo) {
        this.serviceTo = serviceTo;
    }

    public Map getParamServiceFrom() {
        return paramServiceFrom;
    }

    public void setParamServiceFrom(Map paramServiceFrom) {
        this.paramServiceFrom = paramServiceFrom;
    }

    public Map getParamServiceTo() {
        return paramServiceTo;
    }

    public void setParamServiceTo(Map paramServiceTo) {
        this.paramServiceTo = paramServiceTo;
    }

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", serviceFrom=" + serviceFrom +
                ", serviceTo=" + serviceTo +
                ", paramServiceFrom=" + paramServiceFrom +
                ", paramServiceTo=" + paramServiceTo +
                '}';
    }
}
