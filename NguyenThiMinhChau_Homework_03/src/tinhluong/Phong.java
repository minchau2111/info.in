package tinhluong;

import java.util.Scanner;

public abstract class Phong {
	public void phong() {
		String tenphong;
		String truongphong;
		Scanner ab=new Scanner(System.in);
		System.out.println("nhap ten phong: ");
		tenphong=ab.nextLine();
		System.out.println("nhap truong phong: ");
		truongphong=ab.nextLine();
		
		System.out.println("ten phong: " +tenphong);
		System.out.println("ten truong phong: " +truongphong);
		
	}
	
}
