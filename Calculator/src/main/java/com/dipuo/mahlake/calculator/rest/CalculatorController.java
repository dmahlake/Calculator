package com.dipuo.mahlake.calculator.rest;

import com.dipuo.mahlake.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    CalculatorService service;

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b)
    {
        return service.additionalOperator(a, b);
    }

    @GetMapping("/subtract")
    public int minus(@RequestParam int a, @RequestParam int b)
    {
        return service.subtractionOperator(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b)
    {
        return service.multiplicationOperator(a, b);
    }

    @GetMapping("/division")
    public String divide(@RequestParam int a, @RequestParam int b)
    {

        return service.divisionOperator(a, b);
    }

}
