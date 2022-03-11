/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2lesterhernandez;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author leste
 */
public class Autos {
    RandomAccessFile carro;
    public Autos() throws FileNotFoundException{
        File dir = new File("Vehiculo");
        dir.mkdir();
        carro = new RandomAccessFile("Vehiculo/Carros.txt","rw");
    }
    
    public void addCar(int num, String tipo, String corredor, int r, int g, int b) throws IOException {
        carro.seek(carro.length());
        carro.writeInt(num);
        carro.writeUTF(tipo);
        carro.writeUTF(corredor);
        carro.writeInt(r);
        carro.writeInt(g);
        carro.writeInt(b);
    }
    
   
    
    public int searchType() throws IOException{
        carro.seek(0);
        while(carro.getFilePointer()<carro.length()){
            carro.readInt();
            String tipo = carro.readUTF();
            carro.readUTF();
            carro.skipBytes(12);
            if(tipo.equals("McQueen")){
                return 1;
            }else if(tipo.equals("Convertible")){
                return 2;
            }else if(tipo.equals("Nascar")){
                return 3;
            }
        }
        return 0;
    }
    
     public boolean searchNum(int i) throws IOException{
        carro.seek(0);
        while(carro.getFilePointer()<carro.length()){
            int num = carro.readInt();
            carro.readUTF();
            carro.readUTF();
            carro.skipBytes(12);
            if(num==i){
                return true;
            }
        }
        return false;
    }
    
}
