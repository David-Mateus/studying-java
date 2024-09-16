package compositionex2;

import compositionex2.entities.Client;
import compositionex2.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date(DD/MM/YYYY): ");
        Date clientDate = sdf.parse(sc.next());
        Client client = new Client(clientName, clientEmail, clientDate);

        System.out.print("Enter order data");
        String Clientstatus = sc.nextLine();
        new OrderStatus(OrderStatus.valueOf(Clientstatus));


        sc.close();
    }
}
