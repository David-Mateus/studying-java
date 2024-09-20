package heritage.exercise.funcionario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int number = sc.nextInt();
        for(int i = 0; i < number; i++){
            System.out.println("Employee: "+"#"+ (i+1));
            System.out.print("Outsourced: ");
            char typeEmployee = sc.next().charAt(0);

            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePorHours = sc.nextDouble();
            if(typeEmployee == 'y'){
                System.out.println("Additional charge: ");
                double additional = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hours, valuePorHours, additional);
                employees.add(employee);
            }else{
                Employee employee = new Employee(name, hours, valuePorHours);
                employees.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for(Employee employee: employees){
            System.out.println(employee.getName()+"$ "+ employee.payment());
        }

        sc.close();

    }
}
