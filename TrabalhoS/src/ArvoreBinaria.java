public class ArvoreBinaria
{
  private No raiz;
  
  public ArvoreBinaria() // construtor da classe Arvore Binaria
  {
    this.raiz = null; // inicia a �rvore vazia
  }
  public void insere(long id, Object valor) // m�todo para inser��o de valor
  {
    No novoNo = new No(id,valor,null,null);
    if (raiz == null) {
      raiz = novoNo;
    } else {
      
      No atual = raiz; No pai;
      while (true) {
        
        pai = atual;
        
        if (id < atual.getId()) { // vai inserir � esquerda
          atual = atual.getEsq();
          
          if (atual == null) { // pode inserir � esquerda
            pai.setEsq(novoNo);
            return;
          } // se n�o � nulo, vai tentar o pr�ximo filho
        } else { // vai inserir � direita
          
          atual = atual.getDir();
          
          if (atual == null) { // pode inserir � direita
            pai.setDir(novoNo);
            return;
          }
        }
      }
    }
  } // final m�todo insere
  
  private void preFixado(No atual) // caminhamento pr�-fixado da �rvore bin�ria
  {
    if (atual != null) {
      System.out.println("Id: "+atual.getId()+" Valor: "+atual.getValor());
      preFixado(atual.getEsq());
      preFixado(atual.getDir());
    }
  } // final m�todo preFixado


  private void posFixado(No atual) // caminhamento p�s-fixado da �rvore bin�ria
  {
    if (atual != null) {
      posFixado(atual.getDir()); 
      posFixado(atual.getEsq());
      System.out.println("Id: "+atual.getId()+" Valor: "+atual.getValor());
    }
  } // final m�todo posFixado
  private void simFixado(No atual) // caminhamento sim�trico fixado da �rvore bin�ria
  {
    if (atual != null) {
      simFixado(atual.getDir());
      System.out.println("Id: "+atual.getId()+" Valor: "+atual.getValor());
      simFixado(atual.getEsq());
    }
  } // final m�todo inFixado
  public void imprimeElementosArvore() // impress�o dos elementos da �rvore
  {
    posFixado(raiz);
  } // final do m�todo para impress�o
  private long calcAltura(No atual, long a) // calcula a altura da �rvore
  {
    if (atual != null) {
        long e,d;
        e = calcAltura(atual.getEsq(),a)+1;
        d = calcAltura(atual.getDir(),a)+1;
      if (a > d) {
        return a+e;
      } else {
        return a+d;
      }
    }
    return a;
  } // final m�todo calcAltura
  
  public long alturaArvore()
  {
    long a = 0;
    return calcAltura(raiz,a);
  } // final do m�todo alturaArvore
  
} // Final da classe ArvoreBinaria
