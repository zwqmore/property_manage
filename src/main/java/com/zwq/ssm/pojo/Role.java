package com.zwq.ssm.pojo;

import java.util.Date;

public class Role {
    private Integer id;

    private String des;

    private String alias;

    private Byte type;

    private Byte available;

    private Date createtime;

    private Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", des='" + des + '\'' +
                ", alias='" + alias + '\'' +
                ", type=" + type +
                ", available=" + available +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                '}';
    }
}