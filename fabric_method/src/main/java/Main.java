import fabric.DialogWindow;
import fabric.WebDialogButtonCreator;
import fabric.WindowsDialogButtonCreator;

public class Main {

    private static DialogWindow dialog;

    public static void main(String[] args) {
        // to choose witch implementation of button to create
        configure();
        // render window includes creating of button
        dialog.renderWindow();
        // round button should be created for windows, otherwise rectangular one
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialogButtonCreator();
        } else {
            dialog = new WebDialogButtonCreator();
        }
    }
}
