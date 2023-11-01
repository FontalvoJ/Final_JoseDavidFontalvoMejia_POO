
package Controlador;


public class cls_cultivos {
    private String str_codigocultivo;
    private String str_nombre;
    private String str_descripcion;
    private String str_produccion;
    private String str_cod_trabajador;

    public cls_cultivos(String str_codigocultivo, String str_nombre, String str_descripcion, String str_produccion, String str_cod_trabajador) {
        this.str_codigocultivo = str_codigocultivo;
        this.str_nombre = str_nombre;
        this.str_descripcion = str_descripcion;
        this.str_produccion = str_produccion;
        this.str_cod_trabajador = str_cod_trabajador;
    }

    public String getStr_codigocultivo() {
        return str_codigocultivo;
    }
    
    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_descripcion() {
        return str_descripcion;
    }

    public void setStr_descripcion(String str_descripcion) {
        this.str_descripcion = str_descripcion;
    }

    public String getStr_produccion() {
        return str_produccion;
    }

    public void setStr_produccion(String str_produccion) {
        this.str_produccion = str_produccion;
    }

    public String getStr_cod_trabajador() {
        return str_cod_trabajador;
    }

    public void setStr_cod_trabajador(String str_cod_trabajador) {
        this.str_cod_trabajador = str_cod_trabajador;
    }
    
    
    
}
