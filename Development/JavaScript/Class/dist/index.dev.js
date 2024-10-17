"use strict";

var car = {
  name: "toyota",
  model: "fortuner",
  year: 2015,
  colour: "red",
  fullname: function fullname() {
    console.log(this.name + " " + this.model);
  }
};
console.log(car);