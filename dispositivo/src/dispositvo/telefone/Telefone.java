package dispositvo.telefone;

import dispositvo.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

  @Override
  public void ligar() {
    System.out.println("ligando.");
  }

  @Override
  public void atender() {
    System.out.println("atendendo o numero 930668098");
  }

  @Override
  public void correioVoz() {
    System.out.println("A Unitel informa que: Seu saldo é insuficiente .");
  }
  
}
