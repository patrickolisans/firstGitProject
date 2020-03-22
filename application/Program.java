package application;
import java.util.Scanner;
import entities.Employee;
import entities.OutSourceEmployee;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        char outSourced;
        String name;
        Integer hours;
        Double valuePerHour, additionalCharge;
        List<Employee> list= new ArrayList<>();
        System.out.print("Enter the number of employees:");
        n= sc.nextInt();
        for (int i=1; i<=n;i++){
            System.out.println("Employee # "+i+" data:");
            System.out.print("Outsourced (y/n)?");
            outSourced= sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            name= sc.nextLine();
            System.out.print("Hours: ");
            hours= sc.nextInt();
            System.out.print("Value per hour: ");
            valuePerHour= sc.nextDouble();
            if (outSourced=='y'){
                System.out.print("Additional cahrge: ");
                additionalCharge= sc.nextDouble();
                OutSourceEmployee emp= new OutSourceEmployee(name, hours, valuePerHour, additionalCharge);       
                list.add(emp);                                                                                                                                                                                                                                                                                                                                                              
            }
            if (outSourced=='n'){
                Employee emp= new Employee(name, hours, valuePerHour);
                list.add(emp);                                                                                                                                                                                                                                                                                                                                                                      
            }
        }    
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp: list){
            System.out.println(emp.getName() +" - "+String.format("%.2f",emp.payment())) ;
        }    
        
        sc.close();        
    }
}