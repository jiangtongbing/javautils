package basic1.other;

//类
public class A {
	
	public A(){
		
	}
	//构造方法的重载。
	public A(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	static{
		System.out.println("类被加载了");
	}
	
    //成员变量
	public String name;
    
	//隐私的成员变量
	private int age;
    //方法
    public  void setAge(int age){
    	this.age=age;
    }
    
    //静态 成员变量
    public static int count=10;
    
    //方法的重载
    public  void setAttr(String name,int age){
    	 this.name=name;
    	 this.age=age;
    }
    public void setAttr(int age,String name){
    	 this.name=name;
    	 this.age=age;
    }
}
