<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Welcome</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Arena | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </h2>

        <%
            Card card1 = new Card("Card 1", "Photo", TypeOfCard.ATTACKER, new Equipment("Sword", "photo", 150, "1"),
                new Equipment("SomeArmor1", "photo", 150, "2"), new Equipment("Shield", "photo", 150, "3"),
                    150, 56000, 16000, 1000, 2000, 2000, 2000, 500, 500, 100);
            Card card2 = new Card("Card 2", "Photo", TypeOfCard.ARMOR, new Equipment("Axe", "photo", 150, "1"),
                new Equipment("SomeArmor2", "photo", 150, "2"), new Equipment("None", "photo", 0, "3"),
                    150, 80000, 13400, 800, 2000, 2000, 1000, 5500, 500, 100);
            Card card3 = new Card("Card 3", "Photo", TypeOfCard.ATTACKER, new Equipment("Sword", "photo", 150, "1"),
                new Equipment("SomeArmor1", "photo", 150, "2"), new Equipment("Shield", "photo", 150, "3"),
                    150, 56000, 16000, 1000, 2000, 2000, 2000, 500, 500, 100);
            Card card4 = new Card("Card 4", "Photo", TypeOfCard.ARMOR, new Equipment("Axe", "photo", 150, "1"),
                new Equipment("SomeArmor2", "photo", 150, "2"), new Equipment("None", "photo", 0, "3"),
                    150, 80000, 13400, 800, 2000, 2000, 1000, 5500, 500, 100);
            Card card5 = new Card("Card 5", "Photo", TypeOfCard.ATTACKER, new Equipment("Sword", "photo", 150, "1"),
                new Equipment("SomeArmor1", "photo", 150, "2"), new Equipment("Shield", "photo", 150, "3"),
                    150, 56000, 16000, 1000, 2000, 2000, 2000, 500, 500, 100);

            List<Card> list = new ArrayList<>();
            list.add(card1);
            list.add(card2);
            list.add(card3);
            list.add(card4);
            list.add(card5);


        %>

    </c:if>

</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>