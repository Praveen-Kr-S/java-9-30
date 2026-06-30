package Learn_oops;

class Mobile{
	String brand = null;
	String model = null;
	String color = null;
	int rom = 0;
	int ram = 0;
	int price = 0;
	
	void button() {
		System.out.println(this.brand+" it's Help Screen ON/OFF");
	}
}

/*
 * class class_name{
 * 	public class_name(){
			//block of code
		}
 * 
 * }
 */



class Car{
	String brand = null;
	String model = null;
	String color = null;
	int mileage = 0;
	String fuel = null;
	int price = 0;
	void engine() {
		System.out.println(this.brand+" Engine is Start,Run,Off");
	}
	public Car(String b,String m,String c,String f,int mg, int p) {
		this.brand = b;
		this.model = m;
		this.color = c;
		this.mileage = mg;
		this.fuel = f;
		this.price = p;
		
		System.out.println("Car Brand : "+this.brand);
		System.out.println("Car Model : "+this.model);
		System.out.println("Car Color : "+this.color);
		System.out.println("Car Mileage : "+this.mileage);
		System.out.println("Car Fuel : "+this.fuel+" kmph");
		System.out.println("Car Price : "+this.price);
		this.engine();
		System.out.println("=================================");
	}
}


public class Learn_oops {
	
	public static void main(String[] args) {
		
		//ClassName variable = new ClassName();
//		Mobile m1 = new Mobile();
//		System.out.println(m1.brand);
//		m1.brand = "Samsung";
//		m1.model = "S24 Ultra";
//		m1.color = "black";
//		m1.ram = 12;
//		m1.rom = 512;
//		m1.price = 125000;
//		System.out.println("Mobile Brand : "+m1.brand);
//		System.out.println("Mobile Model : "+m1.model);
//		System.out.println("Mobile Color : "+m1.color);
//		System.out.println("Mobile Ram : "+m1.ram+" GB");
//		System.out.println("Mobile Rom : "+m1.rom+" GB");
//		System.out.println("Mobile Price : "+m1.price);
//		m1.button();
//		System.out.println("---------------------------");
//		
//		Mobile m2 = new Mobile();
////		System.out.println(m2.brand);
//		m2.brand = "Realme";
//		m2.model = "GT 7";
//		m2.color = "Red";
//		m2.ram = 16;
//		m2.rom = 256;
//		m2.price = 125000;
//		System.out.println("Mobile Brand : "+m2.brand);
//		System.out.println("Mobile Model : "+m2.model);
//		System.out.println("Mobile Color : "+m2.color);
//		System.out.println("Mobile Ram : "+m2.ram+" GB");
//		System.out.println("Mobile Rom : "+m2.rom+" GB");
//		System.out.println("Mobile Price : "+m2.price);
//		m2.button();
//		System.out.println("---------------------------");
		
		
		
//		Constructor type
		
		Car c1 = new Car("TATA","Nexon","Blue","Disel",15,1200000);
		
		Car c2 = new Car("Hyndai","i20","gray","petrol",18,1400000);
		
		
		
	}
}
