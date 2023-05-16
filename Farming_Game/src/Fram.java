package FarmingGame;

class Fram {
    // 0이면 아무것도 없는 상태, true 면 수확 가능상태
    private boolean framState = false;
    private String framNmme;

    //getter&setter
    public boolean isFramState() {
        return framState;
    }
    public String getFramNmme() {
        return framNmme;
    }

    public void setFramState(boolean framState) {
        this.framState = framState;
    }

    public void setFramNmme(String framNmme) {
        this.framNmme = framNmme;
    }

    // 씨앗 심기
    public void plantSeed(int index, Player player)
    {
        player.setSeedInventory(index);
        framState = true;
    }

    // 밭에 심기
    public void harvestCrop(int index, Player player)
    {
        player.setCropInventory(index);
        framState = false;
    }

}
