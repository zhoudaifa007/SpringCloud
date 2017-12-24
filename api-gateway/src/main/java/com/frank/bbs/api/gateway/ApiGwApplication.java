package com.frank.bbs.api.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGwApplication {

	private static final Logger logger = LoggerFactory.getLogger(ApiGwApplication.class);

	public static void main(String[] args) {
		new SpringApplicationBuilder(ApiGwApplication.class).web(true).run(args);
		logger.info("Api GateWay Started Success!!!");
	}
}
