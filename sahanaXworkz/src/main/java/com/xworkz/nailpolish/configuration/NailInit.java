package com.xworkz.nailpolish.configuration;

import java.io.File;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NailInit extends AbstractAnnotationConfigDispatcherServletInitializer // register
		implements WebMvcConfigurer {

	public NailInit() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] { NailConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling");
		configurer.enable(); // we enable this to handle the static sources
	}// static = .jsp,html,css

	@Override
	protected void customizeRegistration(Dynamic registration) {
		// 1024---->1024kb----1024mb----1gb
		String tempDir = "D:\\temp";
		int maxUploadSizeinMb = 20 * 1024 * 1024; // max length
		File uploadDirectory = new File(tempDir); // path used by server
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
				maxUploadSizeinMb, maxUploadSizeinMb * 2, maxUploadSizeinMb / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
