package coordinate.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FigureFactoryTest {
    @Test
    void null_들어오면_에러발생() {
        assertThrows(IllegalArgumentException.class, () -> {
            FigureFactory.create(null);
        });
    }

    @Test
    void 좌표가_1개_들어오면_에러발생() {
        assertThrows(IllegalArgumentException.class, () -> {
            FigureFactory.create(Arrays.asList(new Point(10, 10)));
        });
    }

    @Test
    void 좌표가_5개_들어오면_에러발생() {
        assertThrows(IllegalArgumentException.class, () -> {
            FigureFactory.create(Arrays.asList(new Point(10, 10), new Point(10, 10), new Point(10, 10), new Point(10, 10), new Point(10, 10)));
        });
    }

    @Test
    void 좌표가_2개_들어오면_선이_만들어지는지_확인() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(20, 20));
        assertThat(FigureFactory.create(points)).isEqualTo(new Line(points));
    }

    @Test
    void 좌표가_3개_들어오면_삼각형이_만들어지는지_확인() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(20, 20), new Point(20, 14));
        assertThat(FigureFactory.create(points)).isEqualTo(new Triangle(points));
    }

    @Test
    void 좌표가_4개_들어오면_삼각형이_만들어지는지_확인() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(22, 10),
                new Point(22, 18), new Point(10, 18));
        assertThat(FigureFactory.create(points)).isEqualTo(new Rectangle(points));
    }
}
