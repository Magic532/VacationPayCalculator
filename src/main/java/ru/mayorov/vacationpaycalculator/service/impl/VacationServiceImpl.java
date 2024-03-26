package ru.mayorov.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;
import ru.mayorov.vacationpaycalculator.service.VacationService;

@Service
public class VacationServiceImpl implements VacationService {

    @Override
    public double calculationVacantionPay(double salary, int vacationDays) {
        return salary/365*vacationDays;
    }
}
