package Entity;

public abstract class fajar07176_AbstractEnity {
    protected String nomorkendaraan07176;
    protected String namapemilik07176;

    public fajar07176_AbstractEnity(String nomorkendaraan07176, String namapemilik07176) {
        this.nomorkendaraan07176 = nomorkendaraan07176;
        this.namapemilik07176 = namapemilik07176;
    }
    public fajar07176_AbstractEnity(){
    }
    public abstract String getNomorkendaraan07176();
    public void setNomorkendaraan07176(String nomorkendaraan07176){
        this.nomorkendaraan07176=nomorkendaraan07176;
    }
    public String getNamapemilik07176(){
        return namapemilik07176;
    }
    public void setNamapemilik07176(String namapemilik07176){
        this.namapemilik07176=namapemilik07176;
    }
}
