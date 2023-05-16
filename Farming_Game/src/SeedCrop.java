package FarmingGame;
import java.util.ArrayList;

class SeedCrop {
     // static 변수와 메소드
    private static int instanceCount = 0;
    private static ArrayList nameList = new ArrayList();

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static ArrayList getNameList() {
        return nameList;
    }

    // non-static 변수와 메소드
    private String seedCropName;
    private int seedPrice;
    private int cropPrice;

     // getter&setter
    public String getSeedCropName() {
        return seedCropName;
    }

    public int getSeedPrice() {
        return seedPrice;
    }

    public int getCropPrice() {
        return cropPrice;
    }

    // 생성자
     public SeedCrop(String name, int seedPrice, int cropPrice) {

        SeedCrop.nameList.add(name);
         this.seedCropName = name;
         this.seedPrice = seedPrice;
         this.cropPrice = cropPrice;
         ++instanceCount;
     }

}
