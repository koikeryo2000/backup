<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>カート</title>
</head>
<body>






<s:iterator value="cartList">
<s:form action="DeleteCartAction">
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
					<s:property value="price" />円

					</td>
					</tr>

								<tr>
			<td>
			<input type="hidden" name="stock" value="<s:property value="stock" />" />
					<s:property value="stock" />個
					</td>
					</tr>

										<tr>
			<td>
			<input type="hidden" name="Producttotal" value="<s:property value="Producttotal" />" />
					<s:property value="Producttotal" />円
					</td>
					</tr>

							<tr>
			<td>



<input type="hidden" name="id" value="<s:property value="id" />" />
					</td>
					</tr>


<s:submit value="カートから削除する"/>




</table>
</s:form>
</s:iterator>




合計<s:property value="#session.Usertotal" />円です

<s:form action="AllDeleteShoppingCartAction">
<s:submit value="カートの中身をすべて削除する"/>
</s:form>

<s:form action="BuyProductAction">
<s:iterator value="cartList">


<input type="hidden" name="Name" value="<s:property value="itemName" />" />
<input type="hidden" name="price" value="<s:property value="price" />" />
<input type="hidden" name="stock" value="<s:property value="stock" />" />
<input type="hidden" name="image" value="<s:property value="image" />" />
<input type="hidden" name="Producttotal" value="<s:property value="Producttotal" />" />
<input type="hidden" name="Usertotal" value="<s:property value="#session.Usertotal" />" />
<input type="hidden" name="Productid" value="<s:property value="id" />" />





</s:iterator>


<s:submit value="購入する"/>
</s:form>

<p>管理者ページに移動する<a href='<s:url action="GoShoppingAction" />'>商品一覧に戻る</a></p>

</body>
</html>