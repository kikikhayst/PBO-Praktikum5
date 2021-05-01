/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author ASUS
 */
public class Kendaraan {

    /**
     * @param args the command line arguments
     */
    int penumpang;
    int kapasitas_bb;
    int mpg;
}

class ObjectKendaraan {

    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan minivan = new Kendaraan();
        Kendaraan sport = new Kendaraan();
        int range1, range2;

        minivan.penumpang = 7;
        minivan.kapasitas_bb = 16;
        minivan.mpg = 21;
        sport.penumpang = 2;
        sport.kapasitas_bb = 14;
        sport.mpg = 12;

        range1 = minivan.kapasitas_bb * minivan.mpg;
        range2 = sport.kapasitas_bb * sport.mpg;

        System.out.println("Minivan dapat membawa " + minivan.penumpang + " orang, dengan jangkauan " + range1);
        System.out.println("Sport dapat membawa " + sport.penumpang + " orang, dengan jangkauan " + range2);
    }
}
