import java.awt.event.*;

public class BCListener implements ActionListener {

	public static final String START = "start";
	public static final String STOP = "stop";
	private final BCFrame frm;
	private BCTime thread;
	
	public BCListener(BCFrame frm) {
		super();
		this.frm = frm;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if (cmd == START) {
			frm.getStartBtn().setEnabled(false);
			frm.getStopBtn().setEnabled(true);
			BCTime bctime = new BCTime(frm);
			Thread t = new Thread(bctime);
			t.start();
			thread = bctime;
		}
		
		else if (cmd == STOP) {
			frm.getStartBtn().setEnabled(true);
			frm.getStopBtn().setEnabled(false);
			thread.running = false;
		}
		
	}

}
