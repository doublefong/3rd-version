<%@ page language="java" import="java.util.*,cn.mysql.project.*" pageEncoding="UTF-8"%>
<%
teacher Tea=new teacher();
List<teacher> list=Tea.tea_list();
%>
<html>
  
  
  <body>
<table>
<tr>
<td>name</td>
</tr>

<%for(teacher tea:list){%>
<tr>
<td><%=tea.getId()%>     </td>
<td><%=tea.getName()%>   </td>
<td><%=tea.getPassword()%></td>
<td>
<a href="teacher.jsp?id=<%=tea.getId()%>">删除</a></td>
</tr>
<%} %>
<tr>
<td>
<a href="adm_modify.jsp?method=addTea">增加教师账号</a></td>
 <a href="../admin.jsp">返回管理员界面</a> 
</tr>
</table>
  </body>
</html>
