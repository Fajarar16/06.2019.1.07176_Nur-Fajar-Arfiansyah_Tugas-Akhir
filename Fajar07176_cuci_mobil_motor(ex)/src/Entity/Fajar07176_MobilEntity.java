package Entity;

public class Fajar07176_MobilEntity extends fajar07176_AbstractEnity{
    private String fajar07176_merekmobil;
    private String fajar07176_warnamobil;   

public Fajar07176_MobilEntity(String nomorkendaraan07176, String namapemilik07176, String fajar07176_merekmobil, String fajar07176_warnamobil){
    super(nomorkendaraan07176, namapemilik07176);
    this.fajar07176_merekmobil = fajar07176_merekmobil;
    this.fajar07176_warnamobil = fajar07176_warnamobil;
    }
    public Fajar07176_MobilEntity(){
    }
    @Override
    public String getNomorkendaraan07176(){
        return nomorkendaraan07176;
    }
    public void setNomorkendaraan07176(String nomorkendaraan07176){
        this.nomorkendaraan07176=nomorkendaraan07176;
    }
    public String getfajar07176_merekmobil(){
        return fajar07176_merekmobil;
    }
    public void setfajar07176_merekmobil(String merekmobil){
        this.fajar07176_merekmobil=merekmobil;
    }
    public String getfajar07176_warnamobil(){
        return fajar07176_warnamobil;
    }
    public void setfajar07176_warnamobil(String warnamobil){
        this.fajar07176_warnamobil=warnamobil;
    }
}