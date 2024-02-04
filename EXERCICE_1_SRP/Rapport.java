package EXERCICE_1_SRP;

public class Rapport {
    public void printTimeSheetReport(EmployeeSet employeesSet) {
        EmployeeSet employeeSet = new EmployeeSet(null);
        System.out.println("Time sheet report for employee: " + employeeSet.getName());
    }

}
