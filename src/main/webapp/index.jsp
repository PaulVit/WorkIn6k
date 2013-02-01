<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <title>JSP</title>
<%!
    public String testAtributeOnNullAndBad(String testAtribute){
        if   (testAtribute == null || testAtribute == "Bad"){
            return "";
        } else{
            return testAtribute;
        }
    }
%>
</head>
<body>

<form name="test" method="get" action="/validate">
    <p><b>Name:</b><br>
        <input type="text" size="40" NAME="name" value=" <%= testAtributeOnNullAndBad((String)request.getAttribute("name")) %> " >
    </p>

    <p><b>Surname:</b><br>
        <input type="text" size="40" NAME="surname" value=" <%= testAtributeOnNullAndBad((String)request.getAttribute("surname")) %> " >
    </p>

    <p><b>E-mail:</b><br>
        <input type="text" size="40" NAME="email" value=" <%= testAtributeOnNullAndBad((String)request.getAttribute("email")) %> " >
    </p>

    <p><b>Password:</b><br>
        <input type="PASSWORD" size="40" NAME="pass"  >
    </p>

    <p><b>Confirm password:</b><br>
        <input type="PASSWORD" size="40" NAME="confirmPass">
    </p>

    <p><b>Birthday:</b><br>
        <input type="text" size="40" NAME="bod" value=" <%= testAtributeOnNullAndBad((String)request.getAttribute("bod")) %> " >
    </p>

    <p><input type="submit" value="Отправить" NAME="submit"></p>

</form>

</body>
</html>