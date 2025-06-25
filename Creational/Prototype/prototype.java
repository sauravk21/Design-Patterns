package Creational.Prototype;

interface Shape {
    Shape clone();
    void draw();    
} 

class Circle implements Shape{
    private String color;

    public Circle(String color){
        this.color = color;
    }

    @Override
    public Shape clone(){
        return new Circle(this.color);
    }

    @Override
    public void draw(){
        System.out.println(color);
    }
}


class ShapeClient{
    private Shape shapePrototype;

    public ShapeClient(Shape shapePrototype){
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape(){
        return shapePrototype.clone();
    }
}

public class prototype {
    public static void main(String[] args) {
        Shape circleShape = new Circle("RED");

        ShapeClient shapeClient = new ShapeClient(circleShape);

        Shape newCircle = shapeClient.createShape();
        newCircle.draw();
    }
}
