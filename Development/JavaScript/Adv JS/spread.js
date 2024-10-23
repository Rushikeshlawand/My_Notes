let arr1 = [1, 2, 3];
let arr2 = [7, 8, 9];

let combineArr = [...arr1, ...arr2];
console.log(combineArr);

//Obj destructuring 
let obj1 = {
  fName: "rushi",
};
let obj2 = {
  sName: "lawand",
};
let combineObj = { ...obj1, ...obj2 };
console.log(combineObj);
