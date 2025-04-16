package model;

public class Aluno {

    private String nomeAluno;
    private int idadeAluno;
    private double notaPrimeira, notaSegunda, notaTerceira;

    public Aluno(int idadeAluno, String nomeAluno, double notaPrimeira, double notaSegunda, double notaTerceira) {
        this.idadeAluno = idadeAluno;
        this.nomeAluno = nomeAluno;
        this.notaPrimeira = notaPrimeira;
        this.notaSegunda = notaSegunda;
        this.notaTerceira = notaTerceira;
    }

    public double calculaMedia () {
        return (notaPrimeira + notaSegunda + notaTerceira) / 3;
    }

public boolean aprovado() {
        return calculaMedia() >= 7.0;
}

public void exibirDados (){
    System.out.println("Nome: " + nomeAluno);


}















}
;