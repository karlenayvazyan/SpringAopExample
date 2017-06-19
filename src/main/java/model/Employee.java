package model;

import annotation.Loggable;

/**
 * Created by karlen on 6/6/17.
 */
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    @Loggable
    public void setName(String name) {
        this.name = name;
    }

    public void throwException(){
        throw new RuntimeException("Dummy Exception");
    }
}
