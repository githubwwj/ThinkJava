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
		//我们留一个作业，自己实现  Char  Int  Long   Float  Double  求出它们占几个字节，最小值，最大值，几位

	}
}
