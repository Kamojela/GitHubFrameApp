/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;


public class GitHubFrame extends JFrame{

    private JPanel headingsPnl;
    private JPanel loginsPnl;
    private JPanel btnsPnl;
    private JPanel usernamePnl;
    private JPanel passwordPnl;
    private JPanel usernamePasswordCombinedPnl;
    private JPanel mainPnl;
    
    private JLabel headingsLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    private JTextField usernameTxtFld;
    private JTextField passwordTxtFld;
    
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    private ButtonGroup btnGrp;
    
    
    
    public GitHubFrame() {
        setSize(600, 650);
        setTitle("Login Page");
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));  
        loginsPnl = new JPanel(new GridLayout(2,1,1,1));
        loginsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 1), "Login details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout( FlowLayout.LEFT));
       
        
        mainPnl = new JPanel(new BorderLayout());
        
        headingsLbl = new JLabel("Login");
        headingsLbl.setFont(new Font(Font.SANS_SERIF, Font.ITALIC + Font.BOLD, 20));
        headingsLbl.setForeground(Color.RED);
        headingsLbl.setBorder(new SoftBevelBorder( SoftBevelBorder.RAISED));
        
        
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        usernameTxtFld = new JTextField(30);
        passwordTxtFld = new JTextField(20);
        
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        btnGrp = new ButtonGroup();
        btnGrp.add(submitBtn);
        btnGrp.add(clearBtn);
        btnGrp.add(exitBtn);
        
        headingsPnl.add(headingsLbl);
        
        usernamePnl.add(usernameLbl);
        usernamePnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTxtFld);
        
        loginsPnl.add(usernamePnl);
        loginsPnl.add(passwordPnl);
        
        btnsPnl.add(submitBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        mainPnl.add(headingsPnl, BorderLayout.NORTH);
        mainPnl.add(loginsPnl, BorderLayout.CENTER);
        mainPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
    }
    
    
}
