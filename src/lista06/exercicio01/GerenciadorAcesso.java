enum NivelAcesso {
    ADMIN,
    MODERADOR,
    USUARIO
}

public class GerenciadorAcesso {
    public static void verificarPermissao(NivelAcesso nivel) {
        switch (nivel) {
            case ADMIN:
                System.out.println("O administrador acessa todos os recursos.");
                break;
            case MODERADOR:
                System.out.println("O moderador pode gerenciar posts e usuários.");
                break;
            case USUARIO:
                System.out.println("O usuário pode visualizar o conteúdo e fazer postagens.");
                break;
            default:
                System.out.println("Nível de acesso desconhecido.");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Verificando permissões para cada nível de acesso:");

        System.out.print("Entrada: NivelAcesso.ADMIN -> Saída: ");
        verificarPermissao(NivelAcesso.ADMIN);

        System.out.print("Entrada: NivelAcesso.MODERADOR -> Saída: ");
        verificarPermissao(NivelAcesso.MODERADOR);

        System.out.print("Entrada: NivelAcesso.USUARIO -> Saída: ");
        verificarPermissao(NivelAcesso.USUARIO);
    }
}