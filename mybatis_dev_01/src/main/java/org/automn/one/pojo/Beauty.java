package org.automn.one.pojo;

import java.io.Serializable;

/**
 * @author pengjun
 * @create 2021-03-03 1:42
 */
public class Beauty implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String borndate;
    private String phone;
    private String photo;
    private String boyfriend_id;

    public Beauty() {
    }

    public Beauty(int id, String name, String sex, String borndate, String phone, String photo, String boyfriend_id) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.borndate = borndate;
        this.phone = phone;
        this.photo = photo;
        this.boyfriend_id = boyfriend_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBorndate() {
        return borndate;
    }

    public void setBorndate(String borndate) {
        this.borndate = borndate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getBoyfriend_id() {
        return boyfriend_id;
    }

    public void setBoyfriend_id(String boyfriend_id) {
        this.boyfriend_id = boyfriend_id;
    }

    @Override
    public String toString() {
        return "Beauty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", borndate='" + borndate + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", boyfriend_id='" + boyfriend_id + '\'' +
                '}';
    }
}
