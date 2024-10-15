import org.example.Aritmetica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AritmeticaTest {
    @Test
    public void testSoma() {
        Aritmetica calculo = new Aritmetica();
        int soma = calculo.area(3,5);
        int soma2 = calculo.area(5,8);
        int soma3 = calculo.area(2,4);
        int testSoma = 20;
        int testSoma2 = 40;
        int testSoma3 = 8;
        assertEquals (soma, testSoma);
        assertEquals(soma2, testSoma);
        assertEquals(soma3, testSoma3);
    }
}
