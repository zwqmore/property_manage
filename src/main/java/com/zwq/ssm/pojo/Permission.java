package com.zwq.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    private Integer id;

    private String des;

    private String alias;

    private String code;

    private Byte type;

    private Byte available;

    private Integer module;

    private Date createtime;

    private Date modifytime;

    private String enablesystem;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    public Integer getModule() {
        return module;
    }

    public void setModule(Integer module) {
        this.module = module;
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

    public String getEnablesystem() {
        return enablesystem;
    }

    public void setEnablesystem(String enablesystem) {
        this.enablesystem = enablesystem == null ? null : enablesystem.trim();
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", des='" + des + '\'' +
                ", alias='" + alias + '\'' +
                ", code='" + code + '\'' +
                ", type=" + type +
                ", available=" + available +
                ", module=" + module +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                ", enablesystem='" + enablesystem + '\'' +
                '}';
    }
}