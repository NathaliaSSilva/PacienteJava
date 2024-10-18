import java.util.Scanner;
public class UsarPaciente {
    public static void main(String[] args) throws Exception {
       Paciente p1 = new Paciente();
       Paciente p2 = new Paciente("nathalia","251181116","rua caranda","11 964491156","01/02/2004","aux.Administrativo");

       Scanner leia = new Scanner(System.in);
        
       System.out.println("Digite o nome: ");
       p1.nome = leia.nextLine();
       System.out.println("Digite o rg: ");
       p1.rg = leia.nextLine();
       System.out.println("Digite o data de nascimento: ");
       p1.dataNascimento = leia.nextLine();
       System.out.println("Digite sua profissão: ");
       p1.profissao = leia.nextLine();
       System.out.println("Digite o seu endereço: ");
       p1.endereco = leia.nextLine();
       System.out.println("Digite o seu telefone: ");
       p1.telefone = leia.nextLine();

       System.out.println("\n");

       System.out.println("Nome: "+p1.nome);
       System.out.println("Rg: "+p1.rg);
       System.out.println("Data de Nascimento: "+p1.dataNascimento);
       System.out.println("Profissão: "+p1.profissao);
       System.out.println("Endereço: "+p1.endereco);
       System.out.println("Telefone: "+p1.telefone);

       System.out.println("\n");

       System.out.println("Nome: "+p2.nome);
       System.out.println("Rg: "+p2.rg);
       System.out.println("Data de Nascimento: "+p2.dataNascimento);
       System.out.println("Profissão: "+p2.profissao);
       System.out.println("Endereço: "+p2.endereco);
       System.out.println("Telefone: "+p2.telefone);











    }
}
