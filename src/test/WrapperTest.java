package test;

import java.util.Calendar;

public class WrapperTest {

	public static void main(String[] args) {
		
		Byte b=10;
		
		System.out.println("Byte="+ByteCache.cache[b+128]);
		
		Calendar.getInstance();
		

	}
	
	private static class ByteCache {
        private ByteCache(){
        	System.out.println("ByteCache()");
        }

        static final Byte cache[] = new Byte[-(-128) + 127 + 1];

        static {
        	System.out.println("ByteCache static()");
            for(int i = 0; i < cache.length; i++)
                cache[i] = new Byte((byte)(i - 128));
        }
    }

}
