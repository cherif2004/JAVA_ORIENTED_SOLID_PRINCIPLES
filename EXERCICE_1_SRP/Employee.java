package EXERCICE_1_SRP;

public class Employee {
    private String name ; 

    public Employee(String name){
    this.name = name ;
    

    }

    public String getName(){
        return name ;
    }

    public void printTimeSheetReport(){
        System.out.println("Time sheet report for Employee : " +name);
    }
}
