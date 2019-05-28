package base.controller;

import base.dao.CustomerDAO;
import base.dao.CustomerDAOImp;
import base.entity.Customer;
import base.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String listCustomer(Model theModel){

        List<Customer> customerList = customerService.getCustomers();

        theModel.addAttribute("customers",customerList);

        return "list-customers";
    }

}
