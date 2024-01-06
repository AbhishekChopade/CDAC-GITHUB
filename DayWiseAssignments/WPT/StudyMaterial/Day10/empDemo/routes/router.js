const express=require("express");
var router=express.Router();
var connection = require("../db/dbconnection")
router.get("/employees",function(req,resp){
    connection.query("select * from employees",(err,data,fields)=>{
        if(err){
            console.log(err);
            resp.status(500).send("<h3>no data found</h3>")
           }else{
            console.log(data);
            //this will generate ./views/index.ejs
            resp.render("index",{empdata:data});
           }
    })
});

router.get("/displayaddform",function(req,resp){
    resp.render("add-emp")

});

router.post("/addemployee",function(req,resp){
    connection.query("insert into employees values(?,?,?,?)",[req.body.eid,req.body.ename,req.body.city,req.body.salary],(err,result)=>{
        if(err){
            console.log(err);
            resp.status(500).send("<h3>no data found</h3>")
           }else{
            console.log(result);
            resp.redirect("/employees");
           }
    })
});

router.get("/delete/:eno",function(req,resp){
    connection.query("delete from employees where eid=?",[req.params.eno],function(err,result){
        if(err){
            console.log(err);
            resp.status(500).send("<h3>No data found</h3>")
        }else{
            console.log(result);
            resp.redirect("/employees")
        }
    })
})
router.get("/edit/:eno",function(req,resp){
    connection.query("select * from  employees  where eid=?",[req.params.eno],function(err,data){
        if(err){
            console.log(err);
            resp.status(500).send("<h3>No data found</h3>")
        }else{
            console.log(data);
            resp.render("edit-emp",{emp:data[0]})
        }
    })
})
router.post("/updateemployee",function(req,resp){
    connection.query("update employees set ename=?,city=?,salary=? where eid=?",[req.body.ename,req.body.city,req.body.salary,req.body.eid],function(err,result){
        if(err){
            console.log(err);
            resp.status(500).send("<h3>No data found</h3>")
        }else{
            console.log(result);
            resp.redirect("/employees");
        }
    })
})

// router.get("/edit/:enum",function(req,resp){
//     connection.query("select * from employees where eid=?",[req.params.enum],function(err,data){
//         if(err){
//             console.log(err);
//             resp.status(500).send("<h3>no data found</h3>")
//            }else{
            
//             console.log(data);
//             resp.render("edit-emp",{prod:data[0]})
//            }
//     })

// })
// router.post("/updateemployee",function(req,resp){
//     connection.query("update employees set ename=?,city=?,salary=? where eid=?",[req.body.ename,req.body.city,req.body.salary,req.body.eid],function(err,result){
//         if(err){
//             console.log(err);
//             resp.status(500).send("<h3>no data updated</h3>")
//            }else{
//             console.log(result);
//             resp.redirect("/employees");
//            }

//     })

// })
module.exports=router;