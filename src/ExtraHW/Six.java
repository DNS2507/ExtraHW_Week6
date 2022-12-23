package ExtraHW;
//Write a java program which replace a “I@love@java” to “we love java”
//Expected output: We love java
public class Six {
    static String name= "I@Love@Java", name1="We Love Java";

    public static void main(String[] args) {
        System.out.println(name.replace(name,name1));
    }
}

