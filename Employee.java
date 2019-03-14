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

    public String E_ID;
    public String E_NAME;
    public String E_SEX;
    public String E_POS;
    public String E_ENTRYDATE;

    public String getE_NAME() {
        return E_NAME;
    }

    public void setE_NAME(String E_NAME) {
        this.E_NAME = E_NAME;
    }

    public String getE_SEX() {
        return E_SEX;
    }

    public void setE_SEX(String E_SEX) {
        this.E_SEX = E_SEX;
        char women = E_SEX.charAt(0);
        char men = E_SEX.charAt(1);
    }

    public String getE_POS() {
        return E_POS;
    }

    public void setE_POS(String E_POS) {
        this.E_POS = E_POS;
    }

    public String getE_ENTRYDATE() {
        return E_ENTRYDATE;
    }

    public void setE_ENTRYDATE(String E_ENTRYDATE) {
        this.E_ENTRYDATE = E_ENTRYDATE;
    }
//    public Employee(String E_ID, String E_NAME, String E_SEX,String E_POS, String E_ENTRYDATE){
//        this.E_ID = E_ID;
//        this.E_NAME = E_NAME;
//        this.E_SEX = E_SEX;
//        this.E_POS = E_POS;
//        this.E_ENTRYDATE = E_ENTRYDATE;
//    }
    
}
