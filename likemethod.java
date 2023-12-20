package ifelse;

public class likemethod {
	void m1 (int i) {
		do {
			if(i%5 ==0) {
				System.out.println(i);
			}
			i++;
		}while(i<=100);
	}
	public static void main(String[] args) {
		likemethod l = new likemethod();
		l.m1(1);}
	

}
