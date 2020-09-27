package cn.org.atool.fluent.mybatis.test.basedao;

import cn.org.atool.fluent.mybatis.generate.datamap.EM;
import cn.org.atool.fluent.mybatis.generate.datamap.TM;
import cn.org.atool.fluent.mybatis.generate.entity.UserEntity;
import cn.org.atool.fluent.mybatis.generate.mapper.UserMapper;
import cn.org.atool.fluent.mybatis.generate.wrapper.UserQuery;
import cn.org.atool.fluent.mybatis.test.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.test4j.hamcrest.matcher.string.StringMode;

import java.util.List;

import static cn.org.atool.fluent.mybatis.generate.helper.UserMapping.userName;
import static org.test4j.tools.datagen.AbstractDataGenerator.increase;

/**
 * @author darui.wu
 * @create 2019/10/31 6:18 下午
 */
public class DistinctTest extends BaseTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void test_distinct() {
        db.table(t_user).clean()
            .insert(TM.user.createWithInit(10)
                .user_name.values(increase(index -> index > 5 ? "user2" : "user1"))
                .age.values(30)
            );
        UserQuery query = new UserQuery()
            .distinct()
            .select.apply(userName).end()
            .where.age().eq(30).end();

        List<UserEntity> users = mapper.listEntity(query);
        db.sqlList().wantFirstSql().eq("SELECT DISTINCT user_name FROM t_user WHERE age = ?", StringMode.SameAsSpace);
        want.list(users).eqDataMap(EM.user.create(2)
            .userName.values("user1", "user2")
        );
    }
}