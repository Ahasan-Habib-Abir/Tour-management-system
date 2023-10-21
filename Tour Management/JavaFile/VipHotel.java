package JavaFile;
public class VipHotel extends Hotel{
	private double AcRoom;
	private double DoubleBed;
	VipHotel(){super();}
	public VipHotel(String Name, double Room, double Food,double DoubleBed,double AcRoom){
		super(Name,Room,Food);
		this.DoubleBed=DoubleBed;
		this.AcRoom=AcRoom;
	}
	public void setDoubleBed(double DoubleBed){
		this.DoubleBed=DoubleBed;
	}
	public double getDoubleBed(){
		return this.DoubleBed;
	}
	public void setACRoom(double AcRoom){
		this.AcRoom=AcRoom;
	}
	public double getAcRoom(){
		return this.AcRoom;
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("Double-Bed Room :"+this.DoubleBed);
		System.out.println("AC Room         :"+this.AcRoom);
	}
}