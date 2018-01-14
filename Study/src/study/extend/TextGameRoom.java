package study.extend;

import java.util.Map;
import java.util.Scanner;

public class TextGameRoom extends Room{
	
	RoomType roomType = RoomType.TEXT_GAME_ROOM;
	
	String[] questions = {"울릉도 동남쪽 뱃길 따라 이백리", "밤이 깊었네 방황하며 춤을 추는 불빛들", "모르는 노래야 아는걸로 말하라고"};
	
	@Override
	public void play() {
		
		String winner = null;
		long record = 0;
		
		for (Player player : playerList) {
			
			// # double을 int로 캐스팅 할 때 소수점 이하 버림! ( Math.random() : 0 ~ 0.99.. 리턴 )
			int index = (int) (Math.random() * questions.length);
			
			String question = questions[index]; 
			System.out.println("문제) " + question);
			
			long startTime = System.currentTimeMillis();
			
			while (!question.equals(App.inputText("정답 : "))) {
			}
			
			long duration = (System.currentTimeMillis() - startTime)/1000;
			
			System.out.println(player.name + "님의 소요 시간 : " + duration+" 초");
			
			if (duration > record) {
				winner = player.name;
				record = duration;	
			}
		}
		
		System.out.println(winner + "님이 " + record + "의 기록으로 승리하셨습니다.");
		
	}
}
