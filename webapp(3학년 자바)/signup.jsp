<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="dbconn.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sign_up</title>

</head>
<% 
	String mode = null;
	if(request.getParameter("mode")!=null)
		mode=request.getParameter("mode");
%>
<body>
<script type="text/javascript" src='./js/need.js'></script>
 <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script><!-- 제이쿼리 -->
<form action="./progress_signup.jsp" method="post" name ="signup">
         <br>
         <p>아이디<input type="text" name="id" id="id" maxlength="16" onkeydown="set_false()"><input type="button" value="중복체크" name="check_id_btn" onkeydown=""onclick="check_id()">
         		<input type="hidden" name ="checkid" id="checkid" value=0>
          <p>이름<input type="text" name="username" maxlength="12">
          <p>비밀번호<input type="password" name="password" maxlength="12">          
          <p>이메일<input type="text" name="email" maxlength="50">
          <p>폰번호<input type="text" name="phone" maxlength="13">
          <p>가입 <input type="button" value="전송" onclick="return check_process()">
          <p>테이블가져오기<input type="button" value="가져오기" onclick="location='signup.jsp?mode=search'">
          
    </form>
    	<% if(mode!=null){  %>
          	<table style="boder:1px solid gray; text-align:center">
          		<thead>
	          		<tr>
	          			<th>아이디</th>
	          			<th>이름</th>
	          			<th>비밀번호</th>
	          			<th>email</th>
	          			<th>phone</th>
	          		</tr>
	          	</thead>
          		<tbody>
        	<% 
        		try{
        			PreparedStatement pstmt = null;
        			ResultSet rs;
        		 	String sql = "select * from member";
        			pstmt = conn.prepareStatement(sql);
        			
        			rs = pstmt.executeQuery();
        			while(rs.next()){
        				%>
        				<tr>
        					<td><%=rs.getString("userid")%></td>
        					<td><%=rs.getString("username")%></td>
        					<td><%=rs.getString("password")%></td>
        					<td><%=rs.getString("email")%></td>
        					<td><%=rs.getString("phone")%></td>        					
        				</tr>
        				<% 
        				}
        				if(rs !=null) rs.close();
        				if(pstmt !=null)pstmt.close();
        				if(conn !=null)conn.close();
        			}catch(SQLException se){
        				se.printStackTrace();
        			}
        		
          }
          %>
          </tbody>
		</table>
</body>
</html>