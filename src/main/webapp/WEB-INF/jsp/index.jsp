<html>
<head>

	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	
	<script type="text/javascript">
		$(document).ready(function() {
			//doJsonStuff();
			doJsonStuff2("Moose", 8);
			doJsonStuff3();
		});
		
		function doJsonStuff() {
		    $.getJSON("/SpringMVCBasic/getjson", function(data) {
		    	 console.log( "success" );
				$('#name').text(data.name);
				$('#age').text(data.age);
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


		function doJsonStuff2(name, age) {
			url = "/SpringMVCBasic/getjson2?name=" + name + "&age=" + age; 
			console.log("Calling url: " + url);

			
		    $.getJSON(url, function(data) {
		    	 console.log("success! name: " + data.name + ", age:" + data.age);
				$('#name').text(data.name);
				$('#age').text(data.age);
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


		function doJsonStuff3() {
			url = "/SpringMVCBasic/getjson3"; 
			console.log("Calling url: " + url);

			
		    $.getJSON(url, function(data) {
		    	 console.log("success!");

				for(var i = 0; i < data.length; i++) {
					$('#nameAge > tbody:last').append('<tr><td>' + data[i].name + '</td><td>' + data[i].age  + '</td></tr>');
				}

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

<h3 id="name">name</h3>
<h3 id="age">age</h3>

<table id="nameAge">
	<thead>
		<tr>
			<th>NAME</th><th>AGE</th>
		</tr>
	</thead>
	<tbody>
	
	
	</tbody>

</table>

</body>
</html>
