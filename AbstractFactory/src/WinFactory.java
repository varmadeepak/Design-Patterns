public class WinFactory implements Ifactory{
    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WinTextBox();
    }
}
