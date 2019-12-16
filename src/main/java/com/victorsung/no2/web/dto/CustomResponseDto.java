package com.victorsung.no2.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomResponseDto {
    private final int serialNum;
    private final String serialName;
}
