
public class Login {

    private String yoneticiID;
    private int yoneticiPW;
    private String isciID;
    private int isciPW;

    public Login(String yoneticiID, int yoneticiPW, String isciID, int isciPW) {
        this.yoneticiID = yoneticiID;
        this.yoneticiPW = yoneticiPW;
        this.isciID = isciID;
        this.isciPW = isciPW;
    }

    public String getYoneticiID() {
        return yoneticiID;
    }

    public int getYoneticiPW() {
        return yoneticiPW;
    }

    public String getIsciID() {
        return isciID;
    }

    public int getIsciPW() {
        return isciPW;
    }

   
}
