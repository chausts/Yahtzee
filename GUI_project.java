/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	private JMenuBar menuBar;
	private JPanel panel1;
	private JPanel panel10;
	private JPanel panel12;
	private JPanel panel13;
	private JPanel panel14;
	private JPanel panel15;
	private JPanel panel16;
	private JPanel panel17;
	private JPanel panel18;
	private JPanel panel19;
	private JPanel panel2;
	private JPanel panel22;
	private JPanel panel24;
	private JPanel panel25;
	private JPanel panel26;
	private JPanel panel27;
	private JPanel panel28;
	private JPanel panel29;
	private JPanel panel3;
	private JPanel panel30;
	private JPanel panel31;
	private JPanel panel32;
	private JPanel panel33;
	private JPanel panel34;
	private JPanel panel35;
	private JPanel panel36;
	private JPanel panel37;
	private JPanel panel38;
	private JPanel panel39;
	private JPanel panel4;
	private JPanel panel40;
	private JPanel panel41;
	private JPanel panel42;
	private JPanel panel44;
	private JPanel panel45;
	private JPanel panel46;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JTextField textfield1;
	private JTextField textfield10;
	private JTextField textfield11;
	private JTextField textfield12;
	private JTextField textfield13;
	private JTextField textfield14;
	private JTextField textfield15;
	private JTextField textfield16;
	private JTextField textfield17;
	private JTextField textfield18;
	private JTextField textfield19;
	private JTextField textfield2;
	private JTextField textfield20;
	private JTextField textfield21;
	private JTextField textfield22;
	private JTextField textfield23;
	private JTextField textfield3;
	private JTextField textfield4;
	private JTextField textfield5;
	private JTextField textfield6;
	private JTextField textfield7;
	private JTextField textfield8;
	private JTextField textfield9;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(1000,690);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(1000,690));
		contentPane.setBackground(new Color(54,103,53));


		panel1 = new JPanel(null);
		panel1.setBorder(BorderFactory.createEtchedBorder(1));
		panel1.setBounds(10,10,350,670);
		panel1.setBackground(new Color(214,217,223));
		panel1.setForeground(new Color(0,0,0));
		panel1.setEnabled(true);
		panel1.setFont(new Font("sansserif",0,12));
		panel1.setVisible(true);

		panel10 = new JPanel(null);
		panel10.setBorder(BorderFactory.createEtchedBorder(1));
		panel10.setBounds(5,245,170,29);
		panel10.setBackground(new Color(214,217,223));
		panel10.setForeground(new Color(0,0,0));
		panel10.setEnabled(true);
		panel10.setFont(new Font("sansserif",0,12));
		panel10.setVisible(true);

		panel12 = new JPanel(null);
		panel12.setBorder(BorderFactory.createEtchedBorder(1));
		panel12.setBounds(5,305,170,29);
		panel12.setBackground(new Color(214,217,223));
		panel12.setForeground(new Color(0,0,0));
		panel12.setEnabled(true);
		panel12.setFont(new Font("sansserif",0,12));
		panel12.setVisible(true);

		panel13 = new JPanel(null);
		panel13.setBorder(BorderFactory.createEtchedBorder(1));
		panel13.setBounds(5,335,170,29);
		panel13.setBackground(new Color(214,217,223));
		panel13.setForeground(new Color(0,0,0));
		panel13.setEnabled(true);
		panel13.setFont(new Font("sansserif",0,12));
		panel13.setVisible(true);

		panel14 = new JPanel(null);
		panel14.setBorder(BorderFactory.createEtchedBorder(1));
		panel14.setBounds(5,365,170,29);
		panel14.setBackground(new Color(214,217,223));
		panel14.setForeground(new Color(0,0,0));
		panel14.setEnabled(true);
		panel14.setFont(new Font("sansserif",0,12));
		panel14.setVisible(true);

		panel15 = new JPanel(null);
		panel15.setBorder(BorderFactory.createEtchedBorder(1));
		panel15.setBounds(5,395,170,29);
		panel15.setBackground(new Color(214,217,223));
		panel15.setForeground(new Color(0,0,0));
		panel15.setEnabled(true);
		panel15.setFont(new Font("sansserif",0,12));
		panel15.setVisible(true);

		panel16 = new JPanel(null);
		panel16.setBorder(BorderFactory.createEtchedBorder(1));
		panel16.setBounds(5,425,170,29);
		panel16.setBackground(new Color(214,217,223));
		panel16.setForeground(new Color(0,0,0));
		panel16.setEnabled(true);
		panel16.setFont(new Font("sansserif",0,12));
		panel16.setVisible(true);

		panel17 = new JPanel(null);
		panel17.setBorder(BorderFactory.createEtchedBorder(1));
		panel17.setBounds(5,455,170,29);
		panel17.setBackground(new Color(214,217,223));
		panel17.setForeground(new Color(0,0,0));
		panel17.setEnabled(true);
		panel17.setFont(new Font("sansserif",0,12));
		panel17.setVisible(true);

		panel18 = new JPanel(null);
		panel18.setBorder(BorderFactory.createEtchedBorder(1));
		panel18.setBounds(5,485,170,29);
		panel18.setBackground(new Color(214,217,223));
		panel18.setForeground(new Color(0,0,0));
		panel18.setEnabled(true);
		panel18.setFont(new Font("sansserif",0,12));
		panel18.setVisible(true);

		panel19 = new JPanel(null);
		panel19.setBorder(BorderFactory.createEtchedBorder(1));
		panel19.setBounds(5,515,170,29);
		panel19.setBackground(new Color(214,217,223));
		panel19.setForeground(new Color(0,0,0));
		panel19.setEnabled(true);
		panel19.setFont(new Font("sansserif",0,12));
		panel19.setVisible(true);

		panel2 = new JPanel(null);
		panel2.setBorder(BorderFactory.createEtchedBorder(1));
		panel2.setBounds(5,5,170,29);
		panel2.setBackground(new Color(214,217,223));
		panel2.setForeground(new Color(0,0,0));
		panel2.setEnabled(true);
		panel2.setFont(new Font("sansserif",0,12));
		panel2.setVisible(true);

		panel22 = new JPanel(null);
		panel22.setBorder(BorderFactory.createEtchedBorder(1));
		panel22.setBounds(5,545,170,29);
		panel22.setBackground(new Color(214,217,223));
		panel22.setForeground(new Color(0,0,0));
		panel22.setEnabled(true);
		panel22.setFont(new Font("sansserif",0,12));
		panel22.setVisible(true);

		panel24 = new JPanel(null);
		panel24.setBorder(BorderFactory.createEtchedBorder(1));
		panel24.setBounds(5,275,170,29);
		panel24.setBackground(new Color(214,217,223));
		panel24.setForeground(new Color(0,0,0));
		panel24.setEnabled(true);
		panel24.setFont(new Font("sansserif",0,12));
		panel24.setVisible(true);

		panel25 = new JPanel(null);
		panel25.setBorder(BorderFactory.createEtchedBorder(1));
		panel25.setBounds(5,575,170,29);
		panel25.setBackground(new Color(214,217,223));
		panel25.setForeground(new Color(0,0,0));
		panel25.setEnabled(true);
		panel25.setFont(new Font("sansserif",0,12));
		panel25.setVisible(true);

		panel26 = new JPanel(null);
		panel26.setBorder(BorderFactory.createEtchedBorder(1));
		panel26.setBounds(5,605,170,29);
		panel26.setBackground(new Color(214,217,223));
		panel26.setForeground(new Color(0,0,0));
		panel26.setEnabled(true);
		panel26.setFont(new Font("sansserif",0,12));
		panel26.setVisible(true);

		panel27 = new JPanel(null);
		panel27.setBorder(BorderFactory.createEtchedBorder(1));
		panel27.setBounds(5,635,170,29);
		panel27.setBackground(new Color(214,217,223));
		panel27.setForeground(new Color(0,0,0));
		panel27.setEnabled(true);
		panel27.setFont(new Font("sansserif",0,12));
		panel27.setVisible(true);

		panel28 = new JPanel(null);
		panel28.setBorder(BorderFactory.createEtchedBorder(1));
		panel28.setBounds(175,5,170,29);
		panel28.setBackground(new Color(214,217,223));
		panel28.setForeground(new Color(0,0,0));
		panel28.setEnabled(true);
		panel28.setFont(new Font("sansserif",0,12));
		panel28.setVisible(true);

		panel29 = new JPanel(null);
		panel29.setBorder(BorderFactory.createEtchedBorder(1));
		panel29.setBounds(175,35,170,29);
		panel29.setBackground(new Color(214,217,223));
		panel29.setForeground(new Color(0,0,0));
		panel29.setEnabled(true);
		panel29.setFont(new Font("sansserif",0,12));
		panel29.setVisible(true);

		panel3 = new JPanel(null);
		panel3.setBorder(BorderFactory.createEtchedBorder(1));
		panel3.setBounds(5,35,170,29);
		panel3.setBackground(new Color(214,217,223));
		panel3.setForeground(new Color(0,0,0));
		panel3.setEnabled(true);
		panel3.setFont(new Font("sansserif",0,12));
		panel3.setVisible(true);

		panel30 = new JPanel(null);
		panel30.setBorder(BorderFactory.createEtchedBorder(1));
		panel30.setBounds(175,65,170,29);
		panel30.setBackground(new Color(214,217,223));
		panel30.setForeground(new Color(0,0,0));
		panel30.setEnabled(true);
		panel30.setFont(new Font("sansserif",0,12));
		panel30.setVisible(true);

		panel31 = new JPanel(null);
		panel31.setBorder(BorderFactory.createEtchedBorder(1));
		panel31.setBounds(175,95,170,29);
		panel31.setBackground(new Color(214,217,223));
		panel31.setForeground(new Color(0,0,0));
		panel31.setEnabled(true);
		panel31.setFont(new Font("sansserif",0,12));
		panel31.setVisible(true);

		panel32 = new JPanel(null);
		panel32.setBorder(BorderFactory.createEtchedBorder(1));
		panel32.setBounds(175,125,170,29);
		panel32.setBackground(new Color(214,217,223));
		panel32.setForeground(new Color(0,0,0));
		panel32.setEnabled(true);
		panel32.setFont(new Font("sansserif",0,12));
		panel32.setVisible(true);

		panel33 = new JPanel(null);
		panel33.setBorder(BorderFactory.createEtchedBorder(1));
		panel33.setBounds(175,155,170,29);
		panel33.setBackground(new Color(214,217,223));
		panel33.setForeground(new Color(0,0,0));
		panel33.setEnabled(true);
		panel33.setFont(new Font("sansserif",0,12));
		panel33.setVisible(true);

		panel34 = new JPanel(null);
		panel34.setBorder(BorderFactory.createEtchedBorder(1));
		panel34.setBounds(175,185,170,29);
		panel34.setBackground(new Color(214,217,223));
		panel34.setForeground(new Color(0,0,0));
		panel34.setEnabled(true);
		panel34.setFont(new Font("sansserif",0,12));
		panel34.setVisible(true);

		panel35 = new JPanel(null);
		panel35.setBorder(BorderFactory.createEtchedBorder(1));
		panel35.setBounds(175,215,170,29);
		panel35.setBackground(new Color(214,217,223));
		panel35.setForeground(new Color(0,0,0));
		panel35.setEnabled(true);
		panel35.setFont(new Font("sansserif",0,12));
		panel35.setVisible(true);

		panel36 = new JPanel(null);
		panel36.setBorder(BorderFactory.createEtchedBorder(1));
		panel36.setBounds(175,245,170,29);
		panel36.setBackground(new Color(214,217,223));
		panel36.setForeground(new Color(0,0,0));
		panel36.setEnabled(true);
		panel36.setFont(new Font("sansserif",0,12));
		panel36.setVisible(true);

		panel37 = new JPanel(null);
		panel37.setBorder(BorderFactory.createEtchedBorder(1));
		panel37.setBounds(175,275,170,29);
		panel37.setBackground(new Color(214,217,223));
		panel37.setForeground(new Color(0,0,0));
		panel37.setEnabled(true);
		panel37.setFont(new Font("sansserif",0,12));
		panel37.setVisible(true);

		panel38 = new JPanel(null);
		panel38.setBorder(BorderFactory.createEtchedBorder(1));
		panel38.setBounds(175,305,170,29);
		panel38.setBackground(new Color(214,217,223));
		panel38.setForeground(new Color(0,0,0));
		panel38.setEnabled(true);
		panel38.setFont(new Font("sansserif",0,12));
		panel38.setVisible(true);

		panel39 = new JPanel(null);
		panel39.setBorder(BorderFactory.createEtchedBorder(1));
		panel39.setBounds(175,335,170,29);
		panel39.setBackground(new Color(214,217,223));
		panel39.setForeground(new Color(0,0,0));
		panel39.setEnabled(true);
		panel39.setFont(new Font("sansserif",0,12));
		panel39.setVisible(true);

		panel4 = new JPanel(null);
		panel4.setBorder(BorderFactory.createEtchedBorder(1));
		panel4.setBounds(5,65,170,29);
		panel4.setBackground(new Color(214,217,223));
		panel4.setForeground(new Color(0,0,0));
		panel4.setEnabled(true);
		panel4.setFont(new Font("sansserif",0,12));
		panel4.setVisible(true);

		panel40 = new JPanel(null);
		panel40.setBorder(BorderFactory.createEtchedBorder(1));
		panel40.setBounds(175,365,170,29);
		panel40.setBackground(new Color(214,217,223));
		panel40.setForeground(new Color(0,0,0));
		panel40.setEnabled(true);
		panel40.setFont(new Font("sansserif",0,12));
		panel40.setVisible(true);

		panel41 = new JPanel(null);
		panel41.setBorder(BorderFactory.createEtchedBorder(1));
		panel41.setBounds(175,395,170,29);
		panel41.setBackground(new Color(214,217,223));
		panel41.setForeground(new Color(0,0,0));
		panel41.setEnabled(true);
		panel41.setFont(new Font("sansserif",0,12));
		panel41.setVisible(true);

		panel42 = new JPanel(null);
		panel42.setBorder(BorderFactory.createEtchedBorder(1));
		panel42.setBounds(175,425,170,29);
		panel42.setBackground(new Color(214,217,223));
		panel42.setForeground(new Color(0,0,0));
		panel42.setEnabled(true);
		panel42.setFont(new Font("sansserif",0,12));
		panel42.setVisible(true);

		panel44 = new JPanel(null);
		panel44.setBorder(BorderFactory.createEtchedBorder(1));
		panel44.setBounds(175,455,170,29);
		panel44.setBackground(new Color(214,217,223));
		panel44.setForeground(new Color(0,0,0));
		panel44.setEnabled(true);
		panel44.setFont(new Font("sansserif",0,12));
		panel44.setVisible(true);

		panel45 = new JPanel(null);
		panel45.setBorder(BorderFactory.createEtchedBorder(1));
		panel45.setBounds(175,485,170,29);
		panel45.setBackground(new Color(214,217,223));
		panel45.setForeground(new Color(0,0,0));
		panel45.setEnabled(true);
		panel45.setFont(new Font("sansserif",0,12));
		panel45.setVisible(true);

		panel46 = new JPanel(null);
		panel46.setBorder(BorderFactory.createEtchedBorder(1));
		panel46.setBounds(175,515,170,29);
		panel46.setBackground(new Color(214,217,223));
		panel46.setForeground(new Color(0,0,0));
		panel46.setEnabled(true);
		panel46.setFont(new Font("sansserif",0,12));
		panel46.setVisible(true);

		panel5 = new JPanel(null);
		panel5.setBorder(BorderFactory.createEtchedBorder(1));
		panel5.setBounds(5,95,170,29);
		panel5.setBackground(new Color(214,217,223));
		panel5.setForeground(new Color(0,0,0));
		panel5.setEnabled(true);
		panel5.setFont(new Font("sansserif",0,12));
		panel5.setVisible(true);

		panel6 = new JPanel(null);
		panel6.setBorder(BorderFactory.createEtchedBorder(1));
		panel6.setBounds(5,125,170,29);
		panel6.setBackground(new Color(214,217,223));
		panel6.setForeground(new Color(0,0,0));
		panel6.setEnabled(true);
		panel6.setFont(new Font("sansserif",0,12));
		panel6.setVisible(true);

		panel7 = new JPanel(null);
		panel7.setBorder(BorderFactory.createEtchedBorder(1));
		panel7.setBounds(5,155,170,29);
		panel7.setBackground(new Color(214,217,223));
		panel7.setForeground(new Color(0,0,0));
		panel7.setEnabled(true);
		panel7.setFont(new Font("sansserif",0,12));
		panel7.setVisible(true);

		panel8 = new JPanel(null);
		panel8.setBorder(BorderFactory.createEtchedBorder(1));
		panel8.setBounds(5,185,170,29);
		panel8.setBackground(new Color(214,217,223));
		panel8.setForeground(new Color(0,0,0));
		panel8.setEnabled(true);
		panel8.setFont(new Font("sansserif",0,12));
		panel8.setVisible(true);

		panel9 = new JPanel(null);
		panel9.setBorder(BorderFactory.createEtchedBorder(1));
		panel9.setBounds(5,215,170,29);
		panel9.setBackground(new Color(214,217,223));
		panel9.setForeground(new Color(0,0,0));
		panel9.setEnabled(true);
		panel9.setFont(new Font("sansserif",0,12));
		panel9.setVisible(true);

		textfield1 = new JTextField();
		textfield1.setBounds(0,0,170,29);
		textfield1.setBackground(new Color(255,255,255));
		textfield1.setForeground(new Color(0,0,0));
		textfield1.setEnabled(true);
		textfield1.setFont(new Font("SansSerif",0,12));
		textfield1.setText("Upper Section");
		textfield1.setVisible(true);

		textfield10 = new JTextField();
		textfield10.setBounds(0,0,170,29);
		textfield10.setBackground(new Color(255,255,255));
		textfield10.setForeground(new Color(0,0,0));
		textfield10.setEnabled(true);
		textfield10.setFont(new Font("sansserif",0,12));
		textfield10.setText("Total");
		textfield10.setVisible(true);

		textfield11 = new JTextField();
		textfield11.setBounds(0,0,170,29);
		textfield11.setBackground(new Color(255,255,255));
		textfield11.setForeground(new Color(0,0,0));
		textfield11.setEnabled(true);
		textfield11.setFont(new Font("sansserif",0,12));
		textfield11.setText("Lower Section");
		textfield11.setVisible(true);

		textfield12 = new JTextField();
		textfield12.setBounds(0,0,170,29);
		textfield12.setBackground(new Color(255,255,255));
		textfield12.setForeground(new Color(0,0,0));
		textfield12.setEnabled(true);
		textfield12.setFont(new Font("sansserif",0,12));
		textfield12.setText("3 of a Kind");
		textfield12.setVisible(true);

		textfield13 = new JTextField();
		textfield13.setBounds(0,0,170,29);
		textfield13.setBackground(new Color(255,255,255));
		textfield13.setForeground(new Color(0,0,0));
		textfield13.setEnabled(true);
		textfield13.setFont(new Font("sansserif",0,12));
		textfield13.setText("4 of a Kind");
		textfield13.setVisible(true);

		textfield14 = new JTextField();
		textfield14.setBounds(0,0,170,29);
		textfield14.setBackground(new Color(255,255,255));
		textfield14.setForeground(new Color(0,0,0));
		textfield14.setEnabled(true);
		textfield14.setFont(new Font("sansserif",0,12));
		textfield14.setText("Small Straight");
		textfield14.setVisible(true);

		textfield15 = new JTextField();
		textfield15.setBounds(0,0,170,29);
		textfield15.setBackground(new Color(255,255,255));
		textfield15.setForeground(new Color(0,0,0));
		textfield15.setEnabled(true);
		textfield15.setFont(new Font("sansserif",0,12));
		textfield15.setText("Large Straight");
		textfield15.setVisible(true);

		textfield16 = new JTextField();
		textfield16.setBounds(0,0,170,29);
		textfield16.setBackground(new Color(255,255,255));
		textfield16.setForeground(new Color(0,0,0));
		textfield16.setEnabled(true);
		textfield16.setFont(new Font("sansserif",0,12));
		textfield16.setText("Yahtzee");
		textfield16.setVisible(true);

		textfield17 = new JTextField();
		textfield17.setBounds(0,0,170,29);
		textfield17.setBackground(new Color(255,255,255));
		textfield17.setForeground(new Color(0,0,0));
		textfield17.setEnabled(true);
		textfield17.setFont(new Font("sansserif",0,12));
		textfield17.setText("Chance");
		textfield17.setVisible(true);

		textfield18 = new JTextField();
		textfield18.setBounds(0,0,170,29);
		textfield18.setBackground(new Color(255,255,255));
		textfield18.setForeground(new Color(0,0,0));
		textfield18.setEnabled(true);
		textfield18.setFont(new Font("sansserif",0,12));
		textfield18.setText("? for each Bonus");
		textfield18.setVisible(true);

		textfield19 = new JTextField();
		textfield19.setBounds(0,0,170,29);
		textfield19.setBackground(new Color(255,255,255));
		textfield19.setForeground(new Color(0,0,0));
		textfield19.setEnabled(true);
		textfield19.setFont(new Font("sansserif",0,12));
		textfield19.setText("Score 100 for ?");
		textfield19.setVisible(false);

		textfield2 = new JTextField();
		textfield2.setBounds(0,0,170,29);
		textfield2.setBackground(new Color(255,255,255));
		textfield2.setForeground(new Color(0,0,0));
		textfield2.setEnabled(true);
		textfield2.setFont(new Font("sansserif",0,12));
		textfield2.setText("Aces = 1");
		textfield2.setVisible(true);

		textfield20 = new JTextField();
		textfield20.setBounds(0,0,170,29);
		textfield20.setBackground(new Color(255,255,255));
		textfield20.setForeground(new Color(0,0,0));
		textfield20.setEnabled(true);
		textfield20.setFont(new Font("sansserif",0,12));
		textfield20.setText("Total of Upper Section");
		textfield20.setVisible(true);

		textfield21 = new JTextField();
		textfield21.setBounds(0,0,170,29);
		textfield21.setBackground(new Color(255,255,255));
		textfield21.setForeground(new Color(0,0,0));
		textfield21.setEnabled(true);
		textfield21.setFont(new Font("sansserif",0,12));
		textfield21.setText("Total of Lower Section");
		textfield21.setVisible(true);

		textfield22 = new JTextField();
		textfield22.setBounds(0,0,170,29);
		textfield22.setBackground(new Color(255,255,255));
		textfield22.setForeground(new Color(0,0,0));
		textfield22.setEnabled(true);
		textfield22.setFont(new Font("sansserif",0,12));
		textfield22.setText("Grand Total");
		textfield22.setVisible(true);

		textfield23 = new JTextField();
		textfield23.setBounds(0,0,170,29);
		textfield23.setBackground(new Color(255,255,255));
		textfield23.setForeground(new Color(0,0,0));
		textfield23.setEnabled(true);
		textfield23.setFont(new Font("sansserif",0,12));
		textfield23.setText("Score 100 per ?");
		textfield23.setVisible(true);

		textfield3 = new JTextField();
		textfield3.setBounds(0,0,170,29);
		textfield3.setBackground(new Color(255,255,255));
		textfield3.setForeground(new Color(0,0,0));
		textfield3.setEnabled(true);
		textfield3.setFont(new Font("sansserif",0,12));
		textfield3.setText("Twos = 2");
		textfield3.setVisible(true);

		textfield4 = new JTextField();
		textfield4.setBounds(0,0,170,29);
		textfield4.setBackground(new Color(255,255,255));
		textfield4.setForeground(new Color(0,0,0));
		textfield4.setEnabled(true);
		textfield4.setFont(new Font("sansserif",0,12));
		textfield4.setText("Threes = 3");
		textfield4.setVisible(true);

		textfield5 = new JTextField();
		textfield5.setBounds(0,0,170,29);
		textfield5.setBackground(new Color(255,255,255));
		textfield5.setForeground(new Color(0,0,0));
		textfield5.setEnabled(true);
		textfield5.setFont(new Font("sansserif",0,12));
		textfield5.setText("Fours = 4");
		textfield5.setVisible(true);

		textfield6 = new JTextField();
		textfield6.setBounds(0,0,170,29);
		textfield6.setBackground(new Color(255,255,255));
		textfield6.setForeground(new Color(0,0,0));
		textfield6.setEnabled(true);
		textfield6.setFont(new Font("sansserif",0,12));
		textfield6.setText("Fives = 5");
		textfield6.setVisible(true);

		textfield7 = new JTextField();
		textfield7.setBounds(0,0,170,29);
		textfield7.setBackground(new Color(255,255,255));
		textfield7.setForeground(new Color(0,0,0));
		textfield7.setEnabled(true);
		textfield7.setFont(new Font("sansserif",0,12));
		textfield7.setText("Sixes = 6");
		textfield7.setVisible(true);

		textfield8 = new JTextField();
		textfield8.setBounds(0,0,170,29);
		textfield8.setBackground(new Color(255,255,255));
		textfield8.setForeground(new Color(0,0,0));
		textfield8.setEnabled(true);
		textfield8.setFont(new Font("sansserif",0,12));
		textfield8.setText("Total Score");
		textfield8.setVisible(true);

		textfield9 = new JTextField();
		textfield9.setBounds(0,0,170,29);
		textfield9.setBackground(new Color(255,255,255));
		textfield9.setForeground(new Color(0,0,0));
		textfield9.setEnabled(true);
		textfield9.setFont(new Font("sansserif",0,12));
		textfield9.setText("Bonus");
		textfield9.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(panel1);
		panel1.add(panel10);
		panel1.add(panel12);
		panel1.add(panel13);
		panel1.add(panel14);
		panel1.add(panel15);
		panel1.add(panel16);
		panel1.add(panel17);
		panel1.add(panel18);
		panel1.add(panel19);
		panel1.add(panel2);
		panel1.add(panel22);
		panel1.add(panel24);
		panel1.add(panel25);
		panel1.add(panel26);
		panel1.add(panel27);
		panel1.add(panel28);
		panel1.add(panel29);
		panel1.add(panel3);
		panel1.add(panel30);
		panel1.add(panel31);
		panel1.add(panel32);
		panel1.add(panel33);
		panel1.add(panel34);
		panel1.add(panel35);
		panel1.add(panel36);
		panel1.add(panel37);
		panel1.add(panel38);
		panel1.add(panel39);
		panel1.add(panel4);
		panel1.add(panel40);
		panel1.add(panel41);
		panel1.add(panel42);
		panel1.add(panel44);
		panel1.add(panel45);
		panel1.add(panel46);
		panel1.add(panel5);
		panel1.add(panel6);
		panel1.add(panel7);
		panel1.add(panel8);
		panel1.add(panel9);
		panel2.add(textfield1);
		panel24.add(textfield10);
		panel12.add(textfield11);
		panel13.add(textfield12);
		panel14.add(textfield13);
		panel15.add(textfield14);
		panel16.add(textfield15);
		panel17.add(textfield16);
		panel18.add(textfield17);
		panel19.add(textfield18);
		panel22.add(textfield19);
		panel3.add(textfield2);
		panel25.add(textfield20);
		panel26.add(textfield21);
		panel27.add(textfield22);
		panel22.add(textfield23);
		panel4.add(textfield3);
		panel5.add(textfield4);
		panel6.add(textfield5);
		panel7.add(textfield6);
		panel8.add(textfield7);
		panel9.add(textfield8);
		panel10.add(textfield9);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}