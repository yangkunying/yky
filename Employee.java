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
public class Employee {

    public String eId;
    public String eName;
    public String eSex;
    public String ePos;
    public String eEntrydate;


//    public Employee(String E_ID, String E_NAME, String E_SEX,String E_POS, String E_ENTRYDATE){
//        this.E_ID = E_ID;
//        this.E_NAME = E_NAME;
//        this.E_SEX = E_SEX;
//        this.E_POS = E_POS;
//        this.E_ENTRYDATE = E_ENTRYDATE;
//    }

    public String geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public String geteSex() {
        return eSex;
    }

    public String getePos() {
        return ePos;
    }

    public String geteEntrydate() {
        return eEntrydate;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex;
    }

    public void setePos(String ePos) {
        this.ePos = ePos;
    }

    public void seteEntrydate(String eEntrydate) {
        this.eEntrydate = eEntrydate;
    }
    
}
