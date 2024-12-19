package HotelReversationSystem.HotelReservationSystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelReversationSystem/Ions/dashboard1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1700, 800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1600, 850);
        add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("THE RAJMAHAL GROUP WELCOMES YOU");
        AirlineManagementSystem.setForeground(Color.WHITE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        AirlineManagementSystem.setBounds(350, 50, 1000, 90);
        NewLabel.add(AirlineManagementSystem);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu AirlineSystem = new JMenu("HOTEL MANAGEMENT");
        AirlineSystem.setForeground(Color.BLUE);
        menuBar.add(AirlineSystem);

        JMenuItem FlightDetails = new JMenuItem("RECEPTION");
        AirlineSystem.add(FlightDetails);

        JMenu AirlineSystemHello = new JMenu("ADMIN");
        AirlineSystemHello.setForeground(Color.RED);
        menuBar.add(AirlineSystemHello);

        FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
        });

        JMenuItem FlightDetailshello3 = new JMenuItem("Login");
        AirlineSystemHello.add(FlightDetailshello3);

        FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Login().setVisible(true);
                }catch(Exception e ){}
            }
        });

        setSize(1950,1090);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }
}
