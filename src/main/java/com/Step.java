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
    private Map getParamServiceTo;

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

    public Map getGetParamServiceTo() {
        return getParamServiceTo;
    }

    public void setGetParamServiceTo(Map getParamServiceTo) {
        this.getParamServiceTo = getParamServiceTo;
    }

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", serviceFrom=" + serviceFrom +
                ", serviceTo=" + serviceTo +
                ", paramServiceFrom=" + paramServiceFrom +
                ", getParamServiceTo=" + getParamServiceTo +
                '}';
    }
}
