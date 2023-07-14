package com.architecture.PersonSlt.Service.ServiceImpl;

import com.architecture.PersonSlt.Entity.PersonSltEntity;
import com.architecture.PersonSlt.Mapper.PersonSltMapper;
import com.architecture.PersonSlt.Service.PersonSltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonSltServiceImpl implements PersonSltService {
    @Autowired
    PersonSltMapper personSltMapper;

    @Override
    public List<PersonSltEntity> getSelectAll() {
        List<PersonSltEntity> list = personSltMapper.selectAll();
        return list;
    }
}
