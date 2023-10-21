package JavaFile;

public abstract class Packages{
	private Date day;
    private Bus bus;
    private Hotel hotel;
	
	Packages(){}
	public Packages(Date day, Bus bus, Hotel hotel){
		this.day=day;
		this.bus=bus;
		this.hotel=hotel;
	}
	public void setDate(Date day){
		this.day=day;
	}
	public Date getDate(){
		return this.day;
	}
	public void setBus(Bus bus){
		this.bus=bus;
	}
	public Bus getBus(){
		return this.bus;
	}
	public void setHotel(Hotel hotel){
		this.hotel=hotel;
	}
	public Hotel getHotel(){
		return this.hotel=hotel;
	}
	public void showDetails(){
		System.out.println("Date :"+day.getDate());
		System.out.println("Hotel Info :");
		hotel.showDetails();
		System.out.println("Bus Info :");
		bus.showDetails();
		
	}
	
}