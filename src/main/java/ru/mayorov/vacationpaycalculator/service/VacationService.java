package ru.mayorov.vacationpaycalculator.service;

import org.springframework.stereotype.Service;


public interface VacationService {

    double calculationVacantionPay(double salary, int vacationDays);
}
