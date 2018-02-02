import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

@SuppressWarnings("serial")
public class BCFrame extends JFrame {

	// GRAFICA
	private final JPanel pane = new JPanel();
	private final JPanel hh_pane = new JPanel();
	private final JPanel mm_pane = new JPanel();
	private final JPanel ss_pane = new JPanel();
	// radiobutton per le ore
	private final JRadioButton h1 = new JRadioButton();
	private final JRadioButton h2 = new JRadioButton();
	private final JRadioButton h3 = new JRadioButton();
	private final JRadioButton h4 = new JRadioButton();
	private final JRadioButton h5 = new JRadioButton();
	private final JRadioButton h6 = new JRadioButton();
	// radiobutton per le minuti
	private final JRadioButton m1 = new JRadioButton();
	private final JRadioButton m2 = new JRadioButton();
	private final JRadioButton m3 = new JRadioButton();
	private final JRadioButton m4 = new JRadioButton();
	private final JRadioButton m5 = new JRadioButton();
	private final JRadioButton m6 = new JRadioButton();
	// radiobutton per le secondi
	private final JRadioButton s1 = new JRadioButton();
	private final JRadioButton s2 = new JRadioButton();
	private final JRadioButton s3 = new JRadioButton();
	private final JRadioButton s4 = new JRadioButton();
	private final JRadioButton s5 = new JRadioButton();
	private final JRadioButton s6 = new JRadioButton();
	//start & stop
	private final JButton start = new JButton("Start");
	private final JButton stop = new JButton("Stop");
	private final JPanel start_pane = new JPanel();
	private final JPanel stop_pane = new JPanel();
	private final JPanel btn_pane = new JPanel();
	
	//COSTRUTTORE
	public BCFrame() {
		super("BinaryClock");
		
		hh_pane.add(h1);		hh_pane.add(h2);		hh_pane.add(h3);		
		hh_pane.add(h4);		hh_pane.add(h5);		hh_pane.add(h6);
		
		mm_pane.add(m1);		mm_pane.add(m2);		mm_pane.add(m3);
		mm_pane.add(m4);		mm_pane.add(m5);		mm_pane.add(m6);
		
		ss_pane.add(s1);		ss_pane.add(s2);		ss_pane.add(s3);
		ss_pane.add(s4);		ss_pane.add(s5);		ss_pane.add(s6);
		
		pane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		start_pane.add(start);	stop_pane.add(stop);
		btn_pane.add(start_pane);
		btn_pane.add(stop_pane);	stop.setEnabled(false);
		
		pane.setLayout(new BorderLayout());
		pane.add(hh_pane, BorderLayout.NORTH);
		pane.add(mm_pane, BorderLayout.CENTER);
		pane.add(ss_pane, BorderLayout.SOUTH);
		
		Container frm = this.getContentPane();
		frm.setLayout(new BorderLayout());
		frm.add(pane, BorderLayout.CENTER);
		frm.add(btn_pane, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setSize(300, 187);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//LISTENER
		BCListener listener = new BCListener(this);
		start.addActionListener(listener);
		stop.addActionListener(listener);
		start.setActionCommand(BCListener.START);
		stop.setActionCommand(BCListener.STOP);
		
	}
	
	//GET
	public JPanel getHHPane() {
		return this.hh_pane;
	}
	public JPanel getMMPane() {
		return this.mm_pane;
	}
	public JPanel getSSPane() {
		return this.ss_pane;
	}
	public JButton getStartBtn() {
		return this.start;
	}
	public JButton getStopBtn() {
		return this.stop;
	}
	
	//MAIN
	public static void main(String[] args) {
		BCFrame frm = new BCFrame();
	}
	
}
