package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author 杨光儒
 * @Title: method
 * @ProjectName project1
 * @Description: TODO
 * @date 2018/8/919:01
 */
public class method {
    Connection conn =null;
    PreparedStatement pstmt =null;
    public Connection getConn() throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password ="123456";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", username, password);
        return conn;
    }
    public int insert()throws Exception{
        Connection conn = getConn();
        int i =0;
        String sql = "insert into study(userid,username,age)values(?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,3);
        pstmt.setString(2,"韦德");
        pstmt.setString(3,"3");
        i = pstmt.executeUpdate();
        pstmt.close();
        conn.close();
        return i;
    }
    public void getall() throws Exception{
        Connection conn = getConn();
        String sql = "select*from study";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        }
        conn.close();
    }
    public void delect () throws Exception{
        conn = getConn();
        String sql = "delete from study where userid=3";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int i =pstmt.executeUpdate();
        System.out.println("删除"+i);
        conn.close();
    }
}
