package shapes;


public class ClassPoint implements Point{
  
    float x;
    float y;
    
    public ClassPoint(float x,float y){
        
        this.x = x;
        this.y = y;
   
    }
    
    final public float getX(){
    
    return x;
    }
    
    final public float getY(){
    
    return y;
    }
}

