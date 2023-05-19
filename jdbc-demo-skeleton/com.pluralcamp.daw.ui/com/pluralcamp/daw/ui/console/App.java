package com.pluralcamp.daw.ui.console;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.events.Event;
import com.pluralcamp.daw.entities.core.Color;
import com.pluralcamp.daw.persistence.daos.impl.jdbc.ColorDAOJDBCImpl;
import com.pluralcamp.daw.persistence.daos.impl.jdbc.EventDAOJDBCImpl;
import com.pluralcamp.daw.persistence.exceptions.DAOException;

public class App {
    public static void main(String[] args) {
       
        Scanner stdin = new Scanner (System.in);

        ColorDAOJDBCImpl colorDAO = new ColorDAOJDBCImpl();
        //EventDAOJDBCImpl eventDAO = new EventDAOJDBCImpl();

        try{
            Color c =colorDAO.getColorById(8);
            if(c != null) {
                System.out.println(c.toString());
            }
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }

        System.out.println("Pulsa una tecla para continuar");
        stdin.nextLine();

        try{
            List<Color> colors = colorDAO.getColors();
            for (Color c : colors) {
                System.out.println(c.toString());
            }
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }

        System.out.println("Pulsa una tecla para continuar");
        stdin.nextLine();

    //     try {
    //         Event e = eventDAO.getEventById(5);
    //         if (e != null) {
    //             System.out.println(e.toString());
    //         }
    //     } catch (DAOException ex) {
    //         System.out.printf("Error:: %s %n", ex.getMessage());
    //     }

    //     System.out.println("Pulsa una tecla para continuar");
    //     stdin.nextLine();

    //     try {
    //         List<Event> events = eventDAO.getEvents();
    //         for (Event e : events){
    //             System.out.println(e.toString());
    //         }
    //     } catch (DAOException ex) {
    //         System.out.printf("Error:: %s %n", ex.getMessage());
    //     }

    //     System.out.println("Pulsa una tecla para continuar");
    //     stdin.nextLine();

    

}
}
