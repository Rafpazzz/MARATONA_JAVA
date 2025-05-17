package Java_Collections.domain;

public class Smatphone {
    public String serialNumber;
    public String marca;

    public Smatphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    //regras metodo equals
    //Reflexivo: x.equals(x) tem que ser true para tudo que for dierente de null
    //Simétrivo: para x e y diferente de null, x.equals(y) == ture logo, y.equals(x) == ture
    //Transitividade: para x, y e z diferente de null, x.equal(y) == true, e x.equals(z) == true logo, y.equal(z) == true
    //Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //para x derente de null, x.equals(null) deve retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        if(this == obj) return true;

        if(this.getClass() != obj.getClass()) return false; //a partir dessa linha eu ja sei que meu objeto se trata do objeto da minha classe que estou trabalhando
        Smatphone smatphone = (Smatphone) obj;

        return serialNumber != null && serialNumber.equals(smatphone.serialNumber);
    }

    //se x.equals(y) == true, y.hashCode() == x.hashsCode()
    //y.hashCode() == x.hashCode(), não necessarioamente o equals deles deve ser true
    //x.equals(y) == false, o hashCode é diferente
    //y.hashCode() != x.hashCode(), x.equals(y) == false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }
}
