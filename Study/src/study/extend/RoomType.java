package study.extend;

public enum RoomType {
	TEXT_GAME_ROOM(0,"텍스트 게임 방"),
	NUMBER_GAME_ROOM(1, "숫자 게임 방"),
	;
	private final int roomType;
	private final String name;
	
	private RoomType(int roomType, String name) {
		this.roomType = roomType;
		this.name = name;
	}
	
	public int getRoomType() {
		return roomType;
	}
	public String getName() {
		return name;
	}
	public static RoomType getRoomType(int type){
		switch (type) {
		case 0: return TEXT_GAME_ROOM;
		default: return NUMBER_GAME_ROOM;
		}
	}
	
}
