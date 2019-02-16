package com.cloudberry.my;

import com.cloudberry.my.com.cloudberry.my.technology.Combustion;
import com.cloudberry.my.com.cloudberry.my.technology.Electric;


public class Prius implements Combustion, Electric {
    public String move(){
        return "Prius " +
                //Need to explicitly
                Combustion.super.move() +
                " " +
                Electric.super.move();
    }
}
