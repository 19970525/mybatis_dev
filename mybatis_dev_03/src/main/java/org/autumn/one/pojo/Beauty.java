package org.autumn.one.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pengjun
 * @create 2021-03-05 12:39
 */
@Data
public class Beauty implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String borndate;
    private String phone;
    private String photo;
    private Boys boys;

}
