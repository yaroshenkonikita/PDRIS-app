package ru.sber.pdris;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("PDRIS")
@Feature("Calculator")
@ExtendWith(AllureJunit5.class)
final class CalculatorTest {

    @Test
    @Owner("qa")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Проверка сложения двух целых чисел")
    void add_works() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
}
