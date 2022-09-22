package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Project extends JFrame {
    public Project() {
        setExtendedState(JFrame.MAXIMIZED_BOTH); // display in fullscreen

        // image
        ImageIcon imagePath = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image imageScale = imagePath.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon image = new ImageIcon(imageScale);
        JLabel finalImage = new JLabel(image);
        add(finalImage);
        setVisible(true);

        // menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        menuBar.add(master);

        // customer
        JMenuItem newCustomer = new JMenuItem("New Customer");
        newCustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newCustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image scaleIcon1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newCustomer.setIcon(new ImageIcon(scaleIcon1));
        newCustomer.setMnemonic('D');
        newCustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        master.add(newCustomer);

        // customer details
        JMenuItem customerDetails = new JMenuItem("Customer Details");
        customerDetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        customerDetails.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image scaleIcon2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerDetails.setIcon(new ImageIcon(scaleIcon2));
        customerDetails.setMnemonic('M');
        customerDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        master.add(customerDetails);

        // deposit details
        JMenuItem depositDetails = new JMenuItem("Customer Details");
        depositDetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        depositDetails.setBackground(Color.WHITE);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image scaleIcon3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositDetails.setIcon(new ImageIcon(scaleIcon3));
        depositDetails.setMnemonic('N');
        depositDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        master.add(depositDetails);

        // deposit details
        JMenuItem calculateBill = new JMenuItem("Calculate Bill");
        calculateBill.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculateBill.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image scaleIcon4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculateBill.setIcon(new ImageIcon(scaleIcon4));
        calculateBill.setMnemonic('B');
        calculateBill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        master.add(calculateBill);


        // information
        JMenu info = new JMenu("information");
        info.setForeground(Color.RED);
        menuBar.add(info);

        JMenuItem updateInformation = new JMenuItem("Update Information");
        updateInformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        updateInformation.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image scaleIcon5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateInformation.setIcon(new ImageIcon(scaleIcon5));
        updateInformation.setMnemonic('P');
        updateInformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        info.add(updateInformation);

        JMenuItem viewInformation = new JMenuItem("View Information");
        viewInformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        viewInformation.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image scaleIcon6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewInformation.setIcon(new ImageIcon(scaleIcon6));
        viewInformation.setMnemonic('L');
        viewInformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
        info.add(viewInformation);



        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        menuBar.add(user);

        JMenuItem payBill = new JMenuItem("Pay Bill");
        payBill.setFont(new Font("monospaced", Font.PLAIN, 12));
        payBill.setBackground(Color.WHITE);
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image scaleIcon7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        payBill.setIcon(new ImageIcon(scaleIcon7));
        payBill.setMnemonic('K');
        payBill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, ActionEvent.CTRL_MASK));
        user.add(payBill);

        JMenuItem billDetails = new JMenuItem("Bill Details");
        billDetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        billDetails.setBackground(Color.WHITE);
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image scaleIcon8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billDetails.setIcon(new ImageIcon(scaleIcon8));
        billDetails.setMnemonic('I');
        billDetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        user.add(billDetails);


        JMenu report = new JMenu("Report");
        report.setForeground(Color.RED);
        menuBar.add(report);

        JMenuItem generateBill = new JMenuItem("Generate Bill");
        generateBill.setFont(new Font("monospaced", Font.PLAIN, 12));
        generateBill.setBackground(Color.WHITE);
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image scaleIcon9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        generateBill.setIcon(new ImageIcon(scaleIcon9));
        generateBill.setMnemonic('G');
        generateBill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        report.add(generateBill);

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        menuBar.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced", Font.PLAIN, 12));
        notepad.setBackground(Color.WHITE);
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image scaleIcon10 = icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(scaleIcon10));
        notepad.setMnemonic('S');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculator.setBackground(Color.WHITE);
        ImageIcon calc = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image scaleCalc = calc.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(scaleCalc));
        calculator.setMnemonic('S');
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        utility.add(calculator);



        JMenu menuExit = new JMenu("Exit");
        menuExit.setForeground(Color.RED);
        menuBar.add(menuExit);

        JMenuItem exit = new JMenuItem("exit");
        exit.setFont(new Font("monospaced", Font.PLAIN, 12));
        exit.setBackground(Color.WHITE);
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image scaleIcon11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(scaleIcon11));
        exit.setMnemonic('S');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        menuExit.add(exit);


        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Project();
    }
}