
package user.Cadastramento;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



public class salvardados {
    private String Email;
    private String nick_name;
    private String senha;
    public boolean salvardados;

    
    public String getEmail() {
        return Email;
    }

   
    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    public String getNick_name() {
        return nick_name;
    }

    
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

   
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
   public boolean salvardados(){
   
        try {
            FileWriter FW = new FileWriter("..\\user\\usuario\\usuario "+this.nick_name);
            PrintWriter PW = new PrintWriter(FW);
            
            PW.println(this.Email);
            PW.println(this.nick_name);
            PW.println(this.senha);
            
            PW.flush();
            PW.close();
            FW.close();
           
        } catch (IOException ex) {
            Logger.getLogger(salvardados.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   return true;
   }

   
}
