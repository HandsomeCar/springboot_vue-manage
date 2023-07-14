package com.architecture.springboot_vuemanage.PersonSlt.Service.ServiceImpl;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;
import com.architecture.springboot_vuemanage.PersonSlt.Mapper.PersonSltMapper;
import com.architecture.springboot_vuemanage.PersonSlt.Service.PersonSltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class PersonSltServiceImpl implements PersonSltService {
    @Autowired
    PersonSltMapper personSltMapper;

    @Override
    public List<PersonSltEntity> getSelectAll() {
        List<PersonSltEntity> list = personSltMapper.selectAll();
        return list;
    }
}
