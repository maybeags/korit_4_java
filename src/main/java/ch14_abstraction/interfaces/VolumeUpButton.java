package ch14_abstraction.interfaces;

public class VolumeUpButton extends Button {
    @Override
    public void onPressed() {

    }

    @Override
    public String onUp() {
        super.onUp();
        return "";
    }
}
