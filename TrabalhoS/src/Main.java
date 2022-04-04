class Main {
 
public static void main(String[] args) {
     ArvoreBinaria a = new ArvoreBinaria(); // cria a árvore binária
      a.insere(777,"A");
      a.insere(999,"B");
      a.insere(222,"C");
      a.insere(444,"D");
      a.insere(666,"E");
      a.insere(45,"F");
      a.insere(5,"G");
      a.insere(86,"H");
      a.insere(888,"I");
      a.insere(555,"J");
      a.insere(333,"K");
      a.insere(111,"L");
   
 

   
      a.imprimeElementosArvore();
    System.out.println(a.alturaArvore());
  }
}