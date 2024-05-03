package one.digitalinnovation;

public class ListaEncadeada <T>{
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    
    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){

        validarIndex(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;

    }

    public T get(int index){
        return getNo(index).getConteudo();
    }


    public T remove(int index){
        No<T> noMirado = this.getNo(index);

        if(index == 0){
            referenciaEntrada = noMirado.getProximoNo();
            return noMirado.getConteudo();
        }
        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noMirado.getProximoNo());
        return noMirado.getConteudo();
    }


    private void validarIndex(int index){
        if (index >= size()) {
            int maxIndex = size()-1;
            throw new IndexOutOfBoundsException("O indíce "+index+" não possui conteúdo nesta lista. O indíce máximo desta lista é "+maxIndex+".");
        }
    }



    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }
                else{
                    break;
                }
            }
            else{
                break;
            }
        }
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "No[conteudo=" + referenciaEntrada + "]------>";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno+= "null";
        return strRetorno;
    }


    
}
