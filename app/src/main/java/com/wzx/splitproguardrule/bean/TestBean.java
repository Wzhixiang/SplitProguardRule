package com.wzx.splitproguardrule.bean;

/**
 * 描述 TODO
 * Created by 王治湘 on 2017/12/25.
 * version 1.0
 */

public class TestBean {

    private String test;

    private int state;

    public TestBean(String test, int state) {
        this.test = test;
        this.state = state;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
