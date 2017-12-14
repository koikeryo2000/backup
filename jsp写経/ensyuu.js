function ensyu(hankei){
    return hankei*hankei*3.14;
}

document.write(ensyu(5)+"<br>");
document.write(ensyu(7)+"<br>");
document.write(ensyu(10)+"<br>");

function park(adult,child){
    return adult*500+child*200;
}



for(var i=1;i<=5;i++){
   document.write("★");
}
document.write("<br>");

for(var i=1;i<=2;i++){
    
    for(var a=1;a<=3; a++){
        document.write("★");
    }
    document.write("<br>");
}

for(var i=1;i<=2;i++){
    for(var a=1;a<=5; a++){
        document.write("☆");
    }
    document.write("<br>");
}

for(var i=1;i<=5;i++){
    for(var a=1;a<=5; a++){
        document.write("★");
    }
    document.write("<br>");
}

for(var i=1;i<=4;i++){
    for(var a=1;a<=3; a++){
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br>");

for(var i=1;i<=3;i++){
    for(var a=1;a<=3; a++){
        if(a%2 ==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}
document.write("<br>");
for(var i=1;i<=5;i++){
    for(var a=1;a<=5; a++){
        if(a%2 ==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}

for(var i=0;i<5; i++){
    for(var y =0;y<=i; y++){
        document.write("★");
    }
    document.write("<br>");
}