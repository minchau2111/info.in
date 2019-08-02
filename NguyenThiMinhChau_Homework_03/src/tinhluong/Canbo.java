package tinhluong;

import java.util.Scanner;

public class Canbo extends Phong {
	@Override
	public void phong() {
		// TODO Auto-generated method stub
		super.phong();
	}
	
	private String chucvu;
	private double hesoluong;
	private String xeploai;
	private double luong;
	
	public void input() {
		Scanner mc=new Scanner(System.in);
		System.out.println("nhap chuc vu: ");
		chucvu=mc.nextLine();
		System.out.println("nhap he so luong: ");
		hesoluong=mc.nextDouble();
		mc.hasNextLine();
		System.out.println("xep loai: ");
		xeploai=mc.nextLine();
		
	}
	
	public void output() {
		
	}
}
