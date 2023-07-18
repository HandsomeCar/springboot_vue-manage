package com.architecture.springboot_vuemanage.PersonSlt.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 小car
 */
@Data
@TableName(value = "person")
public class PersonSltEntity {
    //id
    @TableId(value = "id",type = IdType.ASSIGN_UUID)
    private Integer id;
    //姓名
    private String name;
    //性别
    private String sex;
    //年龄
    private Integer age;
}
