package ru.gb.demo;

import ru.gb.demo.aop.RecoverException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws NoSuchMethodException {
		ApplicationContext context = SpringApplication.run(DemoApplication.class);
		TestClass testClass = context.getBean(TestClass.class);
		System.out.println(testClass.getRuntimeException1("Add"));
	}
}