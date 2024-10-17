function isPrime(num) {
  if (num <= 1) {
    return false; 
  }
  
  if (num === 2) {
    return true; 
  }

  if (num % 2 === 0) {
    return false; 
  }

  for (var i = 3; i * i <= num; i += 2) {
    if (num % i === 0) {
      return false; // A divisor was found, hence it's not prime
    }
  }

  return true; // No divisors were found, hence it is prime
}

// Testing the function
let num = isPrime(7);
console.log(num); // true
