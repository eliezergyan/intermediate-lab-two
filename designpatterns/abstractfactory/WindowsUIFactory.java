package designpatterns.abstractfactory;

public class WindowsUIFactory implements UIFactory{
    public Button createButton(){
        return new WindowsButton();
    }

    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }

}
