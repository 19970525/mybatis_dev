package org.autumn.one.dao;

import org.autumn.one.bean.LoveFriendsBean;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author pengjun
 * @create 2021-03-05 12:41
 */
public interface FriendsDao {
//    @Select("select g.name,b.boyName,g.boyfriend_id from beauty g inner join boys b on g.boyfriend_id=b.id where b.id=#{id}")


    ArrayList<LoveFriendsBean> getSomeFriendsByDynamicSQL1(HashMap map);

}
