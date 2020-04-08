package com.text.codex.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.text.codex.util.VG;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 演示表
 *
 * @date 2019-12-17 21:00:26
 */
@TableName("sys_demo")
public class DemoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    @NotNull(groups = {VG.Update.class})
    @ApiModelProperty(value = "id")
    private Long id;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    @NotBlank(groups = {VG.Add.class, VG.Update.class})
    private String name;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    @NotBlank(groups = {VG.Add.class, VG.Update.class})
    private Integer age;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
