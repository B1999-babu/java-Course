package lambda.Practical;

public class Car {

	String make,mode,color;
	int price;
	
	public Car(String make, String mode, String color, int price) {
		super();
		this.make = make;
		this.mode = mode;
		this.color = color;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printCar() {
		System.out.println(this);
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", mode=" + mode + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
