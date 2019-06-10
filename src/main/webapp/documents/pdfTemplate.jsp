
<jsp:include page="../header.jsp"/>

    <meta charset="UTF-8">
    <title>
    	<%= request.getAttribute("title") %>
    </title>
    <style>
          html, body, iframe
          {
             height:99%;width:99%;
          }
    </style>
</head>
<body>

    <iframe src=${filename} type="application/pdf" width=100% />
    
    
    
</body>
</html>