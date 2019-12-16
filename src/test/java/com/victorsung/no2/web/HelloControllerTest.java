package com.victorsung.no2.web;

import com.jayway.jsonpath.JsonPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)    // 스프링 부트 테스트와 JUnit 사이에 연결자 역할을 한다.
@WebMvcTest // Web에 집중하기 위해 사용하는 Annotation @Controller @ControllerAdvice를 사용할 수 있다.
public class HelloControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void GET요청TEST() throws Exception {

        String hello = "hello";

        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void RequestTEST() throws Exception{

        String name = "kim";
        int age = 100;

        mockMvc.perform(MockMvcRequestBuilders.get("/hello/dto")
                .param("name", name)
                .param("age", String.valueOf(age))
        ).andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.age", is(age)));
    }

}