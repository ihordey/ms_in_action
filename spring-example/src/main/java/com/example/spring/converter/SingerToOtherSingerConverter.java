package com.example.spring.converter;

import com.example.spring.model.OtherSinger;
import com.example.spring.model.Singer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SingerToOtherSingerConverter implements Converter<Singer, OtherSinger> {
    @Override
    public OtherSinger convert(Singer singer) {
        return new OtherSinger(singer.getFirsName(), singer.getLastName());
    }
}
