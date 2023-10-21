package JavaFile;
import java.lang.*;
public class RegularHotel extends Hotel{
	private double DoubleBed;
	RegularHotel(){super();}
	public RegularHotel(String Name, double Room, double Food,double DoubleBed){
		super(Name,Room,Food);
		this.DoubleBed=DoubleBed;
	}
	public void setDoubleBed(double DoubleBed){
		this.DoubleBed=DoubleBed;
	}
	public double getDoubleBed(){
		return this.DoubleBed;
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("Double-Bed Room :"+this.DoubleBed);
	}
}