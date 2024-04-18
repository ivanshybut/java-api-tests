package models;

import lombok.Builder;
import lombok.ToString;

@ToString

public class Cat {
    private String name;

    private String model;

    public Cat(String name, String model){
        this.name = name;
        this.model = model;
    }

    public Cat(){

    }

}

