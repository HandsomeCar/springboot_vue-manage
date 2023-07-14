package com.architecture.PersonSlt.Mapper;

import com.architecture.PersonSlt.Entity.PersonSltEntity;
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
