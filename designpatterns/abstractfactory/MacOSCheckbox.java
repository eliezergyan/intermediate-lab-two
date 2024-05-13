package designpatterns.abstractfactory;

public class MacOSCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Rendering a MacOS checkbox");
    }
}

