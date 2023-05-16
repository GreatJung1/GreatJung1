package FarmingGame;

class Player {
    private String userName;
    private int money;
    private int[] seedInventory = new int[SeedCrop.getInstanceCount()];
    private int[] cropInventory = new int[SeedCrop.getInstanceCount()];

    // getter&setter
    public int getMoney()
    {
        return money;
    }

    public int getSeedInventory(int index)
    {
        return seedInventory[index];
    }

    public int getCropInventory(int index)
    {
        return cropInventory[index];
    }

    public void setSeedInventory(int index) {
        seedInventory[index] -= 1;
    }

    public void setCropInventory(int index) {
        cropInventory[index] += 1;
    }

    // 플레이어의 소지금을 주어진 양만큼 업데이트하는 메서드
    public void updateMoney(int plusMoney)
    {
        money += plusMoney;
    }

    // 씨앗 구매
    public void buySeedInventory(int index, int seedPrice, int seedQuantity)
    {
        seedInventory[index] += seedQuantity;
        money -= seedQuantity;
    }

    // 판매하기
    public void sellCropInventory(int index, int cropPrice, int cropQuantity)
    {
        cropInventory[index] -= cropQuantity;
        money += cropQuantity;
    }

    // 개수를 인자로 넘기기
    public Player(String userName, int count)
    {
        this.userName = userName;
        money = 1000;

        int[] seedInventory = new int[count];
        int[] cropInventory = new int[count];
    }
}
