<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>退会ページ</title>
</head>
<body>
<table>
<s:form action="UnsubscribeAction">
<s:submit value="退会する"/>
</s:form>

</table>

<table>
<s:form action="UnsubscribeAction">

<tr>
				<td>退会理由:</td>
				<td>

<input type="checkbox" name="why" value="魅力的な商品がない">魅力的な商品がない
<input type="checkbox" name="why" value="サポートの対応が良くない">サポートの対応が良くない
<input type="checkbox" name="why" value="サイトが使いにくい">サイトが使いにくい
<input type="checkbox" name="why" value="商品が届くまで遅い">商品が届くまで遅い
<br>
詳細を教えてください<input type="text" required="required"  name="reason" value="">
</td>


<s:submit value="退会する"/>
</s:form>
</table>

<table>
<s:form action="UnsubscribeAction">

<tr>
				<td>退会理由:</td>
				<td>

<input type="checkbox" name="why[]" value="魅力的な商品がない">魅力的な商品がない
<input type="checkbox" name="why[]" value="サポートの対応が良くない">サポートの対応が良くない
<input type="checkbox" name="why[]" value="サイトが使いにくい">サイトが使いにくい
<input type="checkbox" name="why[]" value="商品が届くまで遅い">商品が届くまで遅い
<br>
詳細を教えてください<input type="text" required="required"  name="reason" value="">
</td>


<s:submit value="退会する"/>
</s:form>
</table>





</body>
</html>