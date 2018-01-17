<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>画像検索</title>
</head>
<body>

<table>
<s:form action="imageSearchAction">
				<tr>
					<td>
						<label>名前:</label>
					</td>
					<td>
						<input type="text" required="required" name="name" value="" />
					</td>
				</tr>
				<s:submit value="登録"/>

				</s:form>
				</table>

				<s:form action="imageSearchAction" method="POST">
		<button type="submit">Fetch Records</button>
	</s:form>



</body>
</html>