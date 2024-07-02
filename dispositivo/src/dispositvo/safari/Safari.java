package dispositvo.safari;

import dispositvo.NavegadorInternet;

public class Safari implements NavegadorInternet {

  @Override
  public void exibirPagina() {
    System.out.println("exibindo pagina web");
  }
  @Override
  public void adicionarNovaAba() {
    System.out.println("adicinando aba");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("atualizando a pagina web");
  }


  
}
