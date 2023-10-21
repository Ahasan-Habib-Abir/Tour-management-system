package Interfaces;
import javaFIle.Admin;
public interface IAdmin{
public void AddHotel(Hotel hotel[],Hotel h);
public void RemoveHotel(Hotel hotel[], Hotel h);
public void showAllHotel(Hotel hotel[]);
public void AddBus(Bus bus[],Bus b);
public void RemoveBus(Bus bus[], Bus b);
public void showAllBus( Bus bus[]);
public void AddPackages(Packages packages[],Packages p);
public void RemovePackages(Packages packages[],Packages p);
public void showAllPackages(Packages packages[]);
}