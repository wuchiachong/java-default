package com.cloudberry.my.com.cloudberry.my.technology;

public interface Turbo extends Combustion{
    @Override
    default String move(){
        return "Turbo";
    }
}
