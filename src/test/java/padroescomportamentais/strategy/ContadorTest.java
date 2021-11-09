package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContadorTest {

    @Test
    void deveSomarContaContador() {
        Contador contador = new Contador();
        contador.somarConta(230.0f, 30.0f);
        assertEquals(260.0f, contador.getConta());
    }

    @Test
    void deveSubtrairContaContador() {
        Contador contador = new Contador();
        contador.subtrairConta(60.0f, 5.0f);
        assertEquals(55.0f, contador.getConta());
    }

    @Test
    void deveMultiplicarContaContador() {
        Contador contador = new Contador();
        contador.multiplicarConta(100.0f, 2f);
        assertEquals(200.0f, contador.getConta());
    }

    @Test
    void deveDividirContaContador() {
        Contador contador = new Contador();
        contador.dividirConta(500.0f, 2.0f);
        assertEquals(250.0f, contador.getConta());
    }

    @Test
    void deveCalcularMediaContaContador() {
        Contador contador = new Contador();
        contador.calcularMediaContas(100.0f, 110.0f);
        assertEquals(105.0f, contador.getConta());
    }

}