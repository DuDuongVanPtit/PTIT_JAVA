/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH1;

/**
 *
 * @author PC
 */
import java.util.*;
import java.io.*;
class LuyenTap{
    private String name;
    private int ac, sub;

    public LuyenTap(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }
    public String getName(){
        return name;
    }
    public int getAc(){
        return ac;
    }
    public int getSub(){
        return sub;
    }
    public String toString(){
        return name + " " + ac + " " + sub;
    }
}
public class Bai10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<LuyenTap> list = new ArrayList<>();
        while(t-- > 0){
            String name = sc.nextLine();
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            int ac = Integer.parseInt(arr[0]);
            int sub = Integer.parseInt(arr[1]);
            LuyenTap x = new LuyenTap(name, ac, sub);
            list.add(x);
        }
        list.sort((s1, s2) ->{
            if(s1.getAc() == s2.getAc()){
                if(s1.getSub() == s2.getSub()){
                    return s1.getName().compareTo(s2.getName());
                }
                else{
                    return s1.getSub() - s2.getSub();
                }
            }
            else{
                return s2.getAc() - s1.getAc();
            }         
        });
        for(LuyenTap x : list){
            System.out.println(x);
        }
    }
}
