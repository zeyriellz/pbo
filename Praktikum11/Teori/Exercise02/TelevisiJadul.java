package Teori.Exercise02;

public class TelevisiJadul extends Elektronik {
    private String modeInput;

    public TelevisiJadul() {
        super();
        this.modeInput = "DVI"; 
    }

    public String getModeInput() {
        return modeInput;
    }
}