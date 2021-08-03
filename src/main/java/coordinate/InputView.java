package coordinate;

import java.util.Scanner;

public class InputView {
    public String getInputForFigure() {
        System.out.println("좌표를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
