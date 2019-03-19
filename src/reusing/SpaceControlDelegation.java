package reusing;

public class SpaceControlDelegation {

	//太空船控制器对象
	SpaceControls spaceControls = new SpaceControls();

	// 向前
	public void foward() {
		spaceControls.foward();
	}

	public void back() {
		spaceControls.back();
	}

	public void left() {
		spaceControls.left();
	}

	public void right() {
		spaceControls.right();
	}

	public static void main(String[] args) {
		SpaceControlDelegation spaceControlDelegation=
				new SpaceControlDelegation();
		spaceControlDelegation.left();
		spaceControlDelegation.foward();
	}

}
