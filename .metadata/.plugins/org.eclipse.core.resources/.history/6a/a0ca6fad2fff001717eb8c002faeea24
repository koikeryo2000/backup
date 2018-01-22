<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧表示</title>
</head>
<body>

<table>
<s:iterator value="itemList">
<tr>
					<td>
						<s:property value="itemName" />
					</td>
					<td>
						<s:property value="itemPrice" />
					</td>
					<td>
						<s:property value="itemStock" />
					</td>
					<td>
						<s:property value="category" />
					</td>
					<td>
						<s:property value="description" />
					</td>
					<td>
						<s:property value="Login_user_id" />
					</td>
					<td>
						<s:property value="Insertdate" />
					</td>

					<td>
						<img width="100" height="100" src="<s:url value='ShowItemListAction.action?id='/><s:property value='id' />">
					</td>



				</tr>
</s:iterator>
</table>

</body>
</html>