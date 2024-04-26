public class No<T> {
    private T conteudo;
    private No<T> ProximoNo;

    public No(T conteudo) {
       this.ProximoNo = null;
       this.conteudo = conteudo;
    }
    
    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public No<T> getProximoNo() {
        return ProximoNo;
    }
    public void setProximoNo(No<T> proximoNo) {
        ProximoNo = proximoNo;
    }

    @Override
    public String toString(){
        return "No{"+"conteudo='" + conteudo + '\'' + '}';
    }

}
