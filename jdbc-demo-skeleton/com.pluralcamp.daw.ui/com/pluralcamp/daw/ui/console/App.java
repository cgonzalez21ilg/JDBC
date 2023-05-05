package com.pluralcamp.daw.ui.console;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       
        Scanner stdin = new Scanner (System.in);

        ColorJDBCDAO colorDAO = new ColorJDBCDAO();
        EventJDBCDAO eventDAO = new EventJDBCDAO();

        try{
            Color c =colorDAO.getColorById(5);
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
        }
    }
}
