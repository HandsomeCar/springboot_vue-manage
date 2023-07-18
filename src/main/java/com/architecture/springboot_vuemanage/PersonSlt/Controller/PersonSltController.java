package com.architecture.springboot_vuemanage.PersonSlt.Controller;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;
import com.architecture.springboot_vuemanage.PersonSlt.Service.ServiceImpl.PersonSltServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonSltController {

    @Autowired
    PersonSltServiceImpl personSltService;

    @GetMapping("/selectAll")
    public List<PersonSltEntity> getAll() {
        return personSltService.getSelectAll();
    }

    @PostMapping("/getById")
    public PersonSltEntity getById(@RequestParam("id") String id, @RequestParam("name") String name) {
        return personSltService.getOneByIdAndName(id, name);
    }

    @PostMapping("/getOnePerson")
    public String getOnePerson(@RequestParam("id") String id) {
        return personSltService.getOnePerson(id);
    }
}
