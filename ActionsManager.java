package com.lighthawk.ctwms;

import java.util.Stack;
import java.util.Scanner;

public class ActionsManager {
    
    private Stack<String> actionsHistory = new Stack<>();
    
    public void viewActionHistory() {
        // Shows everything the user has done.
    }
    
    public void undoLastAction() {
        // Undo the last action.
    }
    
    public void clearHistory() {
        // I guess this just clears the Stack.
        actionsHistory.empty(); // Like this?
    }
}
