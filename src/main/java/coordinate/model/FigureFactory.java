package coordinate.model;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FigureFactory {
    private static final String ERROR_WRONG_POINTS = "잘못된 입력값입니다.";
    private static final HashMap<Integer, Function<List<Point>, Figure>> creators = new HashMap<Integer, Function<List<Point>, Figure>>(){{
        put(2, Line::new);
        put(3, Triangle::new);
        put(4, Rectangle::new);
    }};

    public static Figure create(List<Point> points) {
        if (isWrongPoint(points)) {
            throw new IllegalArgumentException(ERROR_WRONG_POINTS);
        }
        return creators.get(points.size()).apply(points);
    }

    private static boolean isWrongPoint(List<Point> points){
        return points == null || points.isEmpty() || points.size() < 2 || points.size() > 4;
    }
}
