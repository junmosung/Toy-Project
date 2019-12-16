package com.victorsung.no2.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복TEST(){
        String name = "test";
        int age = 30;

        HelloResponseDto dto = new HelloResponseDto(name, age);
        assertThat(dto.getAge()).isEqualTo(age);
        assertThat(dto.getName()).isEqualTo(name);
    }

}