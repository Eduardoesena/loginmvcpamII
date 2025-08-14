package android.eduardo.loginmvc.datamodel;

public class UsuarioDataModel {
    public static final String TABELA ="usuario";
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIl = "email";
    public static final String SENHA = "senha";

    public static  String queryCriarTabela = "";
    public String criarTabela = "";
    public static String criarTabela(){
        queryCriarTabela += "CREAT TABELA" + TABELA + "(";
        queryCriarTabela += ID+ "int primary key autoincrement";
        queryCriarTabela += NOME + " text,";
        queryCriarTabela += EMAIl + " text,";
        queryCriarTabela += SENHA + " text,";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }
}
