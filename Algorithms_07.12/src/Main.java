public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();
        methods.isDegreeOfTwo(8);
        System.out.println(methods.sumOfNumbers(9));
        String string1 = "abccba";
        String string2 = "ivan";
        System.out.println(methods.isPalindrome(string1, 0, 1));
        System.out.println(methods.isPalindrome(string2, 0, 1));
        System.out.println();
        methods.numbersOfFibonacci(100, 0, 1);

    }
}