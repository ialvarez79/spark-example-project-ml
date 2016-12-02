package com.mercadolibre.demos.spark;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ialvarez on 12/1/16.
 */
public class Product implements Serializable{
    private int id;
    private String name;
    private List<Integer> parents;


    public Product(int id, String name, List<Integer> parents) {
        this.id = id;
        this.name = name;
        this.parents = parents;
    }

    public List<Integer> getParents() {
        return parents;
    }

    public void setParents(List<Integer> parents) {
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
