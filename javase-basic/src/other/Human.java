package basic1.other;

public class Human extends Living{
   
	public  Human (){
		
	}
    public  Human (int life){
		super(life);
	}
	
	public void setLife(int life){
		this.life=life;
	}
	public int  getLife(){
		return this.life;
	}
	
	public Lt sellLt(Lt lt){
	    System.out.println("买了包辣条");	
		return  lt;
	}
}
