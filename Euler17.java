package problems;

public class Euler17
{
    public static String numToWords(int num) {
        String returnVal;

        switch (num) {
            case 0:
                returnVal = "";
                break;
            case 1:
                returnVal = "one";
                break;
            case 2:
                returnVal = "two";
                break;
            case 3:
                returnVal = "three";
                break;
            case 4:
                returnVal = "four";
                break;
            case 5:
                returnVal = "five";
                break;
            case 6:
                returnVal = "six";
                break;
            case 7:
                returnVal = "seven";
                break;
            case 8:
                returnVal = "eight";
                break;
            case 9:
                returnVal = "nine";
                break;
            case 10:
                returnVal = "ten";
                break;
            case 11:
                returnVal = "eleven";
                break;
            case 12:
                returnVal = "twelve";
                break;
            case 13:
                returnVal = "thirteen";
                break;
            case 14:
                returnVal = "fourteen";
                break;
            case 15:
                returnVal = "fifteen";
                break;
            case 16:
                returnVal = "sixteen";
                break;
            case 17:
                returnVal = "seventeen";
                break;
            case 18:
                returnVal = "eighteen";
                break;
            case 19:
                returnVal = "nineteen";
                break;
            case 20:
                returnVal = "twenty";
                break;
            case 30:
                returnVal = "thirty";
                break;
            case 40:
                returnVal = "forty";
                break;
            case 50:
                returnVal = "fifty";
                break;
            case 60:
                returnVal = "sixty";
                break;
            case 70:
                returnVal = "seventy";
                break;
            case 80:
                returnVal = "eighty";
                break;
            case 90:
                returnVal = "ninety";
                break;
            case 100:
                returnVal = "onehundred";
                break;
            case 200:
                returnVal = "twohundred";
                break;
            case 300:
                returnVal = "threehundred";
                break;
            case 400:
                returnVal = "fourhundred";
                break;
            case 500:
                returnVal = "fivehundred";
                break;
            case 600:
                returnVal = "sixhundred";
                break;
            case 700:
                returnVal = "sevenhundred";
                break;
            case 800:
                returnVal = "eighthundred";
                break;
            case 900:
                returnVal = "ninehundred";
                break;
            case 1000:
                returnVal = "onethousand";
                break;
            default:
                returnVal = "not yet coded";
                break;
        }

        return returnVal;
    }

    public static String process(int num) {
        String returnVal = "";
        if (num <= 20 || num == 1000 || num == 100) {
            returnVal = numToWords(num);
        }
        if (num % 10 == 0 && num < 100) {
            returnVal = numToWords(num);
        } else if (num % 100 == 0) {
            returnVal = numToWords(num);
        } else if (num > 20 && num < 100) {
            String temp = Integer.toString(num).substring(0, 1);
            int numTensDigits = Integer.parseInt(temp) * 10;
            int numOnesDigits = num % 10;
            returnVal = numToWords(numTensDigits) + numToWords(numOnesDigits);
        } else if (num > 100 && num < 1000) {
            String temp;
            String temp2;
            if (num == 200) {
                temp = "";
            }
            temp2 = Integer.toString(num).substring(0, 1);
            int numHundredsDigits = Integer.parseInt(temp2) * 100;

            temp = Integer.toString(num).substring(1, 2);
            int numTensDigits = Integer.parseInt(temp) * 10;

            int numOnesDigits = num % 10;

            returnVal = numToWords(numHundredsDigits);
            if (numTensDigits + numOnesDigits < 20 && (numTensDigits + numOnesDigits) > 0) {
                returnVal += "and" + numToWords(numTensDigits + numOnesDigits);
            } else {
                returnVal += "and" + numToWords(numTensDigits) + numToWords(numOnesDigits);
            }
        }
        return returnVal;
    }

    public static void main(String[] args) {
        int num;
        long sum = 0;

        for (num = 1; num <= 1000; num++) {
            int x = process(num).length();
            System.out.println("length of num " + num + " is " + x);
            sum += process(num).length();
        }

        System.out.println("Sum of letter counts: " + sum);
    }
}
