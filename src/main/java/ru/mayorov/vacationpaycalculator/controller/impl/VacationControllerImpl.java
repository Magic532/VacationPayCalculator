package ru.mayorov.vacationpaycalculator.controller.impl;


import org.springframework.web.bind.annotation.RestController;
import ru.mayorov.vacationpaycalculator.controller.VacationController;
import ru.mayorov.vacationpaycalculator.service.VacationService;

@RestController
public class VacationControllerImpl implements VacationController {

    private final VacationService vacationService;


    public VacationControllerImpl(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @Override
    public double calculate(double salary, int vacationDays) {
        System.out.println(salary + " " + vacationDays);
        return vacationService.calculationVacantionPay(salary, vacationDays);
    }
}
