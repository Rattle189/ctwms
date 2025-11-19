package com.lighthawk.ctwms;

import java.util.Scanner; // Yeah we're going to need this for user input

public class Main {
    // le menu. I don't like writing it underneath main
    void showMenu() {
        System.out.println("=====================");
        System.out.println("CAMPUS TASK WORKFLOW SYSTEM");
        System.out.println("=====================");
        System.out.println("1. Manage Personnel (LinkedList)\n2. Manage Task Requests (Queue)\n3. Service Catalog (ArrayList/List)\n4. Undo History (Stack)\n5. Exit");
        System.out.println("Choose option: ");
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        /* So like, here are the objects that we'll be using.
         I don't know if the names are good or fitting, subject for change? */
        PersonnelManager campusPersonnel = new PersonnelManager();
        ActionsManager userActions = new ActionsManager();
        TaskQueueManager personnelTasks = new TaskQueueManager();
        CampusServicesCatalog availableServices = new CampusServicesCatalog();
        
        int menuChoice; // Initialize a variable we'll be using for keeping track of what the user chooses
       
        do {
            // PSUEDO CODE: show/call the menu here?
            
            menuChoice = userInput.nextInt(); // Prompts the user for an input
            switch(menuChoice) {
                /*
                case 1 -> something; // Call the personnel manager
                case 2 -> something; // Call the task request/queue manager
                case 3 -> something; // Call the service catalog manager
                case 4 -> something; // I guess show the recently done actions by the user?
                case 5 -> System.out.println("Exiting program!"); // */
            }
        } while(menuChoice != 0);
        
        userInput.close(); // Stops prompting the user for inputs once no longer necessary.
    }
}
