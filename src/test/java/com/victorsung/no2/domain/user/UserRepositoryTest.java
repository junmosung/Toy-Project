package com.victorsung.no2.domain.user;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @After
    public void 선처리(){
        userRepository.deleteAll();
    }

    @Test
    public void JPATEST(){
        String name = "JMS";
        Long age = 29L;

        User user = userRepository.save(User.builder().age(age.longValue()).name(name).build());

        List<User> all = userRepository.findAll();

        User user1 = all.get(0);

        assertThat(user1.getName()).isEqualTo(name);
        assertThat(user1.getAge()).isEqualTo(age);
        System.out.println(user1.getId());
    }
}