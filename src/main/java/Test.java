public class Test {
    public static void main(String[] args) {
        Object []objects = new Object[2];
        Shape shape = new Shape();
        objects[0]= shape;
        Circle circle = new Circle();
        objects[1] = circle;
        for (Object a:objects) {
            if (a instanceof Shape){
                Colorable colorable = (Shape)a;

                System.out.println(colorable.howtocolor());
            }
        }
    }
}
