package JavaFile;
public class Time{
	private int Hour;
	private int Minitue;
	private String Mer;
	
	public Time(int Hour,int Minitue,String Mer){
		this.Hour = Hour;
		this.Minitue= Minitue;
		this.Mer=Mer;
	}
	
	public void setHour(int Hour){this.Hour = Hour;}
	public void setMinitue(int Minitue){this.Minitue = Minitue;}
	public void setMer(String Mer){this.Mer = Mer;}
	
	public int getHour(){ return Hour;}
	public int getMinitue(){ return Minitue;}
	public String getMer(){ return Mer;}
	
	public String getTime(){
		return Hour+":"+Minitue+Mer;
	}
	public void showTime(){
		System.out.println(getTime());
	}
}