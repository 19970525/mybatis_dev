package org.autumn.one.dao;

import org.autumn.one.bean.LoveFriendsBean;
import org.autumn.one.pojo.Boys;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author pengjun
 * @create 2021-03-05 12:41
 */
public interface FriendsDao {
//    @Select("select g.name,b.boyName,g.boyfriend_id from beauty g inner join boys b on g.boyfriend_id=b.id where b.id=#{id}")
//    ArrayList<LoveFriendsBean> getFriends(HashMap map);
    ArrayList<LoveFriendsBean> getFriends();

    ArrayList<LoveFriendsBean> getSomeFriends(HashMap map);

    ArrayList<LoveFriendsBean> getSomeFriendsByDynamicSQL1(HashMap map);

    ArrayList<LoveFriendsBean> getSomeFriendsByDynamicSQL2(HashMap map);

    ArrayList<LoveFriendsBean> getSomeFriendsByDynamicSQL3(ArrayList list);

    void updateBoy(HashMap map);

    /**
     * 插入新的数据
     */
    void insertBoy(Boys boy);

}
