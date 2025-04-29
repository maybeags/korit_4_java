package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
    }
}
