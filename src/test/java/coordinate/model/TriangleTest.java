package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {
    private Triangle triangle;

    @BeforeEach
    void setUp() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14,15), new Point(20,8));
        triangle = new Triangle(points);
    }

    @Test
    void 삼각형을_만들수없는_입력값이_들어왔을때_에러발생하는지_확인(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(Arrays.asList(new Point(10, 10), new Point(20, 20), new Point(30, 30)));
        });
    }

    @Test
    void 삼각형_넓이_제대로_구하는지_확인() {
        assertThat(triangle.getArea()).isEqualTo(29.0, offset(0.00099));
    }
}
