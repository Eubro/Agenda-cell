package principal; 
public class Contato {
    public String nome;
    public String sobrenome;
    public String email;
    public Telefone[] telefones=new Telefone[3];
    
    public Contato(String nome, String sobrenome, Telefone telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefones[0]= telefone;
        
    }
    public Contato(String nome, String sobrenome, Telefone telefone, String email){
        this(nome,sobrenome,telefone);
        this.email = email;
        
    }
    public boolean addTelefone(Telefone telefone){
        boolean flag=false;
        for(int i=0;i<telefones.length;i++){
            if (telefones[i]==null){
                telefones[i]=telefone;
                flag=true;
                break;
                
            }
        }
        return flag;
        
    }
    public void alterarEmail(String email) {
        this.email=email;
        System.out.println("E-email alterado.");
        
    }
    @Override
    public String toString(){
        
        String s="Nome:"+ nome + ""+ sobrenome+ "\ne-email="+email+"\nTelefones:";
        for(Telefone elemento:telefones){
            if(elemento!=null)
                s=s+elemento.toString()+"\n";
            
        }
        return s;
    }
    
}


