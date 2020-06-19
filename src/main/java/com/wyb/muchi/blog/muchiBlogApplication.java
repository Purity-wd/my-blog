package com.wyb.muchi.blog;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@SpringBootApplication
@ComponentScan(basePackages = {"com.wyb.**"})
@MapperScan("com.wyb.muchi.blog.mapper")
@EnableAutoConfiguration
public class muchiBlogApplication  implements WebMvcConfigurer {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(muchiBlogApplication.class, args);
    }
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor=new PaginationInterceptor();
        return  paginationInterceptor;
    }
}
