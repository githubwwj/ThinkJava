package com.wwj.first;

class DataType 
{
	public static void main(String[] args) 
	{
		int byteSize=Byte.SIZE; //获取字节位数
		int byteMinValue=Byte.MIN_VALUE;
		int byteMaxValue=Byte.MAX_VALUE;
		int byteCount=Byte.BYTES;
		System.out.println("一个字节几="+byteSize+"位-----byteMinValue="+byteMinValue+"-----byteMaxValue="+
			byteMaxValue+"byteCount="+byteCount);
		//2^8 = 2 * 2 * 2 * 2 = 16   16 * 16=256  有符号的byte的字节类型 -2^7=-128  2^7-1=127
		//2^5 = 32  2^6=64  2^7=128  2 * 2 * 2 * 2 * 2 * 2 * 2=128
		//byteSize=8-----byteMinValue=-128-----byteMaxValue=127
		//1 JAVA 有符号的数据类型, 256/2=128  -128  -1  0  1 127   

		int shortSize=Short.SIZE;
		int shortMinValue=Short.MIN_VALUE;
		int shortMaxValue=Short.MAX_VALUE;
		int shortCount=Short.BYTES;

		System.out.println("--短整型几"+shortSize+"位---shortMinValue="+shortMinValue+"----shortMaxValue="+shortMaxValue
			+"----短整型几个字节="+shortCount);
		// --短整型几16位---shortMinValue=-32768----shortMaxValue=32767----短整型几个字节=2
		//代表注释，不会参与编译
		// 256 * 256  = 2^8 * 2^8 = 2^16= 65536
		//短整型最小值 2^15= 32768    短整型最大值 2^15-1=32768-1=32767
		// 有符号代表有正负，无符号代表整数   

		//Char  Int  Long   Float  Double  
		//我们留一个作业，自己实现  Char  Integer  Long   Float  Double Boolean 求出它们占几个字节，最小值，最大值，几位
		
		int charSize=Character.SIZE;
		int charMinValue=Character.MIN_VALUE;
		int charMaxValue=Character.MAX_VALUE;
		int charCount=Character.BYTES;
		// Character char 包装器类   Short  short
		System.out.println("char 位"+charSize+"--char 最小值="+charMinValue+"---char 最大值="+charMaxValue+"---char 字节="+charCount);

		int intSize=Integer.SIZE;
		int intMinValue=Integer.MIN_VALUE;
		int intMaxValue=Integer.MAX_VALUE;
		int intCount=Integer.BYTES;
		// Character char 包装器类   Short  short
		System.out.println("int 位"+intSize+"--int 最小值="+intMinValue+"---int 最大值="+intMaxValue+"---int 字节="+intCount);

		//int 位32--int 最小值=-2147483648---int 最大值=2147483647---int 字节=4
		//21亿4千7百4十8万3千6百4十8
		// 256 * 256  = 2^8 * 2^8 = 2^16= 65536
		// 2^32 = 2^16 * 2^16 = 4294967296

		int longSize=Long.SIZE;
		long longMinValue=Long.MIN_VALUE;
		long longMaxValue=Long.MAX_VALUE;
		int longCount=Long.BYTES;
		// Character char 包装器类   Short  short
		System.out.println("long 位"+longSize+"--long 最小值="+longMinValue+"---long 最大值="+longMaxValue+"---long 字节="+longCount);
		//long 位64--long 最小值=-9223372036854775808---long 最大值=9223372036854775807---long字节=8
		//JAVA语言跨平台一个很重要的一点，数据类型的大小不依赖于具体的机器硬件，基本数据类型再通的硬件平台上都是一样的

		int floatSize=Float.SIZE;
		float floatMinValue=Float.MIN_VALUE;
		float floatMaxValue=Float.MAX_VALUE;
		int floatCount=Float.BYTES;
		// Character char 包装器类   Short  short
		System.out.println("float 位"+floatSize+"--float 最小值="+floatMinValue+"---float 最大值="+
			floatMaxValue+"---float 字节="+floatCount);
		// float 位32--float 最小值=1.4E-45---float 最大值=3.4028235E38---float 字节=4
		// 1.4E-45 = 1.4* 10 -45
		// 3.4028 * 10^38

		int doubleSize=Double.SIZE;
		double doubleMinValue=Double.MIN_VALUE;
		double doubleMaxValue=Double.MAX_VALUE;
		int doubleCount=Double.BYTES;
		// Character char 包装器类   Short  short
		System.out.println("double 位"+doubleSize+"--double 最小值="+doubleMinValue
			+"---double 最大值="+floatMaxValue+"---double 字节="+doubleCount);
		//double 位64--double 最小值=4.9E-324---double 最大值=3.4028235E38---double 字节=8
	}
}
