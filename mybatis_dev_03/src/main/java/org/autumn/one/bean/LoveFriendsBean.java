package org.autumn.one.bean;

/**
 * @author pengjun
 * @create 2021-03-05 12:49
 */
public class LoveFriendsBean {
    private String name;
    private String BBBName;
    private String boyfriend_id;

    public LoveFriendsBean() {
    }

    public static void main(String[] args) {
        System.out.println();

    }

    public LoveFriendsBean(String name, String BBBName, String boyfriend_id) {
        this.name = name;
        this.BBBName = BBBName;
        this.boyfriend_id = boyfriend_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBBBName() {
        return BBBName;
    }

    public void setBBBName(String BBBName) {
        this.BBBName = BBBName;
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
                ", BBBName='" + BBBName + '\'' +
                ", boyfriend_id='" + boyfriend_id + '\'' +
                '}';
    }
}
