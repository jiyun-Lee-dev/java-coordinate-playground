package coordinate.model;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFigure that = (AbstractFigure) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
