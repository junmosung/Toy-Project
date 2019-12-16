package com.victorsung.no2.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor    // final 선언된 필드에 대한 생성자생성, final이 없으면 선언하지 않는다.
public class HelloResponseDto {
    private final String name;
    private final int age;
}
