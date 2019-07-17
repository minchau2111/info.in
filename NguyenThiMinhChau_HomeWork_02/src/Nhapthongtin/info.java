package Nhapthongtin;

import java.util.Scanner;

public class info {
	private String fullname;
	private String id;
	private int age;
	private int mon1,mon2,mon3;
	private int tc1,tc2,tc3;
	private String group;
	private float tb;
	
	
	
	public info(String fullname, String id, int age, int mon1, int mon2, int mon3, int tc1, int tc2, int tc3,
			String group, float tb) {
		super();
		this.fullname = fullname;
		this.id = id;
		this.age = age;
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
		this.tc1 = tc1;
		this.tc2 = tc2;
		this.tc3 = tc3;
		this.group = group;
		this.tb = tb;
		
	}
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMon1() {
		return mon1;
	}

	public void setMon1(int mon1) {
		this.mon1 = mon1;
	}

	public int getMon2() {
		return mon2;
	}

	public void setMon2(int mon2) {
		this.mon2 = mon2;
	}

	public int getMon3() {
		return mon3;
	}

	public void setMon3(int mon3) {
		this.mon3 = mon3;
	}

	public int getTc1() {
		return tc1;
	}

	public void setTc1(int tc1) {
		this.tc1 = tc1;
	}

	public int getTc2() {
		return tc2;
	}

	public void setTc2(int tc2) {
		this.tc2 = tc2;
	}

	public int getTc3() {
		return tc3;
	}

	public void setTc3(int tc3) {
		this.tc3 = tc3;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public float getTb() {
		return tb;
	}

	public void setTb(float tb) {
		this.tb = tb;
	}

	public info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void input() {
		Scanner mc=new Scanner(System.in);
		System.out.println("nhap ho ten: ");
		fullname=mc.nextLine();
		System.out.println("nhap ma sinh vien: ");
		id=mc.nextLine();
		System.out.println("nhap tuoi: ");
		age=mc.nextInt();
		System.out.println("nhap diem 3 mon: ");
		mon1=mc.nextInt();
		mon2=mc.nextInt();
		mon3=mc.nextInt();
		System.out.println("nhap so tin chi: ");
		tc1=mc.nextInt();
		tc2=mc.nextInt();
		tc3=mc.nextInt();
		System.out.println("nhap lop: ");
		group=mc.nextLine();
		mc.nextLine();
		tb=(float)((mon1*tc1+mon2*tc2+mon3*tc3)/(tc1+tc2+tc3));
		
		
	}
	public void display() {
		System.out.println("ho va ten: " + fullname);
		System.out.println("Ma sinh vien: " + id);
		System.out.println("tuoi: " + age);
		System.out.println("mon 1: " +mon1 +"	so tin chi:" + tc1);
		System.out.println("mon 2: " +mon2+ "	so tin chi:" + tc2);
		System.out.println("mon 3: " +mon3+ "	so tin chi:" + tc3);
		System.out.println("Diem trung binh: " + tb);
		if(tb<4) System.out.println("yeu");
		if(tb<6) System.out.println("trung binh");
		if(tb<7.5) System.out.println("kha");
		else System.out.println("gioi");
		
	}
	
	

}
