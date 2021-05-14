package com.song.board.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
// -> 선언된 모든 final 필드가 포함된 생성자를 생성해 줍니다.
// -> final이 없는 필드는 생성자에 포함되지 않습니다.
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
