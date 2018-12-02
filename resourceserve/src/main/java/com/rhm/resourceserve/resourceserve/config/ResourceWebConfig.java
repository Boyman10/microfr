package com.rhm.resourceserve.resourceserve.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.rhm.resourceserve.resourceserve.controller" })
public class ResourceWebConfig implements WebMvcConfigurer {}