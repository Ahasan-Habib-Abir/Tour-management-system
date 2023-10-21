package JavaFile;
public abstract class Hotel{
	private String Name;
	private double Room;
	private double Food;
	
	Hotel(){}
	public Hotel(String Name, double Room, double Food){
		this.Name=Name;
		this.Room=Room;
		this.Food=Food;
	}
	
	public void SetName(String Name){
		this.Name=Name;
	}
	public String getName(){
		return this.Name;
	}
	public void SetRoom(double Room){
		this.Room=Room;
	}
	public double getRoom(){
		return this.Room;
	}
	public void SetFood(double Food){
		this.Food=Food;
	}
	public double getFood(){
		return this.Food;
	}
	public void showDetails(){
		System.out.println("Hotel Name :"+Name);
		System.out.println("Room Price :"+Room);
		System.out.println("Food Price :"+Food);
	}
}