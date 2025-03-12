package mesquita.model;

public class Personal {
    private String nome;
    private String whatsapp;


    public Personal(String nome, String whatsapp) {
        this.nome = nome;
        this.whatsapp = whatsapp;
    }

    public Personal(){
        this.nome = "";
        this.whatsapp = "(xx)xxxxx-xxxx";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Personal{" +
                "nome='" + nome + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                '}';
    }
}

