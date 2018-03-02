package com.castor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController  //返回json字符串的数据，直接可以编写RESTFul的接口；
@SpringBootApplication  //申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
public class App {

	@RequestMapping("/")  
    public String hello(){  
      return "Hello world!";  
    }  
	
	public static void main(String[] args) {
		/**
		 * 运行我们的Application了，
		 * 第一种方式特别简单：右键Run As -> Java Application。之后打开浏览器输入地址：http://127.0.0.1:8080/ 就可以看到Hello world!了。
		 * 第二种方式右键project – Run as – Maven build – 在Goals里输入spring-boot:run ,然后Apply,最后点击Run。
		 */
		SpringApplication.run(App.class, args);  
	}

}
