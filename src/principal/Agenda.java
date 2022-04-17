package principal;
public class Agenda {
    public Contato[] contatos;
    
    public Agenda(){
        contatos=new Contato[200];
        
    }
    public boolean addContato(Contato contatinho){
        boolean flag=false;
        for(int i=0;i<contatos.length;i++){
            if(contatos[i]==null){
                contatos[i]=contatinho;
                flag=true;
                break;
            }
        }
        return flag;
    }
    public void pesquisa(String nome){
        for(Contato elemento: contatos){
            if((elemento!=null)&&(nome.equalsIgnoreCase(elemento.nome))){
                System.out.println(elemento.toString());
                
            }
        }
    }
    public Contato buscarContato(String nome, String sobrenome){
        //Contato obj=null;
        for(Contato elemento: contatos){
            if(elemento!=null){
                if((sobrenome.equalsIgnoreCase(elemento.sobrenome))&&(nome.equalsIgnoreCase(elemento.nome))){
                    
                    return elemento;
                }
                
            }else
                break;
        }
        return null;
    }
    
}

