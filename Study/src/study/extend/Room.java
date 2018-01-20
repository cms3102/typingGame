package study.extend;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


// 기본 방
public abstract class Room {
	
	private Logger logger = LoggerFactory.getLogger(Room.class);
	
	String name;
	int position;
	
	List<Player> playerList = new ArrayList<>();
	
	public void enter(Player player){
		playerList.add(player);
		logger.info(player.name + "님이 입장하셨습니다.");
	}
	
	public void exit(Player player){
		playerList.remove(player);
	}
	
	public abstract void play();
	
}
