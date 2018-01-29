<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>購入ページ</title>
</head>
<body>
<s:form action="BuyProductAction">
<s:iterator value="BuyList">


<tr>

					<td>
<p><input type="image" src="<s:property value='image' />" alt="送信する"width="100" height="100" ></p>
					</td>
				</tr>

<tr>



					<td>

<input type="hidden" name="Name" value="<s:property value="itemName" />" />
						<s:property value="ProductName" />



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







</s:iterator>


<s:submit value="購入する"/>
</s:form>


<s:iterator value="BuyList">
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
						<s:property value="Name" />



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

</body>
</html>