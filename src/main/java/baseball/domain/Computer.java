package baseball.domain;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class Computer {

    private final Numbers computerNumbers;

    public Computer(Numbers computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    public List<Integer> getComputerNumbers() {
        return computerNumbers.getNumbers();
    }



    private static boolean askForRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();

        if (input.equals("1")) {
            return false; // 게임 재시작
        } else if (input.equals("2")) {
            return true; // 게임 종료
        } else {
            // 유효하지 않은 입력일 경우 다시 입력 받기
            System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            return askForRestart();
        }
    }
    public boolean compareNumbers(User userNumbers) {
        List<Integer> computerNumberList = computerNumbers.getNumbers();
        List<Integer> userNumberList = userNumbers.getUserNumbers();

        int strikes = 0;
        int balls = 0;

        // 스트라이크, 볼체크
        for (int i = 0; i < userNumberList.size(); i++) {
            int userNumber = userNumberList.get(i);

            if (computerNumberList.contains(userNumber) && computerNumberList.indexOf(userNumber) != i) {
                balls++; // 값은 일치하지만 위치가 다르면 볼
            }
            if (userNumberList.get(i) == computerNumberList.get(i)) {
                strikes++; // 값과 위치가 모두 일치하면 스트라이크
            }
        }


        if (strikes == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return askForRestart();
        }
        if (strikes == 0 && balls == 0) {
            System.out.println("낫싱");
            return false;
        }

        System.out.printf("%d볼 %d스트라이크\n", balls, strikes);
        return false;

    }
}
