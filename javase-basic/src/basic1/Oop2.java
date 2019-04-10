package basic1;

import basic1.other.A;
import basic1.other.Haidebao;
import basic1.other.Human;
import basic1.other.Jiangren;
import basic1.other.Lt;
import basic1.other.Nbj;
import basic1.other.Wllt;

public class Oop2 {
     //继续对象部分吧，之前说基础部分的时候，说道了数组，我们知道数组中的所有成员都是一个类型。
	//而当时在说的时候呢，只有基本类型，但是通过上一期，知道了引用类型（对象），那肯定会有引用类型数组
	//其实引用类型就是对象，别纠结这个，但是我喜欢说引用类型。
	//那么 引用类型数组里存放的成员是什么呢？

	public static void main(String[] args) {
		A [] arr=new A [2];
		//此时还未对其进行任何赋值，那么数组内成员的默认值 是什么呢？答案是null
		System.out.println(arr[0]);
		// 现在对其第一个位置赋值
		A a=new A("tom",10);
		arr[0]=a;
		A a2=new A("jerry",20);
		arr[1]=a2;
		//此时arr数组 也就是A的引用类型数组 内有两个成员是 a和a2 
		// 那么现在将数组内的成员赋值给其他A的对象，并改变那个对象的成员变量name之后，原先在
		// 数组内的成员的成员变量name 是否会跟着发生变化呢？
		// 好了此时将 arr的第一个成员赋值给了 a3.
		A a3=arr[0];
		//对a3的name 成员进行改变
		a3.name="cat";
		//猜测arr[0].name的值。结果是cat
		System.out.println("arr[0].name="+arr[0].name);
		//这个也就说明了，引用类型数组内保存的成员依旧是内存中对象的地址。并没有产生新的对象。
		
		//好了这是最后对数组的补充，这一点在java里非常重要，一定要明白引用类型变量的值的含义是对象的地址。
		
		//类的继承，单个定义一个类，有时候会显得十分重复啰嗦，比如，有生物这么个类，人类也是生物。
		//他们都有共通的地方就是 生命值，如果定义了生物类里面添加个生命值变量为life，然后人类里面
		//也定义个生命值变量为life,这里便产生了重复问题，虽然现在看着好像没什么，但是一旦工程大了起来，
		//有成百上千的类都是来自于生物类，他们都有life，现在我想改个名字了不叫life了， 光是修改都要使你感到绝望。
		//于是便有了继承。继承的实质就是将共有的部分提炼出来作为一个父类用于被子类继承。
		//好的，那就定义这么个生物类吧，叫做Living，他有成员变量life，用于表示生命值。
		//和人这么个类（听的真怪）Human，此时让他继承于Living的话，它变会直接能够拥有life这个成员变量。
		//类的继承用extends这个关键字。  public class Human extends Living 就这么个结构，
		//除了成员变量能被继承以外，方法也能被继承，我他妈又想用吃饭这个方法，不过确实好用。。生物都会吃饭的 emm。。
		//那么也就没有必要将吃饭这个方法，放在子类Human中了，而是放在父类Living中。
		//记得上一期说道一个关键字this，这是对当前对象的引用，而现在要说个super 关键字，
		//super 是只会出现在子类方法中的关键字，所有类其实都有Object类作为父类。
		//super 是子类对自己的直接父类的引用，为什么要说直接父类呢，因为父类也会有父类。 也就是爷爷。。。emm。。
		//所以，子类是无法通过super 访问 父类的父类的。
		//现在生成一个Human对象，将父类Living的成员和方法用protected修饰后呢，就只能在子类内部访问哦，
		//无法被具体生成的子类对象所直接访问，所以要想访问life的话，最好定义被public修饰的方法 public int  getLife()
		//这一点其实很操蛋，如果你认为子类在父类中的共有成员变量和方法应该被子类对象直接访问到的话，你就用public去修饰吧。
	    
		Human human=new Human(10000);
	    System.out.println("human.life="+human.getLife());
	    //类只能单一继承，这个很好理解吧，23333，而一个类却能被多个类所继承，
	    //这就和一个孩子只会来自一个爸，而一个爸会生出多个儿子。。。。哈哈哈哈
	    
	    //向上造型是继承的一个特点， 这个概念呢，其实我们把之前老子和儿子的观念先拿掉，
	    //现在是就拿辣条和卫龙辣条来说吧，emmm，卫龙辣条也是辣条是吧？
	    //现在我去商店买辣条了，老板来一包辣条，老板甩给你一包卫龙，小伙子这是新款，知道19.9，好吃的很，
	    //你心想哟呵，还不错 ，买了买了。
	    //但是你如果这么说，老板来一包辣条，他甩给了你一包闲趣，你可能就会认为这老板耳朵是不是有问题。
	    //你就不答应了，换做程序也是一样，程序在此处就会出现异常。
	    //这一点非常重要，此时在人类中 弄一个方法就是卖辣条sellLt，
	    Wllt wllt=new Wllt("卫龙辣条");
	     //注意此处的sellLt方法放入的是Wllt,然后  而返回的Wllt 向上造型成了Lt， 此处是客户所能接受的。。
	    //因为客户本来就是想要辣条，管他是卫龙还是牛板筋。 
	    Lt lt=human.sellLt(wllt);
	    System.out.println("lt.name="+lt.name);
	    Nbj nbj=new Nbj("牛板筋");
	    lt=human.sellLt(nbj);
	    System.out.println("lt.name="+lt.name);
	    //但如果你想把闲趣塞进去当做辣条卖，此处人家客户就不答应了。
	    //Xq xq=new Xq();
	    //此处将注释拿掉的话，程序会报错。
	    //human.sellLt(xq);	    
	    //重写(override) 重写是发生在子类内部的一种现象，是对父类方法的重新定义。
	    //特点：与父类中的方法名。参数列表， 必须相同，方法体自定义。
	    //关于这个重写呢，你可以设想，人类的整个进化史，人类进化的过程中呢，其脑结构发生过很大的变化
	    //就拿 匠人来说，那是处在石器时代的时候，他们当时知道了石头碎了之后能够割破皮肤，以方便吃到内部的鲜肉。
	    //于是石头做成各种工具，然后随着进化，海德堡人某一天碰到了火，他们虽然一开始很怕，但是他们觉得火靠近时很温暖，
	    //离得太近呢，又会把自己的皮肤烧伤，但是烧伤的部分皮肤闻起来很香，于是他们想着火能不能帮助他们
	    //烧烤肉呢，果不出其然，被火烧烤的肉容易咀嚼和下咽，于是人类从此用上了火这个工具。
	    //说完后 如果 海德堡人 继承于 匠人的话，用火这个方法，确实比用石器先进的多，但是这两个方法都是用来
	    //帮助人类进食的。
	    
	    Jiangren j=new Jiangren(100);
	    Haidebao h=new Haidebao(100);
	    //注意看这里的输出。
	    j.useUtil();
	    h.useUtil();
	}
}
