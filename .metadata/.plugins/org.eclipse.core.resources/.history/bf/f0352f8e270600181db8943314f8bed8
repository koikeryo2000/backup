<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>商品一覧を表示する</title>
</head>
<body>
<s:form action="ShowProductListAction">

		<button type="submit">商品一覧表示</button>
	</s:form>

	<s:form action="ProductUpdateAction">
<table>
<s:iterator value="productList">
<tr>

<td>
<label>商品名</label>
</td>

					<td>
					<input type="checkbox" name="itemName" value="<s:property value="itemName" />" />
						<s:property value="itemName" />
						<s:submit value="変更"/>
					</td>
					</tr>

					<tr>
					<td>
<label>値段</label>
</td>
					<td>
						<s:property value="itemPrice" />円
					</td>
					</tr>

					<tr>
					<td>
<label>在庫数</label>
</td>
					<td>
						<s:property value="itemStock" />
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

						<tr>
					<td>
<label>商品登録した人</label>
</td>
					<td>
						<s:property value="login_user_id" />
					</td>
					</tr>

						<tr>
					<td>
<label>商品登録した日</label>
</td>
					<td>
						<s:property value="insertdate" />
					</td>
					</tr>

<tr>
					<td>
<label>画像</label>
</td>
					<td>
						<img width="100" height="100" src="<s:property value='image' />">
					</td>



				</tr>

</s:iterator>

</table>
<p>商品情報を変更したい場合は商品名のチェックボックスをクリックしてから変更項目と変更内容を入力し変更ボタンを押してください</p>

<p>変更する項目を選んでください</p>
<select required="required" name="column" >
<option value="">-</option>
<option value="item_name">商品名</option>
<option value="item_price">値段</option>
<option value="item_stock">在庫数</option>
<option value="Category">カテゴリー</option>
<option value="Description">商品説明</option>

</select>

<p>変更内容を入力してください</p>
<input type="text"required="required" name="change" value="" />

<s:submit value="変更"/>

</s:form>


</body>
</html>