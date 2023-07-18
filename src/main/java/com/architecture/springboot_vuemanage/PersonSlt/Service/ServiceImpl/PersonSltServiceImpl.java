package com.architecture.springboot_vuemanage.PersonSlt.Service.ServiceImpl;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;
import com.architecture.springboot_vuemanage.PersonSlt.Mapper.PersonSltMapper;
import com.architecture.springboot_vuemanage.PersonSlt.Service.PersonSltService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonSltServiceImpl extends ServiceImpl<PersonSltMapper, PersonSltEntity> implements PersonSltService {


    @Override
    public List<PersonSltEntity> getSelectAll() {
        return getBaseMapper().selectAll();
    }

    public PersonSltEntity getOneByIdAndName(String id, String name) {
        return getOne(new LambdaQueryWrapper<PersonSltEntity>().
                eq(PersonSltEntity::getId, id).
                eq(PersonSltEntity::getName, name));
    }

    public String getOnePerson(String id) {
        return getBaseMapper().getOne(id);
    }
}
