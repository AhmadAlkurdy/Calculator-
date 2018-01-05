/*
 creating a GUI for a calculator/ non functional and not completed perfectly I 
did not realize the due date is the 29th
citation: I did not read the book but watched few youtube videos where they show 
how to use actionlistner function

Name: Ahmad Alkurdy
date: 11/28/2017
 */

//importing library for GUI functions 
package calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author ahmad
 */
public class Calculator extends JFrame {
 
    /**
     * @param args the command line arguments
     */
    //initialize variables to match the buttons for the user interface
    JButton zero = new JButton("0");
    JButton one = new JButton("  1 ");
    JButton two = new JButton(" 2 ");
    JButton three = new JButton(" 3 ");
    JButton four = new JButton(" 4 ");
    JButton five = new JButton(" 5 ");
    JButton six = new JButton(" 6 ");
    JButton seven = new JButton(" 7 ");
    JButton eight = new JButton(" 8 ");
    JButton nine = new JButton(" 9 ");
    JButton plus = new JButton(" + ");
    JButton minus = new JButton(" -  ");
    JButton times = new JButton(" *  ");
    JButton divide = new JButton(" /  ");
    JButton equals = new JButton("=");
    JButton point = new JButton(" . ");
    String value;
    char operator;
    
    
    //inialize the size of the text area for the user interface
    JTextArea area = new JTextArea(3, 5);
 
    public static void main(String[] args) {
        // 
        Calculator calculator = new Calculator();
        calculator.setSize(250, 500); //setting the user inteface screen size
        calculator.setTitle(" Calculator ");
        calculator.setResizable(false);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //the functuality of the red button
    }
 
    public Calculator() {
        //THE LOCATION OF THE EMPTY WHITE AREA
        add(new JScrollPane(area), BorderLayout.NORTH);
        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new FlowLayout());
 
     //ADDING THE BUTONS TO THE UNSER INTERFACE from left to right downward
        buttonpanel.add(seven);
        buttonpanel.add(eight);
        buttonpanel.add(nine);
        buttonpanel.add(divide);
        buttonpanel.add(four);
        buttonpanel.add(five);
        buttonpanel.add(six);
        buttonpanel.add(times);
        buttonpanel.add(one);
        buttonpanel.add(two);
        buttonpanel.add(three);
        buttonpanel.add(minus);
        buttonpanel.add(zero); 
        buttonpanel.add(point);
        buttonpanel.add(equals);
        buttonpanel.add(plus);
       
 //the layout of the button
        add(buttonpanel, BorderLayout.CENTER);
        area.setForeground(Color.BLACK);
        area.setBackground(Color.WHITE);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
    }
}