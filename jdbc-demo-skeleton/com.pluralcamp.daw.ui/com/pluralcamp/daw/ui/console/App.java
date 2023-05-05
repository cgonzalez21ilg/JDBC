package com.pluralcamp.daw.ui.console;

import java.util.Scanner;

import org.w3c.dom.events.Event;

public class App {
    public static void main(String[] args) {
       
        Scanner stdin = new Scanner (System.in);

        ColorJDBCDAOImpl colorDAO = new ColorJDBCDAOImpl();
        EventJDBCDAOImpl eventDAO = new EventJDBCDAOImpl();

        try{
            var c = Color c =colorDAO.getColorById(5);
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

        try {
            Event e = eventDAO.getEventById(5);
            if (e != null) {
                System.out.println(e.toString());
            }
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }

        System.out.println("Pulsa una tecla para continuar");
        stdin.nextLine();

        try {
            List<Event> events = eventDAO.getEvents();
            for (Event e : events){
                System.out.println(e.toString());
            }
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }

        System.out.println("Pulsa una tecla para continuar");
        stdin.nextLine();

    }
}
