<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbconn.jsp"%>
<%@ page import ="java.util.*"%>
<%
	try{
	String id=request.getParameter("id");
	PreparedStatement pstmt= null;
	ResultSet rs  = null;
	
	String sql ="select * from member where userid = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, id);
	rs = pstmt.executeQuery();
		
	if(rs.next()){
			 %>성공<% 
	}
		else{
			 %>실패<%
	}
	}catch(SQLException se){
	
	}
	
%>