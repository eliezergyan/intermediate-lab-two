package designpatterns.factory;


public class ShapeFactory {

    public static Shape createShape(String type){
        if(type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (type.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else if(type.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else {
            throw new IllegalArgumentException("Invalid shape type: " + type);
        }

    }
}
