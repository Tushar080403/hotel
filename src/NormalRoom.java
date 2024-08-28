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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class NormalRoom extends JFrame {
    private JPanel contentPane;
    private JTextField textFieldRoomType;
    private JTextField textFieldNumGuests;
    private JTextField textFieldCheckIn;
    private JTextField textFieldCheckOut;
    private JTextField textFieldCustomerName;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NormalRoom frame = new NormalRoom();
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
    public NormalRoom() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 404);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JLabel lblBookRoom = new JLabel("Book Normal Room");
        lblBookRoom.setForeground(Color.GRAY);
        lblBookRoom.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblRoomType = new JLabel("Room Type:");
        
        JLabel lblNumGuests = new JLabel("Number of Guests:");
        
        JLabel lblCheckIn = new JLabel("Check-In Date:");
        
        JLabel lblCheckOut = new JLabel("Check-Out Date:");
        
        JLabel lblCustomerName = new JLabel("Customer Name:");
        
        textFieldRoomType = new JTextField();
        textFieldRoomType.setColumns(10);
        
        textFieldNumGuests = new JTextField();
        textFieldNumGuests.setColumns(10);
        
        textFieldCheckIn = new JTextField();
        textFieldCheckIn.setColumns(10);
        
        textFieldCheckOut = new JTextField();
        textFieldCheckOut.setColumns(10);
        
        textFieldCustomerName = new JTextField();
        textFieldCustomerName.setColumns(10);
        
        JButton btnBookRoom = new JButton("Book Room");
        btnBookRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String roomType = textFieldRoomType.getText();
                String numGuests = textFieldNumGuests.getText();
                String checkIn = textFieldCheckIn.getText();
                String checkOut = textFieldCheckOut.getText();
                String customerName = textFieldCustomerName.getText();
                
                // Assuming BookRoomDao.save is a method to save the booking details in the database
                int i = BookRoomDao.save(roomType, numGuests, checkIn, checkOut, customerName);
                if (i > 0) {
                    JOptionPane.showMessageDialog(NormalRoom.this, "Room booked successfully!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(NormalRoom.this, "Sorry, unable to book the room!");
                }
                Payment.main(new String[]{});
            }
        });
        
        JButton btnBack = new JButton("Back");  
        btnBack.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                // Assuming Hotel.main is a method to go back to the hotel main menu  
            	BooksRoom.main(new String[]{});  
                dispose();  
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
                            .addGap(18)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
                                .addComponent(lblCustomerName, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblRoomType)
                                .addComponent(lblNumGuests, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCheckIn, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(lblCheckOut, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                            .addGap(47)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addComponent(textFieldCustomerName, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldCheckOut, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldCheckIn, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldNumGuests, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldRoomType, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(125, Short.MAX_VALUE))
                .addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
                    .addGap(161)
                    .addComponent(btnBookRoom, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(162, Short.MAX_VALUE))
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap(359, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addContainerGap())
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addComponent(lblBookRoom)
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblRoomType)
                        .addComponent(textFieldRoomType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNumGuests)
                        .addComponent(textFieldNumGuests, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblCheckIn)
                        .addComponent(textFieldCheckIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblCheckOut)
                        .addComponent(textFieldCheckOut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblCustomerName)
                        .addComponent(textFieldCustomerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30)
                    .addComponent(btnBookRoom, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnBack)
                    .addContainerGap(53, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
