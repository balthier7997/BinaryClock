import java.util.*;

public class BCTime implements Runnable {

	private final BCFrame frm;
	private int hh, mm, ss;
	public boolean running = false;

	// costruttore
	public BCTime(BCFrame frm) {
		super();
		this.frm = frm;
	}

	@Override
	public void run() {
		if (!running)
			running = true;
		
		while (running) {
			Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"),Locale.ITALY);
			hh = calendar.get(Calendar.HOUR_OF_DAY);
			mm = calendar.get(Calendar.MINUTE);
			ss = calendar.get(Calendar.SECOND);
			System.out.println(hh+":"+mm+":"+ss);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
