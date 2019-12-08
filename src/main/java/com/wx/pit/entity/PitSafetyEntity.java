package com.wx.pit.entity;

public class PitSafetyEntity {
    private String id;

    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    private String rank;
    //    通道名字
    private int lateral;
    //    水平位移
    private int vertcal;
    //    竖直位移
    private int slant;
    //    倾斜角
    private int waterlevel;
    //    水位
    private int strss;
    //    应力
    private int gap;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getLateral() {
        return lateral;
    }

    public void setLateral(int lateral) {
        this.lateral = lateral;
    }

    public int getVertcal() {
        return vertcal;
    }

    public void setVertcal(int vertcal) {
        this.vertcal = vertcal;
    }

    public int getSlant() {
        return slant;
    }

    public void setSlant(int slant) {
        this.slant = slant;
    }

    public int getWaterlevel() {
        return waterlevel;
    }

    public void setWaterlevel(int waterlevel) {
        this.waterlevel = waterlevel;
    }

    public int getStrss() {
        return strss;
    }

    public void setStrss(int strss) {
        this.strss = strss;
    }

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }
//    裂隙
}
