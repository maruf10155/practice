const s = function (p) {
    p.setup = function () {
        p.createCanvas(700, 400);
    };
    let x = 0;
    let y = 0;
    let m = 100;
    p.draw = function () {
        p.background(255);
        p.translate(100, p.height / 2);
        p.strokeWeight(1);
        p.line(-p.width, 0, p.width, 0)
        p.line(0, -p.width, 0, p.width);
        p.strokeWeight(10);
        for(var x = -1;x < 6;x = x + .1){
            y = p.sin(x);
            p.point(m * x, -m * y);
        }
    };
};
const a = function (p) {
    p.setup = function () {
        p.createCanvas(700, 400);
    };

    let x = 0;
    let y = 0;
    let m = 100;
    p.draw = function () {
        p.background(255);
        p.translate(100, p.height / 2);
        p.strokeWeight(1);
        p.line(-p.width, 0, p.width, 0)
        p.line(0, -p.width, 0, p.width);
        p.strokeWeight(10);
        for(var x = -1;x < 6;x = x + 1){
            y = p.cos(x);
            p.point(m * x, -m * y);
        }
    };
};
new p5(s)
new p5(a)
