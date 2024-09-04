package baseball;

import baseball.domain.Computer;
import baseball.domain.Numbers;
import baseball.domain.User;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class MainController {
    public void run() {
        //게임 초기화
            //컴퓨터에 숫자 초기화
            //사용자 입력받기

        Computer computer = new Computer(createRandomNumber());
        //게임 시작
            //컴퓨터 숫자와 사용자 숫자 비교
        //게임 종료
            // 숫자가 일치하면 종료
            // 재시작 여부 묻고 재시작 or 종료
    }



    private static Numbers createRandomNumber() {
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
            if (numbers.size() == 3) {
                break;
            }
        }
        return new Numbers(numbers);
    }
}
