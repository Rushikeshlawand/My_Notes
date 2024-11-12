var json={
    "name":"Rushi",
    "Age":24,
    "obj":{
        hobbies:"cricket",
        like:"driving"
    }
}
console.log(json);

//convert obj to json
var obj={
    name:"rushi",
    age:24
}
const data=JSON.stringify(obj)
console.log(data,typeof(obj));

var json=`{
"name":"rushi,
"rollNumber":23
}`

const data2=JSON.parse(json)
console.log(data2);