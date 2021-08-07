package org.autumn.one.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pengjun
 * @create 2021-03-05 12:45
 */
@Data
public class Boys implements Serializable {
    private int id;
    private String boyName;
    private String userCP;

}
