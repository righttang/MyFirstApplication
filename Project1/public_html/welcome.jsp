<html>
  <head>
    <title>Security login example</title>
  </head>

   <body> 
   <blockquote>
  <img src=BEA_Button_Final_web.gif align=right>
  <h1> Security Login Example </h1>
   <p> Welcome <%= request.getRemoteUser() %>! 
   <p> If you are an administrator, you can configure the background 
  color of the Web Application. 
  <br> <b><a href="admin/edit.jsp">Configure background</a></b>.
   <% if (request.getRemoteUser() != null) { %>
    <p> Click here to <a href="logout.jsp">logout</a>. 
  <% } %>    
   </blockquote>
  </body>
</html>