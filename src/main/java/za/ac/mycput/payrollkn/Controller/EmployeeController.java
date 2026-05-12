package za.ac.mycput.payrollkn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.payrollkn.Domain.Employee;
import za.ac.mycput.payrollkn.Service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){
        return employeeService.create(employee);
    }

    @GetMapping("/read/{empNum}")
    public Employee read(@PathVariable String empNum){
        return employeeService.read(empNum);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete/{empNum}")
    public boolean delete(@PathVariable String empNum){
        return employeeService.delete(empNum);
    }

    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }



}
