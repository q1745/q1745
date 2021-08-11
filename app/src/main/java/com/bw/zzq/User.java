package com.bw.zzq;

/**
 * @ClassName User
 * @Description TODO
 * @Author ZZQ
 * @Date 2021/8/11 10:50
 * @Version 1.0
 */
public class User {
    private String name;
    private String adress;

    public User() {
    }

    public User(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
