
package poo.ex1;

public class Ex1 {

    public static void main(String[] args) {
        
        int i = (int) (Math.random() *200 +1);
        boolean p = true;
        
        for (int j = 2; j < (i/2); j++){
            if((i%j) == 0){
                System.out.println("O número " + i + " não é primo! E pode ser divido por: " + j);
                p = false;
                break;
            }
        }
        if(p){
            System.out.println("O número: " + i + " é primo!");
        }
    }
}
