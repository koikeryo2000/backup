<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>商品一覧</title>
</head>
<body>

<P>商品検索</P>
<s:form action="SearchProductAction">
<p>変更する項目を選んでください</p>
<select required="required" name="column" >
<option value="">-</option>
<option value="item_Name">商品名</option>
<option value="Category">カテゴリー</option>
<option value="item_price">値段</option>



</select>

<p>検索ワードを入力してください</p>
<input type="text"required="required" name="change" value="" />

<s:submit value="検索"/>

</s:form>




<s:iterator value="productList">
<s:form action="ProductDetailAction">
<table>




<tr>

					<td>
<p><input type="image" src="<s:property value='image' />" alt="送信する"width="100" height="100" ></p>
					</td>
				</tr>

<tr>



					<td>
<input type="hidden" name="Name" value="<s:property value="itemName" />" />
						<s:property value="itemName" />



					</td>
					</tr>

					<tr>
			<td>
					<s:property value="itemPrice" />円

					</td>
					</tr>








</table>
</s:form>
</s:iterator>
</body>
</html>