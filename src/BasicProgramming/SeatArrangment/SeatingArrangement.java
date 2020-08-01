package BasicProgramming.SeatArrangment;

import java.util.Scanner;

public class SeatingArrangement {
    final static Scanner s = new Scanner(System.in);
    static int[] seatNoList;
    static int nTestCases;
    static int travellerSeatNo;
    static int side ;
    static int facedSeatNo;
    static int seatType;
    static int temp;
    static String seatLocation;
    public static void main(String[] args) {
        int[][] data= new int[][]{{1,2,3},{12,11,10},{6,5,4}, {7,8,9}} ;
        int temp = 0;
        nTestCases = s.nextInt();
        seatNoList = new int[nTestCases];
        for(int i = 0 ; i < nTestCases ; i++ ) {
            seatNoList[i] = s.nextInt();
        }
        for(int i = 0 ; i < nTestCases ; i++ ) {
            travellerSeatNo = seatNoList[i] ;
            side = seatNoList[i];
            if(travellerSeatNo < 109 && travellerSeatNo!=0){
                if(travellerSeatNo >12 ) {
                    side = travellerSeatNo % 12;
                }
                if( side == 3 || side == 4 ||
                    side == 10 || side == 9 ) {
                    seatLocation = "AS";
                    temp=2;
                }else if( side % 3 == 2){
                    seatLocation = "MS";
                    temp=1;
                }else {
                    temp=0;
                    seatLocation = "WS";
                    if(side==0){
                        side=12;
                    }
                }
                for(int j =0 ; j < 4 ; j++){
                    if(side == data[j][temp] ){
                        if(side < 7){
                            facedSeatNo = data[++j][temp];
                        }else {
                            facedSeatNo = data[--j][temp];
                        }
                        break;
                    }
                }
            }
            if(side ==12) {
                temp = (travellerSeatNo / 12 - 1) * 12;
            }else {
                temp = (travellerSeatNo / 12 ) * 12;
            }
            System.out.println(facedSeatNo+temp+","+seatLocation);
        }
    }
}

