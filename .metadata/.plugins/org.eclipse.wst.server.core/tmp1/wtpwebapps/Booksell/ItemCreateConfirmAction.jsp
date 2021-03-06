<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>商品登録確認ページ</title>
</head>
<body>

<h3>登録する内容は以下でよろしいですか。</h3>

<table>
<s:form action="">

<tr id="box">
<td>
<label>商品名</label>
</td>
<td>
<s:property value="itemName" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>価格</label>
</td>
<td>
<s:property value="itemPrice" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>商品個数</label>
</td>
<td>
<s:property value="itemStock" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>画像</label>
</td>
<td>
<s:property value="image" />

</td>
</tr>


<tr id="box">
<td>
<label>カテゴリー</label>
</td>
<td>
<s:property value="category" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>商品説明</label>
</td>
<td>
<s:property value="description" escape="false" />
</td>
</tr>

<tr id="box">
<td>
<label>画像test</label>
</td>
<td>
<s:a href="image2" />
<img  src="image2">
</td>
</tr>



<tr>
<s:submit value="完了"/>
</tr>
</s:form>
</table>
</body>
</html>