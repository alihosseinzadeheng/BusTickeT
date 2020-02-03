function page_load()
{
    document.write("HEllo")
}
function txt1_keyup(e) {

document.getElementById('counter').innerHTML=eval(document.getElementById('counter').innerHTML)+1
}
function loadStudents() {

    var myLink = document.getElementById('mylink');
        var script = document.createElement("script");
        script.type = "text/javascript";
        script.src = "Public/Scripts/filename.js.";
        document.getElementsByTagName("head")[0].appendChild(script);
        return false;

    tableBody.innerHTML = rows;
}
function choose(){
    var rowIndex = document.getElementById('row-id').innerHTML;
    alert(rowIndex);
}