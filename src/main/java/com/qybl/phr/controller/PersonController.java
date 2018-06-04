package com.qybl.phr.controller;

import com.qybl.phr.dto.Person;
import com.qybl.phr.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lvjinzhao
 * @Description: ${todo}
 * @date 2018/6/4 22:30
 */
@RestController
@RequestMapping(value = "/demo")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(value = "/getOne/{id}")
    public Person getPerson(@PathVariable(value = "id") String id){
        return personService.getPerson(id);
    }
}
