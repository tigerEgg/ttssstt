package com.tpm.controller;

import javax.servlet.http.HttpServletRequest;

import com.tpm.pojo.TdCustomer;

public class LoginController {

	public void setCustomer(HttpServletRequest request, TdCustomer customer) {
		
		customer.setEmails("jimmy_home@163.com");
		customer.setUsername("测试账号");
		
    }
}
