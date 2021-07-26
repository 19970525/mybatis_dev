import org.autumn.one.bean.LoveFriendsBean;
import org.autumn.one.dao.FriendsDao;
import org.autumn.one.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author pengjun
 * @create 2021-03-05 13:03
 */
public class FriendsTest {

    static Logger log = Logger.getLogger(FriendsTest.class);

    @Test
    public void getSomeFriendsByDynamicSQL1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id", 12);
        ArrayList<LoveFriendsBean> someFriends = mapper.getSomeFriendsByDynamicSQL1(hashMap);
        for (LoveFriendsBean friend: someFriends) {
            log.info(friend);
        }

        sqlSession.close();
    }

}
