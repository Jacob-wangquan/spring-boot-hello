package com.wang;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author user
 *
 */
@RestController
public class HelloController {
	
	/**
	 * 使用@RequestMapping 建立请求映射
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(){
		return "hello world 2017";
	}
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("Jacob");
		demo.setCreateTime(new Date());
		return demo;
	}
}
