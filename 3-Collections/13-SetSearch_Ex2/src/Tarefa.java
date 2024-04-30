public class Tarefa {
    private String descricao;
    private boolean isFinished;

    public Tarefa(String descricao, boolean isFinished) {
        this.descricao = descricao;
        this.isFinished = isFinished;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isFinished() {
        return isFinished;
    }
    public void setFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    @Override
    public String toString() {
        return "\nTarefa [descricao=" + descricao + ", isFinished=" + isFinished + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }
    
    
    
}
