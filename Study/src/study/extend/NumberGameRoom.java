package study.extend;

import java.util.Iterator;
import java.util.Random;

public class NumberGameRoom extends Room{
	
	RoomType roomType = RoomType.NUMBER_GAME_ROOM;
	
	String winner;
	int bestRecord = 0;
	Random randomNum = new Random();
	
	@Override
	public void play() {
		
		for (Player player : playerList) {
			
			System.out.println("\n" + player.name + "님의 차례입니다.\n");
			
			long starTime = System.currentTimeMillis();
			
			for (int i = 0; i < 5; i++) {
				
				int num1 = randomNum.nextInt(9);
				int num2 = randomNum.nextInt(9);
				int answer = num1*num2;
				String question = "다음 문제의 답을 입력하세요 : " + num1 +  " x " + num2 + " = ";

				System.out.println(question);
				
				while (answer != App.inputNo("답 : ")) {
					
					System.out.println(question);
					
				}
				
			}
			
			long endTime = System.currentTimeMillis();
			
			int record = (int)(endTime - starTime)/1000;
			
			if (record > bestRecord) {
				
				bestRecord = record;
				winner = player.name;
				
			}
			
		}
		
		System.out.println("\n" + winner + "님이 " + bestRecord + "초의 기록으로 최종 승리하셨습니다.");
		
	}
}
