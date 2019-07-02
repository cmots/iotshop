/**
 * @author: cmots
 * @date: 2019/7/2 20:14
 * @description: the start form
 */
package view;

import javax.swing.*;
import java.awt.*;

public class Start {
    JFrame jFrame;
    private JTextField welcomeText;
    private JTextArea usernameText;
    private JPasswordField pwdText;
    private JButton[] buttons = new JButton[4];
    private JLabel[] labels = new JLabel[2];

    public Start(){
        //instantiate basic components
        JFrame.setDefaultLookAndFeelDecorated(true);
        jFrame = new JFrame("拼夕夕");
        welcomeText = new JTextField("欢迎使用拼夕夕");
        welcomeText.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeText.setEditable(false);
        labels[0] = new JLabel("用户名:");
        labels[1] = new JLabel("密码：");
        jFrame.setSize(340,200);
        jFrame.setLocation(220,160);
        usernameText = new JTextArea();
        pwdText = new JPasswordField();
        buttons[0] = new JButton("登陆");
        buttons[1] = new JButton("注册");
        buttons[2] = new JButton("管理员登陆");
        buttons[3] = new JButton("商户登陆");

        //extra settings
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //north
        jFrame.getContentPane().add(welcomeText,BorderLayout.NORTH);

        //center
        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        labels[0].setBounds(50,20,50,20);
        labels[1].setBounds(50,60,50,20);
        usernameText.setBounds(110,20,120,20);
        pwdText.setBounds(110,60,120,20);
        textPanel.add(labels[0]);
        textPanel.add(usernameText);
        textPanel.add(labels[1]);
        textPanel.add(pwdText);
        jFrame.getContentPane().add(textPanel,BorderLayout.CENTER);

        //south
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        for(int i=0;i<4;i++){
            buttonPanel.add(buttons[i]);
        }
        jFrame.getContentPane().add(buttonPanel,BorderLayout.SOUTH);

        jFrame.setVisible(true);
    }
}
