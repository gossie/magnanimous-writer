package com.gihub.gossie.magnanimouswriter;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
    @OneToMany(cascade=CascadeType.ALL)
    private List<RatingEntity> ratings;

    MovieEntity(String name, String genre) {
        this.name = name;
        this.genre = genre;
        this.ratings = new ArrayList<>();
    }
    
    void addRating(RatingEntity rating) {
    	ratings.add(rating);
    }
}
