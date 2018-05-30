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
	private JButton BonusButton;
	private JButton ChanceButton;
	private JButton FivesButton;
	private JButton FourKindButton;
	private JButton FoursButton;
	private JButton FullHouseButton;
	private JButton LStraightButton;
	private JLabel NumRolls;
	private JButton OnesButton;
	private JPanel OnesScore;
	private JButton RollButton;
	private JPanel RollFrame;
	private JButton SStraightButton;
	private JPanel ScorecardFrame;
	private JButton SixsButotn;
	private JButton ThreeKindButton;
	private JButton ThreesButton;
	private JPanel TriesFrame;
	private JButton TwosButton;
	private JPanel TwosScore;
	private JButton YahtzeeButton;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(550,450);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(550,450));
		contentPane.setBackground(new Color(54,103,53));


		BonusButton = new JButton();
		BonusButton.setBounds(225,215,90,35);
		BonusButton.setBackground(new Color(214,217,223));
		BonusButton.setForeground(new Color(0,0,0));
		BonusButton.setEnabled(true);
		BonusButton.setFont(new Font("sansserif",0,12));
		BonusButton.setText("Bonus");
		BonusButton.setVisible(true);

		ChanceButton = new JButton();
		ChanceButton.setBounds(225,250,90,35);
		ChanceButton.setBackground(new Color(214,217,223));
		ChanceButton.setForeground(new Color(0,0,0));
		ChanceButton.setEnabled(true);
		ChanceButton.setFont(new Font("sansserif",0,12));
		ChanceButton.setText("Chance");
		ChanceButton.setVisible(true);

		FivesButton = new JButton();
		FivesButton.setBounds(5,145,90,35);
		FivesButton.setBackground(new Color(214,217,223));
		FivesButton.setForeground(new Color(0,0,0));
		FivesButton.setEnabled(true);
		FivesButton.setFont(new Font("sansserif",0,12));
		FivesButton.setText("Five's");
		FivesButton.setVisible(true);

		FourKindButton = new JButton();
		FourKindButton.setBounds(225,40,90,35);
		FourKindButton.setBackground(new Color(214,217,223));
		FourKindButton.setForeground(new Color(0,0,0));
		FourKindButton.setEnabled(true);
		FourKindButton.setFont(new Font("sansserif",0,12));
		FourKindButton.setText("Four Kind");
		FourKindButton.setVisible(true);

		FoursButton = new JButton();
		FoursButton.setBounds(5,110,90,35);
		FoursButton.setBackground(new Color(214,217,223));
		FoursButton.setForeground(new Color(0,0,0));
		FoursButton.setEnabled(true);
		FoursButton.setFont(new Font("sansserif",0,12));
		FoursButton.setText("Four's");
		FoursButton.setVisible(true);

		FullHouseButton = new JButton();
		FullHouseButton.setBounds(225,75,90,35);
		FullHouseButton.setBackground(new Color(214,217,223));
		FullHouseButton.setForeground(new Color(0,0,0));
		FullHouseButton.setEnabled(true);
		FullHouseButton.setFont(new Font("sansserif",0,12));
		FullHouseButton.setText("Full House");
		FullHouseButton.setVisible(true);

		LStraightButton = new JButton();
		LStraightButton.setBounds(225,145,90,35);
		LStraightButton.setBackground(new Color(214,217,223));
		LStraightButton.setForeground(new Color(0,0,0));
		LStraightButton.setEnabled(true);
		LStraightButton.setFont(new Font("sansserif",0,12));
		LStraightButton.setText("L Straight");
		LStraightButton.setVisible(true);

		NumRolls = new JLabel();
		NumRolls.setBounds(20,0,75,65);
		NumRolls.setBackground(new Color(214,217,223));
		NumRolls.setForeground(new Color(0,0,0));
		NumRolls.setEnabled(true);
		NumRolls.setFont(new Font("SansSerif",0,30));
		NumRolls.setText("00");
		NumRolls.setVisible(true);

		OnesButton = new JButton();
		OnesButton.setBounds(5,5,90,35);
		OnesButton.setBackground(new Color(214,217,223));
		OnesButton.setForeground(new Color(0,0,0));
		OnesButton.setEnabled(true);
		OnesButton.setFont(new Font("sansserif",0,12));
		OnesButton.setText("One's");
		OnesButton.setVisible(true);

		OnesScore = new JPanel(null);
		OnesScore.setBorder(BorderFactory.createEtchedBorder(1));
		OnesScore.setBounds(100,10,120,25);
		OnesScore.setBackground(new Color(214,217,223));
		OnesScore.setForeground(new Color(0,0,0));
		OnesScore.setEnabled(true);
		OnesScore.setFont(new Font("sansserif",0,12));
		OnesScore.setVisible(true);

		RollButton = new JButton();
		RollButton.setBounds(410,10,85,35);
		RollButton.setBackground(new Color(214,217,223));
		RollButton.setForeground(new Color(0,0,0));
		RollButton.setEnabled(true);
		RollButton.setFont(new Font("sansserif",0,12));
		RollButton.setText("Roll");
		RollButton.setVisible(true);

		RollFrame = new JPanel(null);
		RollFrame.setBorder(BorderFactory.createEtchedBorder(1));
		RollFrame.setBounds(10,10,400,100);
		RollFrame.setBackground(new Color(214,217,223));
		RollFrame.setForeground(new Color(0,0,0));
		RollFrame.setEnabled(true);
		RollFrame.setFont(new Font("sansserif",0,12));
		RollFrame.setVisible(true);

		SStraightButton = new JButton();
		SStraightButton.setBounds(225,110,90,35);
		SStraightButton.setBackground(new Color(214,217,223));
		SStraightButton.setForeground(new Color(0,0,0));
		SStraightButton.setEnabled(true);
		SStraightButton.setFont(new Font("sansserif",0,12));
		SStraightButton.setText("S Straight");
		SStraightButton.setVisible(true);

		ScorecardFrame = new JPanel(null);
		ScorecardFrame.setBorder(BorderFactory.createEtchedBorder(1));
		ScorecardFrame.setBounds(10,115,530,325);
		ScorecardFrame.setBackground(new Color(214,217,223));
		ScorecardFrame.setForeground(new Color(0,0,0));
		ScorecardFrame.setEnabled(true);
		ScorecardFrame.setFont(new Font("sansserif",0,12));
		ScorecardFrame.setVisible(true);

		SixsButotn = new JButton();
		SixsButotn.setBounds(5,180,90,35);
		SixsButotn.setBackground(new Color(214,217,223));
		SixsButotn.setForeground(new Color(0,0,0));
		SixsButotn.setEnabled(true);
		SixsButotn.setFont(new Font("sansserif",0,12));
		SixsButotn.setText("Six's");
		SixsButotn.setVisible(true);

		ThreeKindButton = new JButton();
		ThreeKindButton.setBounds(225,5,90,35);
		ThreeKindButton.setBackground(new Color(214,217,223));
		ThreeKindButton.setForeground(new Color(0,0,0));
		ThreeKindButton.setEnabled(true);
		ThreeKindButton.setFont(new Font("sansserif",0,12));
		ThreeKindButton.setText("Three Kind");
		ThreeKindButton.setVisible(true);

		ThreesButton = new JButton();
		ThreesButton.setBounds(6,75,90,35);
		ThreesButton.setBackground(new Color(214,217,223));
		ThreesButton.setForeground(new Color(0,0,0));
		ThreesButton.setEnabled(true);
		ThreesButton.setFont(new Font("sansserif",0,12));
		ThreesButton.setText("Three's");
		ThreesButton.setVisible(true);

		TriesFrame = new JPanel(null);
		TriesFrame.setBorder(BorderFactory.createEtchedBorder(1));
		TriesFrame.setBounds(415,45,75,65);
		TriesFrame.setBackground(new Color(214,217,223));
		TriesFrame.setForeground(new Color(0,0,0));
		TriesFrame.setEnabled(true);
		TriesFrame.setFont(new Font("sansserif",0,12));
		TriesFrame.setVisible(true);

		TwosButton = new JButton();
		TwosButton.setBounds(5,40,90,35);
		TwosButton.setBackground(new Color(214,217,223));
		TwosButton.setForeground(new Color(0,0,0));
		TwosButton.setEnabled(true);
		TwosButton.setFont(new Font("sansserif",0,12));
		TwosButton.setText("Two's");
		TwosButton.setVisible(true);

		TwosScore = new JPanel(null);
		TwosScore.setBorder(BorderFactory.createEtchedBorder(1));
		TwosScore.setBounds(99,41,150,100);
		TwosScore.setBackground(new Color(214,217,223));
		TwosScore.setForeground(new Color(0,0,0));
		TwosScore.setEnabled(true);
		TwosScore.setFont(new Font("sansserif",0,12));
		TwosScore.setVisible(true);

		YahtzeeButton = new JButton();
		YahtzeeButton.setBounds(225,180,90,35);
		YahtzeeButton.setBackground(new Color(214,217,223));
		YahtzeeButton.setForeground(new Color(0,0,0));
		YahtzeeButton.setEnabled(true);
		YahtzeeButton.setFont(new Font("sansserif",0,12));
		YahtzeeButton.setText("Yahtzee");
		YahtzeeButton.setVisible(true);

		//adding components to contentPane panel
		ScorecardFrame.add(BonusButton);
		ScorecardFrame.add(ChanceButton);
		ScorecardFrame.add(FivesButton);
		ScorecardFrame.add(FourKindButton);
		ScorecardFrame.add(FoursButton);
		ScorecardFrame.add(FullHouseButton);
		ScorecardFrame.add(LStraightButton);
		TriesFrame.add(NumRolls);
		ScorecardFrame.add(OnesButton);
		ScorecardFrame.add(OnesScore);
		contentPane.add(RollButton);
		contentPane.add(RollFrame);
		ScorecardFrame.add(SStraightButton);
		contentPane.add(ScorecardFrame);
		ScorecardFrame.add(SixsButotn);
		ScorecardFrame.add(ThreeKindButton);
		ScorecardFrame.add(ThreesButton);
		contentPane.add(TriesFrame);
		ScorecardFrame.add(TwosButton);
		ScorecardFrame.add(TwosScore);
		ScorecardFrame.add(YahtzeeButton);

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