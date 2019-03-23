package basic1;


public class ArrayCode {
	 int a1;float a2;byte a3;long a4;short a5;
	 boolean a6;char a7;double a8; 	   	  
		
     public static void main(String[] args) {
		 //数组Array
    	 //初始化的方式
    	 int [] arr1=new int [5];
         float [] arr2={0,0};
    	 double arr3 [] =new double [] {0,0};
    	 
    	 //java的8大基本类型，int,double,float,byte,long,short,boolean,char
    	 //其对应在数组初始化时，默认值分别为如下
    	 ArrayCode a=new ArrayCode();
    	 System.out.println("java的8大基本类型,对应的默认值:"+"\n"
    	 +a.a1+","+"int"+"\n"
    	 +a.a2+","+"float"+"\n"
    	 +a.a3+","+"byte"+"\n"
    	 +a.a4+","+"long"+"\n"
    	 +a.a5+","+"short"+"\n"
    	 +a.a6+","+"boolean"+"\n"
    	 +a.a7+","+"char"+"\n"
    	 +a.a8+","+"double"+"\n");
    	 System.out.println("其默认值则为数组的未被赋值的位置的默认值");
    	 
    	 //关于数组越界的常见异常，IndexOutOfBoundsException
    	 try{
    		 arr1[5]=0; 
    	 }catch(IndexOutOfBoundsException ex ){
    		 System.out.println("数组从0开始数起，所以长度为5的数组，最后的索引应该为4");
    		 System.out.println("数组越界");
    	 }
    	 // 数组中只能存放一种类型 不匹配的类型给其赋值，将无法通过编译
    	 //比如以下  尝试将byte 类型的值放入到int 类型的数组当中。
    	 // arr[1]='ff';
    	 
    	 System.out.println("for 循环的赋值");
    	 //关于数组的遍历
    	 for (int i = 0; i < arr1.length; i++) {
			 //对arr1 用for 循环进行赋值
    		 //理解此处的赋值过程。
    		 arr1[i]=i;  
		 }
    	 System.out.println("while 循环的输出");
    	 //对arr1 用while 循环进行值的输出
    	 int index=0;
    	 while (index<arr1.length){
    		 System.out.println(arr1[index]);
    		 index++;
    	 }
    	 System.out.println("加强for 循环的输出");
    	 //加强for循环输出数组
    	 for(int tmp:arr1){
    		 System.out.println(tmp);
    	 }
    	 
    	 //数组两个位置的值的交换。比如下面arr4 0 和1 的位置的值的交换 
    	 int [] arr4={0,1};
    	 for(int t:arr4){
    		  System.out.println("没交换之前:"+t);
    	 }
    	
    	 int tmp=arr4[0];
    	 arr4 [0]=arr4[1];
    	 arr4 [1]=tmp;
    	 for(int t:arr4){
   	 	  System.out.println("交换之后:"+t);
   	     }    	 
    	 
    	 //此处注重理解，并不要求熟记。
    	 //关于数组常见的几个用途
    	 //冒泡排序和选择排序
    	 //冒泡排序，将最大值往数组的前端或者末尾赋值。
    	 int arr5 [] ={0,10,2,4,9,8};
    	 
    	 System.out.println("从大到小排序完前:");
         for(int t:arr5){
        	 System.out.println(t);
    	 }
    	 
    	 for (int i = 0; i < arr5.length; i++) {
			 for (int j = i+1; j < arr5.length; j++) {
				if(arr5[i]<arr5[j]){
					 int tmp1=arr5[i];
			    	 arr5 [i]=arr5[j];
			    	 arr5 [j]=tmp1;
				}		
			}
		 }
    	 System.out.println("从大到小排序完后:");
    	 
    	 for(int t:arr5){
    		 System.out.println(t);
    	 }
    	 
    	 
    	 System.out.println("从大到小排序完前:");
         for(int t:arr5){
        	 System.out.println(t);
    	 }
    	 //选择排序。让当前值每次都和它的下一位比较，直到排序完成。
    	 //依旧从大到排序。
    	 for (int i = 0; i < arr5.length-1; i++) {
			for (int j = i; j < arr5.length-1; j++) {
				  if(arr5[j]<arr5[j+1]){
					     int tmp1=arr5[j+1];
				    	 arr5 [j+1]=arr5[j];
				    	 arr5 [j]=tmp1;
				  }
			}
		 }
	     System.out.println("从大到小排序完后:");
    	 
    	 for(int t:arr5){
    		 System.out.println(t);
    	 }
    	 
	 } 
}
