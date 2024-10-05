import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String name = "Katsiaryna";
        String surname = "Karpukhina";
        String profession = "Pharmacist";

        byte byteNum = 3;
        short shortNum = 93;
        int intNum = 41;
        long longNum = 5;
        double doubleNum = 3.14;
        float floatNum = 8.5F;
        char ch ='e';
        boolean bool = byteNum != shortNum;

        System.out.println(name + " " + surname + "\nProfession: " + profession);
        System.out.printf("byte byteNum = %d \nshort shortNum = %d \nint intNum = %d \nlong longNum = %d" +
                        "\ndouble doubleNum = %.3f \nfloat floatNum = %.2f \nchar ch = %c \nboolean bool = %b\n",
                        byteNum, shortNum, intNum, longNum, doubleNum, floatNum, ch, bool);

        System.out.println("_______");
        System.out.println("Input your string: ");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();

        int stringLength = userString.length();
        System.out.println("stringLength: " + stringLength);

        boolean stringisEmpty = userString.isEmpty();
        System.out.println("stringisEmpty: " + stringisEmpty);

        char charNr1 = userString.charAt(1);
        System.out.println("charNr1: " + charNr1);

        String anotherString = "My rifle is my best friend";
        boolean stringsAreEqual = userString.equals(anotherString);
        System.out.println("anotherString: " + anotherString);
        System.out.println("stringAreEqual: " + stringsAreEqual);

        boolean stringsAreEqualCaselnsensitive = userString.equalsIgnoreCase(anotherString);
        System.out.println("stringsAreEqualCaselnsensitive: " + stringsAreEqualCaselnsensitive);

        boolean anotherStringStartsWithMy = anotherString.startsWith("My");
        boolean anotherStringEndsWithFriend = anotherString.endsWith("friend");
        boolean anotherStringContainsBest = anotherString.contains("best");
        System.out.printf("anotherStringStartsWithMy: %b \nanotherStringEndsWithFriend: %b \nanotherStringContainsBest: %b\n",
                anotherStringStartsWithMy, anotherStringEndsWithFriend, anotherStringContainsBest);

        String updatedString = userString.replace('a', 'A');
        String newUpdatedString = userString.replace(" ", "$");
        System.out.printf("updatedString: %s \nnewUpdatedString: %s\n", updatedString, newUpdatedString);

        String lowerCaseString = userString.toLowerCase();
        System.out.println("lowerCaseString: " + lowerCaseString);

        System.out.println(String.format("My name is %s. My surname is %s.", name, surname));

        StringBuffer buffer = new StringBuffer("My profession is ");
        buffer.append(profession);
        System.out.println(buffer);

    }
}