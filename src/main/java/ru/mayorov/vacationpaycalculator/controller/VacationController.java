package ru.mayorov.vacationpaycalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
public interface VacationController {
    @GetMapping("calculate")
    double calculate(@RequestParam("salary") double salary, @RequestParam("vacationDays") int vacationDays);

}
