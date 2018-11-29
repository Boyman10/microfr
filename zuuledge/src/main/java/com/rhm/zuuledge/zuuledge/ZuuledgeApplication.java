package com.rhm.zuuledge.zuuledge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuuledgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuuledgeApplication.class, args);
    }
}
