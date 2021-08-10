package coordinate.model;

import java.util.List;

public class Line extends AbstractFigure {
    private static final String INFO_START_MESSAGE = "두 점 사이의 거리는 ";
    private static final String ERROR_IS_NOT_LINE = "잘못된 입력값입니다.";

    public Line(List<Point> points) {
        super(points);
        if (isNotLine(points)) {
            throw new IllegalArgumentException(ERROR_IS_NOT_LINE);
        }
    }

    private boolean isNotLine(List<Point> points) {
        return points.get(0).getSlope(points.get(1)) == 0;
    }

    @Override
    public double getArea() {
        return getPoints().get(0).calculateDistance(getPoints().get(1));
    }

    @Override
    public String getAreaInfo() {
        return INFO_START_MESSAGE + getArea();
    }
}
