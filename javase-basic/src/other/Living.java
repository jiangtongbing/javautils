package basic1.other;

public class Living {
	public Living(){
		
	}
	
	public Living(int life){
		this.life=life;
	}
   //成员变量
	protected int life;
	
	//方法
	protected void haveFood(){
		System.out.println("吃饭了");
	}
}
