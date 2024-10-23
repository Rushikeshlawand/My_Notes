function sum(...num) {
  let sum = 0;
  for (let i = 0; i < num.length; i++) {
    sum = sum + num[i];
  }
  return sum;
}
console.log(sum(5, 4));
console.log(sum(5, 4, 3, 2, 1));
console.log(sum(5, 12345678, 4));

const [one, two, ...data] = [1, 2, 3, 4, 5, 6];
console.log(one);
console.log(two);
console.log(data);

//Obj
const { fName, sName, ...otherName } = {
  fName: "Rushikesh",
  sName: "Lawand",
  age: "24",
  salary: "32000",
};
console.log(fName);
console.log(sName);
console.log(otherName);
