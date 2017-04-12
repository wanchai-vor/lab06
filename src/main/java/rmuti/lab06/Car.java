package rmuti.lab06;

public class Car implements Comparable<Object> {

	private String id;
	private String name;
	private int price;

	public Car(String id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("[id=%s,name=%s,price=%d]", id, name, price);
	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Car otherCar = (Car) o;
		if (price > otherCar.getPrice()) {
			return 1;
		} else if (price < otherCar.getPrice()) {
			return -1;
		} else {
			return 0;
		}
	}

	/* Getter and Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}