package serializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MyTime implements Serializable {

	private int time;
	private List<String> times;

	public MyTime() {
		this.time = 0;
		times = new ArrayList<String>();
	}

	public void increase() {
		time++;
	}

	public void reset() {
		time = 0;
	}

	public int getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "MyTime [time=" + time + "]";
	}

	public void saveTime() {
		times.add(time + "");
	}

}
