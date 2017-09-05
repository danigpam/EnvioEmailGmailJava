package teste;

import utilitarios.Email;

/**
 *
 * @author danigpam
 */
public class TesteEmail {
 
    public static void main(String[] args) {
        
        Email email = new Email();
        email.setNomeDestinatario("Destinatario");
        email.setEmailDestinatario("destinatario@gmail.com");
        email.setAssunto("Email de teste");
        email.setMensagem("Email enviado pelo metodo main");
        if (email.enviar()) {
            System.out.println("Enviado com sucesso");
        }else {
            System.out.println("Nao enviou");
        }
    }
}
