import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @CsvSource({
            "l, la vaca lola come pasto en el lodo, 5",
            "h,  hh hh hh hh hh h, 10",
            "k, kk kk lk, 5",
            "s, sss ss ls, 6",
            "a, aaaa aa aaaa aa, 10"
    })

    void contarLetraEnTexto(char caracter, String texto, int resultadoEsperado) throws RepeticionException {
        //when
         int resultado=Main.contarLetraEnTexto(caracter,texto);
        //then
        assertEquals(resultadoEsperado,resultado);
    }
}