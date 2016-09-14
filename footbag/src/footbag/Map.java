package footbag;

public class Map {
	private int width;
	private int height;
	private Dot[][] dots;
	
	public Map ( int width, int height){
		this.width = width;
		this.height = height;
		dots = new Dot[width][height];
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				dots[i][j] = new Dot((byte)0, (float)(Math.random()*0.05+.95));
			}
		}
		
	}
	
	public Dot getDot(int x, int y){
		return dots[x][y];
	}
	
	public Dot putDot(int x, int y, Dot d){
		Dot temp = dots[x][y];
		dots[x][y] = d;
		return temp;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void update(){
		
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				if(dots[i][j].getType()==(byte)0){
					if(i < width-1)
						dots[i][j] = dots[i+1][j];
					else
						dots[i][j] = new Dot((byte)0, (float)(Math.random()*0.05+.95));
				}
			}
			
		}
		
	}
	
	
}
