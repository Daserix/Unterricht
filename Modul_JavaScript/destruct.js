// let points = [{x: 1, y: 2}, {x: 3, y: 4}];
// let [{x: x1, y: y1}, {x: x2, y: y2}] = points;
// console.log(x1 === 1 && y1 === 2 && x2 === 3 && y2 === 4)

// entspricht folgendem:

// let points = [{ x: 1, y: 2 }, { x: 3, y: 4 }];
// let x1 = points[0]["x"];
// let y1 = points[0]["y"];
// let x2 = points[1]["x"];
// let y2 = points[1]["y"];
// console.log(x1 === 1 && y1 === 2 && x2 === 3 && y2 === 4)


// let points = { p1: [1,2], p2: [3,4] };
// let { p1: [x1, y1], p2: [x2, y2] } = points;
// console.log(x1 === 1 && y1 === 2 && x2 === 3 && y2 === 4)

// entspricht folgendem:

let points = { p1: [1, 2], p2: [3, 4] };
let x1 = points["p1"][0];
let y1 = points["p1"][1];
let x2 = points["p2"][0];
let y2 = poinst["p2"][1];
console.log(x1 === 1 && y1 === 2 && x2 === 3 && y2 === 4)