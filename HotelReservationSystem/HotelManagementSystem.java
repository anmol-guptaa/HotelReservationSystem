package HotelReversationSystem.HotelReservationSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;

    public HotelManagementSystem() {

        setSize(1300, 430);
        setLayout(null);
        setLocationRelativeTo(null);
        setUndecorated(true); // Remove close, minimize, maximize buttons

        // Background Image

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelReversationSystem/Ions/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1388, 1000, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);

        l1 = new JLabel(i2);
        l1.setBounds(0, 0, 1388, 500);

        // Add Title Label

        JLabel lidd = new JLabel("  HOTEL RESERVATION AND");
        lidd.setBounds(30, 250, 750, 70);
        lidd.setFont(new Font("serif", Font.PLAIN, 50));
        lidd.setBackground(Color.WHITE);
        lidd.setForeground(Color.BLACK);
        lidd.setOpaque(true);
        l1.add(lidd);

        JLabel lid = new JLabel("     MANAGEMENT SYSTEM");
        lid.setBounds(30, 300, 750, 90);
        lid.setFont(new Font("serif", Font.PLAIN, 50));
        lid.setBackground(Color.WHITE);
        lid.setForeground(Color.BLACK);
        lid.setOpaque(true);
        l1.add(lid);

        // Next Button
        b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1100, 325, 150, 50);
        l1.add(b1);

        add(l1);

        b1.addActionListener(this);

        setVisible(true);

        // Blinking Effect for Title Label
        while (true) {
            lidd.setVisible(false);
            lid.setVisible(false);
            try {
                Thread.sleep(500); // 500 milliseconds
            } catch (Exception e) {
            }
            lidd.setVisible(true);
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent ae) {
        new Dashboard().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        HotelManagementSystem window = new HotelManagementSystem();
        window.setVisible(true);
    }
}