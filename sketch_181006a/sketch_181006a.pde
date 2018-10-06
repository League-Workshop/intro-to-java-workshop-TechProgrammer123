void setup() {
  size(1000, 1000);
  fill(#F2113E);
  ellipse(500, 500, 500, 500);
  rect(250, 250, 250, 250);
  triangle(100, 50, 1000, 1500, 2000, 3000);
}
void draw() {
 fill(#07F2EC);
  if (mousePressed==true) {
fill(random(255), random(255), random(255));
  } ellipse(500, 500, 500, 500);
   triangle(100, 50, 1000, 1500, 2000, 3000);
   rect(250, 250, 250, 250);
}