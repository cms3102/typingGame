package study.extend;

public enum Items {
	WOOD_SWORD(10, 100),
	SILVER_SWORD(20, 200)
	;
	private final int attack;
	private final int price;
	
	private Items(int attack, int price) {
		this.attack = attack;
		this.price = price;
	}
	
	public int getAttack() {
		return attack;
	}
	public int getPrice() {
		return price;
	}
	
}
