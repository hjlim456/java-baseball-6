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
        Computer computerNumbers = gameStart();
        while (true) {
                User userNumbers = new User(readUserNumbers());
                boolean isCorrect = computerNumbers.compareNumbers(userNumbers);
                if (isCorrect){
                    break;
                }
            }
        }

    private static Computer gameStart() {
        Computer computerNumbers = new Computer(createRandomNumber());
        System.out.println("숫자 야구 게임을 시작합니다.");
        return computerNumbers;
    }


    private static Numbers readUserNumbers() {
        System.out.println("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();

        List<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < userInput.length(); i++) {
            int number = Integer.parseInt(String.valueOf(userInput.charAt(i)));
            userNumbers.add(number);
        }
        return new Numbers(userNumbers);
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
