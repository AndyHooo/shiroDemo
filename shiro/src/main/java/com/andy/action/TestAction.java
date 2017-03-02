package com.andy.action;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 * @ClassName TestAction
 * @Description 测试shiro
 * @author hdq
 * @Date 2016年7月28日 上午11:39:43
 * @version 1.0.0
 */
@Namespace("/test")
public class TestAction {
	
	/**
	 * @MethodName add  
	 * @Description 测试注解权限
	 */
	@Action(value = "add", results = {@Result(name = "success", location = "/main.jsp")})
	@RequiresPermissions("user:add")
	public String add(){
		System.out.println("add");
		return "success";
	}
	
	@Action(value = "query")
	@RequiresPermissions("user:query")
	public void query(){
		System.out.println("query");
	}
}
