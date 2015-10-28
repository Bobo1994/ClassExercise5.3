

public class CarDriver {

	public static void main(String[] args) {
		Car car=new Car();
		System.out.println("The enginesize of this car is "+car.getEngineSize()+"\nthe color is "+car.getColor()+"\nthe horsepower is "+car.getHorsePower());
		car.setColor("black");
		car.setEngineSize(3.0);
		car.setHorsePower(1);
		System.out.println(car);
	}

}
