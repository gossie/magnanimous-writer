package com.gihub.gossie.magnanimouswriter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
class MovieEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String genre;

    MovieEntity(String name, String genre) {
        this.id = null;
        this.name = name;
        this.genre = genre;
    }
}
