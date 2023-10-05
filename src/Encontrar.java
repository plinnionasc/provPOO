import javax.swing.*;

public class Encontrar {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Maria", "maria@gmail.com", "987654321");
        AchadoPerdido achado = new AchadoPerdido("Chave", "Chave encontrada", "Sala de estar", "chave.jpg", "Objeto", "Disponível");

        // Exibindo detalhes
        achado.visualizaDetalhes();

        // Buscando título
        String tituloBuscado = "Chave";
        String resultadoBusca = achado.buscarTitulo(tituloBuscado);
        JOptionPane.showMessageDialog(null, resultadoBusca);
    }
}
