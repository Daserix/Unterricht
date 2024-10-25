let pattern = /\d+/g;
let text = "testing: 1, 245, 9192, 93109 bla ich 812 422"

function getNumberArr(inputString) {
    let numbers = [];
    for (number of inputString.match(/\d+/g)) {
        numbers.push(parseInt(number))
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

console.log(numberArr)
console.log(summe)
    // console.log("Number Array: " + numberArr);
    // console.log("Summe: " + summe)

// console.log(text.match(pattern))