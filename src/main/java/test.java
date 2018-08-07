import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/**
 *
 *@ClassName test
 *@Description TODO
 *@Author 杨光儒
 *@Date 2018/8/6 14:09
 *@Version 1.0
 **/
public class test {
    public static void main(String[] args)throws Exception {
        File file = new File("stList.xlsx");
        FileInputStream fs = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet("Java进阶班");
        int sh = sheet.getLastRowNum();
        Scanner in =new Scanner(System.in);
        System.out.println("请输入自动生成个数，总人数为"+sh);
        int a = in.nextInt();
        if(a>0 && a<sh){
            Set<Integer> list = new HashSet<Integer>();
            System.out.println("---------------------------"+"\t\t\t\t\t\t\t");

            for (int i = 0; i <a; i++) {
                list.add((int) (Math.random() * 48)+1);
            }
            System.out.print("幸运的同学编号为=>"+"  ");
            for (Integer inte: list){
                System.out.print(inte+1+" ");
            }
            System.out.println();
            System.out.println("---------------------------");
            for (Integer i : list){
                XSSFRow row = sheet.getRow(i);
                XSSFCell cell = row.getCell(2);
                XSSFCell cel = row.getCell(4);
                String str = cel.toString().substring(0,cel.toString().indexOf('.'));
                System.out.print(str+"\t");
                System.out.println(cell);
            }
        }

        /*for (int i = 0; i < 49; i++) {
            System.out.print(list.g);
            XSSFRow row = sheet.getRow(list.get(i));
            XSSFCell cell = row.getCell(2);
            System.out.println(cell);
        }*/
    }
}
