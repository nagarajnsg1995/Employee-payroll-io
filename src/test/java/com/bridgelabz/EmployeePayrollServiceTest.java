package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

    public class EmployeePayrollServiceTest {
        @Test
        public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries() {
            EmployeePayrollData[] arrayOfEmp = {
                    new EmployeePayrollData(1, "nagaraj", 10000),
                    new EmployeePayrollData(2, "pkk", 20000),
                    new EmployeePayrollData(3, "akk", 30000)
            };
            EmployeePayrollService employeePayRollService;          //uc3 save the details in a file --open terminal enter->> more payroll-file.txt
            employeePayRollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
            employeePayRollService.writeEmployeePayrollDara(EmployeePayrollService.IOService.FILE_IO);
            long entries = employeePayRollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
            Assert.assertEquals(3, entries);
        }
    }


