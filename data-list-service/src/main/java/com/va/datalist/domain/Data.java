package com.va.datalist.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by vaneet_sharma
 */
@Entity
public class Data {
    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
