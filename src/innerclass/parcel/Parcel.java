package innerclass.parcel;

import static com.wwj.util.Print.*;

/**
 * 快递
 */
public class Parcel {
	
	private String name;

	// 礼物 <==> 内容
	class Content {
		String content;

		public Content(String gift) {
			this.content = gift;
		}
	}

	// 目的地
	class Destination {
		String label;

		Destination(String whereTo) {
			label = whereTo;
//			ship("甜点","广州");
//			name = "天猫快递";
		}
		
	}

	public Content content(String gift) {
		return new Content(gift);
	}

	Destination to(String whereTo) {
		return new Destination(whereTo);
	}

	private void ship(String gift, String whereTo) {
		Content content = content(gift);
		Destination destination = to(whereTo);
		print(content.content);
		print(destination.label);
	}

	public static void main(String[] args) {
		Parcel parcel = new Parcel();
		parcel.ship("四驱车", "杭州西湖区");
		
//		Destination destination=new Destination("");

	}

}
