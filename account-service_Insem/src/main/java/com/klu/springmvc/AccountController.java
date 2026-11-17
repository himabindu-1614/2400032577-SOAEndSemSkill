package com.klu.springmvc;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/api/v1/internal/accounts")
    public String getAllAccounts() {
        return "Banking Account Service: All accounts retrieved successfully";
    }

    @GetMapping("/api/v1/internal/accounts/{id}")
    public String getAccountById(@PathVariable String id) {
        return "Banking Account Service: Account details for ID: " + id;
    }
}
  