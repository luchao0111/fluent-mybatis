package cn.org.atool.fluent.mybatis.generate.dm;

import java.lang.Boolean;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.test4j.module.ICore.DataMap;
import org.test4j.module.database.annotations.ColumnDef;
import org.test4j.module.database.annotations.ScriptTable;
import org.test4j.tools.datagen.KeyValue;

/**
 * StudentScoreDataMap: 表(实体)数据对比(插入)构造器
 *
 * @author Powered By Test4J
 */
@ScriptTable("student_score")
public class StudentScoreDataMap extends DataMap<StudentScoreDataMap> {
  private boolean isTable;

  private Supplier<Boolean> supplier = () -> this.isTable;

  @ColumnDef(
      value = "id",
      type = "bigint(20)",
      primary = true,
      autoIncrease = true
  )
  public final transient KeyValue<StudentScoreDataMap> id = new KeyValue(this, "id", "id", supplier);

  @ColumnDef(
      value = "gmt_created",
      type = "datetime"
  )
  public final transient KeyValue<StudentScoreDataMap> gmtCreated = new KeyValue(this, "gmt_created", "gmtCreated", supplier);

  @ColumnDef(
      value = "gmt_modified",
      type = "datetime"
  )
  public final transient KeyValue<StudentScoreDataMap> gmtModified = new KeyValue(this, "gmt_modified", "gmtModified", supplier);

  @ColumnDef(
      value = "is_deleted",
      type = "tinyint(4)"
  )
  public final transient KeyValue<StudentScoreDataMap> isDeleted = new KeyValue(this, "is_deleted", "isDeleted", supplier);

  @ColumnDef(
      value = "gender_man",
      type = "tinyint(4)"
  )
  public final transient KeyValue<StudentScoreDataMap> genderMan = new KeyValue(this, "gender_man", "genderMan", supplier);

  @ColumnDef(
      value = "school_term",
      type = "int(11)"
  )
  public final transient KeyValue<StudentScoreDataMap> schoolTerm = new KeyValue(this, "school_term", "schoolTerm", supplier);

  @ColumnDef(
      value = "score",
      type = "int(11)"
  )
  public final transient KeyValue<StudentScoreDataMap> score = new KeyValue(this, "score", "score", supplier);

  @ColumnDef(
      value = "student_id",
      type = "bigint(20)"
  )
  public final transient KeyValue<StudentScoreDataMap> studentId = new KeyValue(this, "student_id", "studentId", supplier);

  @ColumnDef(
      value = "subject",
      type = "varchar(30)"
  )
  public final transient KeyValue<StudentScoreDataMap> subject = new KeyValue(this, "subject", "subject", supplier);

  StudentScoreDataMap(boolean isTable) {
    super();
    this.isTable = isTable;
  }

  StudentScoreDataMap(boolean isTable, int size) {
    super(size);
    this.isTable = isTable;
  }

  /**
   * 创建StudentScoreDataMap
   * 初始化主键和gmtCreate, gmtModified, isDeleted等特殊值
   */
  public StudentScoreDataMap init() {
    this.id.autoIncrease();
    this.gmtCreated.values(new Date());
    this.gmtModified.values(new Date());
    this.isDeleted.values(false);
    return this;
  }

  public StudentScoreDataMap with(Consumer<StudentScoreDataMap> init) {
    init.accept(this);
    return this;
  }

  public static StudentScoreDataMap table() {
    return new StudentScoreDataMap(true, 1);
  }

  public static StudentScoreDataMap table(int size) {
    return new StudentScoreDataMap(true, size);
  }

  public static StudentScoreDataMap entity() {
    return new StudentScoreDataMap(false, 1);
  }

  public static StudentScoreDataMap entity(int size) {
    return new StudentScoreDataMap(false, size);
  }

  public static class Factory {
    public StudentScoreDataMap table() {
      return StudentScoreDataMap.table();
    }

    public StudentScoreDataMap table(int size) {
      return  StudentScoreDataMap.table(size);
    }

    public StudentScoreDataMap initTable() {
      return StudentScoreDataMap.table().init();
    }

    public StudentScoreDataMap initTable(int size) {
      return  StudentScoreDataMap.table(size).init();
    }

    public StudentScoreDataMap entity() {
      return StudentScoreDataMap.entity();
    }

    public StudentScoreDataMap entity(int size) {
      return  StudentScoreDataMap.entity(size);
    }
  }
}