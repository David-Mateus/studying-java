package application.entities;

import application.Enumeracao.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args){
//        Order v = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
//        System.out.println(v.toString());
        Order v1 = new Order(1080, new Date(), OrderStatus.valueOf("PENDING_PAYMENT"));
        System.out.println(v1.toString());

    }
}
