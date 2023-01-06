package question1;

class comparison{
	int a,b,c;
	
	String compare() {
		if (a > b && a > c){
				System.out.println(a +" is the greatest");
			}
		else if (b > a && b > c){
			System.out.println(b +" is the greatest");
		}
		else if (c > a && c > b){
			System.out.println(c +" is the greatest");
		}
		return "this";
	}
}