import javax.swing.JOptionPane;

class Trabalho {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String escolha = JOptionPane.showInputDialog("Escolha uma opção:\n1- Distribuição de Alimentos\n2- Trabalho Voluntário\n3- Sair");

            switch (escolha) {
                case "1":
                    DistribuicaoAlimento distribuicaoAlimento = new DistribuicaoAlimento("Projeto A", "Distribuição de alimentos para comunidades carentes", "01/10/2023", "", "Cestas básicas", 1000);
                    validaEImprimeProjeto(distribuicaoAlimento);
                    break;

                case "2":
                    TrabalhoVoluntario trabalhoVoluntario = new TrabalhoVoluntario("Projeto B", "Ensino para crianças em áreas rurais", "01/11/2023", "01/12/2023", "Educação", 3);
                    validaEImprimeProjeto(trabalhoVoluntario);
                    break;

                case "3":
                    continuar = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void validaEImprimeProjeto(Object projeto) {
        if (projeto instanceof DistribuicaoAlimento) {
            DistribuicaoAlimento distribuicaoAlimento = (DistribuicaoAlimento) projeto;
            boolean valido = distribuicaoAlimento.validaProjeto(distribuicaoAlimento.getNomeProjeto());

            if (valido) {
                String info = distribuicaoAlimento.imprimeProjeto();
                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "Projeto inválido.");
            }
        } else if (projeto instanceof TrabalhoVoluntario) {
            TrabalhoVoluntario trabalhoVoluntario = (TrabalhoVoluntario) projeto;
            boolean valido = trabalhoVoluntario.validaProjeto(trabalhoVoluntario.getNomeProjeto());

            if (valido) {
                String info = trabalhoVoluntario.imprimeProjeto();
                JOptionPane.showMessageDialog(null, info);
            } else {
                JOptionPane.showMessageDialog(null, "Projeto inválido.");
            }
        }
    }
}
