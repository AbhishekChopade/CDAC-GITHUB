function getMax(){
    var num1 = document.getElementById("num1").Value;
    var num2 = document.getElementById("num2").Value;
    var num3 = document.getElementById("num3").Value;

    var max=0;

    if(num1>num2 && num1>num3){
        max=num1;
    }
    else if(num2>num3){
        max=num2;
    }
    else{
        max=num3;
    }

    document.getElementById("result").innerHTML = max;
    alert(max)
}



var printMsg= ()=>{
    var num = Number(document.getElementById("num").value)
    var msg = document.getElementById("msg").value
    var str = "" ;
    for(let i=0;i<num;i++){
        console.log(i + "in loop")
        alert(msg)
        str += "<br/>" + msg + "<br/>";
    }
   

    document.getElementById("mydiv").innerHTML=  str
}


function listEven(num){
    //var arr = [1,23,33,56,22]
    num = Number(document.getElementById("num").value)
    var str="<ul>"
    for(let i=1;i<num;i++){
        if(i%2==0){
            str+="<li>"+i+"</li>"+"</br>";

        }

    }
    str+="</ul>";
    document.getElementById("mydiv").innerHTML="List of even numbers :"
    document.getElementById("mydiv1").innerHTML=  str

}

var operations = (num1,num2)=>{
    
}