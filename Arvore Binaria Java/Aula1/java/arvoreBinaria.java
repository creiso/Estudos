public class arvoreBinaria {
    No root;
    public void inserir(long v){
      
        No novo = new No();
        novo.item = v;
        novo.dir = null;
        novo.esq = null;
       
        if(root ==null) {
            root = novo;}
        else{
            No atual = root;
            No anterior;
            while(true){
                anterior = atual;
                if (v <= atual.item){
                    atual = atual.esq;
                    if (atual == null ){
                        anterior.esq = novo;
                        return;
                    }
                }else{
                    atual = atual.dir;
                    if (atual == null){
                        anterior.dir = novo;
                        return;
                    }
                }
            }
            }
        }
     
    
}
