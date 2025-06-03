import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Какое действие вы хотите выбрать:");
            System.out.println("Перевод - 1 ");
            System.out.println("Сложение или вычитание - 2 ");
            int deistv = in.nextInt();
            String chislo1, chislo2;
            switch (deistv) {
                case 1:
                    System.out.println("1 - из 10 в 2 \n" +
                            "2 - из 2 в 10\n" +
                            "3 - из 10 в 16 \n" +
                            "4 - из 16 в 10\n" +
                            "5 - из 2 в 16\n" +
                            "6 - из 16 в 2");
                    deistv = in.nextInt();
                    System.out.print("введите число:");
                    chislo1 = in.next();
                    switch (deistv) {
                        case 1:
                            System.out.println(perevodv2(Integer.parseInt(chislo1)));
                            break;
                        case 2:
                            System.out.println(perevodv10(chislo1));
                            break;
                        case 3:
                            System.out.println(DesytVshestn(Integer.parseInt(chislo1)));
                            break;
                        case 4:
                            System.out.println(ShestnVdesyt(chislo1));
                            break;
                        case 5:
                            System.out.println(DesytVshestn(perevodv10(chislo1)));
                            break;
                        case 6:
                            System.out.println(perevodv2(Integer.parseInt(ShestnVdesyt(chislo1))));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 - сложение в 2 \n" +
                            "2 - сложение в 16(не работает)\n" +
                            "3 - вычитание в 2 \n" +
                            "4 - вычитание в 16(не работает)\n");
                    deistv = in.nextInt();
                    System.out.println("Введите 1 число");
                    chislo1 = in.next();
                    System.out.println("Введите 2 число");
                    chislo2 = in.next();
                    switch (deistv) {
                        case 1:
                            System.out.println(SlozhenieVdv(chislo1, chislo2));
                            break;
                        case 2:
                            System.out.println(SlozhenieVShes(chislo1, chislo2));
                            break;
                        case 3:
                            System.out.println(VichitanieVdv(chislo1, chislo2));
                            break;
                        case 4:
                            System.out.println(VichitanieVShes(chislo1, chislo2));
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private static int perevodv10(String chislo) {
        int numTwo = 0, num = 0;

        for (int i = chislo.length() - 1; i >= 0; i--) {
            if (chislo.charAt(i) == '1')
                numTwo += Math.pow(2, num);
            num++;
        }
        return numTwo;
    }

    private static String perevodv2(int chislo) {
        if (chislo == 0) {
            return "0";
        } else
            return perevodv2(chislo / 2) + chislo % 2;
    }

    private static String SlozhenieVdv(String num, String numTwo) {
        StringBuilder result = new StringBuilder();
        while (num.length() < numTwo.length()) {
            num = "0" + num;
        }
        while (numTwo.length() < num.length()) {
            numTwo = "0" + numTwo;
        }
        int perenos = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            int bit1 = num.charAt(i) - '0';
            int bit2 = numTwo.charAt(i) - '0';
            int sum = bit1 + bit2 + perenos;
            result.append(sum % 2);
            perenos = sum / 2;
        }
        if (perenos != 0) {
            result.append(perenos);
        }
        return result.reverse().toString();
    }

    private static String VichitanieVdv(String num, String numTwo) {

        while (num.length() < numTwo.length()) {
            num = "0" + num;
        }
        while (numTwo.length() < num.length()) {
            numTwo = "0" + numTwo;
        }
        int perenos = 0;
        String num3 = "";
        for (int i = numTwo.length() - 1; i >= 0; i--) {
            if (numTwo.charAt(i) == '1')
                num3 = "0" + num3;
            else
                num3 = "1" + num3;
            System.out.println(numTwo + "   " + num3);
        }
        return SlozhenieVdv(SlozhenieVdv(num3, "1"), num).substring(1);
    }

    private static String DesytVshestn(int desyat) {
        StringBuilder d = new StringBuilder();
        while (desyat != 0) {
            int b = desyat - desyat / 16 * 16;
            desyat = desyat / 16;
            switch (b) {
                case 1:
                    d.append("1");
                    break;
                case 2:
                    d.append("2");
                    break;
                case 3:
                    d.append("3");
                    break;
                case 4:
                    d.append("4");
                    break;
                case 5:
                    d.append("5");
                    break;
                case 6:
                    d.append("6");
                    break;
                case 7:
                    d.append("7");
                    break;
                case 8:
                    d.append("8");
                    break;
                case 9:
                    d.append("9");
                    break;
                case 10:
                    d.append("A");
                    break;
                case 11:
                    d.append("B");
                    break;
                case 12:
                    d.append("C");
                    break;
                case 13:
                    d.append("D");
                    break;
                case 14:
                    d.append("E");
                    break;
                case 15:
                    d.append("F");
                    break;
                default:
                    break;
            }
        }
        return d.reverse().toString();
    }

    private static String ShestnVdesyt(String d) {
        int desyat = 0;
        int p = 0;
        for (int i = d.length() - 1; i >= 0; i--) {
            int s;
            if (d.charAt(i) >= '0' && d.charAt(i) <= '9') {
                s = d.charAt(i) - '0';
            } else {
                s = d.charAt(i) - 'A' + 10;
            }
            desyat += s * Math.pow(16, p);
            p++;
        }
        return Integer.toString(desyat);
    }

    private static String VichitanieVShes(String chislo, String chislo2) {
        char c, c2;
        while (chislo.length() < chislo2.length()) {
            chislo = "0" + chislo;
        }
        while (chislo2.length() < chislo.length()) {
            chislo2 = "0" + chislo2;
        }
        String num = "";
        StringBuilder res = new StringBuilder();
        int s3 = 0;
        for (int i = chislo.length() - 1; i >= 0; i--) {
            c = chislo.charAt(i);
            c2 = chislo2.charAt(i);
            int s, s2;
            if (c >= '0' && c <= '9')
                s = c - '0';
            else s = c - 'A' + 10;
            if (c2 >= '0' && c2 <= '9')
                s2 = c2 - '0';
            else s2 = c2 - 'A' + 10;
            num = String.valueOf(s - s2 - s3);
            if (s - s2 - s3 < 0) {
                num = String.valueOf(s - s2 - s3 + 16);
                s3 = 1;
            } else {
                s3 = 0;
            }
            num = switch (num) {
                case "1" -> "1";
                case "2" -> "2";
                case "3" -> "3";
                case "4" -> "4";
                case "5" -> "5";
                case "6" -> "6";
                case "7" -> "7";
                case "8" -> "8";
                case "9" -> "9";
                case "10" -> "A";
                case "11" -> "B";
                case "12" -> "C";
                case "13" -> "D";
                case "14" -> "E";
                case "15" -> "F";
                default -> num;
            };
            res.append(num);
        }
        return res.reverse().toString();
    }

    private static String SlozhenieVShes(String chislo, String chislo2) {
        char c = 0, c2 = 0;
        chislo = "0" + chislo;
        chislo2 = "0" + chislo2;
        while (chislo.length() < chislo2.length()) {
            chislo = "0" + chislo;
        }
        while (chislo2.length() < chislo.length()) {
            chislo2 = "0" + chislo2;
        }

        String num;
        StringBuilder res = new StringBuilder();
        int s3 = 0;
        for (int i = chislo.length() - 1; i >= 0; i--) {
            c = chislo.charAt(i);
            c2 = chislo2.charAt(i);
            int s, s2;
            if (c >= '0' && c <= '9')
                s = c - '0';
            else s = c - 'A' + 10;
            if (c2 >= '0' && c2 <= '9')
                s2 = c2 - '0';
            else s2 = c2 - 'A' + 10;

            num = String.valueOf(s + s2 + s3);
            if (s + s2 + s3 > 15) {
                num = String.valueOf(s + s2 + s3 - 16);
                s3 = 1;
            } else s3 = 0;
            num = switch (num) {
                case "1" -> "1";
                case "2" -> "2";
                case "3" -> "3";
                case "4" -> "4";
                case "5" -> "5";
                case "6" -> "6";
                case "7" -> "7";
                case "8" -> "8";
                case "9" -> "9";
                case "10" -> "A";
                case "11" -> "B";
                case "12" -> "C";
                case "13" -> "D";
                case "14" -> "E";
                case "15" -> "F";
                default -> num;
            };
            res.append(num);
        }
        if (res.charAt(res.length() - 1) == '0') {
            return res.reverse().substring(1).toString();
        } else return res.reverse().toString();
    }
}