package ru.mayorov.vacationpaycalculator.service;

/**
 * The interface Vacation service.
 */
public interface VacationService {

    /**
     * Calculation vacation pay.
     *
     * @param salary       average monthly salary
     * @param vacationDays number of vacation days
     * @return vacation pay amount in String format
     */
    String calculationVacationPay(double salary, int vacationDays);
}
