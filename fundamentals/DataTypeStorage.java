package fundamentals;

public class DataTypeStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a';
		System.out.println(ch+3);//'a' has ASCII value 97
		int i='a'+3;
		System.out.println(i);//alternate method
		int j=ch;//implicit typecasting 
		ch=(char)j;//typecasting or explicit converson of int into char data type to storea larger value to small data type but it has data loss
		ch=(char)(ch+1);
		System.out.println(ch);
		int l;
		short s= 15;
		l=s;//allowed to store smaller type to larger one
		s=(short)l;//have to convert explicitly to store larger type(4 bytes) to smaller one(2 bytes)
		float f=(float)1.7;
		float min1=Float.MIN_VALUE;
		float max1=Float.MAX_VALUE;
//		int min=Integer.MIN_VALUE;
//		int max=Integer.MAX_VALUE;
//		System.out.println(min+" "+max);
//		System.out.println('a'+1);
		System.out.println(min1+"\n "+max1);

	}

}
