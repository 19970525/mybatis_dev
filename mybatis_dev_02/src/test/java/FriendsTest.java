import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.autumn.one.bean.LoveFriendsBean;
import org.autumn.one.dao.FriendsDao;
import org.autumn.one.pojo.Boys;
import org.autumn.one.utils.MybatisUtils;
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
    public void selectLoveFriends() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);

        HashMap<String, Integer> limitMap = new HashMap<>();
        Integer page = 2;
        limitMap.put("index", page*(page-1));
        limitMap.put("size", 5);
        ArrayList<LoveFriendsBean> friends = mapper.getFriends(limitMap);

        for (LoveFriendsBean lf : friends) {
          log.info(lf);
          log.debug(lf);
          log.error(lf);
        }

        sqlSession.close();
    }

    @Test
    public void getSomeFriends() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id", 12);
        hashMap.put("sex", null);
        ArrayList<LoveFriendsBean> someFriends = mapper.getSomeFriends(hashMap);
        for (LoveFriendsBean friend: someFriends) {
            log.info(friend);
        }

        sqlSession.close();
    }

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

    @Test
    public void getSomeFriendsByDynamicSQL2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("id", 12);
        ArrayList<LoveFriendsBean> someFriends = mapper.getSomeFriendsByDynamicSQL2(hashMap);
        for (LoveFriendsBean friend: someFriends) {
            log.info(friend);
        }

        sqlSession.close();
    }

    @Test
    public void getSomeFriendsByDynamicSQL3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        ArrayList<LoveFriendsBean> someFriends1 = mapper.getSomeFriendsByDynamicSQL3(list);
        sqlSession.clearCache();//清除缓存，测试是否会重新查询
        ArrayList<LoveFriendsBean> someFriends2 = mapper.getSomeFriendsByDynamicSQL3(list);
        log.info("一级缓存查询重复数据，someFriends1==someFriends2：" + someFriends1.equals(someFriends2));
        for (LoveFriendsBean friend: someFriends1) {
            log.info(friend);
        }

        sqlSession.close();
    }

    @Test
    public void updateBoy() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", 12);
        hashMap.put("boyName", "pengjun");
        hashMap.put("userCP", 999);
        mapper.updateBoy(hashMap);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertData() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FriendsDao mapper = sqlSession.getMapper(FriendsDao.class);
        mapper.insertBoy(new Boys("彭俊","666"));

        System.out.println("添加完成");

        sqlSession.commit();
        sqlSession.close();
    }
}
