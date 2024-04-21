public class First005 {
    public static void main(String[] args) {
       int age = 31;
       String name = "Ivan";
       String formatName = String.format("My name is %s and my age is %d", name, age);
       System.out.println(formatName);
    }
}
