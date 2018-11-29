var mysql      = require('mysql');
var express    = require('express');
var bodyParser = require('body-parser');


var app = express();

app.use(bodyParser.json());

var connection = mysql.createConnection({
host     : '127.0.0.1',
port	 : '3307',
user     : 'root',
password : 'letmein',
database : 'test'
});

connection.connect();


app.get('/', function(req, res) {
	res.json({"msg": "Application is ready"});
});

app.post('/postData', function(req, res) {
	console.log("req.body: ", req.body);
	connection.query("INSERT into test values('"+req.body.name+"', '"+req.body.email+"')", function(err, rows) {
		if (!err)
		 res.json({
			"msg": "Inserrted Successfully",
			"rows": rows
		});
		else
		 res.json({"msg": 'Error while performing Query.'});
	});
});

app.get('/getData', function(req, res) {
	
	connection.query('SELECT * from test', function(err, rows, fields) {
	if (!err)
	 res.json({
		"msg": "Get Data Query",
		"rows": rows
	});
	else
	 res.json({"msg": 'Error while performing Query.'});
	});
});


app.listen(8080, function(req, res) {
	console.log("Application is running at 8080");
});

//connection.end();
