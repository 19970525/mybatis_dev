package org.autumn.one.bean;

/**
 * @author pengjun
 * @create 2021-03-05 12:49
 */
public class LoveFriendsBean {
    private String name;
    private String boyName;
    private String boyfriend_id;

    public LoveFriendsBean() {
    }

    public LoveFriendsBean(String name, String boyName, String boyfriend_id) {
        this.name = name;
        this.boyName = boyName;
        this.boyfriend_id = boyfriend_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public String getBoyfriend_id() {
        return boyfriend_id;
    }

    public void setBoyfriend_id(String boyfriend_id) {
        this.boyfriend_id = boyfriend_id;
    }

    @Override
    public String toString() {
        return "LoveFriendsBean{" +
                "name='" + name + '\'' +
                ", boyName='" + boyName + '\'' +
                ", boyfriend_id='" + boyfriend_id + '\'' +
                '}';
    }
}
