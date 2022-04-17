package principal;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda a =new Agenda();
        int opcao;
        String nome, sobrenome, tel, marcador, flag;
        do {
           
            menu();
            opcao=sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome:");
                    nome=sc.next();
                    System.out.println("Digite o sobrenome:");
                    sobrenome=sc.next();
                    System.out.println("Digite o número do telefone:");
                    tel=sc.next();
                    System.out.println("Digite o marcador (Residencial/Comercial/Celular):");
                    marcador=sc.next();
                    
                    Telefone t=new Telefone(tel,marcador);
                    Contato c1= new Contato(nome,sobrenome,t);
                    a.addContato(c1);
                    do {
                        System.out.println("Deseja inserir mais um número: (S-sim/N-não");
                        flag= sc.next().toUpperCase();
                        if(flag.charAt(0)=='S'){
                            System.out.println("Digite o número do telefone:");
                            tel =sc.next();
                            System.out.println("Digite o marcador (Residencial/Comecial/Celular):");
                            marcador=sc.next();
                            Telefone t2=new Telefone(tel,marcador);
                            if(c1.addTelefone(t2))
                                System.out.println("Número inserido com sucesso!");
                            else
                                System.out.println("Não foi possível inserir o número!");
                        }
                    }while(flag.charAt(0)=='S');
                    System.out.println("Deseja inserir um e-mail:(S-sim/N-não)");
                    flag=sc.next().toUpperCase();
                    if(flag.charAt(0)=='S'){
                        System.out.println("Digite o e-mail:");
                        c1.alterarEmail(sc.next());
                        
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome:");
                    nome=sc.next();
                    a.pesquisa(nome);
                    break;
                case 3:
                    System.out.println("Digite o nome:");
                    nome=sc.next();
                    System.out.println("Digite o sobrenome:");
                    sobrenome=sc.next();
                    Contato c = a.buscarContato(nome, sobrenome);
                    if(c==null){
                        System.out.println("Nenhum contato encontrado");
                        
                    }
                    else{
                        System.out.println(c.toString());
                        System.out.println("1- Alterar e-mail:");
                        switch(sc.nextInt()){
                            case 1:
                                System.out.println("Digite o e-mail:");
                                c.alterarEmail(sc.next());
                                break;
                            case 2:
                                System.out.println("Digite o número do telefone:");
                                tel = sc.next();
                                System.out.println("Digite o marcador (Residencial/Comecial/Celular)");
                                marcador=sc.next();
                                Telefone t2=new Telefone(tel,marcador);
                                if(c.addTelefone(t2))
                                    System.out.println("Número inserido com sucesso!");
                                else
                                    System.out.println("Não foi possível inserir o número de telefone. Memória cheia");
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saiu da agenda");
                    break;
            }
        }while(opcao!=4);
        
        
    }
    public  static void menu(){
        String menu="""
                    1.Inserir Contato
                    2. Buscar Contato
                    3. Alterar Contato
                    4. Sair da agenda
                    Digite uma opção:
                    """;
        System.out.println(menu);
                    
    }

     
    }
    


