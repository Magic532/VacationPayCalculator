package ru.mayorov.vacationpaycalculator.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.mayorov.vacationpaycalculator.controller.impl.VacationControllerImpl;
import ru.mayorov.vacationpaycalculator.service.VacationService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(VacationControllerImpl.class)
public class VacationControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private VacationService vacationService;

    @Test
    void calculationVacationPayTest() throws Exception{
        double salary = 100000;
        int vacationDays = 14;

        mockMvc.perform(MockMvcRequestBuilders.get("/calculate")
                .param("salary", String.valueOf(salary))
                .param("vacationDays", String.valueOf(vacationDays)))
                .andExpect(status().isOk());
    }
}
