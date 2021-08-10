package coordinate.model;

import java.util.List;

public abstract class AbstractFigure implements Figure {
    private static final String POINTS_EMPTY_ERROR_MESSAGE = "잘못된 Point 값 입니다.";
    private final List<Point> points;

    public AbstractFigure(List<Point> points) {
        if (points.isEmpty()) {
            throw new IllegalArgumentException(POINTS_EMPTY_ERROR_MESSAGE);
        }
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }
}
