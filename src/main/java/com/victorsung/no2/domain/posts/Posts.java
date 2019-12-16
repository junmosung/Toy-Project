package com.victorsung.no2.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity // 실제 DB 테이블과 매칭될 클래스이다. 보통 Entity 클래스라고 한다.
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 번호 등록
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title,String content,String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // Entity 클래스에서는 절대 Setter를 만들지 않는다. why? 유지보수에서 확실하게 데이터의 변동이 없게 하기 위해서
//    public void contentReset(){
//        this.content = "";
//    }
}
