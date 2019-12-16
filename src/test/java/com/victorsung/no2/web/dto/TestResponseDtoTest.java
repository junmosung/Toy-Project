package com.victorsung.no2.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestResponseDtoTest {

    @Test
    public void 롬북TEST(){
        Long no = 1000L;
        String name = "Vic";

        TestResponseDto dto = new TestResponseDto(no,name);

        assertThat(dto.getId()).isEqualTo(no);
        assertThat(dto.getName()).isEqualTo(name);
    }

}