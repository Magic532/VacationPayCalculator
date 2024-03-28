package ru.mayorov.vacationpaycalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/")

public interface VacationController {

    @GetMapping("calculate")
    String calculate(@RequestParam("salary") double salary, @RequestParam("vacationDays") int vacationDays);
}
