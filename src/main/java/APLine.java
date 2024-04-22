public class APLine
{
  private int a,b,c;
  public APLine(int a, int b, int c){
    a=a;
    b=b;
    c=c;
  }
  public double getSlope(){
    return (double)-a/b;
  }
  public boolean isOnLine(int x, int y){
    if(a*x+b*x+c=0){
      return true;
    }else{
      return false;
    }
  }
  
}
