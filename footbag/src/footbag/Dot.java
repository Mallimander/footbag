package footbag;

public class Dot {
	private byte type;
	private float health;
	
	public Dot (byte type, float health){
		this.type = type;
		this.health = health;
	}
	
	public byte getType(){
		return type;
	}
	
	public float getHealth(){
		return health;
	}
	
	public void setHealth(float health){
		this.health = health;
	}
	
	public String toString(){
		return "Type: " + Byte.toString(type) + " Health: " + Float.toString(health);
	}
}
