package com.victorsung.no2.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CustomResponseDtoTest {

    @Test
    public void 롬복TEST(){
        String name = "s500";
        int num = 1000;
        CustomResponseDto dto = new CustomResponseDto(num, name);

        assertThat(dto.getSerialNum()).isEqualTo(num);
        assertThat(dto.getSerialName()).isEqualTo(name);

    }

}