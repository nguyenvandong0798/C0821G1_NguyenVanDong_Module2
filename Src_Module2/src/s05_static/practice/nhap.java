package s05_static.practice;

public class nhap {
    public static int id = 1000;
    public int inf;

    public nhap(){
        this.inf = id++;
    }
    public int getInf(){
        return this.inf;
    }
    public int setinf(int id){
        return this.id = id;
    }

    public static void main(String[] args) {
        nhap s1 = new nhap();
        nhap s2 = new nhap();
        nhap s3 = new nhap();
        System.out.println("s1 id:" + s1.getInf());
        System.out.println("s2 id:" + s2.getInf());
        System.out.println("s3 id:" + s3.getInf());
    }

}
