package cn.org.atool.fluent.mybatis.generate.entity;

import cn.org.atool.fluent.mybatis.annotation.FluentMybatis;
import cn.org.atool.fluent.mybatis.annotation.RefMethod;
import cn.org.atool.fluent.mybatis.annotation.TableField;
import cn.org.atool.fluent.mybatis.annotation.TableId;
import cn.org.atool.fluent.mybatis.base.IEntity;
import cn.org.atool.fluent.mybatis.base.RichEntity;
import cn.org.atool.fluent.mybatis.customize.MyCustomerInterface;
import cn.org.atool.fluent.mybatis.customize.MyEntity;
import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * StudentEntity: 数据映射实体定义
 *
 * @author Powered By Fluent Mybatis
 */
@Data
@Accessors(
    chain = true
)
@EqualsAndHashCode(
    callSuper = false
)
@FluentMybatis(
    table = "student",
    mapperBeanPrefix = "my",
    defaults = MyCustomerInterface.class
)
public class StudentEntity extends RichEntity implements MyEntity<StudentEntity> {
  private static final long serialVersionUID = 1L;

  /**
   */
  @TableId("id")
  private Long id;

  /**
   */
  @TableField(
      value = "gmt_created",
      insert = "now()"
  )
  private Date gmtCreated;

  /**
   */
  @TableField(
      value = "gmt_modified",
      insert = "now()",
      update = "now()"
  )
  private Date gmtModified;

  /**
   */
  @TableField(
      value = "is_deleted",
      insert = "0"
  )
  private Boolean isDeleted;

  /**
   */
  @TableField("address")
  private String address;

  /**
   */
  @TableField("age")
  private Integer age;

  /**
   */
  @TableField("birthday")
  private Date birthday;

  /**
   */
  @TableField("bonus_points")
  private Long bonusPoints;

  /**
   */
  @TableField("env")
  private String env;

  /**
   */
  @TableField("gender_man")
  private Integer genderMan;

  /**
   */
  @TableField("grade")
  private Integer grade;

  /**
   */
  @TableField("home_address_id")
  private Long homeAddressId;

  /**
   */
  @TableField("home_county_id")
  private Long homeCountyId;

  /**
   */
  @TableField("phone")
  private String phone;

  /**
   */
  @TableField("status")
  private String status;

  /**
   */
  @TableField("tenant")
  private Long tenant;

  /**
   */
  @TableField("user_name")
  private String userName;

  /**
   */
  @TableField(
      value = "version",
      notLarge = false
  )
  private String version;

  @Override
  public Serializable findPk() {
    return this.id;
  }

  @Override
  public final Class<? extends IEntity> entityClass() {
    return StudentEntity.class;
  }

  /**
   * 实现定义在{@link cn.org.atool.fluent.mybatis.base.IRefs}子类Refs上
   */
  @RefMethod("studentId = id && isDeleted = isDeleted && env = env")
  public List<StudentScoreEntity> findStudentScoreList() {
    return super.invoke("findStudentScoreList", true);
  }

  /**
   * 实现定义在{@link cn.org.atool.fluent.mybatis.base.IRefs}子类Refs上
   */
  @RefMethod
  public StudentScoreEntity findEnglishScore() {
    return super.invoke("findEnglishScore", true);
  }
}
