function Incre(){
let count=0;
function innerIncre(){
    count++;
    return count;
}
return innerIncre;
}

const data=Incre();
console.log(data());
console.log(data());

console.log(data());
console.log(data());
console.log(data());
