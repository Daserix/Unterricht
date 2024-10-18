function getNumberArr(inputString) {
  let lastIntStart = NaN;
  let lastInt = NaN;
  let numbers = [];
  let idx = 0;
  for (char of inputString) {
    if (!isNaN(parseInt(char))) {
      if (lastInt + 1 !== idx) {
        lastIntStart = idx;
      }
      lastInt = idx;
      if (idx+1 === inputString.length) {
        numbers.push(parseInt(inputString.slice(lastIntStart, idx+1)));
      }
    } else {
      if (lastInt + 1 === idx) {
        numbers.push(parseInt(inputString.slice(lastIntStart, idx)));
      }
    }
    idx++;
  }
  return numbers;
}

function getArrSum(inputArray) {
    let sum = 0;
    for (num of inputArray) {
        sum += num;
    }
    return sum
}
let stringToCount = "asudhaus8128hdsua8727h91hus12 Hallo 39"

numberArr = getNumberArr(stringToCount)
summe = getArrSum(numberArr)

console.log("Number Array: " + numberArr);
console.log("Summe: " + summe)