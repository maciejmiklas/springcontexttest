package org.test.context.ex02;

import javax.annotation.PostConstruct;

import static org.test.context.Log.log;

class BeanA {

    public BeanA() {
        log("BeanA - constructor");
    }

    @PostConstruct
    public void postConstruct() {
        log("BeanA - postConstruct");
    }
}
