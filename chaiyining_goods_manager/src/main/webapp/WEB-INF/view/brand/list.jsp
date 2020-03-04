<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<table class="table">
	<tr>
		<th>id</th>
		<th>名称</th>
		<th>详情</th>
	</tr>
	
	<c:forEach items="${pageInfo.list }" var="b">
	<tr>
		<td>${b.id}</td>
		<td>${b.name}</td>
		<td>${b.firstChar}</td>
		<td>${b.deletedFlag}</td>
		
		
	</tr>
	</c:forEach>
	<tr>
<td colspan="10" scope="row">
	<button onclick="fenye(1)">首页</button>
	<button onclick="fenye(${pageInfo.prePage==0?1:pageInfo.prePage})">上一页</button>
	<button onclick="fenye(${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage})">下一页</button>
	<button onclick="fenye(${pageInfo.pages})">尾页</button>
</td>
</tr>
</table>

<script type="text/javascript">


function fenye(pageNum) {
	var recUrl="/brand/list";
	console.log("准备进入"+recUrl);
	 //$("form").submit(); 
	$("#main").load(recUrl+"?pageNum="+pageNum);
	
	}
</script>
