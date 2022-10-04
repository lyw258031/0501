import java.util.Scanner;
public class Judge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        boolean isloop = isLoop(str);
        if (isloop) {
            System.out.println(str + "是回文字符");
        } else {
            System.out.println(str + "不是回文字符");
        }

    }

    public static boolean isLoop(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
