package com.wwj.control;
import static com.wwj.util.Print.print;

//extends ¼Ì³Ð
public class ChocolateChip extends Cookie {
	
	protected void setName(String name) {
		print(name);
		this.name = name;
		super.setName(name);
	}
	
	public static void main(String[] args) {
		
		ChocolateChip chip=new ChocolateChip();
		chip.setName("µÂÜ½ÇÉ¿ËÁ¦±ý");
		chip.bite();
		
		print("---"+chip.getName());
		
	}
	

}
