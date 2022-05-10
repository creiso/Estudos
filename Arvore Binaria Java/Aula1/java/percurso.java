
    public class percurso {
        public static void main(String[] args) {
            No novo = new No();
            novo = null;
            System.out.println(novo);
        }
        public void inOrder(No atual){
            
            atual.esq = null;
            inOrder(atual.esq);
            System.out.println(atual.item + "  ");
            inOrder(atual.dir);
        }

    public void preOrder(No atual){
        if (atual !=null){
            System.out.println(atual.item+" ");
            preOrder(atual.esq);
            preOrder(atual.dir);
        }
    }
    public void posOrder(No atual){
        if (atual != null){
            posOrder(atual.esq);
            posOrder(atual.dir);
            System.out.println(atual.item+"  ");
        }
    }
        
}
