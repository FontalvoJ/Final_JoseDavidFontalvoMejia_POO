
package Controlador;


public class cls_trabajadores {
    
    private String str_codigo;
    private String str_nombre;
    private String str_contacto;
    private String str_nitfinca;
    private String str_cargo;

    public cls_trabajadores(String str_codigo, String str_nombre, String str_contacto, String str_nitfinca, String str_cargo) {
        this.str_codigo = str_codigo;
        this.str_nombre = str_nombre;
        this.str_contacto = str_contacto;
        this.str_nitfinca = str_nitfinca;
        this.str_cargo = str_cargo;
    }

    public String getStr_codigo() {
        return str_codigo;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public String getStr_contacto() {
        return str_contacto;
    }

    public void setStr_contacto(String str_contacto) {
        this.str_contacto = str_contacto;
    }

    public String getStr_nitfinca() {
        return str_nitfinca;
    }

    public void setStr_nitfinca(String str_nitfinca) {
        this.str_nitfinca = str_nitfinca;
    }

    public String getStr_cargo() {
        return str_cargo;
    }

    public void setStr_cargo(String str_cargo) {
        this.str_cargo = str_cargo;
    }
    
    
}
