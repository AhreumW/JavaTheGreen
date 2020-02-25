
public class ShoppingMallSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오

		String[] nameArr = { "sangah", "hong", "jaegun", "woojin", "hyeonseok", "hwansang", "jiwon", "jaemin",
				"yonghun", "jihun" };

//		이렇게도 분리 가능
//		String[] comBuyNameArr = {"sangah","hong","jaegun","woojin","hyeonseok"};
//		String[] anyBuyNameArr = {"hwansang","jiwon","jaemin","yonghun","jihun"};

		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(nameArr[i] + " : " + "컴퓨터 구입");
			cnt++;
		}

		System.out.println("컴퓨터 가게에서 " + cnt + "개의 컴퓨터를 팔았습니다. ");

		System.out.println(nameArr[5] + " : " + "꽃 구입");
		System.out.println(nameArr[6] + " : " + "핸드폰 구입");
		System.out.println(nameArr[7] + " : " + "노트 구입");
		System.out.println(nameArr[8] + " : " + "커피 구입");
		System.out.println(nameArr[9] + " : " + "옷 구입");

		System.out.println("꽃 가게에서 1개의 꽃을 팔았습니다. ");
		System.out.println("핸드폰 가게에서 1개의 핸드폰을 팔았습니다. ");
		System.out.println("문방구에서 1개의 노트를 팔았습니다. ");
		System.out.println("카페에서 1개의 커피를 팔았습니다. ");
		System.out.println("옷 가게에서 1개의 옷을 팔았습니다. ");

	}

}
