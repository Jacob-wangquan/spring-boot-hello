package com.wang;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 使用@SpringBootApplication指定这是一个spring boot程序
 *
 */
@SpringBootApplication
public class App extends WebMvcConfigurerAdapter
{
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		/*
		 * 1、需要先定义一个 convert 转换消息的对象;
		 * 2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		 * 3、在convert中添加配置信息.
		 * 4、将convert添加到converters当中.
		 * 
		 */
		
		// 1、需要先定义一个 convert 转换消息的对象;
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		
		//2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat
        );
		
		//3、在convert中添加配置信息.
        fastConverter.setFastJsonConfig(fastJsonConfig);
        
        //4、将convert添加到converters当中.
    	converters.add(fastConverter);
		
	}
	
    public static void main( String[] args )
    {
    	/**
         * 在main方法中进行启动
         */
    	SpringApplication.run(App.class, args);
    }
}
