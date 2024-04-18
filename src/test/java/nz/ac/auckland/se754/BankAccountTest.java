package nz.ac.auckland.se754;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    BankAccount ba;

    @BeforeEach
    public void setUp() {
        ba = new BankAccount();
    }

    @Test
    public void test1() {
        ba.deposit(10);
        assertEquals(12, ba.getBalance());
    }


    @Test
    public void test2() {
        ba.deposit(10);
        ba.withdraw(5);
        assertEquals(7, ba.getBalance());
    }

    @Test
    public void test3() {
        assertThrows(BalanceNotEnoughException.class, () -> {
            ba.withdraw(1000000);
        });
    }
}