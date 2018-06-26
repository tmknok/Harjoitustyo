
public class Timer {
	
	private double startTime;
	private double endTime;
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public double getTime() {
		return endTime - startTime;
	}
	
}
