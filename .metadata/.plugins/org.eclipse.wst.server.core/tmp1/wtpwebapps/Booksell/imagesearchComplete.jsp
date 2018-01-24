<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>イメージサーチ成功</title>
</head>
<body>

<table>
<s:iterator value="dataList">
				<tr>
					<td>
						<s:property value="id" />
					</td>
					<td>
						<s:property value="name" />
					</td>
					<td>
						<img width="100" height="100" src="<s:url value='Image.action?id='/><s:property value='id' />">
					</td>
						<td>
						<img width="100" height="100" src="<s:url value='imageSearchAction.action?id='/><s:property value='id' />">
					</td>

				</tr>
			</s:iterator>
</table>

<p>管理者ページに移動する<a href='<s:url action="GoManagerPageAction" />'>こちら</a></p>

</body>
</html>