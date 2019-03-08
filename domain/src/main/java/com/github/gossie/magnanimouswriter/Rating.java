package com.github.gossie.magnanimouswriter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
class Rating {

    private final int numberOfStars;
}
