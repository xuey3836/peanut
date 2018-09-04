package huasheng0903;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class peanut {

	private JFrame frame;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t2;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private JTextField t15;
	private JTextField t16;
	private JTextField t17;
	private JTextField t18;
	private JButton button;
	private JTextField r1;
	private JLabel lblNewLabel;
	private JLabel lblGg;
	private JLabel lblMgkohg;
	private JLabel lblGg_1;
	private JLabel lblOl;
	private JLabel lblGg_2;
	private JLabel lblGg_3;
	private JLabel lblGg_4;
	private JLabel lblGg_5;
	private JLabel lblGg_6;
	private JLabel lblGg_7;
	private JLabel lblGg_8;
	private JLabel lblGg_9;
	private JLabel lblGg_10;
	private JLabel lblGg_11;
	private JLabel lblGg_12;
	private JLabel lblGg_13;
	private JLabel lblGg_14;
	private JLabel label;
	private JTextField r2;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField r3;
	private JLabel label_3;
	private JTextField r4;
	private JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					peanut window = new peanut();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public peanut() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//ImageIcon icon=new ImageIcon("C:\\Users\\o0\\Desktop\\hs\\peanut.jpg");
		//frame.setIconImage(icon.getImage());
		frame.setTitle("\u82B1\u751F\u52A0\u5DE5\u9002\u5B9C\u6027\u8BC4\u4EF7");
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 870, 547);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		
		JTextField t1 = new JTextField();
		t1.setBounds(157, 101, 96, 27);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(429, 185, 96, 27);
		frame.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(157, 227, 96, 27);
		frame.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(701, 185, 96, 27);
		frame.getContentPane().add(t5);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(701, 309, 96, 27);
		frame.getContentPane().add(t6);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(429, 101, 96, 27);
		frame.getContentPane().add(t2);
		
		t7 = new JTextField();
		t7.setColumns(10);
		t7.setBounds(701, 143, 96, 27);
		frame.getContentPane().add(t7);
		
		t8 = new JTextField();
		t8.setColumns(10);
		t8.setBounds(157, 309, 96, 27);
		frame.getContentPane().add(t8);
		
		t9 = new JTextField();
		t9.setColumns(10);
		t9.setBounds(429, 227, 96, 27);
		frame.getContentPane().add(t9);
		
		t10 = new JTextField();
		t10.setColumns(10);
		t10.setBounds(701, 101, 96, 27);
		frame.getContentPane().add(t10);
		
		t11 = new JTextField();
		t11.setColumns(10);
		t11.setBounds(429, 143, 96, 27);
		frame.getContentPane().add(t11);
		
		t12 = new JTextField();
		t12.setColumns(10);
		t12.setBounds(701, 227, 96, 27);
		frame.getContentPane().add(t12);
		
		t13 = new JTextField();
		t13.setColumns(10);
		t13.setBounds(157, 141, 96, 27);
		frame.getContentPane().add(t13);
		
		t14 = new JTextField();
		t14.setColumns(10);
		t14.setBounds(157, 269, 96, 27);
		frame.getContentPane().add(t14);
		
		t15 = new JTextField();
		t15.setColumns(10);
		t15.setBounds(429, 309, 96, 27);
		frame.getContentPane().add(t15);
		
		t16 = new JTextField();
		t16.setColumns(10);
		t16.setBounds(429, 269, 96, 27);
		frame.getContentPane().add(t16);
		
		t17 = new JTextField();
		t17.setColumns(10);
		t17.setBounds(701, 267, 96, 27);
		frame.getContentPane().add(t17);
		
		t18 = new JTextField();
		t18.setColumns(10);
		t18.setBounds(157, 183, 96, 27);
		frame.getContentPane().add(t18);
		
		button = new JButton("\u8BA1\u7B97");
		button.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 22));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1= t1.getText();
				String s2 = t2.getText();
				String s3= t3.getText();
				String s4 = t4.getText();
				String s5= t5.getText();
				String s6 = t6.getText();
				String s7= t7.getText();
				String s8 = t8.getText();
				String s9= t9.getText();
				String s10 = t10.getText();
				String s11= t11.getText();
				String s12 = t12.getText();
				String s13= t13.getText();
				String s14 = t14.getText();
				String s15= t15.getText();
				String s16 = t16.getText();
				String s17= t17.getText();
				String s18 = t18.getText();
				
				//ª®…˙”Õ
				if ("".equals(s1)|"".equals(s2)|"".equals(s5)|"".equals(s7)|"".equals(s10)
						|"".equals(s11)| "".equals(s13)| "".equals(s18)) {
					r1.setText("None");
				}else {
					double dt1 = Double.valueOf(s1);//∫¨ÀÆ¡ø
					double dt2 = Double.valueOf(s2);// ∫¨”Õ¡ø
					double dt3 = Double.valueOf(s3);// À·º€
					double dt5 = Double.valueOf(s5);// O/L
					double dt7 = Double.valueOf(s7);// ◊ÿÈµÀ·
					double dt10 = Double.valueOf(s10);//”ÕÀ·
					double dt11 = Double.valueOf(s11);// ≤ª±•∫Õ÷¨∑æÀ·
					double dt13 = Double.valueOf(s13);// —«”ÕÀ·
					double dt18 = Double.valueOf(s18);// ª®…˙À·
					
					
					double u1 = 13.725 - 0.417*dt7*dt7 + 0.00167*dt13*dt13- 7.059*dt18*dt18-0.831*dt13/dt7-
						0.218*dt13/dt18+1.994/dt3-25.588/dt10-0.017*dt1*dt1- 0.0031*dt2- 0.0576*dt5*dt5+0.072*dt10+
					      0.189*dt11+2.006*dt1*dt3- 0.562*dt3*dt10-
					      0.143*dt3*dt5;
				double u2 = 20.849  - 0.417*dt7*dt7 + 0.00167*dt13*dt13- 7.059*dt18*dt18-0.831*dt13/dt7-
						0.218*dt13/dt18+1.994/dt3-25.588/dt10-0.017*dt1*dt1- 0.0031*dt2- 0.0576*dt5*dt5+0.072*dt10+
					      0.189*dt11+2.006*dt1*dt3- 0.562*dt3*dt10-
					      0.143*dt3*dt5;
				double  v1 = Math.exp(u1);
				double  v2 = Math.exp(u2);
				double  p1 = v1/(1+v1);
			    double  p2 = v2/(1+v2) - v1/(1+v1);
				double	p3 = 1- p1-p2;  
			    if (p3 > Math.max(p1, p2)){
					      r1.setText("  “À");
					    }else if(p2 > Math.max(p1, p3)){
					      r1.setText("ª˘±æ  “À");
					    }else if(p1 >Math.max(p2, p3) ){
					      r1.setText("≤ª  “À");
					    }}
				
			   //huangshengjiang
			    if ("".equals(s2)|"".equals(s4)|"".equals(s5)|"".equals(s8)|"".equals(s9)|"".equals(s10)|"".equals(s12)) {
			    	r2.setText("None");
			    } else {
					double dt2 = Double.valueOf(s2);// ∫¨”Õ¡ø
					double dt4 = Double.valueOf(s4);// µ∞∞◊÷ ∫¨¡ø
					double dt5 = Double.valueOf(s5);// O/L
					double dt8 = Double.valueOf(s8);// µ∞∞±À·
					double dt9 = Double.valueOf(s9);// æ´∞±À·
					double dt10 = Double.valueOf(s10);//”ÕÀ·
					double dt12 = Double.valueOf(s12);// ÃÏ√≈∂¨∞±À·
				
					
			        double hsju1 = -135.3133-121.3634*dt8*dt8-2.3718/(dt8*dt8)+8.5160/(dt5*dt5)+
				            13.6826*Math.log(dt2)+48.4477*Math.log(dt4)+15.6472*Math.log(dt12)-15.7329*Math.log(dt10)-
				            2.0589*dt9*dt9;
				    double hsju2 = -128.5687-121.3634*dt8*dt8-2.3718/(dt8*dt8)+8.5160/(dt5*dt5)+
				            13.6826*Math.log(dt2)+48.4477*Math.log(dt4)+15.6472*Math.log(dt12)-15.7329*Math.log(dt10)-
				            2.0589*dt9*dt9;
					double  jv1 = Math.exp(hsju1);
					double  jv2 = Math.exp(hsju2);
					double  jp1 = jv1/(1+jv1);
				    double  jp2 = jv2/(1+jv2) - jv1/(1+jv1);
					double	jp3 = 1- jp1-jp2;  
				    if (jp3 > Math.max(jp1, jp2)){
						      r2.setText("  “À");
						    }else if(jp2 > Math.max(jp1, jp3)){
						      r2.setText("ª˘±æ  “À");
						    }else if(jp1 >Math.max(jp2, jp3) ){
						      r2.setText("≤ª  “À");
						    }
			    }
			
				
			            
			     //ningjiao 
			     if("".equals(s6)|"".equals(s9)|"".equals(s12)|"".equals(s14)|"".equals(s15)|"".equals(s16)|"".equals(s17)) {
			    	 r3.setText("None");
			     }else {
						double dt6 = Double.valueOf(s6);// ¥÷œÀŒ¨
						double dt9 = Double.valueOf(s9);// æ´∞±À·
						double dt12 = Double.valueOf(s12);// ÃÏ√≈∂¨∞±À·
						double dt14 = Double.valueOf(s14);// À’∞±À·
						double dt15 = Double.valueOf(s15);// π»∞±À·
						double dt16 = Double.valueOf(s16);// “Ï¡¡∞±À·
						double dt17 = Double.valueOf(s17);// ¡¡∞±À·
			    	 double nju =  43.3235- 5.8742/(dt6*dt6)+2.5718*dt12*dt16-14.2342*dt16/dt12-
					            11.0155*dt12/dt17+0.4072*dt15/dt14-
					            30.9734*dt14/dt17-47.9375*dt16/dt9;
					     double njp1 = Math.exp(nju)/(1+Math.exp(nju));
					     double njp2 = 1/(1+Math.exp(nju));
					     double njp = njp2- njp1 ;
					    if ( njp >0.33){
					    	 r3.setText("  “À");
					    }else if( -0.33 < njp & njp < 0.33){
					    	r3.setText("ª˘±æ  “À");
					    }else{
					    	r3.setText("≤ª  “À");
					     }
				      
			     }
			     
			     
			     //rongjie   
			     if("".equals(s6)|"".equals(s9)|"".equals(s12)|"".equals(s14)|"".equals(s15)|"".equals(s17)) {
			    	 r4.setText("None");
			     }
			     else {

						double dt6 = Double.valueOf(s6);// ¥÷œÀŒ¨
						double dt9 = Double.valueOf(s9);// æ´∞±À·
						double dt12 = Double.valueOf(s12);// ÃÏ√≈∂¨∞±À·
						double dt14 = Double.valueOf(s14);// À’∞±À·
						double dt15 = Double.valueOf(s15);// π»∞±À·
						double dt17 = Double.valueOf(s17);// ¡¡∞±À·
			    	 
				     double rju = -100.2 - 0.0370* dt6*dt6- 1.5610*dt9+0.004978/(dt14*dt14)-
					            309.5/(dt15*dt15)+7.0861*dt14/(dt6)-2.9472*dt12*dt17+
					          182.34*dt14/dt17+33.648*dt17/dt14-10.903*dt15/dt9;
					     double rjp1 = Math.exp(rju)/(1+Math.exp(rju));
					     double rjp2 = 1/(1+Math.exp(rju));
					     double rjp = rjp2- rjp1 ;
					     if ( rjp >0.33){
					    	 r4.setText("  “À");
					    }else if( -0.33 < rjp & rjp < 0.33){
					    	r4.setText("ª˘±æ  “À");
					    }else{
					    	r4.setText("≤ª  “À");
					     } 
			     }
		
			}
		});
		button.setForeground(Color.BLUE);
		button.setBounds(242, 351, 123, 29);
		frame.getContentPane().add(button);
		
		r1 = new JTextField();
		r1.setBounds(225, 404, 96, 27);
		frame.getContentPane().add(r1);
		r1.setColumns(10);
		
		lblNewLabel = new JLabel("\u542B\u6C34\u91CF g/100g");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblNewLabel.setBounds(46, 106, 93, 21);
		frame.getContentPane().add(lblNewLabel);
		
		lblGg = new JLabel("\u542B\u6CB9\u91CF g/100g");
		lblGg.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg.setBounds(321, 106, 93, 21);
		frame.getContentPane().add(lblGg);
		
		lblMgkohg = new JLabel("\u9178\u4EF7 mgKOH/g");
		lblMgkohg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMgkohg.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblMgkohg.setBounds(321, 190, 93, 21);
		frame.getContentPane().add(lblMgkohg);
		
		lblGg_1 = new JLabel("\u86CB\u767D\u8D28\u542B\u91CF g/100g");
		lblGg_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_1.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_1.setBounds(15, 230, 124, 21);
		frame.getContentPane().add(lblGg_1);
		
		lblOl = new JLabel("O/L");
		lblOl.setHorizontalAlignment(SwingConstants.CENTER);
		lblOl.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblOl.setBounds(593, 190, 93, 21);
		frame.getContentPane().add(lblOl);
		
		lblGg_2 = new JLabel("\u7C97\u7EA4\u7EF4 g/100g");
		lblGg_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_2.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_2.setBounds(593, 314, 93, 21);
		frame.getContentPane().add(lblGg_2);
		
		lblGg_3 = new JLabel("\u68D5\u6988\u9178 g/100g");
		lblGg_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_3.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_3.setBounds(593, 148, 93, 21);
		frame.getContentPane().add(lblGg_3);
		
		lblGg_4 = new JLabel("\u86CB\u6C28\u9178 g/100g");
		lblGg_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_4.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_4.setBounds(46, 314, 93, 21);
		frame.getContentPane().add(lblGg_4);
		
		lblGg_5 = new JLabel("\u7CBE\u6C28\u9178 g/100g");
		lblGg_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_5.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_5.setBounds(321, 232, 93, 21);
		frame.getContentPane().add(lblGg_5);
		
		lblGg_6 = new JLabel("\u6CB9\u9178 g/100g");
		lblGg_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_6.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_6.setBounds(593, 106, 93, 21);
		frame.getContentPane().add(lblGg_6);
		
		lblGg_7 = new JLabel("\u4E0D\u9971\u548C\u8102\u80AA\u9178 g/100g");
		lblGg_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_7.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_7.setBounds(280, 148, 134, 21);
		frame.getContentPane().add(lblGg_7);
		
		lblGg_8 = new JLabel("\u5929\u95E8\u51AC\u6C28\u9178 g/100g");
		lblGg_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_8.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_8.setBounds(561, 232, 124, 21);
		frame.getContentPane().add(lblGg_8);
		
		lblGg_9 = new JLabel("\u4E9A\u6CB9\u9178 g/100g");
		lblGg_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_9.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_9.setBounds(46, 146, 93, 21);
		frame.getContentPane().add(lblGg_9);
		
		lblGg_10 = new JLabel("\u82CF\u6C28\u9178 g/100g");
		lblGg_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_10.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_10.setBounds(46, 272, 93, 21);
		frame.getContentPane().add(lblGg_10);
		
		lblGg_11 = new JLabel("\u8C37\u6C28\u9178 g/100g");
		lblGg_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_11.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_11.setBounds(321, 314, 93, 21);
		frame.getContentPane().add(lblGg_11);
		
		lblGg_12 = new JLabel("\u5F02\u4EAE\u6C28\u9178 g/100g");
		lblGg_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_12.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_12.setBounds(301, 274, 123, 21);
		frame.getContentPane().add(lblGg_12);
		
		lblGg_13 = new JLabel("\u4EAE\u6C28\u9178 g/100g");
		lblGg_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_13.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_13.setBounds(593, 274, 93, 21);
		frame.getContentPane().add(lblGg_13);
		
		lblGg_14 = new JLabel("\u82B1\u751F\u9178 g/100g");
		lblGg_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblGg_14.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 13));
		lblGg_14.setBounds(46, 190, 93, 21);
		frame.getContentPane().add(lblGg_14);
		
		label = new JLabel("\u82B1\u751F\u6CB9");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(146, 407, 81, 21);
		frame.getContentPane().add(label);
		
		r2 = new JTextField();
		r2.setColumns(10);
		r2.setBounds(593, 404, 96, 27);
		frame.getContentPane().add(r2);
		
		label_1 = new JLabel("\u82B1\u751F\u9171");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(508, 407, 81, 21);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("\u51DD\u80F6\u6027");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(146, 446, 81, 21);
		frame.getContentPane().add(label_2);
		
		r3 = new JTextField();
		r3.setColumns(10);
		r3.setBounds(225, 443, 96, 27);
		frame.getContentPane().add(r3);
		
		label_3 = new JLabel("\u6EB6\u89E3\u6027");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(508, 443, 81, 21);
		frame.getContentPane().add(label_3);
		
		r4 = new JTextField();
		r4.setColumns(10);
		r4.setBounds(593, 440, 96, 27);
		frame.getContentPane().add(r4);
		
		label_4 = new JLabel("\u82B1\u751F\u52A0\u5DE5\u9002\u5B9C\u6027\u8BC4\u4EF7");
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("ÀŒÃÂ", Font.BOLD, 30));
		label_4.setBounds(225, 15, 367, 56);
		frame.getContentPane().add(label_4);
		
		JButton btnNewButton = new JButton("\u91CD\u7F6E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				t7.setText("");
				t8.setText("");
				t9.setText("");
				t10.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t15.setText("");
				t16.setText("");
				t17.setText("");
				t18.setText("");
				r1.setText("");
				r2.setText("");
				r3.setText("");
				r4.setText("");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("ÀŒÃÂ", Font.PLAIN, 22));
		btnNewButton.setBounds(498, 351, 123, 29);
		frame.getContentPane().add(btnNewButton);
	}
}
