public class TesteConexao {
  public static void main(String[] args) {
    try (Conexao conexao = new Conexao()) {
      conexao.leDados();
    } catch (Exception ex) {
      System.out.println("Erro na conexao");
    }

    //    Conexao conexao = null;
    //    try {
    //      conexao = new Conexao();
    //      conexao.leDados();
    //
    //    } catch (Exception ex) {
    //      System.out.println("Erro na conexao");
    //    } finally {
    //      System.out.println("finally");
    //
    //      conexao.close();
    //    }
  }
}
