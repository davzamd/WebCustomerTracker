package base.controller;

import base.entity.Customer;
import base.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/list")
    public String listCustomer(Model theModel) {

        List<Customer> customerList = customerService.getCustomers();

        theModel.addAttribute("customers", customerList);

        return "list-customers";
    }

    @GetMapping("/showFromForAdd")
    public String showFormForAdd(Model model) {

        Customer customer = new Customer();

        model.addAttribute("customer", customer);

        return "customer-add-form";
    }

    @GetMapping("/showFromForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {

        Customer customer = customerService.getCustomerById(id);

        model.addAttribute("customer", customer);

        return "customer-add-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

}
