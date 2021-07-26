package org.autumn.one.pojo;

/**
 * @author pengjun
 * @create 2021-03-05 12:45
 */
public class Boys {
    private int id;
    private String boyName;
    private String userCP;

    public Boys() {
    }

    public Boys(String boyName, String userCP) {
        this.boyName = boyName;
        this.userCP = userCP;
    }

    public Boys(int id, String boyName, String userCP) {
        this.id = id;
        this.boyName = boyName;
        this.userCP = userCP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoyName() {
        return boyName;
    }

    public void setBoyName(String boyName) {
        this.boyName = boyName;
    }

    public String getUserCP() {
        return userCP;
    }

    public void setUserCP(String userCP) {
        this.userCP = userCP;
    }

    @Override
    public String toString() {
        return "Boys{" +
                "id=" + id +
                ", boyName='" + boyName + '\'' +
                ", userCP='" + userCP + '\'' +
                '}';
    }
}
