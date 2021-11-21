//(a),
interface iVolume{
 public void showData(); // 顯示球體的資料
 public double vol(); // 計算球體積
}
abstract class CSphere implements iVolume{
 final double PI=3.14;
 protected int x;
 protected int y;
}
class CCircle extends CSphere{
 protected int radius;

public CCircle(int a,int b,int r){
 x=a;
 y=b;
 radius=r;
}
public void showData(){
 System.out.println("球心:("+x+","+y+")");
 System.out.println("半徑:"+radius);
 System.out.println("球體積:"+vol());
}
public double vol(){
 return ((4.0/3)*PI*radius*radius*radius);
}
}

public class Main{
public static void main(String args[]){
 CCircle cir=new CCircle(8,6,2);
 cir.showData();
}
}

//球心:(8,6)
//半徑:2
//球體積:33.49333333333333

//(b),
//因為CCircle類別繼承了抽象類別CSphere,必須要改寫CSphere類別裡的method,雖然CSphere抽象類別並沒有實作介面iVolume,但透過CCircle類別的改寫動作,可以替父類別CSphere完成了實作。

//(c),
interface iVolume{
 public void showData(); // 顯示球體的資料
 public double vol(); // 計算球體積
}
abstract class CSphere implements iVolume{
 final double PI=3.14;
 protected int x;
 protected int y;
 protected int radius; // radius必須放到CCircle的父類別裡

public void showData(){
 System.out.println("球心:("+x+","+y+")");
 System.out.println("半徑:"+radius);
 System.out.println("球體積:"+vol());
}
public double vol(){
 return ((4.0/3)*PI*radius*radius*radius);
}
}
class CCircle extends CSphere{
public CCircle(int a,int b,int r){
 x=a;
 y=b;
 radius = r;
}
}

public class Main{
public static void main(String args[]){
 CCircle cir=new CCircle(8,6,2);
 cir.showData();
}
}
//球心:(8,6)
//半徑:2
//球體積:33.49333333333333
