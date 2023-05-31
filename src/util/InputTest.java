package util;

public class InputTest {
    public static void main(String[] args) {
        Input inputOne = new Input();
        System.out.println("Get String: ");
        System.out.println(inputOne.getString());
        System.out.println("yesNo: ");
        System.out.println(inputOne.yesNo());
        System.out.println("Give me a number between 1 and 10");
        System.out.println(inputOne.getDouble());
        System.out.println("Give me a number between 1 and 10");
        System.out.println(inputOne.getInt());

    }


}


