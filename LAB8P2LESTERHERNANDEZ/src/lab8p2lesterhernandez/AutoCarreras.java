package lab8p2lesterhernandez;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author leste
 */
public class AutoCarreras {

    RandomAccessFile carro;

    public AutoCarreras() throws FileNotFoundException {
        File direccion = new File("Auto");
        direccion.mkdir();
        carro = new RandomAccessFile("Auto/Carro.txt", "rw");
    }

    public void añadirCarro(int numero, String modelo, String corredor, int a, int b, int c) throws IOException {
        carro.seek(carro.length());
        carro.writeInt(numero);
        carro.writeUTF(modelo);
        carro.writeUTF(corredor);
        carro.writeInt(a);
        carro.writeInt(b);
        carro.writeInt(c);
    }

    public int buscarTipo() throws IOException {
        carro.seek(0);
        while (carro.getFilePointer() < carro.length()) {
            carro.readInt();
            String tipo = carro.readUTF();
            carro.readUTF();
            carro.skipBytes(12);
            if (tipo.equals("McQueen")) {
                return 1;
            } else if (tipo.equals("Convertible")) {
                return 2;
            } else if (tipo.equals("Nascar")) {
                return 3;
            }
        }
        return 0;
    }

    public boolean buscarNumero(int a) throws IOException {
        carro.seek(0);
        while (carro.getFilePointer() < carro.length()) {
            int num = carro.readInt();
            carro.readUTF();
            carro.readUTF();
            carro.skipBytes(12);
            if (num == a) {
                return true;
            }
        }
        return false;
    }

}
