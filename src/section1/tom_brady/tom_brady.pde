PImage mustache;
PImage friend;
void setup(){ 
  friend = loadImage("tom brady.jpeg");
  mustache = loadImage("mustache #2.png");

   size(800, 800);
  friend.resize(800,800);
}


void draw(){background(friend);
if(mousePressed){
   image(mustache,mouseX, mouseY, 500,100);
}}
