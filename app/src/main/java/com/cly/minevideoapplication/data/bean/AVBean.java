package com.cly.minevideoapplication.data.bean;

/**
 * Created by Angel on 2017/5/15.
 */

public class AVBean {


    /**
     * id : 1
     * name : (AROMA)(ARM-349)医療マスクの女 摘津蜜 芦名ユリア 武井麻希 滝川かのん.mp4
     * pic :
     * time :
     * path : G:\c\(AROMA)(ARM-349)医療マスクの女 摘津蜜 芦名ユリア 武井麻希 滝川かのん.mp4
     * space : 1012
     */

    private int id;
    private String name;
    private String pic;
    private String time;
    private String path;
    private int space;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    @Override
    public String toString() {
        return "AVBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pic='" + pic + '\'' +
                ", time='" + time + '\'' +
                ", path='" + path + '\'' +
                ", space=" + space +
                '}';
    }
}
