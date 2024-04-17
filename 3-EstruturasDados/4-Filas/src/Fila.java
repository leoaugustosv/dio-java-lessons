public class Fila<T> {
    
private No<T> refNoEntradaFila;

public Fila() {
    this.refNoEntradaFila = null;
}

public void enqueue(T object){
    No novNo = new No(object);
    novNo.setRefNo(refNoEntradaFila);
    refNoEntradaFila = novNo;
}

public T first(){
    if(!this.isEmpty()){
        No primeiroNo = refNoEntradaFila;

        while (true) {
            if(primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
            }else{
                break;
            }
        }
        return (T) primeiroNo.getObject();
    }
    return null;
}

public T dequeue(){
    if(!this.isEmpty()){
        No primeiroNo = refNoEntradaFila;
        No noAuxiliar = refNoEntradaFila;
        while (true) {
            if(primeiroNo.getRefNo() != null){
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
                
            }else{
                noAuxiliar.setRefNo(null);
                break;
            }
        }
        return (T) primeiroNo.getObject();
    }
    return null;
}


public boolean isEmpty(){
    return refNoEntradaFila == null ? true : false;
}

@Override
public String toString() {
    String retorno = "";
    No noAuxiliar = refNoEntradaFila;
    if(refNoEntradaFila != null){

        while (true) {
            retorno += "[No-{objeto="+noAuxiliar.getObject()+"}]--->";
            
            if (noAuxiliar.getRefNo() != null) {
                noAuxiliar = noAuxiliar.getRefNo();
            }
            else{
                retorno += "null";
                break;
            }
        }

    }else{
        retorno = "null";
        
    }

    return retorno;
}

}


