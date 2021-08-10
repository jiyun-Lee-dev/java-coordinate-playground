package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

import java.util.Arrays;
import java.util.List;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(22, 10),
                new Point(22, 18), new Point(10, 18));
        rectangle = new Rectangle(points);
    }

    @Test
    void 직사각형으로_안만들어지면_에러발생() {
        assertThrows(IllegalArgumentException.class, () -> {
            List<Point> points = Arrays.asList(new Point(10, 10), new Point(10, 17),
                    new Point(22, 18), new Point(10, 18));
            new Rectangle(points);
        });
    }

    @Test
    void 넓이_제대로_구하는지_확인() {
        assertThat(rectangle.getArea()).isEqualTo(96);
    }
}
