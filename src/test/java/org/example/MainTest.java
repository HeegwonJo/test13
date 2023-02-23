package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    @Test
    @DisplayName("예각이 들어오면 1을 리턴한다.")
    void tests () {
        assertThat(new Main().solution(80)).isEqualTo(1);
    }
    @Test
    @DisplayName("직각이 들어오면 2을 리턴한다.")
    void test1 () {
        assertThat(new Main().solution(90)).isEqualTo(2);
    }

    @Test
    @DisplayName("둔각이 들어오면 3을 리턴한다.")
    void test2 () {
        assertThat(new Main().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("평각이 들어오면 4를 리턴한다.")
    void test3 () {
        assertThat(new Main().solution(180)).isEqualTo(4);
    }

}