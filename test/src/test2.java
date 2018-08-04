import java.util.Scanner;
/**
 *
 *@ClassName test2
 *@Description TODO
 *@Author 杨光儒
 *@Date 2018/8/4 10:11
 *@Version 1.0
 **/
public class test2 {
    public static void main(String[] args) {
        System.out.println(test2());
    }
    private static String test2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入日期：");
        String str = scanner.nextLine().trim();
        if(str.equals("")) return "error";
        String[] strArr = str.split("-");
        if (strArr == null || strArr.length != 3) return "error";
        int year;
        int month;
        int day;
        try {
            year = Integer.parseInt(strArr[0]);
            month = Integer.parseInt(strArr[1]);
            day = Integer.parseInt(strArr[2]);
        } catch (Exception e) {
            return "error";
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (month <= 0 || month > 12) return "error";
        if (day <= 0 || day > 31) return "error";
        switch (month) {
            case 2:
                if (isLeapYear) {
                    if (day > 29) return "error";
                    day = (day == 29) ? 1 : day + 1;
                } else {
                    if (day > 28) return "该日期不存在";
                    day = (day == 28) ? 1 : day + 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) return "error";
                day = (day == 30) ? 1 : day + 1;
                break;
            default:
                day = (day == 31) ? 1 : day + 1;
                break;
        }
        month = (day == 1) ? month + 1 : month;
        year = (month == 13) ? year + 1 : year;
        month = (month == 13) ? 1 : month;
        String m = month < 10 ? ("0" + month) : (month + "");
        return "下一天为:" + year + "-" + m + "-" + day;
    }

}
