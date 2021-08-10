package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

import java.util.Arrays;
import java.util.List;


public class LineTest {
    private Line line;

    @BeforeEach
    void setUp() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15));
        line = new Line(points);
    }

    @Test
    void 주어진_두점으로_선을_만들수없으면_에러발생() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Line(Arrays.asList(new Point(10, 10), new Point(10, 10)));
        });
    }

    @Test
    void 선길이_제대로_계산하는지_확인() {
        assertThat(line.getArea()).isEqualTo(6.403124, offset(0.00099));
    }
}
