package classes;

/**
 *
 * @author vovo
 */
public class Erro {

    // ATRIBUTOS ------------------------------------------------------------------------>
    private String codigo = "";
    private String mensagem = "";

    // MÉTODOS -------------------------------------------------------------------------->
    // CONSTRUTOR ----------------------------------------------------------------------->
    public Erro(Exception erro) {
        setMensagem(erro.getMessage());
    }

    // GET ------------------------------------------------------------------------------>
    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    // SET ------------------------------------------------------------------------------>
    private void setMensagem(String codigo) {

        this.codigo = codigo;

        switch (codigo) {
            case "nom001":
                mensagem = "Nome inválido!";
                break;

            case "pes001":
                mensagem = "Peso inválido!";
                break;

            case "alt001":
                mensagem = "Altura inválida!";
                break;

            case "sex001":
                mensagem = "Sexo inválido!";
                break;

            default:
                this.codigo = "err000";
                mensagem = codigo;
        }
    }
}
