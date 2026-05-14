package za.ac.mycput.payrollkn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.payrollkn.Domain.Address;
import za.ac.mycput.payrollkn.Service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/create")
    public Address createAddress(@RequestBody Address address){
        return addressService.create(address);
    }

    @GetMapping("/read/{postalCode}")
    public Address readAddress(@PathVariable Integer postalCode){
        return addressService.read(postalCode);
    }

    @PutMapping("/update")
    public Address updateAddress(@RequestBody Address address){
        return addressService.update(address);
    }

    @DeleteMapping("/delete/{postalCode}")
    public boolean deleteAddress(@PathVariable Integer postalCode){
        return this.addressService.delete(postalCode);
    }

    @GetMapping("/getAll")
    public List<Address> getAllAddress(){
        return addressService.getAll();
    }

}
