
package principal;
public class Telefone {
    public String numero;
    public String marcador;
    
    public Telefone(String numero, String marcador){
        this.numero = numero;
        this.marcador = marcador;
    }
    @Override
    public String toString(){
        return "Telefone:"+this.numero+"("+ this.marcador + ")";
    }
    
}

