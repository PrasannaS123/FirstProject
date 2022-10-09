package com.jumping;
import java.util.*;
public class Break {
	public static void main(String[] args) {
		Scanner love = new Scanner(System.in);
		System.out.println("enter a number ");
		byte b = love.nextByte();
		while(b>=0) {
			if(b%10==0) {
				System.out.println(b);
				break;
			}
		b--;
		
	}

}
}