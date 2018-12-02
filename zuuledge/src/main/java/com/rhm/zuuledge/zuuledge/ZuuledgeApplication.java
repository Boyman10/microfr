package com.rhm.zuuledge.zuuledge;

import com.rhm.zuuledge.zuuledge.filters.SimpleFilter;
import com.rhm.zuuledge.zuuledge.interceptor.UserFeignClientInterceptor;
import feign.RequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableOAuth2Sso
public class ZuuledgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuuledgeApplication.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }


    @Bean
    public RequestInterceptor getUserFeignClientInterceptor() {
        return new UserFeignClientInterceptor();
    }
}
