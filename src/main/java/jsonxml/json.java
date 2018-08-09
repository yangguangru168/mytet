package jsonxml;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import javax.annotation.Resource;
import java.io.*;
/**
 * @author 杨光儒
 * @Title: json
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/813:32
 */
public class json {
    public static void main(String[] args) throws JSONException,IOException {
        String str = xmlandjson();//获取xml文件并转成json格式
        outContent(str);//写入数据到xml.txt
        getxml();//读取xml.txt文件的数据
    }

    /*读取xml信息，并转化成json格式*/
    public static String xmlandjson () throws  JSONException,IOException{
        //前面要加"/"
        InputStream in = json.class.getResourceAsStream("/NBA.xml");//注意在target文件夹中要存在NBA.xml否则报错
        String xml =IOUtils.toString(in);
        JSONObject xmlObject = XML.toJSONObject(xml);
        System.out.println(xmlObject.get("湖人队"));
        return xmlObject.toString();
    }

    /*创建文件xml.txt并把json数据写入*/
    public static void outContent(String str) throws IOException{
        //创建文件xml.txt
        File file =new File("xml.txt");
        file.createNewFile();
        //输出流输出到xml.txt文件
        FileOutputStream fo= new FileOutputStream("xml.txt");
        //输入流。从那个文件获取数据
        FileInputStream fi = new FileInputStream("NBA.xml");
        InputStreamReader ip = new InputStreamReader(fi);
        OutputStreamWriter ow = new OutputStreamWriter(fo);
        BufferedReader br = new BufferedReader(ip);
        //BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter bw = new PrintWriter(ow,true);
        String s =null;
        while ((s=br.readLine())!=null){
            bw.println(s);//把内容写入
        }
        bw.close();
        ow.close();
    }

    /*以行为单位读取文件内容，一次读一整行，读取文件数据*/
    public static void getxml() throws IOException{
        File file = new File("xml.txt");
        FileReader rd = new FileReader(file);
        BufferedReader br = new BufferedReader(rd);
        String s = null;
        StringBuilder stb = new StringBuilder();
        while ((s=br.readLine())!=null){
            stb.append(s);
        }
        br.close();
        System.out.println("读取=》"+stb.toString());
    }
}
