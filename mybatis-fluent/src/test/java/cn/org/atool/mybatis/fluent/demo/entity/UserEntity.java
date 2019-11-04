package cn.org.atool.mybatis.fluent.demo.entity;

import cn.org.atool.mybatis.fluent.base.IEntity;
import cn.org.atool.mybatis.fluent.demo.helper.UserEntityHelper;
import cn.org.atool.mybatis.fluent.demo.mapping.UserMP;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.Date;
import java.io.Serializable;

import java.util.Map;

/**
 * <p>
 * 
 * </p>
 *
 * @author generate code
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName(UserMP.Table_Name)
public class UserEntity implements IEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    @TableId(value = UserMP.Column.id, type = IdType.AUTO)
    private Long id;
    /**
     * 
     */
    @TableField(value = UserMP.Column.user_name)
    private String userName;
    /**
     * 
     */
    @TableField(value = UserMP.Column.address_id)
    private Long addressId;
    /**
     * 
     */
    @TableField(value = UserMP.Column.gmt_created, update = "now()", fill = FieldFill.INSERT)
    private Date gmtCreated;
    /**
     * 
     */
    @TableField(value = UserMP.Column.gmt_modified, update = "now()", fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
    /**
     * 
     */
    @TableField(value = UserMP.Column.is_deleted)
    @TableLogic
    private Boolean isDeleted;
    /**
     * 
     */
    @TableField(value = UserMP.Column.age)
    private Integer age;
    /**
     * 
     */
    @TableField(value = UserMP.Column.version)
    @Version
    private String version;

    @Override
    public Serializable findPk() {
        return this.id;
    }

    /**
     * 将实体对象转换为map
     */
    @Override
    public Map<String, Object> toMap() {
        return UserEntityHelper.map(this);
    }
}
