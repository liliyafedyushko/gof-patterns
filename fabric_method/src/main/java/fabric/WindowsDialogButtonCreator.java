package fabric;

import model.Button;
import model.RoundButton;

public class WindowsDialogButtonCreator implements DialogWindow {
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
