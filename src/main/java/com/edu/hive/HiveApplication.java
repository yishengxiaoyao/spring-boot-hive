package com.edu.hive;

import com.edu.hive.config.HiveDruidConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = { HiveDruidConfig.class })
public class HiveApplication {
    public static void main(String[] args){
        SpringApplication.run(HiveApplication.class,args);
    }
}
