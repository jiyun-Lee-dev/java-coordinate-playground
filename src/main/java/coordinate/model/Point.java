package coordinate.model;

import java.util.Objects;

public class Point {
    private static final int MIN = 1;
    private static final int MAX = 24;
    private static final String OUT_OF_RANGE_ERROR_MESSAGE
            = "잘못된 입력값입니다. 좌표의 범위는 " + Point.MIN + "부터 " + Point.MAX + "까지만 가능합니다.";
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if (checkOfRange(x, y)) {
            throw new IllegalArgumentException(OUT_OF_RANGE_ERROR_MESSAGE);
        }
        this.x = x;
        this.y = y;
    }

    private boolean checkOfRange(int x, int y) {
        return outOfRange(x) || outOfRange(y);
    }

    private boolean outOfRange(int value) {
        return value < MIN || value > MAX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public boolean isSamePos(int x, int y) {
        return this.x == x && this.y == y;
    }
}
