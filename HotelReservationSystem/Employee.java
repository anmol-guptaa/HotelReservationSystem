package HotelReversationSystem.HotelReservationSystem;


import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Employee extends JFrame {
    Connection conn = null;
    JTextField textField, textField_1, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8;
    private JPanel contentPane;
    private JTable table;
    private JLabel lblNewLabel;
    private JLabel lblJob;
    private JLabel lblName;
    private JLabel lblDepartment;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Employee frame = new Employee();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void close()
    {
        this.dispose();
    }
    /**
     * Create the frame.
     * @throws SQLException
     */
    public Employee() throws SQLException {
        //conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(430, 200, 1000, 600);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        table = new JTable();
        table.setBounds(0, 34, 1000, 450);
        contentPane.add(table);

        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    conn c = new conn();
                    String displayCustomersql = "select * from Employee";
                    ResultSet rs = c.s.executeQuery(displayCustomersql);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                }
                catch(Exception e1){
                    e1.printStackTrace();
                }
            }

        });
        btnLoadData.setBounds(350, 500, 120, 30);
        btnLoadData.setBackground(Color.BLACK);
        btnLoadData.setForeground(Color.WHITE);
        contentPane.add(btnLoadData);

                JButton btnExit = new JButton("Back");
                btnExit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new Reception().setVisible(true);
                        setVisible(false);
                    }
                });
                btnExit.setBounds(510, 500, 120, 30);
                btnExit.setBackground(Color.RED);
                btnExit.setForeground(Color.WHITE);
                contentPane.add(btnExit);

                lblNewLabel = new JLabel("Name");
                lblNewLabel.setBounds(10, 11, 46, 14);
                contentPane.add(lblNewLabel);

                lblJob = new JLabel("Age");
                lblJob.setBounds(120, 11, 46, 14);
                contentPane.add(lblJob);

                lblName = new JLabel("Gender");
                lblName.setBounds(230, 11, 46, 14);
                contentPane.add(lblName);

                lblDepartment = new JLabel("Job");
                lblDepartment.setBounds(340, 11, 86, 14);
                contentPane.add(lblDepartment);

                JLabel l1 = new JLabel("Salary");
                l1.setBounds(450, 11, 86, 14);
                contentPane.add(l1);

                JLabel l2 = new JLabel("Phone");
                l2.setBounds(560, 11, 86, 14);
                contentPane.add(l2);

                JLabel l3 = new JLabel("Aadhar");
                l3.setBounds(670, 11, 86, 14);
                contentPane.add(l3);

                JLabel l4 = new JLabel("Gmail");
                l4.setBounds(790, 11, 86, 14);
                contentPane.add(l4);

               JLabel l5 = new JLabel("ID");
               l5.setBounds(890, 11, 86, 14);
               contentPane.add(l5);

                getContentPane().setBackground(Color.WHITE);
    }
}