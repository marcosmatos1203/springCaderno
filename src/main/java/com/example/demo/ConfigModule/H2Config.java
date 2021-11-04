package com.example.demo.ConfigModule;

import com.example.demo.ServiceModule.DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("h2")
public class H2Config {
    @Autowired
    private DBService dbService;

    @Bean
    public void istanciaBaseDeDados(){
        this.dbService.InstanciaBaseDeDados();
    }
}
