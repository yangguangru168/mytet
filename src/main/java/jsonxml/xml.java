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
        player.addElement("name").addText("詹姆斯");
        player.addElement("name ").addText("隆多");
        player.addElement("player").addText("韦德");
        player.addElement("player ").addText("杜兰特");
        player.addElement("cc").addText("利拉德");
        player.addElement("cc ").addText("安东尼");
        player.addElement("sf").addText("保罗");
        player.addElement("sf ").addText("哈登");
        return dom;
    }
}
