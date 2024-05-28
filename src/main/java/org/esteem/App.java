package org.esteem;
import org.esteem.controller.EsteemController;
import org.esteem.model.Cliente;
import org.esteem.model.Loja;
import org.esteem.view.DeveloperView;

public class App 
{
    public static void main( String[] args )
    {
        EsteemController controller = new EsteemController();
        DeveloperView developerView = new DeveloperView();
        Cliente cliente = new Cliente(0,"Roberto");
        Loja loja = new Loja();
        controller.modoDevMenu(developerView, cliente, loja);
    }
}
