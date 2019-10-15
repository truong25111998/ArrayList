/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlhsarray;

import java.util.ArrayList;
import java.util.List;


public class QLHS {
    private List<QLHSArray> hocsinh;
    public QLHS(){
        hocsinh = new ArrayList<>();
    }
    public void xuatall(){
        System.out.println("Danh sach hoc sinh la: ");
        for(int i = 0; i<hocsinh.size(); i++){
            QLHSArray q = hocsinh.get(i);
            q.xuattt();
        }
    }
    public String findlop(String lop){
        for(int i = 0; i<hocsinh.size(); i++){
        QLHSArray q = hocsinh.get(i);
        if(q.getLop().equals(lop)){
            return q.getLop();           
            }
        }
        return null;
    }
    public String findname(String name){
        for(int i = 0; i<hocsinh.size(); i++){
            QLHSArray q = hocsinh.get(i);
            if(q.getName().equals(name))
                System.out.println("Tim thay ten"+ q.getName());
            
            else
                System.out.println("k tim thay");
        }
        return null;
    }
    public String updateName(){
        for(int i = 0; i<hocsinh.size(); i++){
            QLHSArray q = hocsinh.get(i);
            
        }
        return null;
    }
    public void addhs(QLHSArray q){
        hocsinh.add(q);
    }
    public void sortbypoint(){
        for(int i = 0; i<hocsinh.size()-1; i++){
            for(int j = i+1; j<hocsinh.size(); j++){
                QLHSArray q1 = hocsinh.get(i);
                QLHSArray q2 = hocsinh.get(j);
                if(q1.getPoint()>q2.getPoint())
                {
                    hocsinh.set(i, q2);
                    hocsinh.set(j, q1);
                }
            }
            
        }
        
    }
}
