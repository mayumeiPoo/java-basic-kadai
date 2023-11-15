package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void main(String[] fruit) {
	HashMap <String,String> fruitMap = new HashMap<String,String>();
	fruitMap.put("apple","りんご");
	fruitMap.put("peach","桃");
	fruitMap.put("banana","バナナ");
	fruitMap.put("lemon","レモン");
	fruitMap.put("pear","梨");
	fruitMap.put("kiwi","キウィ");
	fruitMap.put("strawberry","いちご");
	fruitMap.put("grape","ぶどう");
	fruitMap.put("muscat","マスカット");
	fruitMap.put("cherry","さくらんぼ");
	

	for(int i = 0; i < fruit.length; i++) {
		if(fruitMap.get(fruit[i])==null){
			System.out.println(fruit[i] + "は存在しません");
		}
		else {
			System.out.println(fruit[i] + "の意味は" + fruitMap.get(fruit[i]));
		}
	}
	
		
	}
}
