package Bagg2;

class GG {
	public void aaa() {
	System.out.println("GG");
}
}
class JJ extends GG{
	public void aaa() {
		
		System.out.println("JJ");
	}
}
public class Exam_08 {

	public static void main(String[] args) {
  //JJ jp = new JJ();
     GG gp = new JJ();
     // jp.aaa();
     gp.aaa();
	}

}
