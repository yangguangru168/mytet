package jsonxml;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * @author 杨光儒
 * @Title: xml
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/810:42
 */
public class xml {
    public static void main(String[] args)throws Exception {
        FileWriter out = new FileWriter("NBA.xml");
        createXML().write( out );
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("UTF-8");
        XMLWriter writer = new XMLWriter( System.out,format );
        writer.write( createXML() );
        out.close();
    }
    public static Document createXML(){
        Document dom = DocumentHelper.createDocument();
        dom.addComment("NBA球星");
        //创建根节点
        Element root = dom.addElement("湖人队");
        //
        Element player = root.addElement("coach");
        player.addElement("1").addText("詹姆斯");
        player.addElement("2").addText("隆多");
        Element player_s = player.addElement("Player");
        Element player_x = player_s.addElement("耐克鞋");
        player_x.addText("詹15代战靴");
        Element player_y = player_s.addElement("耐克衣服");
        player_y.addText("湖人球衣");
        Element player_qx = player_s.addElement("Adidas");
        player_qx.addText("Adidas战靴");
        Element player_yy = player_s.addElement("Adidas衣服");
        player_yy.addText("Adidas湖人球衣");

        return dom;
    }
}
