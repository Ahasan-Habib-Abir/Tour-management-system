package JavaFile;
public abstract class Bus{
	private Time Schedule;
	private String Counter;
	Bus(){}
	public Bus(Time Schedule,String Counter){
		this.Schedule=Schedule;
		this.Counter=Counter;
	}
    public void setSchedule(Time Scheule){
		this.Schedule=Schedule;
	}
	public void setCounter(String Counter){
		this.Counter=Counter;
	}
	public Time getSchedule(){
		return this.Schedule;
	}
	public String getCounter(){
		return this.Counter;
	}
	public void showDetails(){
		System.out.println("Schedule :"+Schedule.getTime());
		System.out.println("Counter  :"+Counter);
	}
}    
