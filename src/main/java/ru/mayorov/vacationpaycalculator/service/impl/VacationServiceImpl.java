package ru.mayorov.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;
import ru.mayorov.vacationpaycalculator.service.VacationService;

@Service
public class VacationServiceImpl implements VacationService {

    @Override
    public String calculationVacationPay(double salary, int vacationDays) {
        double vacationPayBeforeTax = salary/29.3*vacationDays;
        double vacationPayAfterTax = vacationPayBeforeTax*0.87;
        double tax = vacationPayBeforeTax - vacationPayAfterTax;
        return String.format("Сумма отпускных: %.2f" + "\n" +
                "НДФЛ 13%%: " + "%.2f" + "\n" +
                "К выплате без НДФЛ: %.2f", vacationPayBeforeTax, tax, vacationPayAfterTax);
    }
}
