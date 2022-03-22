package com.student;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.TableColumnModel;
 
public class Main {
 
    public static void main(String[] args) {
       
        final JFrame frame = new JFrame("Book a group tuition lesson");
 
      
        String[] columns = new String[] {
            "Id", "Name", "Price", "Lesson Subjects", "Either Day "
        };
 
       
        Object[][] data = new Object[][] {
            {1, "Thomas", "200", "English", "Sunday" },
            {2, "Jean", "300", "Math", "Saturday" },
            {3, "Yohan", "400", "Verbal Reasoning", "Evening" },
            {4, "Emily", "600", "Non-verbal","Morning" },
            {5, "Alex", "100", "Reasoning", "Afternoon" },
        };
 
        
        JTable table = new JTable(data, columns);

        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(40);
        columnModel.getColumn(2).setPreferredWidth(40);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
    
        JScrollPane scroll = new JScrollPane(table);
        table.setFillsViewportHeight(true);
 
        JLabel labelHead = new JLabel("Centre offers different Group ");
        labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
 
        frame.getContentPane().add(labelHead,BorderLayout.PAGE_START);
   
        frame.getContentPane().add(scroll,BorderLayout.CENTER);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 180);
        frame.setVisible(true);
    }
}