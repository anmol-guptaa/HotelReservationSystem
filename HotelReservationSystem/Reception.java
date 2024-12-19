package HotelReversationSystem.HotelReservationSystem;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Reception extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        new Reception();
    }

    public Reception() {
        setUndecorated(true);
        setBounds(530, 200, 850, 570);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Image for the background
        try {
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("HotelReversationSystem/Ions/reception.jpg"));
            Image i3 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel l1 = new JLabel(i2);
            l1.setBounds(250, 0, 600, 570);
            add(l1);
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
            e.printStackTrace();
        }

        // New Customer Form Button
        JButton btnNewCustomerForm = new JButton("New Customer Form");
        btnNewCustomerForm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    NewCustomer custom = new NewCustomer();
                    custom.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening New Customer Form: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnNewCustomerForm.setBounds(20, 50, 200, 30);
        btnNewCustomerForm.setBackground(Color.BLACK);
        btnNewCustomerForm.setForeground(Color.WHITE);
        contentPane.add(btnNewCustomerForm);

        // Room Button
        JButton btnRoom = new JButton("Room");
        btnRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Room room = new Room();
                    room.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Room: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnRoom.setBounds(20, 90, 200, 30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        contentPane.add(btnRoom);

        // Department Button
        JButton btnDepartment = new JButton("Department");
        btnDepartment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Department dept = new Department();
                    dept.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Department: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnDepartment.setBounds(20, 130, 200, 30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        contentPane.add(btnDepartment);

        // Employee Info Button
        JButton btnEmployeeInfo = new JButton("All Employee Info");
        btnEmployeeInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Employee em = new Employee();
                    em.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Employee Info: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnEmployeeInfo.setBounds(20, 170, 200, 30);
        btnEmployeeInfo.setBackground(Color.BLACK);
        btnEmployeeInfo.setForeground(Color.WHITE);
        contentPane.add(btnEmployeeInfo);

        // Customer Info Button
        JButton btnCustomerInfo = new JButton("Customer Info");
        btnCustomerInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    CustomerInfo customer = new CustomerInfo();
                    customer.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Customer Info: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnCustomerInfo.setBounds(20, 210, 200, 30);
        btnCustomerInfo.setBackground(Color.BLACK);
        btnCustomerInfo.setForeground(Color.WHITE);
        contentPane.add(btnCustomerInfo);

        // Manager Info Button
        JButton btnManagerInfo = new JButton("Manager Info");
        btnManagerInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ManagerInfo mana = new ManagerInfo();
                    mana.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Manager Info: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnManagerInfo.setBounds(20, 250, 200, 30);
        btnManagerInfo.setBackground(Color.BLACK);
        btnManagerInfo.setForeground(Color.WHITE);
        contentPane.add(btnManagerInfo);

        // Check Out Button
        JButton btnCheckOut = new JButton("Check Out");
        btnCheckOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ensure the CheckOut window opens successfully
                    CheckOut check = new CheckOut();
                    check.setVisible(true);
                    setVisible(false); // Hide the Reception window
                } catch (Exception e1) {
                    System.out.println("Error opening Check Out: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnCheckOut.setBounds(20, 290, 200, 30);
        btnCheckOut.setBackground(Color.BLACK);
        btnCheckOut.setForeground(Color.WHITE);
        contentPane.add(btnCheckOut);


        JButton btnUpdateCheckStatus = new JButton("Update Check Status");
        btnUpdateCheckStatus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    UpdateCheck update = new UpdateCheck();
                    update.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Update Check Status: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnUpdateCheckStatus.setBounds(20, 330, 200, 30);
        btnUpdateCheckStatus.setBackground(Color.BLACK);
        btnUpdateCheckStatus.setForeground(Color.WHITE);
        contentPane.add(btnUpdateCheckStatus);

        // Update Room Status Button
        JButton btnUpdateRoomStatus = new JButton("Update Room Status");
        btnUpdateRoomStatus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    UpdateRoom room = new UpdateRoom();
                    room.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Update Room Status: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnUpdateRoomStatus.setBounds(20, 370, 200, 30);
        btnUpdateRoomStatus.setBackground(Color.BLACK);
        btnUpdateRoomStatus.setForeground(Color.WHITE);
        contentPane.add(btnUpdateRoomStatus);

        // Pick Up Service Button
        JButton btnPickUpService = new JButton("Pick up Service");
        btnPickUpService.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    PickUp pick = new PickUp();
                    pick.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Pick Up Service: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnPickUpService.setBounds(20, 410, 200, 30);
        btnPickUpService.setBackground(Color.BLACK);
        btnPickUpService.setForeground(Color.WHITE);
        contentPane.add(btnPickUpService);

        // Search Room Button
        JButton btnSearchRoom = new JButton("Search Room");
        btnSearchRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    SearchRoom search = new SearchRoom();
                    search.setVisible(true);
                    setVisible(false);
                } catch (Exception e1) {
                    System.out.println("Error opening Search Room: " + e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        btnSearchRoom.setBounds(20, 450, 200, 30);
        btnSearchRoom.setBackground(Color.BLACK);
        btnSearchRoom.setForeground(Color.WHITE);
        contentPane.add(btnSearchRoom);

        // Log Out Button
        JButton btncan = new JButton("Cancel");
        btncan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    setVisible(false);
                } catch (Exception e) {
                    System.out.println("Error logging out: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
        btncan.setBounds(40, 510, 150, 30);
        btncan.setBackground(Color.RED);
        btncan.setForeground(Color.WHITE);
        contentPane.add(btncan);

        // Set background color
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }
}