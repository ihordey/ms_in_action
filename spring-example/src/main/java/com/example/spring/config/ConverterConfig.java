package com.example.spring.config;

//import com.example.spring.converter.SingerToOtherSingerConverter;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
//import org.springframework.context.annotation.Bean;
import com.example.spring.converter.SingerToOtherSingerConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.context.support.ConversionServiceFactoryBean;

//import java.util.Set;

@Configuration
public class ConverterConfig implements WebMvcConfigurer {

   /* @Bean
    public ConversionServiceFactoryBean conversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        Set<Object> converters = Set.of(new SingerToOtherSingerConverter());
        bean.setConverters(converters);
        bean.afterPropertiesSet();
        return bean;
    }*/

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new SingerToOtherSingerConverter());
    }
}
