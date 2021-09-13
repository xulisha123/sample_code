package com.tuling.cglib.mapper;

public class Dao implements IDao{

    public void select() {

         System.out.println("-----select-----");
        insert();
    }

    private void insert() {
        System.out.println("-----insert-----");
    }

    public final void delete() {
        System.out.println("delete from ...");
    }
}
