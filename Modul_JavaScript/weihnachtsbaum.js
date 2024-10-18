class Weihnachtsbaum {
    constructor(height) {
        if (height > 1) {
            this.height = height;
        } else {
            console.log("Tree has to have a height of at least 2. Changed height to 2.")
            this.height = 2;
        }
    }

    aufstellen() {
        let staender = "_|_"
        let tree = []
        for (let i = 0; i < this.height; i++) {
            let spaces = " ".repeat(this.height - i - 1)
            let twigs = "*".repeat(i * 2 + 1)
            tree.push(spaces + twigs)
        }
        return `${tree.join("\n")}\n${" ".repeat(this.height - 2) + staender}`;
    }
}

let wb = new Weihnachtsbaum(5);
console.log(wb.aufstellen());