package com.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author karl
 * @since 2020-08-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Mange extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "mangeId", type = IdType.AUTO)
    private Integer mangeId;

    /**
     * 名称
     */
    @TableField("mangeName")
    private String mangeName;

    /**
     * 作用
     */
    @TableField("mangeDesc")
    private String mangeDesc;


}
