<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>退会ユーザー一覧ページ</title>
</head>
<body>

<s:form action="UnsubscribeListAction">
<s:submit value="一覧表示"/>
</s:form>



<s:form action="UnsubscribeListAction">
<table>
<s:iterator value="unsubscribeList">
<tr>


					<tr>
					<td>
<label>退会ユーザー</label>
</td>
					<td>
						<s:property value="UserName" />様
					</td>
					</tr>

					<tr>
					<td>
<label>退会理由</label>
</td>
					<td>
						<s:property value="Why" />
					</td>
					</tr>

							<tr>
					<td>
<label>詳細</label>
</td>
					<td>
						<s:property value="Reason" />
					</td>
					</tr>

					<tr>
					<td>
<label>退会日</label>
</td>
					<td>
						<s:property value="Date" />
					</td>
					</tr>

<s:submit value="一覧表示"/>

</s:iterator>
</table>
</s:form>
unsubscribeList
<s:iterator value="unsubscribeList">
				<tr>
					<td><s:property value="UserName" /></td>
					<td><s:property value="Why" /><span></span></td>
					<td><s:property value="Reason" /><span></span></td>
					<td><s:property value="Date" /></td>

</tr>
			</s:iterator>


</body>
</html>