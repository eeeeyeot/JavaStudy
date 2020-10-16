package p350ex7_13;

public class TimeSet
{
	public static void main(String[] args)
	{
		Time t = new Time(12, 35, 30);
		System.out.println(t);
		//t.hour = 13;
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}
}

class Time{
	private int hour, min, sec;
	Time(int hour, int min, int sec){
		setHour(hour);
		setMin(min);
		setSec(sec);
	}
	public int getHour() { return hour; }
	public void setHour(int hour)
	{
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	public int getMin() { return min; }
	public void setMin(int min)
	{
		if(min < 0 || min > 59) return;
		this.min = min;
	}
	public int getSec() { return sec; }
	public void setSec(int sec)
	{
		if(sec < 0 || sec > 59) return;
		this.sec = sec;
	}
	public String toString() {
		return hour + ":" + min + ":" + sec;
	}
}
