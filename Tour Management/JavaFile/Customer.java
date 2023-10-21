package JavaFile;
import java.lang.*;
public class Customer{
	private String name; 
	private String Email;
	private String PhnNum;
	private int age;
	
	Customer(){}
	public Customer(String name,String Email,String PhnNum,int age){
		this.name=name;
		this.Email=Email;
		this.PhnNum=PhnNum;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setEmail(String Email){
		this.Email=Email;
	}
	public String getEmail(){
		return this.Email;
	}
	public void setPhnNum(String PhnNum){
		this.PhnNum=PhnNum;
	}
	public String getPhnNum(){
		return this.PhnNum=PhnNum;
	}
	public void setAge(int age){
		this.age=age;
	}
		
	
	public void AddPackages(Packages packages[],Packages p){
		for(int i=0;i<packages.length;i++){
			if(packages[i] == null){
				packages[i] = p;
				break;
			}
		}
	}
	public void RemovePackages(Packages packages[],Packages p){
		for(int i=0;i<packages.length;i++){
			if(packages[i] == p){
				packages[i] = null;
				break;
			}
		}
	}
	public void showAllPackages(Packages packages[]){
		System.out.println("===============");
		
		System.out.println("Customer name:"+name);
	System.out.println("Email:"+Email);
	System.out.println("PhnNum:"+PhnNum);
	System.out.println("Age:"+age);
		
		for(int i=0;i<packages.length;i++){
			if(packages[i] !=null){
				
				packages[i].showDetails();
			}
		}
		
	}
}