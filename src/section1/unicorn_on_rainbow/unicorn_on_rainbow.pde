PImage rainbow;
PImage unicorn;
void setup(){
 unicorn = loadImage("not my friend.jpeg");
   rainbow = loadImage("friend.jpeg");
     size(800,600);
     rainbow.resize(800,600);
  background(rainbow);
  
}
void draw(){  
  image(unicorn, 400, 300);
}
  
  
