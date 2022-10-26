
package poo.ex3;

public class Ex3 {

    public static void main(String[] args) {
        int a = 125;
        int cresceA = 2;
        int b = 108;
        int cresceB =3;
        
        int ano = 0;
        while (a>b){
            a += cresceA;
            b += cresceB;
            ano++;
        }
        
        System.out.println(ano);
    }
}
