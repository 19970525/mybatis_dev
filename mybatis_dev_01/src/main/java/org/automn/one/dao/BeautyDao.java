package org.automn.one.dao;

import org.automn.one.pojo.Beauty;

import java.util.List;

/**
 * @author pengjun
 * @create 2021-03-03 1:47
 */
public interface BeautyDao {
    List<Beauty> getBeautyList(String str);

}
