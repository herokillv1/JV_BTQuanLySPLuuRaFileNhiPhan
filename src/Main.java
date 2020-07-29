import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DanhSachSP> danhSachSPS = new ArrayList<>();
        danhSachSPS.add(new DanhSachSP("1","Điện Thoại","Apple",10000));
        danhSachSPS.add(new DanhSachSP("2","Máy Tính","Acer",20000));
        danhSachSPS.add(new DanhSachSP("3","Ô Tô","BMW",100000));
        danhSachSPS.add(new DanhSachSP("4","Xe Máy","Honda",50000));
        danhSachSPS.add(new DanhSachSP("4","Xe","Honda",50000));

        ObjectFile objectFile = new ObjectFile();


        try {
            objectFile.writeObjectFile("txt/file.txt",danhSachSPS);

        }catch (EOFException ex){
            System.out.println("");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            danhSachSPS = objectFile.readObjectFile("txt/file.txt");
            for (DanhSachSP danhSachSP : danhSachSPS){
                System.out.println(danhSachSP);
            }
        }catch (IOException | ClassNotFoundException ioe) {
            System.err.println(ioe.getMessage());
        }

        for (DanhSachSP danhSachSP : danhSachSPS){
            if(danhSachSP.getTenSP().equals("Xe")){
                danhSachSP.setMaSP("5");
            }
        }

        try {
            objectFile.writeObjectFile("txt/file.txt",danhSachSPS);

        }catch (EOFException ex){
            System.out.println("");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            danhSachSPS = objectFile.readObjectFile("txt/file.txt");
            for (DanhSachSP danhSachSP : danhSachSPS){
                System.out.println(danhSachSP);
            }
        }catch (IOException | ClassNotFoundException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
