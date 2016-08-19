/*************************************************************************************************
 * 版权所有 (C)2015
 * 
 * 文件名称：TagsAction.java
 * 内容摘要：TagsAction.java
 * 当前版本：TODO
 * 作        者：李加蒙
 * 完成日期：2016年8月19日 上午9:47:34
 * 修改记录：
 * 修改日期：2016年8月19日 上午9:47:34
 * 版   本 号：
 * 修   改 人：
 * 修改内容：
 ************************************************************************************************/
package com.struts2.sags;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @filename 文件名称：TagsAction.java
 * @contents 内容摘要：
 */
public class TagsAction extends ActionSupport {
	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		this.addFieldError("fielderror.test", "feil");
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
