package classes;

public class Programa {

  public static void main(String[] args) {

    Contato contatoLeandro = new Contato("Leandro", "(84) 98166-1076");
    Contato contatoYuri = new Contato("Yuri", "(84) 4002-8922");

    ContaCorrente conta01 = new ContaCorrente(contatoLeandro, "123-0", "11122-4", 0.09);
    ContaCorrente conta02 = new ContaCorrente(contatoYuri, "123-0", "11123-4", 0.13);
    conta02.sacar(1000);
    conta02.abaterTaxaDeJuros();

    System.out.println(conta01.equals(conta02));

    Banco banco = new Banco();
    banco.adicionarConta(conta01);
    banco.adicionarConta(conta02);

    System.out.println(banco);

  }
}