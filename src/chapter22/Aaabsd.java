package chapter22;

public class Aaabsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] playerJump = {"","","","",""}; 
		for(int i = 0; i < playerJump.length; i++) {
			System.out.print(playerJump[i] + "|");
		}
		System.out.println();
		System.out.println("playerJump.length : " + playerJump.length);
		
		playerJump[3] += "       ";
		
		for(int i = 0; i < playerJump.length; i++) {
			System.out.print(playerJump[i] + "|");
		}
		System.out.println();
		System.out.println("playerJump[3].length : " + playerJump[3].length());
		
	}

}
