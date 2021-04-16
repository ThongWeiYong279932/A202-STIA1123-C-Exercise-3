
import java.util.Scanner;

public class Desktop {
		String brand, cpu;
		int ram, no;
		double price, totalprice;
		
		Scanner scan = new Scanner(System.in);
		
		Desktop(){
			System.out.print("Please enter the desktop brand(HP/Dell): ");
			this.brand = scan.nextLine();
			System.out.print("Please enter the CPU model(intel i5/ intel i7): ");
			this.cpu = scan.nextLine();
			System.out.print("Please enter the RAM(8/16): ");
			this.ram = scan.nextInt();
			if (brand.equalsIgnoreCase("HP")) {
				if (cpu.equalsIgnoreCase("intel i5")) {
					if (ram == 8) {
						this.price = 2500;
					}
					else if (ram == 16) {
						this.price = 3000;
					}
				}
				else if (cpu.equalsIgnoreCase("intel i7")) {
					if (ram == 8) {
						this.price = 3000;
					}
					else if (ram == 16) {
						this.price = 3500;
					}
				}
			}
			else if (brand.equalsIgnoreCase("Dell")) {
				if (cpu.equalsIgnoreCase("intel i5")) {
					if (ram == 8) {
						this.price = 2300;
					}
					else if (ram == 16) {
						this.price = 2800;
					}
				}
				else if (cpu.equalsIgnoreCase("intel i7")) {
					if (ram == 8) {
						this.price = 2800;
					}
					else if (ram == 16) {
						this.price = 3300;
					}
				}
			}
			System.out.print("Please enter the number of units: ");
			this.no = scan.nextInt();
			this.totalprice = this.price * this.no;
			System.out.println();
		}
		
		Desktop(String brand, String cpu, int ram, int no){
			this.brand = brand;
			this.cpu = cpu;
			this.ram = ram;
			if (brand.equalsIgnoreCase("HP")) {
				if (cpu.equalsIgnoreCase("intel i5")) {
					if (ram == 8) {
						this.price = 2500;
					}
					else if (ram == 16) {
						this.price = 3000;
					}
				}
				else if (cpu.equalsIgnoreCase("intel i7")) {
					if (ram == 8) {
						this.price = 3000;
					}
					else if (ram == 16) {
						this.price = 3500;
					}
				}
			}
			else if (brand.equalsIgnoreCase("Dell")) {
				if (cpu.equalsIgnoreCase("intel i5")) {
					if (ram == 8) {
						this.price = 2300;
					}
					else if (ram == 16) {
						this.price = 2800;
					}
				}
				else if (cpu.equalsIgnoreCase("intel i7")) {
					if (ram == 8) {
						this.price = 2800;
					}
					else if (ram == 16) {
						this.price = 3300;
					}
				}
			}
			this.no = no;
			this.totalprice = this.price * this.no;
			System.out.println();
		}
}
