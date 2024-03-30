package ru.mayorov.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;
import ru.mayorov.vacationpaycalculator.service.VacationService;

@Service
public class VacationServiceImpl implements VacationService {

    @Override
    public String calculationVacationPay( double salary, int vacationDays) {

        double vacationPayBeforeTax = salary/29.3*vacationDays;
        double vacationPayAfterTax = vacationPayBeforeTax*0.87;
        double tax = vacationPayBeforeTax - vacationPayAfterTax;

        if (salary<10000 || salary>1000000){
            return "Укажите ежемесячный доход в диапозоне от 10 000 до 1 000 000";
        }

        if (vacationDays<1 || vacationDays>1000){
            return "Укажите количество дней отпуска в диапозоне от 1 до 1 000";
        }

        return String.format("Сумма отпускных: %.2f" + "\n" +
                "НДФЛ 13%%: " + "%.2f" + "\n" +
                "К выплате без НДФЛ: %.2f", vacationPayBeforeTax, tax, vacationPayAfterTax);
    }
}
