<html>
<head>

	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function() {
			doJsonStuff();
		});
		
		function doJsonStuff() {
		    $.getJSON("/SpringMVCBasic/getjson", function() {
		    	 console.log( "success" );
		    })
		    .done(function() {
		    	console.log( "second success" );
		    })
		    .fail(function() {
		    	console.log( "error" );
		    })
		    .always(function() {
		    	console.log( "complete" );
		    });
		}
	</script>





</head>
<body>
<h2>Hello World! Bruce was here!</h2>

<h3 id="name"></h3>
<h3 id="age"></h3>

</body>
</html>
