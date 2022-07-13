package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeePayrollServiceTest {
    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmp = {
                new EmployeePayrollData(1, "nagaraj", 14000),
                new EmployeePayrollData(2, "pkk", 38000),
                new EmployeePayrollData(3, "abc", 12000)
        };
        EmployeePayrollService employeePayRollService;
        employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayRollService.writeEmployeePayrollDara(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entries);
        employeePayRollService.printData(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Employee Payroll Service Number of Entries is : " + entries);
    }

    @Test
    public void readTheEmployeePayrollFile() {
        EmployeePayrollService employeePayRollService = new EmployeePayrollService();
        employeePayRollService.readEmployeePayroll(EmployeePayrollService.IOService.FILE_IO);
    }
}

