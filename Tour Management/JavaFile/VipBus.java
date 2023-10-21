package JavaFile;
public class VipBus extends Bus{
	private double Ticket;
	private double Food;
	VipBus(){super();}
	public VipBus(Time Schedule,String Counter,double Ticket,double Food){
		super(Schedule,Counter);
		this.Ticket=Ticket;
		this.Food=Food;
	}
	public void setTicket(double Ticket){
		this.Ticket=Ticket;
	}
	public double getTicket(){
		return this.Ticket;	
	}
	public void setFood(double Food){
		this.Food=Food;
	}
	public double getFood(){
		return this.Food;	
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("Ticket Price :"+this.Ticket);
		System.out.println("Food Price   :"+this.Food);
		System.out.println("AC Service Provided");
	}
}