package com.unlockjava.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.tuckey.web.filters.urlrewrite.UrlRewriteFilter;

@SpringBootApplication
public class UnlockJavaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UnlockJavaApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean tuckeyRegistrationBean() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();

		registrationBean.setFilter(new UrlRewriteFilter());
		registrationBean.addInitParameter("confPath", "urlrewrite.xml");

		return registrationBean;
	}
}
