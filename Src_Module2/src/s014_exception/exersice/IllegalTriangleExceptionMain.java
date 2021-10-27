package s014_exception.exersice;

import java.util.Scanner;
class IllegalTriangleExceptionMain{
    public static void main(String[]args){
        int x =0;
        int y =0;
        int z =0;
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("Hãy nhập x: ");
            x=scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            y=scanner.nextInt();
            System.out.println("Hãy nhập z: ");
            z=scanner.nextInt();
            if(x+y<z ||x+z<y ||z+y<x){
                throw new IllegalTriangleException("not rectangle");
            }
        }catch(IllegalTriangleException e){
            System.err.println("giá trị chưa đúng: ");
        }
        finally {
            System.out.println("x " + x +  ", y " + y +  ", z " + z);
        }
    }
}

