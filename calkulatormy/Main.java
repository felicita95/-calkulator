package calkulatormy;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) throws Exception {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите два числа (арабских или римских):");
        String expression = skan.nextLine();
        System.out.println(calc(expression));
    }

    public static String calc(String input) throws Exception {
        int num1;
        int num2;
        String oper;
        String result;
        boolean isRoman;
        String[] operands = input.split("[+\\-*/]");
        if (operands.length != 2) throw new Exception("Должно быть 2 операнда и содержать знаки: +,-,* или /");

        oper = operator(input);
        if (Roman.isRoman(operands[0]) && (Roman.isRoman(operands[1]))) {
            num1 = Roman.convert(operands[0]);
            num2 = Roman.convert(operands[1]);
            isRoman = true;
        } else if (!Roman.isRoman(operands[0]) && !Roman.isRoman(operands[1])) {
            num1 = Integer.parseInt(operands[0]);
            num2 = Integer.parseInt(operands[1]);
            isRoman = false;
        } else {
            throw new Exception("Числа должны быть в одном формате и больше нуля");
        }

        if (num1 > 10 | num2 > 10) {
            throw new Exception("Введите числа от 1 до 10");
        }
        int resultcalk = calk(num1, num2, oper);

        if (isRoman) {
            if (resultcalk <= 0) {
                throw new Exception("Число должно быть больше нуля");
            }
            result = Roman.converToRoman(resultcalk);

        } else {
            result = String.valueOf(resultcalk);
        }
        return result;

    }

    static String operator(String val) {
        if (val.contains("+")) return "+";
        else if (val.contains("-")) return "-";
        else if (val.contains("*")) return "*";
        else if (val.contains("/")) return "/";
        else return null;
    }

    static int calk(int a, int b, String operat) {
        if (operat.equals("+")) return a + b;
        else if (operat.equals("-")) return a - b;
        else if (operat.equals("*")) return a * b;
        else return a / b;
    }
}




