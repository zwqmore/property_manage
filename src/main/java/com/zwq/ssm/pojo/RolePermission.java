package com.zwq.ssm.pojo;

public class RolePermission {
    private Integer id;

    private Integer roleid;

    private Integer permid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPermid() {
        return permid;
    }

    public void setPermid(Integer permid) {
        this.permid = permid;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "id=" + id +
                ", roleid=" + roleid +
                ", permid=" + permid +
                '}';
    }
}