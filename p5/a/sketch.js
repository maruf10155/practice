function setup() {
    createCanvas(650, 850);

}
let t = 0;
let n=60;
function draw() {
    let q=300;
    translate(width/2,height/2);
    background(0, 255, 255);
    fill(255,0,0);
    strokeWeight(1);
    ellipse(0, 0,2*q,2*q);
    for (let i=0;i<2*PI;i=i+PI/n){
        line(q*cos(i),q*sin(i),0,0);
    }
    strokeWeight(20);
    let x = q*cos(t);
    let y = -q*sin(t);

    point(x,y);
    // point(x*cos(0),y*sin(0));
    // point(x*cos(0),x*sin(0));
    // point(q*cos(t-PI/4)*cos(PI/4),-q*cos(t-PI/4)*sin(PI/4));
    for (let i=0;i<n;i++){
        point(q*cos(t-i*PI/n)*cos(i*PI/n),-q*cos(t-i*PI/n)*sin(i*PI/n));

    }

    t = t + 0.01;
}