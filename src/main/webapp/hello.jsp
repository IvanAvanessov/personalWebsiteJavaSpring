<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    Hello 
    
    <%
    double num = Math.random();
    if (num > 0.95) {
  %>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
  <%
    } else {
  %>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
  <%
    }
  %>
  <%
  	for (int i = 0; i < 30; i ++){
  		%> <li> <a href = ""> item <%= i %> </a>
  		<% } %>

  <p><%= request.getLocalAddr() %></p>
  <p><%= request.getLocalName() %></p>
  <p><%= request.getParameterMap().toString() %></p>
  <p><%= request.getLocalAddr() %></p>
  <p><%= request.getLocalAddr() %></p>
  
</body>
</html>