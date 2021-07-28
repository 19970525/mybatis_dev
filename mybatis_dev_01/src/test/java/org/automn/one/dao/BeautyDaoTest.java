package org.automn.one.dao;

import org.apache.ibatis.session.SqlSession;
import org.automn.one.pojo.Beauty;
import org.automn.one.utils.MybatisUtils;
import org.junit.Test;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-03-03 2:16
 */
public class BeautyDaoTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BeautyDao beautyDao = sqlSession.getMapper(BeautyDao.class);
        List<Beauty> beautyList = beautyDao.getBeautyList("岩");

        for (Beauty beauty : beautyList) {
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
            System.out.println(beauty);
        }


        sqlSession.close();

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        BeautyDao beautyDao2 = sqlSession2.getMapper(BeautyDao.class);
        List<Beauty> beautyList2 = beautyDao2.getBeautyList("岩");

        for (Beauty beauty : beautyList2) {
            System.out.println(beauty);
        }


        System.out.println(beautyList == beautyList2);

        sqlSession2.close();
    }

}


