public class TapNumero {
    private int numeroUno;
    private int numeroDos;

    public TapNumero() {
        numeroUno = Cero();
        numeroDos = Cero();
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

  
    public TapNumero(int _numero) {
        numeroUno = Sucesor();
    }

    public int Cero() {
        return 0;
    }

    public int Sucesor() {
        return numeroUno + 1;
    }

    public int Antecesor() {
        if (EsCero()) {
            return 0;
        } else {
            return numeroUno - 1;
        }
    }

    public boolean EsCero() {
        if (numeroUno == 0)
            return true;
        else
            return false;
    }

    public int Suma() {
        return numeroUno + numeroDos;
    }

    public int Diferecia() {
        return numeroUno - numeroDos;
    }

    public boolean Igual() {
        if (numeroUno == numeroDos)
            return true;
        else
            return false;
    }
}