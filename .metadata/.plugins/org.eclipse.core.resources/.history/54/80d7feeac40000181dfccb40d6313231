<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>購入商品登録</title>
</head>
<body>
<table>
<s:form action="ItemCreateCompleteAction" enctype="multipart/form-data"  >

<tr>
					<td>
						<label>商品名:</label>
					</td>
					<td>
						<input type="text" required="required" name="itemName" />
					</td>
				</tr>
				<tr>
					<td>
						<label>価格:</label>
					</td>
					<td>
						<input type="text" required="required" name="itemPrice"  />
					</td>
				</tr>
				<tr>
					<td>
						<label>個数:</label>
					</td>
					<td>
						<input type="text"required="required" name="itemStock"  />
					</td>
				</tr>

				  <tr>
                <td>画像: </td>
                <td><input type="file" name="image" accept="image/jpeg/png"/></td>
            </tr>

				<tr>
					<td>
						<label>カテゴリー:</label>
					</td>
					<td>
						<input type="text"required="required" name="category"  />
					</td>
				</tr>

				<tr>
					<td>
						<label>商品説明:</label>
					</td>
					<td>
						<input type="text" required="required" name="description"  />
					</td>
				</tr>



				<s:submit value="登録"/>


</s:form>
</table>

<h3>テストアップローダー</h3>

<table>
<s:form action="imageUploadAction"  enctype="multipart/form-data">
		<input type="text" name="name" >

		<input type="file" name="image" accept="image/jpeg/png"/>
		<s:submit name="sumbit" value="アップロード" />
	</s:form>
	</table>








</body>
</html>