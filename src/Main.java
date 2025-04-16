import model.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Aluno primeiroAluno = new Aluno("Pedro", 22, 7.0, 8.5, 9.0);
        Aluno segundoAluno = new Aluno("Joana", 17, 3.5, 6.0, 7.0);

        primeiroAluno.exibirDados();

        System.out.println("----------");

        segundoAluno.exibirDados();



            }
        }





