package practice.practiceDTNT;

public class InterwiewSorusuC02_TestKeyWordsMDA {
    public static void main(String[] args) {


//Interwiew Sorusu
//Ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
//10 sorumuz var
//ogrencilerin cevaplari
char[][] answers = {
{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
{'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

 // cevap anahtari
char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

/*output:
1 nolu ogrencinin dogru cevap sayisi :7
2 nolu ogrencinin dogru cevap sayisi :6
3 nolu ogrencinin dogru cevap sayisi :5
4 nolu ogrencinin dogru cevap sayisi :4
5 nolu ogrencinin dogru cevap sayisi :8
6 nolu ogrencinin dogru cevap sayisi :7
7 nolu ogrencinin dogru cevap sayisi :7
8 nolu ogrencinin dogru cevap sayisi :7

 */

        char[][] answers1 = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E' , 'B','E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // cevap anahtari
        char[] keys1 = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};


      testSonucu(answers1,keys1);












    }//main

    private static void testSonucu(char[][] answers1, char[] keys1) {
        for (int i = 0; i < answers1.length ; i++) { //ogrenci sayisi ve cevaplari verir[][]

            int sayac = 0;
            for (int j =0; j < answers1[i].length; j++) {
                if (answers1[i][j]==keys1[j]){
                    sayac++;
                }

            }
            System.out.println(i+1+"nolu ogrencinin gogru cevap sayisi" +sayac);
        }

    }//main
}