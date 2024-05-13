package designpatterns.abstractfactory;

public class MacOSUIFactory implements UIFactory{
    public Button createButton(){
        return new MacOSButton();
    }

    public Checkbox createCheckbox(){
        return new MacOSCheckbox();
    }

}
