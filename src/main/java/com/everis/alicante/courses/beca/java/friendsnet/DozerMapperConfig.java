package com.everis.alicante.courses.beca.java.friendsnet;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerMapperConfig {

    @Bean
    public DozerBeanMapper getDozerBeanMapper() {
        return new DozerBeanMapper();
    }
}
