<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>購入履歴</title>
</head>
<body>
<p>購入履歴</p>


<s:iterator value="BuyHistoryList">
<form action="GoUserReviwAction">
<table>



<tr>

					<td>
<p><input type="image" src="<s:property value='image' />" alt="送信する"width="100" height="100" ></p>
					</td>
				</tr>

<tr>



					<td>

<input type="hidden" name="itemName" value="<s:property value="itemName" />" />
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

					<s:property value="stock" />個
					</td>
					</tr>

										<tr>
			<td>

					<s:property value="totalPrice" />円
					</td>
					</tr>

							<tr>
			<td>



支払い方法:<s:property value="pay" />
					</td>
					</tr>

							<tr>
			<td>


<input type="hidden" name="situation" value="<s:property value="situation" />" />
発送状況:<s:property value="situation" />
					</td>
					</tr>

									<tr>
			<td>
		<input type="hidden" name="BuyDate" value="<s:property value="BuyDate" />" />
購入日:<s:property value="BuyDate" />日
					</td>

			</tr>

			<s:submit value="レビュー"/>

			</table>
			</form>
</s:iterator>



<p>mypageに移動する<a href='<s:url action="GoMypageAction" />'>こちら</a></p>





</body>
</html>