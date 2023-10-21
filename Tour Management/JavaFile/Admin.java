package JavaFile;
import Interfaces.*;
public class Admin{
	public void AddHotel(Hotel hotel[],Hotel h){
		for(int i=0;i<hotel.length;i++){
			if(hotel[i] == null){
				hotel[i] = h;
				break;
			}
		}
	}
	public void RemoveHotel(Hotel hotel[], Hotel h){
		for(int i=0;i<hotel.length;i++){
			if(hotel[i] == h){
				hotel[i] = null;
				break;
			}
		}
	}
	public void showAllHotel(Hotel hotel[]){
		
		for(int i=0;i<hotel.length;i++){
			if(hotel[i] !=null){
				System.out.println("===============");
				hotel[i].showDetails();
			}
		}
		
	}
	
	public void AddBus(Bus bus[],Bus b){
		for(int i=0;i<bus.length;i++){
			if(bus[i] == null){
				bus[i] = b;
				break;
			}
		}
	}
	public void RemoveBus(Bus bus[], Bus b){
		for(int i=0;i< bus.length;i++){
			if( bus[i] == b){
				 bus[i] = null;
				break;
			}
		}
	}
	public void showAllBus( Bus bus[]){
		
		for(int i=0;i<bus.length;i++){
			if(bus[i] !=null){
				System.out.println("===============");
				bus[i].showDetails();
			}
		}
		
	}
	
}