<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>仮想通貨確認ページ</title>

</head>
<body>
<table>
<s:form action="NetMoneyCreateCompleteAction">
<p>発行金額にお間違えがなければ発行ボタンを押してください</p>
<tr id="box">
<td>
<label>発行予定金額</label>
</td>
<td>
<s:property value="price" escape="false" />円
</td>
</tr>

<tr>
<s:submit value="発行"/>
</tr>

</s:form>
</table>


</body>
</html>