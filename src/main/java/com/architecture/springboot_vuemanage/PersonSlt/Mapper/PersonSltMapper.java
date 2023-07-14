package com.architecture.springboot_vuemanage.PersonSlt.Mapper;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonSltMapper {

    @Select("select * from person")
    List<PersonSltEntity> selectAll();
}
