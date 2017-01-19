package com.iqiyi.live;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Desc : config client
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {
    public static void main( String[] args ) {
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}