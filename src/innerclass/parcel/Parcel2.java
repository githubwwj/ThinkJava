package innerclass.parcel;

public class Parcel2 {

	private class PContent implements Content {

		private String content;

		PContent(String content) {
			this.content = content;
		}

		@Override
		public String getContent() {
			return content;
		}

	}

	private class PDestination implements Destination {

		private String label;

		public PDestination(String label) {
			this.label = label;
		}

		@Override
		public String readLable() {
			return label;
		}
	}

	public Content setContent(String gift) {
		return new PContent(gift);
	}

	public Destination destination(String whereTo) {
		return new PDestination(whereTo);
	}

	public void ship(String whereTo, String gift) {
		Content content = setContent(gift);
		Destination destination = destination(whereTo);
		System.out.println(content.getContent() + "送到" + destination.readLable());
	}

	public static void main(String[] args) {

		Parcel2 parcel2=new Parcel2();
		parcel2.ship("深圳市铁仔山公园","一盒枸杞");
	}	

}
