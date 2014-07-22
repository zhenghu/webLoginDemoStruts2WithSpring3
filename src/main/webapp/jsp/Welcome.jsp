<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-richtext-tags" %>

<link href="jsp/resources/style_edf.css" rel="stylesheet"
      type="text/css" />


<html>
<head>
    <title>Welcome</title>
</head>

<body>
    <h2>Welcome <s:property value="username" /> to web login demo!</h2>
    <s:form action="welcome" method="post">
       <s:textfield name="information" key="Information" />
       <sj:ckeditor value="ckeditor richtext editor" cols="80" rows="10" width="200" />
       <s:submit value="add" method="add" align="center"/>
    </s:form>
</body>
</html>
