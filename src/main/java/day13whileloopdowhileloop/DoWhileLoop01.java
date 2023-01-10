package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //1 while-loop
        int i =1;  //baslangic degeri
                                       //while loop önce düsünür sonra karar verir
        while (i<1){ //sart
            System.out.println("sen bir whileloop sun");  //1 while body hic calismadi
                                                          //2 while loop da zero execution mumkundur

            i++;  //artirma azaltma
        }
        //"doWhileLoop     dusunmeden calisir
        int k = 1;
        do{

            System.out.println("sen bir dowhileloop sun"); //do while calisti
                                                             // do while kullandiginiz da loop body si en az bir kez calisir
                                                             //do while loop da zero execution mumkundur
            k++;
        }while (k<1);



    }
}
