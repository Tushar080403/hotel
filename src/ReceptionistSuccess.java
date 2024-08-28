


	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.GroupLayout;
	import javax.swing.GroupLayout.Alignment;
	import javax.swing.JLabel;
	import java.awt.Color;
	import java.awt.Font;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.LayoutStyle.ComponentPlacement;
	import java.sql.*;
	public class ReceptionistSuccess extends JFrame {
		static ReceptionistSuccess frame;
		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frame = new ReceptionistSuccess();
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
		public ReceptionistSuccess() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 371);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			JLabel lblReceptionistSection = new JLabel("Receptionist Section");
			lblReceptionistSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
			lblReceptionistSection.setForeground(Color.GRAY);
			
			JButton btnNewButton = new JButton("Add User");
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				UserForm.main(new String[]{});
				frame.dispose();
				}
			});
			
			JButton btnAddStaff = new JButton("Add Staff");
			btnAddStaff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				AddStaff.main(new String[]{});
				}
			});
			btnAddStaff.setFont(new Font("Tahoma", Font.PLAIN, 15));
			JButton btnViewStaff = new JButton("View Staff");
			btnViewStaff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				ViewStaff.main(new String[]{});
				}
			});
			btnViewStaff.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JButton btnDeleteStaff = new JButton("Delete Staff");
			btnDeleteStaff.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				DeleteStaff.main(new String[]{});
				frame.dispose();
				}
			});
			btnDeleteStaff.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
			JButton btnLogout = new JButton("Logout");
			btnLogout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Hotel.main(new String[]{});
					frame.dispose();
				}
			});
			btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
			GroupLayout gl_contentPane = new GroupLayout(contentPane);
			gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap(150, Short.MAX_VALUE)
						.addComponent(lblReceptionistSection, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
						.addGap(123))
					.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
						.addGap(134)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnDeleteStaff, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnViewStaff, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAddStaff, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					        .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(109, Short.MAX_VALUE))
			);
			gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(lblReceptionistSection, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(11)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnAddStaff, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnViewStaff, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnDeleteStaff, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(21, Short.MAX_VALUE))
			);
			contentPane.setLayout(gl_contentPane);
		}
	}