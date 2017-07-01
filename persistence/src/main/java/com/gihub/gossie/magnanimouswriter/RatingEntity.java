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
class RatingEntity {

	@Id
    @GeneratedValue
    private Long id;
	
	private int numberOfStars;
	
	RatingEntity(int numberOfStars) {
		this.numberOfStars = numberOfStars;
	}
}
