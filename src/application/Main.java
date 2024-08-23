package application;

import entities.poo.*;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Triangle x, y;
//        x = new Triangle();
//        y = new Triangle();
//        System.out.println("Triangle X: ");
//        x.xT = sc.nextDouble();
//        x.yT = sc.nextDouble();
//        x.zT = sc.nextDouble();
//        System.out.println("Triangle Y: ");
//        y.xT = sc.nextDouble();
//        y.yT = sc.nextDouble();
//        y.zT = sc.nextDouble();
//
//        double triangle1 = x.area();
//        double triangle2 = y.area();
//
//        if(triangle1 > triangle2){
//            System.out.println("Larger area : X %.2f " + triangle1);
//        }else{
//            System.out.println("Larger area : Y %.2f " + triangle2);
//        }
//        Product product;
//        product = new Product();
//
//        product.name = sc.next();
//        product.price = sc.nextDouble();
//        product.quantity= sc.nextInt();
//
//        System.out.println("Product data: " + product.informationProduct());
//        System.out.println("Enter the number of products to be added in Stock: ");
//        int addProduct = sc.nextInt();
//        product.addProducts(addProduct);
//        System.out.println("Product data: " + product.informationProduct());
//        System.out.prinStudenttln("Enter the number of products to be remoed in Stock: ");
//        int removeProduct = sc.nextInt();
//        product.removeProducts(removeProduct);
//        System.out.println("updated data " + product.informationProduct());

//        Rectangle rectangle = new Rectangle();
//        rectangle.width = sc.nextDouble();
//        rectangle.height = sc.nextDouble();
//        System.out.println(rectangle.toString());
//        Employee employee = new Employee();
//        employee.name = sc.next();
//        employee.grossSalary = sc.nextDouble();
//        employee.tax = sc.nextDouble();
//        System.out.println(employee.netSalary());
//        System.out.println("Adicione incremnto");
//        double increment = sc.nextDouble();
//        employee.increaseSalary(increment);
//        System.out.println(employee.toString());
        Student student = new Student();
        student.nameStudent = sc.next();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();
        System.out.println(student.result());
        sc.close();

    }
}