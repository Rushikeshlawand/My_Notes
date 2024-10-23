let promise = new Promise((resolve, reject) => {
  let data = 101;

  if (data == 101) {
    resolve("matches");
  } else {
    reject("error");
  }
});
promise.then((data) => console.log(data)).catch((err) => console.log(err));





// API DATA ON WEB PAGE

fetch("https://jsonplaceholder.typicode.com/todos/")
  .then((data) => data.json())
  .then((data) => console.log(data))
  .catch((error) => console.log(error));

var apiData = [];
var paraEle = document.getElementById("one");
function API_Call() {
  fetch("https://jsonplaceholder.typicode.com/todos/")
    .then((data) => data.json())
    .then((data) => (apiData = data))
    .then(() => {
      Display();
    })
    .catch((err = console.log(err)));
}
function Display() {
  apiData.map((ele) => {
    let pData = document.createElement("p");
    paraEle.appendChild(pData);
    return (pData.innerHTML = ele.userId + " " + ele.title);
  });
}
