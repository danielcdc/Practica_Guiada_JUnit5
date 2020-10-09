package org.salesianostriana.dam;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void depositTest1(){
        CuentaCorriente cc1 = new CuentaCorriente("Cuenta1", 123123, 5);
        assertTrue(cc1.deposit(1));
    }

    @Test
    void depositTest2(){
        CuentaCorriente cc1 = new CuentaCorriente("Cuenta1", 123123, 5);
        assertFalse(cc1.deposit(-1));
    }
}
