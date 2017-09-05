package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utilitarios.Email;

/**
 *
 * @author danigpam
 */
@WebServlet(name = "TesteEmail", urlPatterns = {"/TesteEmail"})
public class TesteEmail extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Email email = new Email();
        email.setNomeDestinatario("Destinatario");
        email.setEmailDestinatario("destinatario@gmail.com");
        email.setAssunto("Email de teste");
        email.setMensagem("Email enviado pela servlet");
        if (email.enviar()) {
            response.getWriter().println("Enviado com sucesso");
        }else {
            response.getWriter().println("Nao enviou");
        }
    }
}
