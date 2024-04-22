public class APLine
{
  private int a,b,c;
  public APLine(int a1, int b2, int c3){
    a=a1;
    b=b2;
    c=c3;
  }
  public double getSlope(){
    return -(double)a/b;
  }
  public boolean isOnLine(int x, int y){
    if(a*x+b*x+c==0){
      return true;
    }else{
      return false;
    }
  }
  
}
