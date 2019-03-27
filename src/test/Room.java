package test;

public class Room {

	public static  String tag="101";
	
	private static class Table {
		String name = "Ì´Ä¾×À×Ó";
		public String getName() {
			return name;
		}
	}

	protected static class Bed {
		static int length = 220;

		static int getLength() {
			return length;
		}

		static class Mattress {
			static int length = 210;

			 int getLength() {
				return length;
			}
		}
	}

	public static Table getTable() {
		return new Table();
	}

	public static Bed getBed() {
		return new Bed();
	}

	public static void main(String[] args) {
		int length=Bed.getLength();
		System.out.println(length);
		Room.Bed.Mattress mattress=new Room.Bed.Mattress();
		System.out.println(mattress.getLength());
		
		
		
		
	}
	

}
