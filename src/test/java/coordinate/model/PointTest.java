package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointTest {
    @Test
    void 생성되는지_확인() {
        assertThat(new Point(1, 2)).isEqualTo(new Point(1, 2));
    }

    @Test
    void 잘못된_값_입력하면_에러발생하는지_확인() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(0, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(25, 1);
        });
    }

    @Test
    void 주어진_좌표값이랑_같은지_확인() {
        assertThat(new Point(1, 2).isSamePos(1, 2)).isTrue();
    }
}
