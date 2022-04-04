// Implementa��o da classe No de uma �rvore 
public class No
{
  private long id; // identificador do elemento
  private Object valor; // armazena o valor de cada No
  private No esq; // aponta para o filho esquerdo do n�
  private No dir; // aponta para o filho direito do n�,,

  
  public No(long id, Object valor, No esq, No dir) // construtor classe No
  {
    this.id = id;
    this.valor = valor; 
    this.esq = esq;
    this.dir = dir;
  }
  
  public void setId(long id) // m�todo para alterar o identificador do n�
  {
    this.id = id;
  }
  
  public long getId() // m�todo para receber o identificador do n�
  {
    return this.id;
  }
  
  public void setValor(Object valor) // m�todo para alterar o valor
  {
    this.valor = valor;
  }
  
  public Object getValor() // m�todo para receber o objeto contido no No
  {
    return valor;
  }
  public void setEsq(No esq) // m�todo que altera o filho esquerdo
  {
    this.esq = esq;
  }
  
  public No getEsq() // m�todo que recebe o filho esquerdo do n�
  {
    return esq;
  }
  
  public void setDir(No dir) // m�todo que altera o filho direito
  {
    this.dir = dir;
  }
  
  public No getDir() // m�todo que recebe o filho direito do n�
  {
    return dir;
  }
  
}
// Final da classe N