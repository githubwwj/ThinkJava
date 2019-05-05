package test;

public class LinkTest {

	public static void main(String[] args) {

		LinkList<Integer> linkList=new LinkList<Integer>();
		linkList.add(10);
		linkList.add(12);
		linkList.add(14);
		linkList.add(0,30);
		
		linkList.remove();
		linkList.remove(1);
		
		for(int i=0;i<linkList.size();i++) {
			int res=linkList.get(i);
			System.out.printf("%d:%d\t",i,res);
			
		}
	}

}
