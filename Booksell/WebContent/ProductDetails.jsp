<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>商品詳細</title>
</head>
<body>
<s:form action="CreateShoppingCartAction">
<table>
<s:iterator value="productList">

<tr>
					<td>
<label></label>
</td>
					<td>
					<input type="hidden" name="image" value="<s:property value="image" />" />
						<img width="100" height="100" src="<s:property value='image' />">
					</td>



				</tr>

<tr>
<td>
<label>商品名</label>
</td>

					<td>
<input type="hidden" name="itemName" value="<s:property value="itemName" />" />
						<s:property value="itemName" />

					</td>
					</tr>

					<tr>
					<td>
<label>値段</label>
</td>
					<td>
					<input type="hidden" name="itemPrice" value="<s:property value="itemPrice" />" />
						<s:property value="itemPrice" />円
					</td>
					</tr>

					<tr>
					<td>
<label>在庫数</label>
</td>
					<td>
					<input type="hidden" name="itemStock" value="<s:property value="itemStock" />" />
						<s:property value="itemStock" />
					</td>
					</tr>


					<tr>
					<td>
<label>購入する数を選んでください</label>
</td>
<td>

<select required="required" name="Stock" >
<option value="">-</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>



</select>
</td>
</tr>
							<tr>
					<td>
<label>カテゴリー</label>
</td>
					<td>

						<s:property value="category" />
					</td>
					</tr>

					<tr>
					<td>
<label>商品説明</label>
</td>
					<td>
						<s:property value="description" />
					</td>
					</tr>





</s:iterator>



<s:submit value="カートへ追加"/>
</table>
</s:form>

<p>管理者ページに移動する<a href='<s:url action="GoShoppingAction" />'>商品一覧に戻る</a></p>

</body>
</html>