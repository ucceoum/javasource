
<%@ page import="java.sql.*" contentType="text/html;charset=EUC-KR"%>

<%
  String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
  String DB_USER = "madang";
  String DB_PASSWORD= "12345";
  Connection conn; //����̹� ���� ��ü ����
  Statement stmt; //���� ��ü ����
 try {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    //����̹� �������
    conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    //�������
    stmt = conn.createStatement();
    conn.close();
    out.println("Madang Oracle DB Connection Success!");
     } 
  catch(Exception e){
   out.println(e);
          }
  // C:\Program Files\Apache Software Foundation\Tomcat 9.0
  //     \webapps\ROOT
%>
