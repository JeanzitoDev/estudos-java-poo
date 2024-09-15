package br.edu.fatecfranca.exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente() {
    }

    public Cliente(float saldo, String nome, String numeroAgencia, String numeroConta) {
        this.setSaldo(saldo);
        this.setNome(nome);
        this.setNumeroAgencia(numeroAgencia);
        this.setNumeroConta(numeroConta);
    }

    public String getNumeroConta() {

        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8){
            if(numeroConta.charAt(6) == '-'){
                this.numeroConta = numeroConta;

            }
            else{
                System.out.println("Numero da conta sem dígito verificador");
            }
        }
        else{
            this.numeroConta = "";
            System.out.println("Número da conta invádo");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6){
            if(numeroAgencia.charAt(4) == '-'){
                this.numeroAgencia = numeroAgencia;
            }
            else{
                this.numeroAgencia = "";
                System.out.println("Sem dígito verificador da agência");
            }
        }
        else{
            this.numeroAgencia = "";
            System.out.println("Número da agência invádo");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else {
            this.nome = nome;
            System.out.println("Nome excedeu tamanho permitido!");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo >=0){
            this.saldo = saldo;
        }
        else{
            System.out.println("Saque não permitido!");
        }
    }

    public void depositar (float x){
        this.setSaldo(this.getSaldo() + x);
    }

    public void sacar(float x){
        this.setSaldo(this.getSaldo() - x);
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "\nnumeroConta='" + numeroConta + '\'' +
                ",\nnumeroAgencia='" + numeroAgencia + '\'' +
                ",\nnome='" + nome + '\'' +
                ",\nsaldo=" + saldo +
                '}' + "\n";
    }
}


