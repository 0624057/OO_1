# 2019/11/19

## zuvio_hw

請新增一個CShape的子類別CTriangle，

其constructor 共有三個double的參數 a,b,c (為直角三角形的三個邊長)，

其面積為0.5*a*b，

請寫出CTriangle的類別程式與產生其物件的main 程式(顏色為紅色，a=3, b=4, c=5) 

程式碼請放在個人的github 

答案請列出其連結

ˋˋˋjava

abstract class CShape

{

  protected String color;
  
  public void setColor(String str)
  
  {
  
    color=str;
    
  }
  
  public abstract void show();
  
}



class CTriangle extends CShape

{

  protected double length,width,height;
  
  public CTriangle (double a,double b,double c)
  
  {
  
  length=a;
  
  height=b;
  
  width=c;
  
  }
  
  public void show() {
  
        System.out.println("color="+color);
        
        System.out.println("area="+length*height*0.5);
        
    }
    
}



public class finallyresult

{

  public static void main(String args[])
  
  {
  
    CTriangle rect=new CTriangle(3,4,5);
    
    rect.setColor("Red");
    
    
    rect.show();
    
  }
  
}

ˋˋˋ
