package com.example.cobauts1.models;

public class TeamLogo {
    int logo;
    String name;
    String desc;

    public TeamLogo(int s, String name, String desc) {
        this.logo = s;
        this.name = name;
        this.desc = desc;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
