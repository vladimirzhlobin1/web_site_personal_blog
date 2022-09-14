package com.mber.persistense.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(of="id")
@Entity
public class Post {
    @Id
    @ToString.Exclude//go away
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    @Lob
    private String text;
    @Lob
    private String anons;

    private int views;
}

