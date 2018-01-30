<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>発送状態変更画面</title>
</head>
<body>

<s:form action="ChangeSituationAction">
<s:iterator value="UserBuyList">

<table>




<tr>

					<td>
<p><input type="image" src="<s:property value='image' />" alt="送信する"width="100" height="100" ></p>
					</td>
				</tr>

<tr>



					<td>


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

発送状況:<s:property value="situation" />
					</td>
					</tr>

							<tr>
			<td>

購入者:<s:property value="UserName" />
					</td>
					</tr>

									<tr>
			<td>

購入日:<s:property value="BuyDate" />
					</td>
					</tr>

												<tr>
			<td>
			<input type="hidden" name="id" value="<s:property value="id" />" />
					<s:property value="id" />id
					</td>
					</tr>



<tr>
			<td>
<p>発送状況変更したい場合発送状況を選んで変更ボタンを押してください。</p>
<select required="required" name="situation" >
<option value="未発送">未発送</option>
<option value="発送中">発送中</option>
<option value="発送済み">発送済み</option>
<option value="受け取り完了">受け取り完了</option>
</select>

</td>
					</tr>





<s:submit value="発送済みに変更"/>
</table>
</s:iterator>



</s:form>



</body>
</html>