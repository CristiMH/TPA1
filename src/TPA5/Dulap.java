package TPA5;

public class Dulap {
    private boolean statusUsa;  //deschisa sau inchisa
    private boolean luminaBackground;   //pornita sau stinsa
    public void setStatusUsa(boolean statusUsa) {
        this.statusUsa = statusUsa;
        setLuminaBackground(statusUsa);
    }
    public void setLuminaBackground(boolean luminaBackground) {
        this.luminaBackground = luminaBackground;
    }
}
