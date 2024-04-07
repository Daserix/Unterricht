package ba.sem2.einheit1.modul1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.rint;

public class Springer {
    int[] location = {0,0};
    public Springer(int zeile, int spalte) {
        this.location[0] = zeile;
        this.location[1] = spalte;
    }

    public boolean canMoveTo(int zielZeile, int zielSpalte) {
        if (abs(zielZeile-location[0])==2) {
            return abs(zielSpalte - location[1]) == 1;
        } else if (abs(zielZeile-location[0])==1) {
            return abs(zielSpalte - location[1]) == 2;
        } else {
            return false;
        }
    }

    public boolean canMoveTo(int[] targetLocation) {
        if (abs(targetLocation[0]-location[0])==2) {
            return abs(targetLocation[1] - location[1]) == 1;
        } else if (abs(targetLocation[0]-location[0])==1) {
            return abs(targetLocation[1] - location[1]) == 2;
        } else {
            return false;
        }
    }
    public List<int[]> possibleMoves() {
        List<int[]> locationList = new ArrayList<int[]>();
        int[] operations = {1,-1,2,-2};
        for (int i = 0; i<operations.length; i++) {
            if (location[0]+operations[i]<9 && location[0]+operations[i]>0) {
                for (int j = 1; j<operations.length/2+1; j++) {
                    if (i < operations.length/2) {
                        if (location[1]+operations[i+j]<9 && location[1]+operations[i+j]>0) {
                            locationList.add(new int[]{location[0]+operations[i], location[1]+operations[i+j]});
                        }
                    } else {
                        if (location[1]+operations[i-j]<9 && location[1]+operations[i-j]>0) {
                            locationList.add(new int[]{location[0]+operations[i], location[1]+operations[i-j]});
                        }
                    }
                }
            }
        }
        return  locationList;
    }
}
