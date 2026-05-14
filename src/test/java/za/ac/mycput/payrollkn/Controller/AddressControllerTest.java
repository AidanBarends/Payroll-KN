package za.ac.mycput.payrollkn.Controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.mycput.payrollkn.Domain.Address;
import za.ac.mycput.payrollkn.Factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AddressControllerTest {

    @Autowired
    private AddressController addressController;

    private Address address;

    @BeforeAll
    void setUp() {
        address = AddressFactory.createAddress(
                "25",
                "Arrington Avenue",
                "Lansdowne",
                "Cape Town",
                8000
        );
    }

    @Test
    void a_createAddress() {
        Address created =  addressController.createAddress(address);
        assertNotNull(created);
        System.out.println("Created address: " + created);
    }

    @Test
    void b_readAddress() {
        Address read = addressController.readAddress(address.getPostalCode());
        assertNotNull(read);
        System.out.println("Read address: " + read);
    }

    @Test
    void c_updateAddress() {
        Address updated = new Address.Builder()
                .copy(address)
                .setStreetName("HertzogBolevoard")
                .build();
        Address result = addressController.updateAddress(updated);
        assertNotNull(result);
        System.out.println("Updated address: " + result);
    }

    @Test
    void d_deleteAddress() {
        boolean deleted = addressController.deleteAddress(address.getPostalCode());
        assertNotNull(deleted);
        System.out.println("Deleted address: " + deleted);
    }

    @Test
    void e_getAllAddress() {
        assertNotNull(addressController.getAllAddress());
        System.out.println("All address: " + addressController.getAllAddress());

    }
}