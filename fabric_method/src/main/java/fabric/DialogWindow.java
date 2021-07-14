package fabric;

import model.Button;

public interface DialogWindow {

    default void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }

    Button createButton();
}
