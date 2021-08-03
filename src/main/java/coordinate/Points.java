package coordinate;

import java.util.Objects;

public class Points {
    // 이것도 포장해야하나..? 일단 스킵..
    private int xPos;
    private int yPos;

    public Points(int xPos, int yPos) {
        if (isNotValuable(xPos) || isNotValuable(yPos)) {
            throw new IllegalArgumentException("좌표의 위치값은 0이상 24이하만 가능합니다.");
        }
        this.xPos = xPos;
        this.yPos = yPos;
    }

    private boolean isNotValuable(double pos) {
        return pos < 0.0 || pos > 24.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points = (Points) o;
        return xPos == points.xPos && yPos == points.yPos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPos, yPos);
    }

    public int getXpos() {
        return this.xPos;
    }

    public int getYpos() {
        return this.yPos;
    }
}
