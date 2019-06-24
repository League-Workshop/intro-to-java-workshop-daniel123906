void setup(){
      size(800,600);
      background(0,100,0);
}
void draw(){
  if(mousePressed){
      fill(random(256),random(256),random(246));
  }    
    else{
fill(random(50),0,0);
    }
   
   ellipse(mouseX,mouseY,100,200);


}

        
