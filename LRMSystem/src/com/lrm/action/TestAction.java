package com.lrm.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author zhuguangjin
 * @brief struts2环境测试
 */
public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("testAction.execute()");
		return "success";
	}


}
