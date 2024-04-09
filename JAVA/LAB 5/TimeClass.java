//Define Time class with constructor to initialize hour and minute.
// Also de ne addition method to add two time objects.

import java.util.Scanner;
class Logic{
    int time(int hh,int mm,int ss){     
        return hh*3600+mm*60+ss;
    }
}
public class TimeClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logic obj = new Logic();
        System.out.print("Enter hours in hh format: ");
        int hh = sc.nextInt();
        if (hh >= 24) {
            hh %= 24;
        }
        System.out.print("Enter minutes in mm format: ");
        int mm = sc.nextInt();
        if (mm >= 60) {
            hh += mm / 60;
            mm %= 60;
        }
        System.out.print("Enter seconds in ss format: ");
        int ss = sc.nextInt();
        if (ss >= 60) {
            mm += ss / 60;
            ss %= 60;
        }
        int t = obj.time(hh, mm, ss);
        System.out.print(hh + ":" + mm + ":" + ss);
    }
}
class Time{
    int h,m;
    Time(int hh,int mm){
        this.h = hh;
        this.m = mm;
    }
void addition(int t1h,int t2h,int t1m,int t2m){
    int hours = t1h + t2h;
    int minutes = t1m + t2m;
    if(minutes>=60){
        hours+=minutes/60;
        minutes%=60;
    }
    System.out.println(hours+":"+minutes);
}
    
}