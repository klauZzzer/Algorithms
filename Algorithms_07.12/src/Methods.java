public class Methods {

    public void isDegreeOfTwo(int number) {
        if (number == 1) {
            System.out.println("YES");
            return;
        }
        if (number % 2 != 0) {
            System.out.println("NO");
            return;
        }

        isDegreeOfTwo(number / 2);

    }

    public int sumOfNumbers(int number) {
        if (number < 10) {
            return number;
        }
        return sumOfNumbers(number / 10) + number % 10;

    }

    public void numbersOfFibonacci(int number, int first, int second) {
        //Только так смог
        //нужно указывать first = 0 и second = 1
        if (first + second > number) {
            return;
        }
        numbersOfFibonacci(number, second, first + second);
        System.out.println(second);


    }

    public boolean isPalindrome(String string, int i, int j) {
        //Только так смог
        //нужно указывать i = 0 и j = 1
        if (i == string.length() / 2) {
            return true;
        }
        if (string.charAt(i) == string.charAt(string.length() - j)) {
            return isPalindrome(string, i+1, j+1);
        } else {
            return false;
        }
    }



}
