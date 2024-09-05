package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    void compareNumbersTest() {
        //given
        Computer computerNumbers = new Computer(new Numbers(List.of(1,2,3)));
        User userNumbers = new User(new Numbers(List.of(1,2,7)));
        //when
        Computer.compareNumbers(userNumbers);
        //then
    }

    @Test
    void askForFinishGame() {
    }
}