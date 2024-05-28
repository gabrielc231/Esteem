package org.esteem.view;

import org.esteem.controller.EsteemController;


public interface AppView {
    public void clearInterface();
    public void showOptions();
    public void registerController(EsteemController controller);
    public int getUserInput() throws Exception;
}   
