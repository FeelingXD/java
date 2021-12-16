<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file ="dbconn.jsp"%>

<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");

	PreparedStatement pstmt = null;
	
	String sql= "insert into member values(?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, id);
	pstmt.setString(2, username);
	pstmt.setString(3, password);
	pstmt.setString(4, email);
	pstmt.setString(5, phone);
	
	pstmt.executeUpdate();
	
	if(pstmt != null)
		pstmt.close();
	if(conn !=null)
		conn.close();
	response.sendRedirect("signup.jsp");
%>