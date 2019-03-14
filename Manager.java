/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author yangkunying
 */
public class Manager extends Employee {
    public String M_POS;

    
    public void Manager(String M_POS){
        setM_POS(M_POS);
    }
    public String getM_POS(){
        return M_POS;
    }
    public void setM_POS(String M_POS1){
        this.M_POS = M_POS;
    }
    
}
