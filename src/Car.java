public class Car {

    private String marka;
    private int probeg;
    private int god;
    public static int count;

    public Car(String marka, int probeg, int god)

    {
        this.marka = marka;
        this.probeg = probeg;
        this.god = god;
        count++;
    }

    public String getMarka() {return this.marka;}
    public void SetMarka(String newMarka) {this.marka = newMarka;}
    public int getProbeg() {return this.probeg;}

    public void setProbeg(int probeg) {
        this.probeg = probeg;}

    public int getGod() {return this.god;}
    public void setGod(int god) {
        this.god = god;}

    public static int getCount() {
        return count;
    }
}



