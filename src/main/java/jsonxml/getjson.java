package jsonxml;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.ServerSocket;
import java.util.Iterator;

/**
 * @author 杨光儒
 * @Title: getjson
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/910:51
 */
public class getjson {
    public static void main(String[] args) throws IOException,JSONException {
        File file = new File("xml.txt");
        //FileReader fr = new FileReader(file);
        FileInputStream fi= new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fi);
        BufferedReader br = new BufferedReader(isr);
        StringBuilder sb = new StringBuilder();
        String s =null;
        while ((s=br.readLine())!=null){
            sb.append(s);//
        }
        br.close();
        isr.close();
        fi.close();
        System.out.println(sb);
        JSONObject json = new JSONObject(sb.toString());
        //获取到json得对象
        JSONObject js = (JSONObject) json.getJSONObject("湖人队").get("coach");
        Iterator array = js.keys();
        while (array.hasNext()){
            String ss = (String) array.next();
            /*
            *js.getJSONArray():是获取coach节点下的数组[]，一共有4个
            * js.getJSONArray(ss):遍历得到的keys对应去获取coach节点下的数组[]， 例如cc <=>"cc":["利拉德","安东尼"]
            * 用for循环去遍历每一个数组里面的值
            * String ss = (String) array.next() 是第一个数组里面的值遍历完再继续遍历下一个数组里面的值，直到把所有数组遍历完。
            * */
            JSONArray jsonArray = js.getJSONArray(ss);
            System.out.println("钱钱钱"+jsonArray.get(1));
            System.out.println(js.length());
            for (int i = 0; i < jsonArray.length(); i++) {
                System.out.println("  "+jsonArray.get(i).toString());
            }
        }
      //rtty
        }

}
