package HotelReversationSystem.HotelReservationSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        new Admin();
    }

    public Admin() {

        setUndecorated(true);
        setBounds(530, 200, 800, 294);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        // Image loading and setting
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelReversationSystem/Ions/admin.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(320, 0, 500, 325);
        add(l1);

        // Button to Add Employee
        JButton btnAddEmployee = new JButton("Add Employee");
        btnAddEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AddEmployee emp = new AddEmployee(); // Open the AddEmployee window
                    emp.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Add Employee: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnAddEmployee.setBounds(50, 70, 200, 30);
        btnAddEmployee.setBackground(Color.BLACK);
        btnAddEmployee.setForeground(Color.WHITE);
        contentPane.add(btnAddEmployee);

        // Button to Add Room
        JButton btnAddRoom = new JButton("Add Room");
        btnAddRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AddRoom room = new AddRoom(); // Open the AddRoom window
                    room.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Add Room: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnAddRoom.setBounds(50, 110, 200, 30);
        btnAddRoom.setBackground(Color.BLACK);
        btnAddRoom.setForeground(Color.WHITE);
        contentPane.add(btnAddRoom);

        // Button to Add Driver
        JButton btnAddDriver = new JButton("Add Driver");
        btnAddDriver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    AddDrivers driver = new AddDrivers(); // Open the AddDriver window
                    driver.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Add Driver: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnAddDriver.setBounds(50, 150, 200, 30);
        btnAddDriver.setBackground(Color.BLACK);
        btnAddDriver.setForeground(Color.WHITE);
        contentPane.add(btnAddDriver);


        JButton b2 = new JButton("Cancel");
        b2.setBounds(80, 220, 120, 30);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });

        // Set background color
        getContentPane().setBackground(Color.WHITE);

        // Set the frame visible
        setVisible(true);
    }
}
