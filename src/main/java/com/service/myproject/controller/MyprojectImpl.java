package com.service.myproject.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-02T02:23:46.490Z")

@RestSchema(schemaId = "myproject")
@RequestMapping(path = "/myProject", produces = MediaType.APPLICATION_JSON)
public class MyprojectImpl {

    @Autowired
    private MyprojectDelegate userMyprojectDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMyprojectDelegate.helloworld(name);
    }

}
