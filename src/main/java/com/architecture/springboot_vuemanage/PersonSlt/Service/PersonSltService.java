package com.architecture.springboot_vuemanage.PersonSlt.Service;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;

import java.util.List;

public interface PersonSltService {
    List<PersonSltEntity> getSelectAll();
}
