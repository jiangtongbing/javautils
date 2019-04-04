package basic1;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExpand {
	//数组拓展。
	
    public static void main(String[] args) {
		//数组从原则上是不能增加长度。
    	//但是可以通过一些方法进行扩容，这也是List底层的实现方式
    	//初始化一个5长度的数组。
    	String [] arr=new String [5];
    	//对数组进行初始化。
    	initArray(arr);
    	//对数组进行输出。
    	System.out.println("此时arr数组长度:"+arr.length);
    	consoleArray(arr);   	
    	//对数组进行扩容1个长度。
    	arr = Arrays.copyOf(arr,arr.length+1); 
    	System.out.println("\n扩容后arr数组长度:"+arr.length);
    	consoleArray(arr);
    	
    	//借此原理我们则可以动态的改变数组的长度，
    	//不过其实原数组对象本身已经改变。在扩容的时候产生了新的数组对象。
    	//然后将原数组的原本的值赋于新数组，新数组多余的格子则以其中容纳的类型的默认值进行填充。
    	  	
    	//最后还剩一个二维，三维数组的概念。这个做个了解就行了。
    	//其实java不存在这个概念，这个概念是底层C++所携带的概念。
    	//java作为c++的动态链接库，其实已经进化了。
        //java中因为对象概念，实际到的二维数组，不过是一维数组的数组而已。
    	//比如 arr[][]  这是一个类似于二维数组的结构，
    	//但是在java中，它则可以看成是  arr[] 这个数组对象 的数组、
    	//三维数组则以此类推，其实在照这样看下去就没有意义了。因为太大了.太复杂了。
    	//也很蠢。没有人会去用这个结构。
    	
    	//数组最基本完了后呢，我要再说一个想法
    	//就是最基本的东西，肯定有其他人比你先学，先理解了。也去用了，
    	//他们在用的时候就会留下一些工具。。对于类来说就是工具类。它里面封装了很多
    	//简化操作数组的方法。比如我下面封装的两个用于操作数组的方法。
    	//所以既然讲到数组，必然会有一些操作数组的工具类，它叫Arrays。
    	//以后学到基础概念，都是这么个思路。
    	
    	//1.Arrays.copyOf 扩容，上面已经说过了。其本质是拷贝。
    	//2.Arrays.fill 填充数组。
    	String  [] arr2=new String [4];
    	//将arr2数组用一去填充。
    	Arrays.fill(arr2,"一");  
    	System.out.print("\narr2的值:");
    	System.out.println(Arrays.toString(arr2));   	
    	//3.Arrays.sort 排序
    	//排序呢要理解两个概念。一个自然排序，一个自定义排序。
    	//自然排序是从小到大进行排序，

    	//直接调用Arrays.sort则是进行了自然排序。
        int [] arr3={1,10,4,5,6};  //排序后结果应该为[1,4,5,6,10]
        Arrays.sort(arr3);
    	System.out.println(Arrays.toString(arr3));
    	//看到效果之后，你或许就会问，那么从大到小怎么搞？下面就要用到自定义排序。
    	//自定义排序则是对Array.sort的拓展。按照自己制定的规则去排序。
    	//这个拓展方法仅对对象数组有效，基本类型的数组是无法使用的。
    	//Integer做为int的包装类，这个在后面会讲到。
    	Integer [] arr4={1,10,4,5,6};  	
    	Arrays.sort(arr4,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
			    //很多对象实现一个叫compareTo的方法，用于比较该对象的大小。
			    //根据返回值来判断，大于0则大，小于0则小，等于0则相等。
			    //那么根据这个原理。我们来实现对arr4的数组的排序。
				//这个compare方法呢，会对arr4这个数组进行循环遍历。从0这个索引开始
				//每次返回遍历的紧挨着的两个成员，比如第一次呢会返回0和1这个索引下的成员，
				//第二次则是1和2.以此类推。到遇到最后一个成员为止。
				//每次返回的两个成员最为compare方法的o1和o2形参传入。
				//此时我们对这两个成员进行比较。
				//如果o1比o2大
				if(o1.compareTo(o2)>0){
					//我们就返回一个比0小的数，比如-1
					return -1;
				}else{
					//否则就返回一个比0大的数，比如1，其实不管返回1，还是2，结果是一样。
					//系统只判断这个值比0大还是比0小。
					return 1;
				}
				//总结，这个方法的返回值。会决定每次遍历传入的两个成员的位置。
				//从左至右，返回大于0的数，则会将大的摆在左边，反之则放在右边。
				
				//直接这样返回也能实现从大到小，请自己思考为什么.
				//return o2-o1;
			}
		});
    	//到此从大到小就排序完毕了。
    	System.out.println(Arrays.toString(arr4));
    	
    	//4.Arrays.copyOfRange,指定数组的起始和终止位置进行拷贝。 	
    	//5.Arrays.equals 对数组进行比较。
    	 
    	//说到比较，这里说到一个概念，就是Ascall码表。1和2的ascall码值就是49和50.
    	//其实计算并不知道  1比2 小，它其实不知道任何图形文字，那这么做出比较呢。它虽然不知道1比2，但是它知道49的二进制码比50小。
    	//1的ascall码值49 的二进制码为0011 0001，2的ascall码值50的二进制码 为 0011 0010
    	//说到这里，你可能又会问了，妈的，你这不是还没解释清楚，这两个东西这么比大小呢。
    	//其实到这里计算机就能明白了，它会从左至右依次比较，1表示的是高电流，0表示的低电流，
    	//虽说计算机不认识1和0，但是计算机知道哪里的电流高峰了，哪里的电流低谷了。
    	//按照这样，如果遇到相等则找下一个。 
    	//直到比较出来大小为止，就会停止比较，1和2的ascall码值的二进制码则在比较到倒数第二位的时候分出了大小。
    	//49的二进制码倒数第二位为0，50的二进制码倒数第二位为1，所以2大于1.程序在此处停止比较。
    	//这就是所有程序比较大小的原理。不仅仅是java，其他都一样。   
    	//但是人理解的时候，你只要按照人的思维去理解就行了。1就是比2小。
 	
    	//说完这个，除了数字能够比较大小以外，其实字母，汉字都可以比较大小，他们的原理和上面一样。
    	//abcd 他们都有各自的ascall码值。从大到小依次为 97，98，99，100
    	//所以a<b<c<d  
    	//依次类推，字符串的比较， 比如 abc和adc 结果是 adc 大于 abc 
    	//因为程序在判断字符串的时候呢，也是从左至右判断，第一位都相等，那就第二位，
    	//第二位因为d>b 则程序在此处停止了比较，认为adc 字符串大于 abc 字符串。
    	//第二位以后的所有字符都不再进行比较。
    	
    	//6.Arrays.toString 将数组转为字符串。和下面我封装的那个consoleArray方法原理相同。
 	
    	//等对象学完，会再次基础上，从零实现一个list列表对象，一个可以动态改变长度的数组对象。
	} 
    
    /**
     * 公共方法。  
     * @param arr
     */
    public static void  initArray(String [] arr ){
    	  for(int i=0;i<arr.length;i++){
    		   arr[i]=i+"";  
    	  }
    }
    public static void consoleArray(String [] arr){
    	System.out.print("数组的值：");
    	System.out.print("[");
    	 for(String a:arr){
    		 System.out.print(a+",");
    	 }
    	System.out.print("]");
    }
    
}
