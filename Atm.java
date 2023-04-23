package atmapp;
import java.io.IOException;
public class Atm extends OptionsMenu
{
    public static void main(String[] args) throws IOException
    {
        OptionsMenu optionmenu= new OptionsMenu();  // calling OPtionsMenu CLass
        optionmenu.getLogin();   // calling getLogin method in OptionsMenu Class
    }
}

