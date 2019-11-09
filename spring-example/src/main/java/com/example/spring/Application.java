package com.example.spring;

import com.example.spring.model.OtherSinger;
import com.example.spring.model.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.ConversionService;

@SpringBootApplication
public class Application  implements CommandLineRunner {
    @Autowired
    private ConversionService conversionService;

    public static void main(String[] args) {
       SpringApplication.run(Application.class, args);
//        ConversionService conversionService = context.getBean(ConversionService.class);
    }

    @Override
    public void run(String... args) throws Exception {
        Singer singer = new Singer("Ivan", "Hordey");
        System.out.println(singer);
        OtherSinger otherSinger = conversionService.convert(singer, OtherSinger.class);
        System.out.println(otherSinger);
    }
}
