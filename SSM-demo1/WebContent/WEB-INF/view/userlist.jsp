<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 引入jstl核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>	
			<th>用户id</th>
			<th>真实姓名</th>
			<th>用户名</th>
			<th>职务id</th>
			<th>部门编号</th>
			<th>联系电话</th>
			<th>电子邮箱</th>
			<th>入职日期</th>
			<th>操作</th>
		</tr>
		<c:forEach var="u" items="${users}">
	       <tr>
	            <td>${u.id}</td>
	            <td>${u.realname}</td>
	            <td>${u.username}</td>
	            <td>${u.jobid}</td>
	            <td>${u.deptno}</td>
	            <td>${u.phone}</td>
	            <td>${u.email}</td>
	            <td>${u.regTime}</td> 
	            <td>
 				<a onclick="deleteUserById(${u.id});" href="javascript:void(0);">删除</a>&nbsp;&nbsp;
 				<a onclick="updateUserById(${u.id});" href="#">修改</a>
 			</td>
	       </tr>
	    </c:forEach>
	</table>
</body>
<script type="text/javascript">
	function deleteUserById(id){
		if(confirm("请确认删除此条数据！")){
			window.location.href="${pageContext.request.contextPath}/user/delete.do?id="+id;
		}	
	}
</script>
</html>