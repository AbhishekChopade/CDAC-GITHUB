//import all libraries
const express = require("express");
const app = express();
const bodyParser = require("body-parser");
const path = require("path");
var routes = require("./routes/router");

app.set("views",path.join(__dirname,"views"));
app.set("view engine","ejs");


app.use(bodyParser.urlencoded({extended:false}));

app.use("/",routes);

app.listen(9090,function(){
    console.log("Server listening at 9090");
})

module.exports = app;