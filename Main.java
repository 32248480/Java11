interface iAaa{
 public void show();
}

class Cbbb{
 public int num=10;

public void set(int n){
 num=n;
}
}

class Cccc extends Cbbb implements iAaa{
public void show(){
 System.out.println("num="+num);
}
}

public class Main{
public static void main(String args[]){
 Cccc cc=new Cccc();
 cc.set(5);
 cc.show(); // ¦L¥X num=5
}
}

//num=5