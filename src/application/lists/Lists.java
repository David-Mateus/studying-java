package application.lists;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
//  List: ArrayList ou LinkedList
public class Lists {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Agenda> agenda = new ArrayList<>();

        agenda.add(new Agenda("David1", 11111));
        agenda.add(new Agenda("David2", 11111));
        agenda.add(new Agenda("David3", 11111));
        for (Agenda a: agenda){
            System.out.println(a.getName());
        }











        sc.close();
    }
}
