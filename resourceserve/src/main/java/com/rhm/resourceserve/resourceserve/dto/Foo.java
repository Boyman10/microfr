package com.rhm.resourceserve.resourceserve.dto;

import lombok.Data;

@Data
public class Foo {

    private String name;
    private long id;

    public Foo( long id, String name) {
        this.name = name;
        this.id = id;
    }
}
