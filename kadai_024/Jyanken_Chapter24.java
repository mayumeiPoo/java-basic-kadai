package kadai_024;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter24 {
	public String getMyChoice () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String input= scanner.next();
		while((!input.equals("r") && !input.equals("s") && !input.equals("p"))) {
			System.out.println(input + "は無効です");
		
		}
		return input;
		}
		
		
	public String getRandom () {
		String [] Hand = new String [] {"r", "s", "p"};
		String Random=Hand[(int) Math.floor(Math.random() * 3)];
		return Random;
	}
	public void playGame() {
		String input = getMyChoice();
		String PC = getRandom();
		HashMap<String,String> hand = new HashMap<String,String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		System.out.println("自分の選んだ手は" + hand.get(input));
		System.out.println("対戦相手が選んだ手は"+ hand.get(PC));
		
		if(input.equals(PC)) {
			System.out.println("あいこです");
	}
		else if(input.equals("r")&&(PC.equals("s"))||
				(input.equals("s")&&(PC.equals("p")))||
				(input.equals("p")&&(PC.equals("g")))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}


	
	

}
}
