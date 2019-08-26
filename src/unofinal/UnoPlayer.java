
package unofinal;

import java.io.Serializable;


public class UnoPlayer implements Serializable {
    
    private String p1Name;
    private String p2Name;
    private int p1Bodovi1;
    private int p2Bodovi1;
    private int p1Bodovi2;
    private int p2Bodovi2;
    private int p1Bodovi3;
    private int p2Bodovi3;
    private int p1Bodovi4;
    private int p2Bodovi4;
    private int p1Bodovi5;
    private int p2Bodovi5;
    private String datum;
    
    public String getp1Name(){
        return p1Name;
    }
    public void setp1Name(String p1Name){
        this.p1Name = p1Name;
    }
    
    public String getp2Name(){
        return p2Name;
    }
    public void setp2Name(String p2Name){
        this.p2Name = p2Name;
    }
    
    public int getp1B(){
        return p1Bodovi1;
    }
    public void setp1B(int p1Bodovi1){
       this.p1Bodovi1 = p1Bodovi1;
    }
    
    public int getp2B(){
        return p2Bodovi1;
    }
    public void setp2B(int p2Bodovi1){
       this.p2Bodovi1 = p2Bodovi1;
    }
    public int getp1B2(){
        return p1Bodovi2;
    }
    public void setp1B2(int p1Bodovi2){
       this.p1Bodovi2 = p1Bodovi2;
    }
    
    public int getp2B2(){
        return p2Bodovi2;
    }
    public void setp2B2(int p2Bodovi2){
       this.p2Bodovi2 = p2Bodovi2;
    }
    public int getp1B3(){
        return p1Bodovi3;
    }
    public void setp1B3(int p1Bodovi3){
       this.p1Bodovi3 = p1Bodovi3;
    }
    
    public int getp2B3(){
        return p2Bodovi3;
    }
    public void setp2B3(int p2Bodovi3){
       this.p2Bodovi3 = p2Bodovi3;
    }
    public int getp1B4(){
        return p1Bodovi4;
    }
    public void setp1B4(int p1Bodovi4){
       this.p1Bodovi4 = p1Bodovi4;
    }
    
    public int getp2B4(){
        return p2Bodovi4;
    }
    public void setp2B4(int p2Bodovi4){
       this.p2Bodovi4 = p2Bodovi4;
    }
    public int getp1B5(){
        return p1Bodovi5;
    }
    public void setp15(int p1Bodovi5){
       this.p1Bodovi5 = p1Bodovi5;
    }
    
    public int getp2B5(){
        return p2Bodovi5;
    }
    public void setp2B5(int p2Bodovi5){
       this.p2Bodovi5 = p2Bodovi5;
    }
    
    public String getDaum(){
        return datum;
    }
    public void setDatum(String datum){
        this.datum = datum;
    }
    
    public UnoPlayer(String p1Name, String p2Name, int p1Bodovi1, int p2Bodovi1,int p1Bodovi2, int p2Bodovi2,int p1Bodovi3, int p2Bodovi3,int p1Bodovi4, int p2Bodovi4,int p1Bodovi5, int p2Bodovi5, String datum){
        this.p1Name = p1Name;
        this.p2Name = p2Name;
        this.p1Bodovi1 = p1Bodovi1;
        this.p2Bodovi1 = p2Bodovi1;
        this.p1Bodovi2 = p1Bodovi2;
        this.p2Bodovi2 = p2Bodovi2;
        this.p1Bodovi3 = p1Bodovi3;
        this.p2Bodovi3 = p2Bodovi3;
        this.p1Bodovi4 = p1Bodovi4;
        this.p2Bodovi4 = p2Bodovi4;
        this.p1Bodovi5 = p1Bodovi5;
        this.p2Bodovi5 = p2Bodovi5;
        this.datum = datum;
        
    }
    
    public UnoPlayer(){
        
    }
    
    
    
}
