package com.lesAd.module.user;

import org.springframework.data.annotation.Id;

import com.lesAd.common.AuditFields;

public class User extends AuditFields{

	@Id
	private String userId;
	private String userCode;
	private String displayName;
	private String passWord;
	private String mailId;
	private String userRole;
	private Boolean userLocked;
	private String mobile;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Boolean getUserLocked() {
		return userLocked;
	}

	public void setUserLocked(Boolean userLocked) {
		this.userLocked = userLocked;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
