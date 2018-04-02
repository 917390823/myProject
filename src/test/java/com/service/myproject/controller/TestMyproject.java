package com.service.myproject.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMyproject {

        MyprojectDelegate myprojectDelegate = new MyprojectDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = myprojectDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}