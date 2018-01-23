<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>仮想通貨作成ページ</title>
</head>
<body>

<p>金額を選んで発行ボタンを押してください</p>

<table>
<s:form action="NetMoneyCreateConfirmAction">

<tr>
				<td>金額:</td>
				<td>
				<select required="required" name="price" >
<option value="">-</option>
<option value="1000">1000</option>
<option value="1500">1500</option>
<option value="3000">3000</option>
<option value="5000">5000</option>
<option value="10000">10000</option>
<option value="30000">30000</option>
<option value="50000">50000</option>
</select> 円
				</td>
				</tr>

<s:submit value="発行"/>

</s:form>
</table>

</body>
</html>