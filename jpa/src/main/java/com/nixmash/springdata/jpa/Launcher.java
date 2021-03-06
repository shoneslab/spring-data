package com.nixmash.springdata.jpa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SpringVersion;

import com.nixmash.springdata.jpa.common.ContactUI;
import com.nixmash.springdata.jpa.config.ApplicationConfig;

@SpringBootApplication
public class Launcher {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(ApplicationConfig.class);
		ctx.refresh();
		System.out.println("version: " + SpringVersion.getVersion());
		ContactUI ui = ctx.getBean(ContactUI.class);
		ui.init();
		ctx.close();
	}

}
