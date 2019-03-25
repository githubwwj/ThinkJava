package innerclass.parcel;
import static com.wwj.util.Print.*;

public class Parcel3 {
	
	public void add() {
		class A {
			
		}
	}

	public static void main(String[] args) {

		Parcel3 parcel3=new Parcel3();
		print(parcel3.content().getContent());
		
		print(parcel3.content2().getContent());
		
		print(parcel3.content3("5").getContent());
		
	}
	
	public Content content() {
		return new Content() {
			
			private String name ="Ò»´ü¹şÃÜ¹Ï";
			
			@Override
			public String getContent() {
				return name;
			}
		};
	}
	
	public Content content3(final String weight) {
		return new Content() {
			
			private String name ="Ò»´ü¹şÃÜ¹Ï";
			
			@Override
			public String getContent() {
				return name+weight+"kg";
			}
		};
	}
	
	public Content content2() {
		return new MyContent();
	}
	
	class MyContent implements Content{
		private String name ="Ò»´üéÙ×Ó";
		@Override
		public String getContent() {
			return name;
		}
	}

}
