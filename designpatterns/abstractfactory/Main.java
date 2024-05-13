package designpatterns.abstractfactory;

public class Main {
    public static void main(String[] args){
        UIFactory windowsFactory = new WindowsUIFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();

        windowsButton.render();
        windowsCheckbox.render();

        UIFactory macOSFactory = new MacOSUIFactory();
        Button macOSButton = macOSFactory.createButton();
        Checkbox macOSCheckbox = macOSFactory.createCheckbox();

        macOSButton.render();
        macOSCheckbox.render();
    }
}
