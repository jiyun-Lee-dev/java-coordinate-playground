package coordinate.view;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// 분리할까 생각했는데, 어차피 입력 형식이 정해져있어서 inputview에서 point 만드는 걸로
public class InputView {
    private static final String INPUT_START_MESSAGE = "좌표를 입력하세요.";
    private static Scanner scanner = new Scanner(System.in);

    public static Figure inputPoints() {
        System.out.println(INPUT_START_MESSAGE);
        return getFigure(scanner.nextLine());
    }

    public static Figure getFigure(String input) {
        try {
            input = input.replaceAll(" ", "");
            List<Point> points = generatePoints(input);
            return FigureFactory.create(points);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return inputPoints();
        }
    }

    private static List<Point> generatePoints(String input) {
        List<String[]> posList = getPosList(input);
        List<Point> points = new ArrayList<>();
        for (String[] pos : posList) {
            points.add(new Point(Integer.parseInt(pos[0]), Integer.parseInt(pos[1])));
        }
        return points;
    }

    private static List<String[]> getPosList(String input) {
        List<String[]> result = Pattern.compile("-")
                .splitAsStream(input)
                .map(points -> points.replace("(", "").replace(")", "").split(",", 2))
                .collect(Collectors.toList());
        return result;
    }
}
