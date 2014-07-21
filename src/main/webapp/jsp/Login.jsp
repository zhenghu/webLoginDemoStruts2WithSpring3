<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="html" uri="/struts-tags"%>

<link href="jsp/resources/style_edf.css" rel="stylesheet"
	type="text/css" />

<html>
<head>
<title>EDF bff packaging - Login</title>
</head>

<body
	style="background-image: url('jsp/resources/login_background.png');">
	<html:form action="login" method="post">

		<table>
			<tr>
				<img src="jsp/resources/logo_edf.jpg" width="78" height="82"
					align="left" alt="">
			</tr>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
		</table>


		<h2>EDF bff packaging Application</h2>
		<br>
		<div>
			<table class="table_attribute">
				<tbody>
			        <tr><html:actionerror /><tr>
					<tr>
						<html:textfield name="username" key="label.username" />
					</tr>
					<tr>
						<html:password name="password" key="label.password" />
					</tr>
				</tbody>
			</table>
		</div>
		<div class="button_center">
			&nbsp;
			<html:submit method="execute" key="label.login" align="center" />
		</div>
	</html:form>
</body>
</html>
