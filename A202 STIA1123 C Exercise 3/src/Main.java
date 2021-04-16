
public class Main {

	public static void main(String[] args) {
		Desktop a = new Desktop();
		System.out.println("Desktop Details:");
		System.out.println("Brand: "+ a.brand);
		System.out.println("CPU: "+ a.cpu);
		System.out.println("RAM: "+ a.ram+"GB");
		System.out.printf("Price per unit: RM%.2f %n",a.price);
		System.out.println("Number of units: " + a.no);
		System.out.printf("Total Price: RM%.2f %n",a.totalprice);
		
		System.out.println();
		
		Desktop b = new Desktop("HP", "intel i7", 16, 3);
		System.out.println("Desktop Details:");
		System.out.println("Brand: "+ b.brand);
		System.out.println("CPU: "+ b.cpu);
		System.out.println("RAM: "+ b.ram+"GB");
		System.out.printf("Price per unit: RM%.2f %n",b.price);
		System.out.println("Number of units: " + b.no);
		System.out.printf("Total Price: RM%.2f %n",b.totalprice);
	}

}
