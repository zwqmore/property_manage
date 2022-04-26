package com.zwq.ssm.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Village {
    private Integer id;

    private String villagename;

    private Integer cityid;

    private String cityname;

    private Integer countyid;

    private String countyname;

    private Integer streetid;

    private String streetname;

    private Date updatetime;

    private Integer userid;

    private Byte status;

    private Byte vs;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String contacts;

    private Integer tuserid;

    private Integer stateid;

    private String statename;

    @Override
    public String toString() {
        return "Village{" +
                "id=" + id +
                ", villagename='" + villagename + '\'' +
                ", cityid=" + cityid +
                ", cityname='" + cityname + '\'' +
                ", countyid=" + countyid +
                ", countyname='" + countyname + '\'' +
                ", streetid=" + streetid +
                ", streetname='" + streetname + '\'' +
                ", updatetime=" + updatetime +
                ", userid=" + userid +
                ", status=" + status +
                ", vs=" + vs +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", contacts='" + contacts + '\'' +
                ", tuserid=" + tuserid +
                ", stateid=" + stateid +
                ", statename='" + statename + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVillagename() {
        return villagename;
    }

    public void setVillagename(String villagename) {
        this.villagename = villagename;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getCountyid() {
        return countyid;
    }

    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    public String getCountyname() {
        return countyname;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public Integer getStreetid() {
        return streetid;
    }

    public void setStreetid(Integer streetid) {
        this.streetid = streetid;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getVs() {
        return vs;
    }

    public void setVs(Byte vs) {
        this.vs = vs;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Integer getTuserid() {
        return tuserid;
    }

    public void setTuserid(Integer tuserid) {
        this.tuserid = tuserid;
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }
}