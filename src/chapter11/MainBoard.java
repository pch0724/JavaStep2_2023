package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		//1단계
		Player player = new Player();
		player.play(1);
		
		//2단계
		player.upgradeLevel(new AdvancedLevel());
		player.play(2);
		
		//3단계
		player.upgradeLevel(new SuperLevel());
		player.play(5);
	}
}
