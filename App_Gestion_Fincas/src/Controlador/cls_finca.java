
package Controlador;

public class cls_finca {
    private String str_nit;
    private String str_nombre;
    private String str_ubicacion;
    private String str_propietario;
    private String str_correo;

    public cls_finca(String str_nit, String str_nombre, String str_ubicacion, String str_propietario, String str_correo) {
        this.str_nit = str_nit;
        this.str_nombre = str_nombre;
        this.str_ubicacion = str_ubicacion;
        this.str_propietario = str_propietario;
        this.str_correo = str_correo;
    }

    public String getStr_nit() {
        return str_nit;
    }


    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_ubicacion() {
        return str_ubicacion;
    }

    public void setStr_ubicacion(String str_ubicacion) {
        this.str_ubicacion = str_ubicacion;
    }

    public String getStr_propietario() {
        return str_propietario;
    }

    public void setStr_propietario(String str_propietario) {
        this.str_propietario = str_propietario;
    }

    public String getStr_correo() {
        return str_correo;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }
    
    
    
}
