package designpatterns.factory;

public class Main {
    public static void main(String[] args){
        Shape circle = ShapeFactory.createShape("circle");
        circle.draw();

        Shape square = ShapeFactory.createShape("square");
        square.draw();

        Shape triangle = ShapeFactory.createShape("triangle");
        triangle.draw();

        // Handling invalid shape exception
        try{
            Shape invalidShape = ShapeFactory.createShape("oval");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }





}
