import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("请输入工资：");
            int salary = sc.nextInt();
            if(salary == 0){
                flag = false;
            }else{
                int other = salary - 3500;
                if (salary <= 3500) {
                    System.out.println("不交税");
                }else if (other <= 1500) {
                    System.out.println("所需要缴纳的税费为：" + other*0.03+" 元");
                }else if (other <= 4500){
                    System.out.println("所需要缴纳的税费为：" + other*0.1+" 元");
                }else if (other <= 9000){
                    System.out.println("所需要缴纳的税费为：" + other*0.2+" 元");
                }else if (other <= 35000){
                    System.out.println("所需要缴纳的税费为：" + other*0.25+" 元");
                }else if (other <= 55000){
                    System.out.println("所需要缴纳的税费为：" + other*0.3+" 元");
                }else if (other <= 80000){
                    System.out.println("所需要缴纳的税费为：" + other*0.35+" 元");
                }else {
                    System.out.println("所需要缴纳的税费为：" + other*0.45+" 元");
                }
            }
        }

    }
}
