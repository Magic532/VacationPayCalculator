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
    public String calculate(double salary, int vacationDays) {
        return vacationService.calculationVacationPay(salary, vacationDays);
    }
}