package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter text : ");
        Scanner scanner = new Scanner(System.in);
        String text =scanner.nextLine();

//        System.out.println(text);

        Sentence sentence = new Sentence(text);
        sentence.reverseWordsByOrderInSentence();
        sentence.printTotalCharatersInText();

        /*
         * cumle alinacak
         * verilen kelimeleri cumle sirasina gore tersten yazacaz.
         * -->  Ben şuan staj başvurumun kabülü için verilen görevleri yapıyorum ve Bordo firmasının bir üyesi olmak istiyorum.
         * ----->  istiyorum. olmak üyesi bir firmasının Bordo ev yapıyorum görevleri verilen niçi kabülü başvurumun staj şuan Ben
         * baglaclari da tersten yazacaz  --> ve >ev ;  icin > nici ...
         *  bosluk disindaki tum karakterlerin kullanimi adetini  hesapla
         * */

        /* Cumleyi al
         *  kelimeleri bosluklara kadar alip arrayListe eklicem
         * arrayListte sondan baslicam bosluklarla text eklicem
         * ArrayListten textleri alirken eger baglac varsa tersten yazicam
         * bide arraylistten cekerken  mesela A karakterinin degerini AdetSayisiniHesaplama classindaki arraylistte  class(harf ve kullanim sayisi) degerini artiacaz.
         * */
    }
}
