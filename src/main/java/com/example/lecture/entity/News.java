package com.example.lecture.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long newsSeq;

    @Column(length = 20, nullable = false)
    private String newsNo;

    @Column(length = 20, nullable = false)
    private String category;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(length = 2000, nullable = false)
    private String address;

    @Column(length = 2000, nullable = false)
    private String image;

    @Builder
    public News(String newsNo, String category, String title, String address, String image) {
        this.newsNo = newsNo;
        this.address = address;
        this.category = category;
        this.title = title;
        this.image = image;
    }
}