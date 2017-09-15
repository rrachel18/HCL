
public class Singleton {

	public static void main(String[] args) {
		
	}
}


class SingleInstance{
	//Eager instantiation
	private final static SingleInstance instance = new SingleInstance();
	
	private SingleInstance(){
		
	}
	
	public static SingleInstance getInstance(){
		return instance;
	}
}