package ru.mayorov.vacationpaycalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The interface Vacation controller.
 */
@RequestMapping("/")
public interface VacationController {

    /**
     * Method for calculating vacation pay.
     *
     * @param salary       average monthly salary
     * @param vacationDays number of vacation days
     * @return vacation pay amount in String format
     */
    @GetMapping("calculate")
    String calculate(@RequestParam(name="salary") double salary,
                     @RequestParam(name = "vacationDays") int vacationDays);
}
