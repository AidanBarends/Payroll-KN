package za.ac.mycput.payrollkn.Factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.payrollkn.Domain.Address;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class AddressFactoryTest {

    private static Address address;

    @BeforeEach
    void setUp() {
        address = AddressFactory.createAddress(
                "112",
                "Mermaid Avenue",
                "Parklands",
                "Cape Town",
                8001
        );
    }

    @Test
    void a_address1() {
        assertNotNull(address);
        System.out.println("Address created " + address);
    }

    @Test
    void b_fail_address(){
        Address invalidAddress = AddressFactory.createAddress(
                "121",
                "Arrington Avenue",
                "Parklands",
                "Cape Town",
                332
        );

        assertNull(invalidAddress);
        System.out.println("Address created " + invalidAddress);
    }
}