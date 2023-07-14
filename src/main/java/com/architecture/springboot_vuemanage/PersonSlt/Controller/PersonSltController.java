package com.architecture.springboot_vuemanage.PersonSlt.Controller;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;
import com.architecture.springboot_vuemanage.PersonSlt.Mapper.PersonSltMapper;
import com.architecture.springboot_vuemanage.PersonSlt.Service.PersonSltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/person")
@ResponseBody
public class PersonSltController {

    @Autowired
    PersonSltService personSltService;

    @GetMapping("/selectAll")
    public List<PersonSltEntity> getAll(){
        return personSltService.getSelectAll();
    }
}
