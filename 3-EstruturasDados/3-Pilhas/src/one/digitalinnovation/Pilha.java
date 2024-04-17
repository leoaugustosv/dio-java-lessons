package one.digitalinnovation;
public class Pilha{
    private No refNoEntrada;

    public Pilha() {
    this.refNoEntrada = null;
    }

    public boolean isEmpty(){
       return refNoEntrada == null ? true : false;
    }

    public No top(){
        return refNoEntrada;
    }

    public void push(No novNo){
        No refAuxiliar = refNoEntrada;
        refNoEntrada = novNo;
        refNoEntrada.setRefNo(refAuxiliar);
    }
    
    public No pop(){
        if(!this.isEmpty()){
            No noRetirado = refNoEntrada;
            refNoEntrada = refNoEntrada.getRefNo();
            return noRetirado;
        }
        else{
        return null;
        }
        
    }

    public String toString(){
        String retorno = "-----------------\n";
        retorno += " Pilha\n";
        retorno += "-----------------\n";

        No noPercorrerPilha = refNoEntrada;

        while (true) {
            if (noPercorrerPilha != null) {
                retorno += "[No{Dado="+noPercorrerPilha.getDado() +"}]\n";
                noPercorrerPilha = noPercorrerPilha.getRefNo();


            }
            else{
                break;
            }
        }
        retorno += "=================\n";
        return retorno;
    }

}