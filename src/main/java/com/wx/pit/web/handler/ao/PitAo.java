package com.wx.pit.web.handler.ao;

public class PitAo {
    private String id;

    private String num;
    //    通道名字
    private int toplateral;
    //    顶部水平位移
    private int topvertical;
    //    顶部竖直位移
    private int slant;
    //    倾斜角
    private int deeplateral;
    //    深层水平位移
    private int columnvertical;
    //    立柱竖直位移
    private int waterlevel;
    //    水位
    private int supportforce;
    //   支撑内力
    private int boltstress;
    //    锚杆应力
    private int gap;
//    裂隙


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getToplateral() {
        return toplateral;
    }

    public void setToplateral(int toplateral) {
        this.toplateral = toplateral;
    }

    public int getTopvertical() {
        return topvertical;
    }

    public void setTopvertical(int topvertical) {
        this.topvertical = topvertical;
    }

    public int getSlant() {
        return slant;
    }

    public void setSlant(int slant) {
        this.slant = slant;
    }

    public int getDeeplateral() {
        return deeplateral;
    }

    public void setDeeplateral(int deeplateral) {
        this.deeplateral = deeplateral;
    }

    public int getColumnvertical() {
        return columnvertical;
    }

    public void setColumnvertical(int columnvertical) {
        this.columnvertical = columnvertical;
    }

    public int getWaterlevel() {
        return waterlevel;
    }

    public void setWaterlevel(int waterlevel) {
        this.waterlevel = waterlevel;
    }

    public int getSupportforce() {
        return supportforce;
    }

    public void setSupportforce(int supportforce) {
        this.supportforce = supportforce;
    }

    public int getBoltstress() {
        return boltstress;
    }

    public void setBoltstress(int boltstress) {
        this.boltstress = boltstress;
    }

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }
}

