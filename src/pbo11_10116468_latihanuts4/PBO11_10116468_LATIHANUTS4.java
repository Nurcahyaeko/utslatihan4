/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116468_latihanuts4;

/**
 *
 * @author User
 */
public class PBO11_10116468_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDesigner mDs = new ModelDesigner();
        mDs.bonusDesigner();
        
        ModelProgrammer mPr = new ModelProgrammer();
        mPr.bonusProgramer();
        
        ModelSystemAnalyst mSa = new ModelSystemAnalyst();
        mSa.bonusSystemAnalys();
    }
    
}
