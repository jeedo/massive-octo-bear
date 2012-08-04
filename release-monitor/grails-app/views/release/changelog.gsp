<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="main"/>
<title>Changelog</title>
</head>
<body>
  <div class="body">
  <table>
  <thead>
  <tr><th>Id</th><th>Release Id</th>  <th>Compnent</th> <th>Date</th><th>Env</th></tr>
  
  </thead>
  <tbody>
    <g:each status="i" in="${releaseList}" var="item">
      <tr>
        <td>${item.id?.encodeAsHTML() }</td>
        <td>${item.buildId?.encodeAsHTML() }</td>
        <td>${item.component?.encodeAsHTML() }</td>
        <td>${item.logDate?.encodeAsHTML() }</td>
        <td>${item.env?.encodeAsHTML() }
      </tr>
    </g:each>
  </tbody>
  </table>
  </div>
</body>
</html>