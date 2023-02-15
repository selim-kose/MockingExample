package com.example;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EmployeeManagerTest {

    private EmployeeRepository employeeRepository;
    private EmployeeManager employeeManager;
    List<Employee> employees;
    BankServiceDummy bankServiceDummy;


    @BeforeAll
    void setup() {
        employeeRepository = mock(EmployeeRepository.class);
        bankServiceDummy = new BankServiceDummy();
        employeeManager = new EmployeeManager(employeeRepository, bankServiceDummy);


        Employee employee1 = new Employee("1",10000.00);
        Employee employee2 = new Employee("2",20000.00);
        employees = Arrays.asList(employee1,employee2);

    }


}
