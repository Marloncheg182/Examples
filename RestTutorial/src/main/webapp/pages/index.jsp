<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Testing of REST service methods</title>
</head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
  var prefix = '/myhome-rest/testservice';
  var RestGet = function(){
    $.ajax({
      type: 'GET',
      url: prefix + '/' + Date.now(),
      dataType: 'json',
      async: true,
      success: function(result){
        alert('Time: ' + result.time + ', message: ' + result.message);
      },
      error: function(jqXHR, textStatus, errorThrown){
        alert(jqXHR.status + ' ' + jqXHR.responseText);
      }
    });
  }
  var RestPut = function(){
    var JSONObject = {'time': Date.now(), 'message': "Example of PUT call"};
    $.ajax({
      type: 'PUT',
      url:  prefix,
      contentType: 'application/json; charset=utf-8',
      data: JSON.stringify(JSONObject),
      dataType: 'json',
      async: true,
      success: function(result) {
        alert('Time: ' + result.time + ', message: ' + result.message);
      },
      error: function(jqXHR, textStatus, errorThrown) {
        alert(jqXHR.status + ' ' + jqXHR.responseText);
      }
    });
  }

  var RestPost = function() {
    $.ajax({
      type: 'POST',
      url:  prefix,
      dataType: 'json',
      async: true,
      success: function(result) {
        alert('Time: ' + result.time
                + ', message: ' + result.message);
      },
      error: function(jqXHR, textStatus, errorThrown) {
        alert(jqXHR.status + ' ' + jqXHR.responseText);
      }
    });
  }
  var RestDelete = function() {
    $.ajax({
      type: 'DELETE',
      url:  prefix + '/' + Date.now(),
      dataType: 'json',
      async: true,
      success: function(result) {
        alert('Time: ' + result.time
                + ', message: ' + result.message);
      },
      error: function(jqXHR, textStatus, errorThrown) {
        alert(jqXHR.status + ' ' + jqXHR.responseText);
      }
    });
  }
</script>
<body>
<h3> An example of using the REST with Ajax</h3>
<button type="button" onclick="RestGet()">Method GET</button>
<button type="button" onclick="RestPost()">Method POST</button>
<button type="button" onclick="RestDelete()">Method DELETE</button>
<button type="button" onclick="RestPut()">Method PUT</button>
</body>
</html>
