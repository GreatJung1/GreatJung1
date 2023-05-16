package FarmingGame;
import java.util.Scanner;

public class StartPoint {

    public static void main(String[] args) {

        //필요한 변수 선언
        Scanner scanner = new Scanner(System.in);
        String playerName;
        int choice;
        int turnCount =0;

        // 게임 소개
        System.out.println("농 사 게 임");

        // 게임에 필요한 작물, 농장 클래스 생성
        SeedCrop 오이 = new SeedCrop("오이", 1000, 11000);
        SeedCrop 고추 = new SeedCrop("고추", 50000, 550000);

        Fram fram1 = new Fram();

        // 사용자 입력받고 Player 객체 생성
        System.out.println("게임을 하시려는 당신의 이름은 무엇인가요?");
        playerName = scanner.next();
        Player player = new Player(playerName, SeedCrop.getInstanceCount());

        // Turn Staring-Point
        do {
            // Player 현 상태 보여주기
            System.out.println("\n"+(turnCount+1)+"번째 턴이 시작됩니다!");
            System.out.print("["+playerName+"님의 현상태]" +
                            "\n보유한 돈 \n\t"+player.getMoney()+
                            "\n보유한 씨앗 \n");
            for(int i = 0; i < SeedCrop.getInstanceCount(); i++)
            {
                System.out.println("\t"+SeedCrop.getNameList().get(i) + "의 경우에는 " + player.getSeedInventory(i)+ "개 있습니다");

            }
            System.out.print("보유한 농작물 \n");
            for(int i = 0; i < SeedCrop.getInstanceCount(); i++)
            {
                System.out.println("\t"+SeedCrop.getNameList().get(i) + "의 경우에는 " + player.getCropInventory(i)+ "개 있습니다");

            }
//            System.out.print("밭의 상태 \n");
//            for(int i = 0; i < SeedCrop.getInstanceCount(); i++)
//            {
//                System.out.println("\t"+SeedCrop.getNameList().get(i) + "의 경우에는 " + player.getCropInventory(i)+ "개 있습니다");
//
//            }

            System.out.println("\n이번 턴에는 어떤 행동을 할까요?\n(선택 후에는 취소가 안되니 신중하게 결정하세요!)");
            System.out.print("1.밭에가기\n2.씨앗구매하기\n3.농작물 판매하기\n: ");
            choice = scanner.nextInt();


            // 사용자 1차 선택지 입력값 받기

            // 1차_1번 선택지 : 농장에가기

            // 1차_2번 선택지 : 시장에 가기

            // 1차_3번 선택지 : 상점에 가기

            // Turn Finish-Point


        } while (player.getMoney() > 1000000);

        // 마무리 말

    }
}
