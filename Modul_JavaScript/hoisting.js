function hoisting() {
    console.log("Hoisted vars");
    var a = 5;
    console.log("pre: " + a);
    for (var a = 0; a < 10; a++) {
        console.log("in: " + a);
    }
    console.log("post: " + a);
}

function scoped() {
    console.log("Scoped vars");
    let a = 5;
    console.log("pre: " + a);
    for (let a = 0; a < 10; a++) {
        console.log("in: " + a);
    }
    console.log("post: " + a);
}

hoisting();
scoped();