package prova2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MinicarregadeiraTest {
    Minicarregadeira miniCar1, miniCar2;
    Frota frota1;

    @BeforeEach
    void inicializador(){
        miniCar1 = new Minicarregadeira(200.0,900.0,90.0);
        miniCar2 = new Minicarregadeira(200.0,800.0,90.0);
        frota1 = new Frota();

        frota1.cadastrarMiniCar(200.0,900.0,90.0);
        frota1.cadastrarMiniCar(200.0,800.0,90.0);
    }

    @Test
    void testGerarId() {
        assertEquals(1,  miniCar1.getId());
        assertEquals(2 , miniCar2.getId());
    }

    @Test
    void consultar(){
        String exp = "(3, 200.0, 900.0, 90.0, geral) | (4, 200.0, 800.0, 90.0, geral) | ";

        assertEquals(exp, frota1.consultar("geral"));
    }
}