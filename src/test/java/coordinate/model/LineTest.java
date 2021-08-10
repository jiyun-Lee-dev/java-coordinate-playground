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
    void 선길이_제대로_계산하는지_확인() {
        assertThat(line.getArea()).isEqualTo(6.403124, offset(0.00099));
    }
}
