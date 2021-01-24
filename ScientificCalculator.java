package ScientificCalculator;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScienceCalculator {

	private JFrame frmStandradCalulator;
	private JTextField txtDisplay;

	Double firstnum;
	Double secondnum;
	Double result;
	String operations;
	String answer;
	
	double[] i = new double[5];
	
	double Nigeruian = 535.96;
	double US_Dollar = 1.52;
	double Kenyan_Shilling = 156.21;
	double Brazilian_Real = 5.86;
	double Canadian_Dollar = 2.03;
	double Indian_Rupee = 100.68;
	double Philippine_peso = 71.74;
	double Indonesian_Rupiah = 20746.75;
	
	private JTextField jtxtConverts;
	private JTextField jlblConverts;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScienceCalculator window = new ScienceCalculator();
					window.frmStandradCalulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScienceCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frmStandradCalulator = new JFrame();
		frmStandradCalulator.setTitle("Standrad Calulator");
		frmStandradCalulator.setBounds(100, 100, 844, 384);
		frmStandradCalulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandradCalulator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStandradCalulator.setTitle("Standrad Calulator");
				frmStandradCalulator.setBounds(100, 100, 265, 380);
				txtDisplay.setBounds(10,1,243,37);
				
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientificcalculator = new JMenuItem("Scientific Calculator");
		mntmScientificcalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandradCalulator.setTitle("Scientific Calulator");
				frmStandradCalulator.setBounds(100, 100, 530, 380);
				txtDisplay.setBounds(10,1,494,37);
			}
		});
		mnFile.add(mntmScientificcalculator);
		
		JMenuItem mntmUnitConvertersion = new JMenuItem(" Unit Conversion");
		mntmUnitConvertersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 
				 frmStandradCalulator.setTitle("Unit Conversion");
				frmStandradCalulator.setBounds(100, 100, 815, 380);
				txtDisplay.setBounds(10,1,494,37);
						
			}
		});
		mnFile.add(mntmUnitConvertersion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		frmStandradCalulator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		txtDisplay.setBounds(10, 11, 243, 37);
		frmStandradCalulator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String backspace = null;
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				
				
			}
			}
			});
		btnNewButton.setBounds(10, 91, 56, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "Clear";
				
			}
		});
		btnNewButton_1.setBounds(66, 91, 88, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("+-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
			ops = ops * (-1);
			txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_3.setBounds(154, 91, 46, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_3);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn7.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn7.setBounds(10, 137, 42, 47);
		frmStandradCalulator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn8.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn8.setBounds(51, 137, 42, 47);
		frmStandradCalulator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn9.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn9.setBounds(92, 137, 42, 47);
		frmStandradCalulator.getContentPane().add(btn9);
		
		JButton btnNewButton_7 = new JButton("/");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnNewButton_7.setBounds(133, 137, 42, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn4.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn4.setBounds(10, 183, 42, 47);
		frmStandradCalulator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn5.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn5.setBounds(51, 183, 42, 47);
		frmStandradCalulator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn6.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn6.setBounds(92, 183, 42, 47);
		frmStandradCalulator.getContentPane().add(btn6);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnNewButton_11.setBounds(133, 183, 42, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_11);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn1.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn1.setBounds(10, 229, 42, 47);
		frmStandradCalulator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn2.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn2.setBounds(51, 229, 42, 47);
		frmStandradCalulator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn3.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn3.setBounds(92, 229, 42, 47);
		frmStandradCalulator.getContentPane().add(btn3);
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnNewButton_15.setBounds(133, 229, 42, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("v-");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnNewButton_16.setBounds(200, 91, 45, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("%");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnNewButton_17.setBounds(175, 137, 70, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("1/x");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "1/x";
		
				
				
			}
		});
		btnNewButton_18.setBounds(175, 183, 70, 47);
		frmStandradCalulator.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("=");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+")
				{
				result = firstnum +  secondnum;
					answer = String.format("%.2f" ,result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-" )	
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f",result);
					txtDisplay.setText(answer);	
				}
				else if (operations == "*" )	
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f" ,result);
					txtDisplay.setText(answer);
					
				}
				else if (operations == "/" )	
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f" ,result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/" )	
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f" ,result);
					txtDisplay.setText(answer);
				}
				else if (operations == "1/x" )	
				{
					result = 1 / secondnum;
					answer = String.format("%.2f" ,result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnNewButton_19.setBounds(175, 229, 70, 83);
		frmStandradCalulator.getContentPane().add(btnNewButton_19);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + btn0.getText();				
				txtDisplay.setText(iNum);
			}
		});
		btn0.setBounds(10, 275, 68, 37);
		frmStandradCalulator.getContentPane().add(btn0);
		
		JButton button_1 = new JButton(".");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String iNum = txtDisplay.getText() + button_1.getText();				
				txtDisplay.setText(iNum);
			}
		});
		button_1.setBounds(78, 275, 56, 37);
		frmStandradCalulator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "+";
			}
		});
		button_2.setBounds(133, 275, 42, 37);
		frmStandradCalulator.getContentPane().add(button_2);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setBounds(255, 91, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnSin.setBounds(316, 91, 60, 47);
		frmStandradCalulator.getContentPane().add(btnSin);
		
		JButton btnLog_2 = new JButton("Sinh");
		btnLog_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog_2.setBounds(376, 91, 70, 47);
		frmStandradCalulator.getContentPane().add(btnLog_2);
		
		JButton btnLog_3 = new JButton("C");
		btnLog_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "Mod";
			}
		});
		btnLog_3.setBounds(446, 91, 58, 47);
		frmStandradCalulator.getContentPane().add(btnLog_3);
		
		JButton btnLog_1_1 = new JButton("Cos");
		btnLog_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog_1_1.setBounds(316, 137, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_1);
		
		JButton btnLog_1_2 = new JButton("π");
		btnLog_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops;
				ops = (3.1415926535897932384626433832795);
				txtDisplay.setText(String.valueOf(ops));
				

			}
		});
		btnLog_1_2.setBounds(255, 137, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_2);
		
		JButton btnLog_1_3 = new JButton("Cosh");
		btnLog_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog_1_3.setBounds(376, 137, 70, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3);
		
		JButton btnLog_1_3_1 = new JButton("Inx");
		btnLog_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.log10(ops );
				txtDisplay.setText(String.valueOf(ops));
				
				
			}
		});
		btnLog_1_3_1.setBounds(446, 137, 58, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1);
		
		JButton btnLog_1_3_1_1 = new JButton("x^y");
		btnLog_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.pow(ops , ops);
				txtDisplay.setText(String.valueOf(ops));
				
				
			}
		});
		btnLog_1_3_1_1.setBounds(255, 183, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1);
		
		JButton btnLog_1_3_1_1_1 = new JButton("Tan");
		btnLog_1_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog_1_3_1_1_1.setBounds(316, 183, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1);
		
		JButton btnLog_1_3_1_1_1_1 = new JButton("Tanh");
		btnLog_1_3_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog_1_3_1_1_1_1.setBounds(376, 183, 70, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_1);
		
		JButton btnLog_1_3_1_1_1_2 = new JButton("Exp");
		btnLog_1_3_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());				
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		btnLog_1_3_1_1_1_2.setBounds(446, 183, 58, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_2);
		
		JButton btnLog_1_3_1_1_1_3 = new JButton("2*π");
		btnLog_1_3_1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog_1_3_1_1_1_3.setBounds(446, 229, 58, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_3);
		
		JButton btnLog_1_3_1_1_1_4 = new JButton("Rund");
		btnLog_1_3_1_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			
			}
		});
		btnLog_1_3_1_1_1_4.setBounds(376, 229, 70, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_4);
		
		JButton btnLog_1_3_1_1_1_5 = new JButton("Cbr");
		btnLog_1_3_1_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			
			}
		});
		btnLog_1_3_1_1_1_5.setBounds(316, 229, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_5);
		
		JButton btnLog_1_3_1_1_1_6 = new JButton("x^2");
		btnLog_1_3_1_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
				ops = (ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			
			}
		});
		btnLog_1_3_1_1_1_6.setBounds(255, 229, 60, 47);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_6);
		
		JButton btnLog_1_3_1_1_1_6_1 = new JButton("x^3");
		btnLog_1_3_1_1_1_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					double ops = Double.parseDouble((String.valueOf(txtDisplay.getText())));
					ops = (ops * ops * ops);
					txtDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnLog_1_3_1_1_1_6_1.setBounds(255, 275, 60, 37);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_6_1);
		
		JButton btnLog_1_3_1_1_1_6_1_1 = new JButton("Bin");
		btnLog_1_3_1_1_1_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				int a = Integer.parseInt(txtDisplay.getText()); // Binary
				txtDisplay.setText(Integer.toString(a,2));
				
			}
		});
		btnLog_1_3_1_1_1_6_1_1.setBounds(316, 275, 60, 37);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_6_1_1);
		
		JButton btnLog_1_3_1_1_1_6_1_2 = new JButton("Hex");
		btnLog_1_3_1_1_1_6_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());// Binary
				txtDisplay.setText(Integer.toString(a,16));
			}
		});
		btnLog_1_3_1_1_1_6_1_2.setBounds(376, 275, 70, 37);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_6_1_2);
		
		JButton btnLog_1_3_1_1_1_6_1_3 = new JButton("Octal");
		btnLog_1_3_1_1_1_6_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtDisplay.getText());// Binary
				txtDisplay.setText(Integer.toString(a,8));
			}
		});
		btnLog_1_3_1_1_1_6_1_3.setBounds(446, 275, 58, 37);
		frmStandradCalulator.getContentPane().add(btnLog_1_3_1_1_1_6_1_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(510, 78, 310, 237);
		frmStandradCalulator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setBounds(124, 5, 112, 13);
		panel.add(lblCurrencyConverter);
		
		JComboBox jcmbCurrencys = new JComboBox();
		jcmbCurrencys.setBounds(48, 28, 235, 47);
		panel.add(jcmbCurrencys);
		jcmbCurrencys.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Nigeria", "Canada", "Brazil", "Indonesia", "Philippine", "India"}));
		
		jtxtConverts = new JTextField();
		jtxtConverts.setBounds(48, 96, 235, 36);
		panel.add(jtxtConverts);
		jtxtConverts.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(198, 197, 85, 37);
		panel.add(btnClear);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(48, 197, 85, 37);
		panel.add(btnConvert);
		
		jlblConverts = new JTextField();
		jlblConverts.setBounds(48, 142, 235, 29);
		panel.add(jlblConverts);
		jlblConverts.setColumns(10);
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConverts.getText());
				if(jcmbCurrencys.getSelectedItem().equals("Nigeria"))
				{
					String cConvert1 = String.format("N % 2f", British_Pound * Nigeruian);
					jlblConverts.setText(cConvert1);
				}
					if(jcmbCurrencys.getSelectedItem().equals("USA"))
					{
						String cConvert2 = String.format("$ % 2f", British_Pound * US_Dollar);
						jlblConverts.setText(cConvert2);
						
					}
					if(jcmbCurrencys.getSelectedItem().equals("Kenyan"))
					{
						String cConvert3 = String.format("KS % 2f", British_Pound * Kenyan_Shilling);
						jlblConverts.setText(cConvert3);
						
					}
					if(jcmbCurrencys.getSelectedItem().equals("Canada")) 
					{
						String cConvert4 = String.format("c$ % 2f", British_Pound * Canadian_Dollar);
						jlblConverts.setText(cConvert4);
						
					}
					if(jcmbCurrencys.getSelectedItem().equals("Brazil")) 
					{
						String cConvert5 = String.format("Bra % 2f", British_Pound * Brazilian_Real);
						jlblConverts.setText(cConvert5);
						
					}
					if(jcmbCurrencys.getSelectedItem().equals("India")) 
					{
						String cConvert6 = String.format("INR % 2f", British_Pound * Indian_Rupee);
						jlblConverts.setText(cConvert6);
						
					}
					if(jcmbCurrencys.getSelectedItem().equals("Philippine")) 
					{
						String cConvert7 = String.format("PHP % 2f", British_Pound * Philippine_peso);
						jlblConverts.setText(cConvert7);
						
					}
					if(jcmbCurrencys.getSelectedItem().equals("Indonesian")) 
					{
						String cConvert8 = String.format("IDR % 2f", British_Pound * Indonesian_Rupiah);
						jlblConverts.setText(cConvert8);
						
					}	
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConverts.setText(null);
				jlblConverts.setText(null);
				jcmbCurrencys.setSelectedItem("Choose One Currency");
			}
		});
	}
}
