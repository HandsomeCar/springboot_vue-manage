package com.architecture.PersonSlt.Controller;

import com.architecture.PersonSlt.Entity.PersonSltEntity;
import com.architecture.PersonSlt.Service.PersonSltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
@SpringBootConfiguration
@EnableAutoConfiguration
public class PersonSltController {
    @Autowired
    PersonSltService personSltService;

    @GetMapping("/selectAll")
    public List<PersonSltEntity> getAll(){
        return personSltService.getSelectAll();
    }
}
