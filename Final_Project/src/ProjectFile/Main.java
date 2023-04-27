package ProjectFile;

import java.util.Scanner;
import java.util.Vector;

import Object.Menu;

public class Main {
	
	private static final String NULL = null;

	Scanner sc = new Scanner(System.in);
	
	Vector<Menu> menuData = new Vector<Menu>();
	
	public Main() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void Insert() {
		String kode, nama;
		int harga, stok;
		
		System.out.println("Input kode menu (PD-XXX):");
		kode = sc.nextLine();
		System.out.println("Input nama menu:");
		nama = sc.nextLine();
		System.out.println("Input harga menu:");
		harga = sc.nextInt(); sc.nextLine();
		System.out.println("Input stok menu:");
		stok = sc.nextInt(); sc.nextLine();
		
		Menu s = new Menu(kode, nama, harga, stok);
		
		menuData.add(s);
	}
	
	public void View() {
		
	}
	
	public void Update() {
		int harga, stok;
		System.out.println("Input harga baru:");
		harga = sc.nextInt(); sc.nextLine();
		System.out.println("Input stok baru:");
		stok = sc.nextInt(); sc.nextLine();
		
		Menu s = new Menu(harga, stok);
		
		menuData.add(s);
	}
	
	public void Delete() {
		Menu s = new Menu(NULL, NULL, NULL, NULL);
		
		menuData.add(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
