package edu.nju.hostelworld.vo;

/**
 * Created by yyy on 2017/3/29.
 */
public class HostelMoneyBar {

    private String name;
    private int y;
    private String drilldown;

    public HostelMoneyBar(String name,int y,String drilldown){
        this.name = name;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDrilldown() {
        return drilldown;
    }

    public void setDrilldown(String drilldown) {
        this.drilldown = drilldown;
    }
}
