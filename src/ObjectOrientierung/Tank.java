package ObjectOrientierung;

public class Tank {
    private int tankAmount;
    private int currentTank;




    public Tank(int tankAmount, int currentTank) {
        this.tankAmount = tankAmount;
        this.currentTank = currentTank;
    }


    public int getTankAmount() {
        return tankAmount;
    }
    public int getCurrentTank() {
        return currentTank;
    }

    public void setTankAmount() {
        this.tankAmount = tankAmount;
    }

    public void setCurrentTank() {
        this.currentTank = currentTank;
    }

}
