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
    public static String xmlandjson () throws JSONException, IOException{
        InputStream in = json.class.getResourceAsStream("/NBA.xml");
        String xml = IOUtils.toString(in);
        JSONObject xmljson = XML.toJSONObject(xml);
        return xmljson.toString();


    }

    /*创建文件xml.txt并把json数据写入*/
    public static void outContent(String str) throws IOException{
        File file =new File("xml.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.flush();
        bw.close();
        fw.close();
    }

    /*读取文件数据*/
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
        System.out.println(stb.toString());

    }
}
