import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PaymentGateWay1 extends JFrame {
    static PaymentGateWay1 frame;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new PaymentGateWay1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PaymentGateWay1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 404);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JLabel lblBookRoom = new JLabel("PaymentGateWay");
        lblBookRoom.setForeground(Color.GRAY);
        lblBookRoom.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JButton btnBookRoom = new JButton("Debit Card");
        btnBookRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DebitCard.main(new String[]{});
            }
        });
        
        JButton btnBookRoom2 = new JButton("Credit Card");
        btnBookRoom2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	CreditCard.main(new String[]{});
            }
        });
        
        JButton btnBack = new JButton("Back");  
        btnBack.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                Payment.main(new String[]{});  
                frame.dispose();  
            }  
        });  

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGap(150)
                            .addComponent(lblBookRoom))
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGap(161)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                .addComponent(btnBookRoom, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(btnBookRoom2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(133, Short.MAX_VALUE))
                .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                    .addContainerGap(359, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addComponent(lblBookRoom)
                    .addGap(50)
                    .addComponent(btnBookRoom, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(btnBookRoom2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnBack)
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
