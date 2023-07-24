package com.architecture.springboot_vuemanage.PersonSlt.Mapper;

import com.architecture.springboot_vuemanage.PersonSlt.Entity.PersonSltEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonSltMapper extends BaseMapper<PersonSltEntity> {

//    @Select("select * from person")
    List<PersonSltEntity> selectAll();

    String getOne(@Param("id") String id);
}
