package com.victorsung.no2.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor    // final 처리된 필드가 매게변수에 있는 생성자를 만들어 준다.
public class TestResponseDto {
    private final Long id;
    private final String name;
}
