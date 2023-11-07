package Prime_Chapter11;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] primeNum =new boolean[101];
		
		for(int i=1; i < primeNum.length;i++) {
			primeNum[i]=true;
		}
		//素数でない
		int divideNum = 2;
		while(divideNum < primeNum.length) {
		for(int i=divideNum+1;i<primeNum.length;i++) {
			if(i % divideNum == 0) {
				primeNum[i] = false;
				continue;
			}
		}
		divideNum++;
		}
		//素数
		for(int i=2;i < primeNum.length;i++) {
			if (primeNum[i]) {
		System.out.println(i);
				
		}
		}
	}

}
