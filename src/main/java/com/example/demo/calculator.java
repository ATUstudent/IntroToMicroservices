package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class calculator {
    @GetMapping("/Calculator")
    public String Calculator(@RequestParam float num1, @RequestParam (defaultValue = "0.0") float num2, String maths)
    {
        float total = 0;
        switch(maths)
        {
            case"+":
                total = num1 + num2;
                break;
    
            case"-":
                total = num1 - num2;
                break;
    
            case"*":
                total = num1 * num2;
                break;
    
            case"/":
                if (num2 != 0) {
                    total = num1 / num2;
                } else {
                    return "Error";
                }
                break;
            default:
                return "Error: Invalid operation.";
        }
        return "Total is " + total;
    }
}

