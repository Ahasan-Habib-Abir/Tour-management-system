package JavaFile;
public class RegularBus extends Bus{
	private double Ticket;
	RegularBus(){super();}
	public RegularBus(Time Schedule,String Counter,double Ticket){
		super(Schedule,Counter);
		this.Ticket=Ticket;
	}
	public void setTicket(double Ticket){
		this.Ticket=Ticket;
	}
	public double getTicket(){
		return this.Ticket;	
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("Ticket Price :"+this.Ticket);
	}
}