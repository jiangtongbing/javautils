package basic1;


public class ArrayCode {
	 int a1;float a2;byte a3;long a4;short a5;
	 boolean a6;char a7;double a8; 	   	  
		
     public static void main(String[] args) {
		 //����Array
    	 //��ʼ���ķ�ʽ
    	 int [] arr1=new int [5];
         float [] arr2={0,0};
    	 double arr3 [] =new double [] {0,0};
    	 
    	 //java��8��������ͣ�int,double,float,byte,long,short,boolean,char
    	 //���Ӧ�������ʼ��ʱ��Ĭ��ֵ�ֱ�Ϊ����
    	 ArrayCode a=new ArrayCode();
    	 System.out.println("java��8���������,��Ӧ��Ĭ��ֵ:"+"\n"
    	 +a.a1+","+"int"+"\n"
    	 +a.a2+","+"float"+"\n"
    	 +a.a3+","+"byte"+"\n"
    	 +a.a4+","+"long"+"\n"
    	 +a.a5+","+"short"+"\n"
    	 +a.a6+","+"boolean"+"\n"
    	 +a.a7+","+"char"+"\n"
    	 +a.a8+","+"double"+"\n");
    	 System.out.println("��Ĭ��ֵ��Ϊ�����δ����ֵ��λ�õ�Ĭ��ֵ");
    	 
    	 //��������Խ��ĳ����쳣��IndexOutOfBoundsException
    	 try{
    		 arr1[5]=0; 
    	 }catch(IndexOutOfBoundsException ex ){
    		 System.out.println("�����0��ʼ�������Գ���Ϊ5�����飬��������Ӧ��Ϊ4");
    		 System.out.println("����Խ��");
    	 }
    	 // ������ֻ�ܴ��һ������ ��ƥ������͸��丳ֵ�����޷�ͨ������
    	 //��������  ���Խ�byte ���͵�ֵ���뵽int ���͵����鵱�С�
    	 // arr[1]='ff';
    	 
    	 System.out.println("for ѭ���ĸ�ֵ");
    	 //��������ı���
    	 for (int i = 0; i < arr1.length; i++) {
			 //��arr1 ��for ѭ�����и�ֵ
    		 //���˴��ĸ�ֵ���̡�
    		 arr1[i]=i;  
		 }
    	 System.out.println("while ѭ�������");
    	 //��arr1 ��while ѭ������ֵ�����
    	 int index=0;
    	 while (index<arr1.length){
    		 System.out.println(arr1[index]);
    		 index++;
    	 }
    	 System.out.println("��ǿfor ѭ�������");
    	 //��ǿforѭ���������
    	 for(int tmp:arr1){
    		 System.out.println(tmp);
    	 }
    	 
    	 //��������λ�õ�ֵ�Ľ�������������arr4 0 ��1 ��λ�õ�ֵ�Ľ��� 
    	 int [] arr4={0,1};
    	 for(int t:arr4){
    		  System.out.println("û����֮ǰ:"+t);
    	 }
    	
    	 int tmp=arr4[0];
    	 arr4 [0]=arr4[1];
    	 arr4 [1]=tmp;
    	 for(int t:arr4){
   	 	  System.out.println("����֮��:"+t);
   	     }    	 
    	 
    	 //�˴�ע����⣬����Ҫ����ǡ�
    	 //�������鳣���ļ�����;
    	 //ð�������ѡ������
    	 //ð�����򣬽����ֵ�������ǰ�˻���ĩβ��ֵ��
    	 int arr5 [] ={0,10,2,4,9,8};
    	 
    	 System.out.println("�Ӵ�С������ǰ:");
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
    	 System.out.println("�Ӵ�С�������:");
    	 
    	 for(int t:arr5){
    		 System.out.println(t);
    	 }
    	 
    	 
    	 System.out.println("�Ӵ�С������ǰ:");
         for(int t:arr5){
        	 System.out.println(t);
    	 }
    	 //ѡ�������õ�ǰֵÿ�ζ���������һλ�Ƚϣ�ֱ��������ɡ�
    	 //���ɴӴ�����
    	 for (int i = 0; i < arr5.length-1; i++) {
			for (int j = i; j < arr5.length-1; j++) {
				  if(arr5[j]<arr5[j+1]){
					     int tmp1=arr5[j+1];
				    	 arr5 [j+1]=arr5[j];
				    	 arr5 [j]=tmp1;
				  }
			}
		 }
	     System.out.println("�Ӵ�С�������:");
    	 
    	 for(int t:arr5){
    		 System.out.println(t);
    	 }
    	 
	 } 
}
