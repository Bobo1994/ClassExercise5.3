
public class Car {
	private String color;
	private int horsePower;
	private double engineSize;	
	public Car(){
		color="blue";
		horsePower=2;
		engineSize=2.5;
	}
	public Car(String color, int horsePower, double engineSize){
		this.color=color;
		this.horsePower=horsePower;
		this.engineSize=engineSize;
	}
	public String getColor(){
		String  color =this.color;
		 return color;
	}
	public void setColor(String color){
		this.color =color;
	}
	public int getHorsePower(){
		int horsePower=this.horsePower;
		return horsePower;
	}
	public void setHorsePower(int horsePower){
		this.horsePower=horsePower;
	}
	public double getEngineSize(){
		double engineSize=this.engineSize;
		return engineSize;
	}
	public void setEngineSize(double engineSize){
		this.engineSize=engineSize;
	}
	public String toString(){
		return "The color of this car is "+this.color+", the hosepower is "+this.horsePower+", and the enginesize is "+this.engineSize; 
	}
	
}
