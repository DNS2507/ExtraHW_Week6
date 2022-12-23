package ExtraHW;
//Write a java program which replace a “I love java” to “we love java”
//Expected output: We love java
public class Three {
    static String name= "I Love Java";// Static Variable

    public static void main(String[] args) {
        System.out.println(name.replaceAll("I","We")); //String Method

    }
}
