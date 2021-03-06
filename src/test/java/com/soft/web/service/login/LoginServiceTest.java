package com.soft.web.service.login;

import java.util.*;

import org.junit.*;
import org.springframework.beans.factory.annotation.*;

import com.soft.util.*;
import com.soft.web.service.LoginService;

public class LoginServiceTest extends BaseTest {

	@Autowired
	private LoginService service;
	
	@Test
	public void testLogin() {
		Map<String, Object> map = service.login("admin");
		System.out.println("Username:" + map.get("user_name"));
		System.out.println("Password:" + map.get("password"));
	}
}