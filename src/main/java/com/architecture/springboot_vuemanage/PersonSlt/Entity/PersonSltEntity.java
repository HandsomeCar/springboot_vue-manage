package com.architecture.springboot_vuemanage.PersonSlt.Entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * 小car
 * @author xdf
 */
@Data
@TableName("person")
public class PersonSltEntity implements Serializable {

    private static final long serialVersionUID = -5158053199140049452L;

    /**
     * id
     */
    @Id
    private Integer id;
    /**
     * 姓名
     */
    @TableField("name")
    private String name;
    /**
     * 性别
     */
    @TableField("sex")
    private String sex;
    /**
     * 年龄
     */
    @TableField("age")
    private Integer age;
    /**
     * 组织
     */
    @TableField("org")
    private String org;
}