package fabric;

import model.Button;
import model.RectangularButton;

public class WebDialogButtonCreator implements DialogWindow {
    @Override
    public Button createButton() {
        return new RectangularButton();
    }
}
