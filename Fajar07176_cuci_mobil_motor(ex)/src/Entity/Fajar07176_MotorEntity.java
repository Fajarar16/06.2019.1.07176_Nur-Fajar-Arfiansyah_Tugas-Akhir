package Entity;

public class Fajar07176_MotorEntity extends fajar07176_AbstractEnity{
    private String fajar07176_merekmotor;
    private String fajar07176_warnamotor;

public Fajar07176_MotorEntity(String nomorkendaraan07176, String namapemilik07176, String fajar07176_merekmotor, String fajar07176_warnamotor){
    super(nomorkendaraan07176,namapemilik07176);
    this.fajar07176_merekmotor = fajar07176_merekmotor;
    this.fajar07176_warnamotor = fajar07176_warnamotor;
    }
    public Fajar07176_MotorEntity(){
    }
    @Override
    public String getNomorkendaraan07176(){
        return nomorkendaraan07176;
    }
    public void setNomorkendaraan07176(String nomorkendaraan07176){
        this.nomorkendaraan07176=nomorkendaraan07176;
    }
    public String getfajar07176_merekmotor(){
        return fajar07176_merekmotor;
    }
    public void setfajar07176_merekmotor(String fajar07176_merekmotor){
        this.fajar07176_merekmotor=fajar07176_merekmotor;
    }
    public String getfajar07176_warnamotor(){
        return fajar07176_warnamotor;
    }
    public void Setfajar07176_warnamotor(String fajar07176_warnamotor){
        this.fajar07176_warnamotor=fajar07176_warnamotor;
    }
}