package com.zwq.ssm.vo;

import com.zwq.ssm.pojo.Permission;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * description: TODO
 *
 * @author zwq
 * @date 2021/12/15 9:56
 */
public class UserVO{

	private Integer id;

	private String username;

	private String realname;

	private String phone;

	private Byte type;

	private Integer villageid;

	private Integer roleid;

	private Date createtime;

	private Date modifytime;

	private Byte available;

	private Integer tuserid;

	private String villageName = "--";

	private String roleName;

	public Integer getUserId() {
		return id;
	}

	public void setUserId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Integer getVillageid() {
		return villageid;
	}

	public void setVillageid(Integer villageid) {
		this.villageid = villageid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
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

	public Byte getAvailable() {
		return available;
	}

	public void setAvailable(Byte available) {
		this.available = available;
	}

	public Integer getTuserid() {
		return tuserid;
	}

	public void setTuserid(Integer tuserid) {
		this.tuserid = tuserid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "UserVO{" +
				"id=" + id +
				", username='" + username + '\'' +
				", realname='" + realname + '\'' +
				", phone='" + phone + '\'' +
				", type=" + type +
				", villageid=" + villageid +
				", roleid=" + roleid +
				", createtime=" + createtime +
				", modifytime=" + modifytime +
				", available=" + available +
				", tuserid=" + tuserid +
				", villageName='" + villageName + '\'' +
				", roleName='" + roleName + '\'' +
				'}';
	}
}
