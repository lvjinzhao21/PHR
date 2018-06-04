package com.qybl.phr.service;

import com.qybl.phr.dao.PersonMapper;
import com.qybl.phr.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Lvjinzhao
 * @Description: ${todo}
 * @date 2018/6/4 22:37
 */
@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person getPerson(@PathVariable(value = "id") String id){
        return personMapper.selectByPrimaryKey(id);
    }
}
