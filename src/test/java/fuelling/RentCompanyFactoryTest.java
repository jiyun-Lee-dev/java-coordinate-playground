package fuelling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class RentCompanyFactoryTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception { // exception은 뭘까
        RentCompanyFactory rentCompanyFactory = new RentCompanyFactory();
        RentCompany rentCompany = rentCompanyFactory.create();
        rentCompany.addCar(new Sonata(150));
        rentCompany.addCar(new K5(260));
        rentCompany.addCar(new Sonata(120));
        rentCompany.addCar(new Avante(300));
        rentCompany.addCar(new K5(390));

        String report = rentCompany.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                "K5 : 20리터" + NEWLINE +
                "Sonata : 12리터" + NEWLINE +
                "Avante : 20리터" + NEWLINE +
                "K5 : 30리터" + NEWLINE
        );
    }
}
