package org.salesianostriana.dam;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CuentaCorrienteTest {
    // Inicializamos 3 cuentas corrientes para realizar las pruebas.
    CuentaCorriente cc1;
    CuentaCorriente cc2;
    CuentaCorriente cc3;

    // Instanciamos antes de las pruebas las cuentas corrientes.
    @BeforeAll
    public void beforeAll(){
        cc1 = new CuentaCorriente("Daniel", 123456789, 5000);
        cc2 = new CuentaCorriente("Jorge", 321654987, 8000);
        cc3 = new CuentaCorriente("Carlos", 111222333, 6500);
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    // Iniciamos los test con un enfoque de caja negra, con valores límites.

    /**
     * Comprueba un valor positivo muy elevado. Se espera True.
     */
    @Test
    void depositTest1() {
        assertTrue(cc1.deposit(100000));
    }

    /**
     * Comprueba que devuelve True cuando no se inserta cantidad alguna.
     */
    @Test
    void depositTest2() {
        assertTrue(cc1.deposit(0));
    }

    /**
     * Comprueba que devuelve False al introducir una cantidad negativa.
     */
    @Test
    void depositTest3() {
        assertFalse(cc1.deposit(-1000));
    }



}
