package com.sks.nouniquebeandefinitionexception;

import com.sks.nouniquebeandefinitionexception.component.InjectionByConstructor;
import com.sks.nouniquebeandefinitionexception.component.InjectionBySetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NouniquebeandefinitionexceptionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(NouniquebeandefinitionexceptionApplication.class, args);

		InjectionByConstructor injectionByConstructor=(InjectionByConstructor)ctx.getBean("injectionByConstructor");
		injectionByConstructor.getMessage();

		InjectionBySetter injectionBySetter=(InjectionBySetter)ctx.getBean("injectionBySetter");
		injectionBySetter.getMessage();

	}

}
