package footbag;

public class DotUtil {

	public DotUtil(){
		
	}
	
	public byte toByte(String str) {
		byte temp = (byte)0;
		switch(str){
		
		case "air": temp = (byte)0;
		break;
		
		case "sand": temp = (byte)1;
		break;
		
		}
		
		return temp;
	}
	
	public String bToString(byte b){
		String temp = "NULL";
		switch(b){
		
		case 0: temp = "air";
		break;
		
		case 1: temp = "sand";
		break;
		
		}
		
		return temp;
	}
	
	public float[] getColor(Dot d){
		float [] temp = {0f, 0f, 0f};
		switch(d.getType()){
		
		case 0: temp[0] = 0.85f*d.getHealth(); temp[1] = 0.9f*d.getHealth(); temp[2] = 1.0f*d.getHealth();
		break;
		
		case 1: temp[0] = 0.6f*d.getHealth(); temp[1] = 0.6f*d.getHealth(); temp[2] = 0.1f*d.getHealth();
		break;
		
		}
		return temp;
	}
	
}
