let promise = new Promise((resolve, reject) => {
  let data = 101;

  if (data == 101) {
    resolve("matches");
  } else {
    reject("error");
  }
});
promise.then((data) => console.log(data)).catch((err) => console.log(err));

