package test;

public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			  int value() {
				return super.value() * 47;
			}
		};
//		return new Wrapping(x);
	}
	class Wrapping{
		private int i;
		public Wrapping(int x) {
			i= x;
		}
		 int value() {
			return i;
		}
	}
	
	
	public static void main(String[] args) {
		Parcel8 parcel8=new Parcel8();
		Wrapping wrapping=parcel8.wrapping(10);
		System.out.println(wrapping.value());
	}

}
