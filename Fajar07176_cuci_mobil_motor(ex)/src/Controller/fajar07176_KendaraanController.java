package Controller;
//@author Fajar

import Entity.Fajar07176_MobilEntity;
import Entity.Fajar07176_MotorEntity;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class fajar07176_KendaraanController {
    
    public void insertMotor07176(String fajar07176_nomormotor,String fajar07176_pemilikmotor,
            String fajar07176_merekmotor,String fajar07176_warnamotor){
        Fajar07176_MotorEntity motor = new Fajar07176_MotorEntity(fajar07176_nomormotor,
                fajar07176_pemilikmotor,fajar07176_merekmotor,fajar07176_warnamotor);
        fajar07176_AllObjectModel.motor07176.insertMotor07176(motor);
    }
    public void insertMobil07176(String nomorkendaraan07176, String namapemilik07176, 
            String fajar07176_merekmobil, String fajar07176_warnamobil){
        Fajar07176_MobilEntity mobil = new Fajar07176_MobilEntity(nomorkendaraan07176,
                namapemilik07176,fajar07176_merekmobil,fajar07176_warnamobil);
        fajar07176_AllObjectModel.mobil07176.insertMobil07176(mobil);
    }
    public int jumlahmotor(){
        return fajar07176_AllObjectModel.motor07176.size();
    }
    public ArrayList<Fajar07176_MotorEntity> getDataMotor(){
        return fajar07176_AllObjectModel.motor07176.getMotor();
    }
    public void hapusmotor(int index){
        fajar07176_AllObjectModel.motor07176.hapus(index);
    }
    
    public int jumlahmobil(){
        return fajar07176_AllObjectModel.mobil07176.size();
    }
    public ArrayList<Fajar07176_MobilEntity> getDataMobil(){
        return fajar07176_AllObjectModel.mobil07176.getMobil();
    }
    public void hapusmobil(int index){
        fajar07176_AllObjectModel.mobil07176.hapus(index);
    }
    public void update(int index, String kendaraan, String data, String ubah){
       if(kendaraan=="mobil"){
       fajar07176_AllObjectModel.mobil07176.update(index,data,ubah);    
       }else if(kendaraan=="motor"){
       fajar07176_AllObjectModel.motor07176.update(index,data,ubah);    
       }
    }
    public DefaultTableModel databaru(){
        DefaultTableModel dtmdaftarprak = new DefaultTableModel();
        Object[] kolom = {"index","Nomor Kendaraan", "Pemilik", "Merek", "Warna"};
        dtmdaftarprak.setColumnIdentifiers(kolom);
        int motor07176 = fajar07176_AllObjectModel.motor07176.getMotor().size();
        int mobil07176 = fajar07176_AllObjectModel.mobil07176.getMobil().size();
        for (int i = 0; i < motor07176; i++) {
            Object[] data = new Object[5];
            data[0] = i;
            data[1] = fajar07176_AllObjectModel.motor07176.getMotor().get(i).getNomorkendaraan07176();
            data[2] = fajar07176_AllObjectModel.motor07176.getMotor().get(i).getNamapemilik07176();
            data[3] = fajar07176_AllObjectModel.motor07176.getMotor().get(i).getfajar07176_merekmotor();
            data[4] = fajar07176_AllObjectModel.motor07176.getMotor().get(i).getfajar07176_warnamotor();
            dtmdaftarprak.addRow(data);
        }
        for (int i = 0; i < mobil07176; i++) {
            Object[] data = new Object[5];
            data[0] = i;
            data[1] = fajar07176_AllObjectModel.mobil07176.getMobil().get(i).getNomorkendaraan07176();
            data[2] = fajar07176_AllObjectModel.mobil07176.getMobil().get(i).getNamapemilik07176();
            data[3] = fajar07176_AllObjectModel.mobil07176.getMobil().get(i).getfajar07176_merekmobil();
            data[4] = fajar07176_AllObjectModel.mobil07176.getMobil().get(i).getfajar07176_warnamobil();
            dtmdaftarprak.addRow(data);
        }
        return dtmdaftarprak;
    }
}
