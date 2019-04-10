package basic1.other;

public class Haidebao extends Jiangren{

	  public Haidebao(){
		  
	  }
      public Haidebao(int life){
		 super(life); 
	  }
      //对父类Jiangren的方法useUtil 进行了重写。
	  public void useUtil(){
           System.out.println("使用火");		  
	  }
	
}
