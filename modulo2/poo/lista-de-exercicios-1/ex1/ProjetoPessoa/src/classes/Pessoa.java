package classes;

/**
 *
 * @author vovo
 */
public class Pessoa {

    // ATRIBUTOS
    private String nome = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    private float imc = 0;
    private String situacao = "";

    // MÉTODOS -------------------------------------------------------------------------->
    // GET ------------------------------------------------------------------------------>
    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }

    public float getImc() throws Exception {
        return imc;
    }

    public String getSituacao() throws Exception {
        return situacao;
    }

    // SET ------------------------------------------------------------------------------>
    public void setNome(String nome) throws Exception {
        if (nome.trim().length() <= 1) {
            throw new Exception("nom001");
        }
        this.nome = nome;
    }

    public void setPeso(int peso) throws Exception {
        validarPeso(peso);
        this.peso = peso;
    }

    public void setAltura(float altura) throws Exception {
        validarAltura(altura);
        this.altura = altura;
    }

    public void setSexo(String sexo) throws Exception {
        if (!sexo.equals("Feminino") && !sexo.equals("Masculino")) {
            throw new Exception("sex001");
        }
        this.sexo = sexo;
    }

    public void setImc() throws Exception {
        validarPeso(peso);
        validarAltura(altura);

        imc = (peso / (altura * altura));
    }

    public void setSituacao() {
        if (imc < 17) {
            situacao = "Muito abaixo do peso";
        } else if (imc < 18.50) {
            situacao = "Abaixo do peso";
        } else if (imc < 25) {
            situacao = "Peso normal";
        } else if (imc < 35) {
            situacao = "Obesidade I";
        } else if (imc <= 40) {
            situacao = "Obesidade II (Severa)";
        } else {
            situacao = "Obesidade III (Mórbida)";
        }
    }

    // VALIDAÇÕES ----------------------------------------------------------------------->
    private void validarPeso(int peso) throws Exception {
        if (peso <= 0) {
            throw new Exception("pes001");
        }
    }

    private void validarAltura(float altura) throws Exception {
        if (altura <= 0) {
            throw new Exception("alt001");
        }
    }
}
