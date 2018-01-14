package study.extend;

import java.util.Scanner;

public class App {

	private static Scanner scan = new Scanner(System.in);

	public App() {
		// # 플레이할 방 선택하기
		System.out.println("## 플레이할 게임 방을 선택하세요 ##");
		for (int i = 0; i < RoomType.values().length; i++) {
			RoomType type = RoomType.values()[i];
			System.out.println((i + 1) + ". " + type.getName());
		}
		RoomType gameType = RoomType.getRoomType(inputNo("플레이할 게임은 ?")-1);
		Room room;
		switch (gameType) {
		case TEXT_GAME_ROOM:
			room = new TextGameRoom();
			break;
		default:
			room = new NumberGameRoom();
			break;
		}
		System.out.println(gameType.getName()+" 을 선택하셨습니다!!");
		
		// # 플레이어 수 입력 받기
		int playerCount = inputNo("플레이어의 수를 입력하세요 : ");
		for (int i = 0; i < playerCount; i++) {
			String name = inputText((i + 1) + "번째 플레이어의 이름은 ? ");
			Player player = new Player(name);
			room.enter(player);
		}
		
		room.play();
	}

	public static int inputNo(String printMessage) {
		while (true) {
			try {
				System.out.print(printMessage);
				return scan.nextInt();
			} catch (Exception e) {
			} finally {
				scan.nextLine();
			}
		}
	}

	public static String inputText(String printMessage) {
		System.out.print(printMessage);
		return scan.nextLine();
	}

	public static void main(String[] args) {
		new App();
	}
}
