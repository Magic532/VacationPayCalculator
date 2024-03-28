package ru.mayorov.vacationpaycalculator.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mayorov.vacationpaycalculator.service.impl.VacationServiceImpl;

public class VacationServiceTests {
    private VacationServiceImpl vacationService = new VacationServiceImpl();

    @Test
    public void testCalculationVacationPay(){
        double salary = 100000;
        int vacationDays = 14;
        String expectedResult = "Сумма отпускных: 47781,57\n" +
                "НДФЛ 13%: 6211,60\n" +
                "К выплате без НДФЛ: 41569,97";
        String actualResult = vacationService.calculationVacationPay(salary,vacationDays);

        Assertions.assertEquals(expectedResult,actualResult, "Фактический результат должен соответствовать ожидаемому");
    }
}
