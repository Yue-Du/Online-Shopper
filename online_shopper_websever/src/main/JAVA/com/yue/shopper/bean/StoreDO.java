package com.yue.shopper.bean;

public class StoreDO {
    long id;
    String name;
    short delete;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getDelete() {
        return delete;
    }

    public void setDelete(short delete) {
        this.delete = delete;
    }
}
