package academy.devdojo.maratona_java.Projetos.Projeto_01.Main;

import academy.devdojo.maratona_java.Projetos.Projeto_01.Entity.User;
import academy.devdojo.maratona_java.Projetos.Projeto_01.view.Arquivo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        List<User> list_user = new ArrayList<>();
        Scanner r = new Scanner(System.in);
        int i = 0;
        Arquivo a = new Arquivo();
        User user= new User();
        String str;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            System.out.println("====Menu de Usuario====");
            System.out.println("[1].Cadastrar");
            System.out.println("[2].Buscar");
            System.out.println("[3].Remover");
            System.out.println("[4].Sair");
            System.out.print("Escolha: ");
            i = r.nextInt();

            switch(i) {
                case 1:
                    System.out.print("Digite Id:");
                    user.setId(r.nextLong());
                    System.out.print("Digite o nome: ");
                    user.setName(r.next());
                    System.out.print("Digite sua data de nascimento: ");
                    str =r.next();
                    user.setDate_nas(LocalDate.parse(str, formatter));
                    System.out.print("Informe seu sexo[M/F]: ");
                    str = r.next();
                    if(str.equals("M") || str.equals("F")) {
                        user.setSexo(str.charAt(0));
                    }else {
                        System.out.println("Valor invalido");
                        break;
                    }
                    System.out.print("Digite o email: ");
                    user.setEmail(r.next());
                    a.salvarEmBanco(user);
                    break;
            }

        }while(i!=4);
    }

}
