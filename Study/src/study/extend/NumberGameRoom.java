package study.extend;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberGameRoom extends Room{
	
	private Logger logger = LoggerFactory.getLogger(NumberGameRoom.class);
	
	RoomType roomType = RoomType.NUMBER_GAME_ROOM;
	
	String winner;
	int bestRecord = 0;
	Random randomNum = new Random();
	
	@Override
	public void play() {
		 
		for (Player player : playerList) {
			
			logger.info("\n" + player.name + "님의 차례입니다.\n");
			
			long starTime = System.currentTimeMillis();
			
			for (int i = 0; i < 5; i++) {
				
				int num1 = randomNum.nextInt(9);
				int num2 = randomNum.nextInt(9);
				int answer = num1*num2;
				String question = "다음 문제의 답을 입력하세요 : " + num1 +  " x " + num2 + " = ";
				
				logger.info(question);
				
				while (answer != App.inputNo("답 : ")) {
					
					logger.info(question);
					
				}
				
			}
			
			long endTime = System.currentTimeMillis();
			
			int record = (int)(endTime - starTime)/1000;
			
			if (record > bestRecord) {
				
				bestRecord = record;
				winner = player.name;
				
			}
			
		}
		
		logger.info("\n" + winner + "님이 " + bestRecord + "초의 기록으로 최종 승리하셨습니다.");
		
	}
}
