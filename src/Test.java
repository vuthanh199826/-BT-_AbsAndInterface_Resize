public class Test {

    public static void main(String[] args) {
        Shape[] obj = new Shape[3];
        obj[0] = new Circle();
        obj[1] = new Retangle();
        obj[2] = new Square();

        System.out.println("Before");

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        System.out.println("After");

//        ((Circle) obj[0]).resize(Math.random() * 100);
//        ((Retangle) obj[1]).resize(Math.random() * 100);
//        ((Square) obj[2]).resize(Math.random() * 100);

        for (int i = 0; i < obj.length; i++) {
            ((Resizeable)obj[i]).resize(Math.random()*100);
            System.out.println(obj[i]);
        }
    }
}
