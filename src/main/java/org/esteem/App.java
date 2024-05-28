package org.esteem;
import org.esteem.controller.EsteemController;
import org.esteem.model.Cliente;
import org.esteem.model.Loja;
import org.esteem.view.AppView;
import org.esteem.view.DeveloperView;

public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente = new Cliente(0,"Roberto");
        Loja loja = new Loja();

        AppView view = new DeveloperView();
        EsteemController controller = new EsteemController(cliente,loja);
        
        DeveloperView developerView = new DeveloperView();
        developerView.registerController(controller);
        developerView.modoDevMenu();
    }
}
