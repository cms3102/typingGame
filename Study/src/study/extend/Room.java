package study.extend;

import java.util.ArrayList;
import java.util.List;

// # 일반적인 방
public abstract class Room {
	String name;
	int position;
	
	List<Player> playerList = new ArrayList<>();
	
	public void enter(Player player){
		playerList.add(player);
		System.out.println(player.name + "님이 입장하셨습니다.");
	}
	
	public void exit(Player player){
		playerList.remove(player);
	}
	
	public abstract void play();
	
}
