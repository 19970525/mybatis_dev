import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.autumn.one.dao.FriendsDao;
import org.autumn.one.pojo.Beauty;
import org.autumn.one.utils.MybatisUtils;
import org.junit.Test;

import java.util.ArrayList;

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
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("id", 12);
//        ArrayList<LoveFriendsBean> someFriends = mapper.getSomeFriendsByDynamicSQL1(hashMap);

        ArrayList<Beauty> beautyAndBoys = mapper.getBeauty();
        for (Beauty beautyAndBoy: beautyAndBoys) {
            log.info(beautyAndBoy);
        }

        sqlSession.close();
    }

}
