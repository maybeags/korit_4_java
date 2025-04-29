package ch14_abstraction.interfaces;

public class TvRemoteController {
    // field 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    public TvRemoteController(
            PowerButton powerButton,
            ChannelDownButton channelDownButton,
            ChannelUpButton channelUpButton
    ) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }

    // 이상의 field들을 이용한 메서드들을 정의
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }
}
