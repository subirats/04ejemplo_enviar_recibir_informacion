package lluis.subirats.a04ejemplo_enviar_recibir_informacion.modelos;

import java.io.Serializable;

public class Direccion implements Serializable {
    private String calle;
    private int num;
    private String ciudad;

    public Direccion() {
    }

    public Direccion(String calle, int num, String ciudad) {
        this.calle = calle;
        this.num = num;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return
                "Calle ='" + calle + '\'' +
                ", num =" + num +
                ", ciudad ='" + ciudad;
    }
}
