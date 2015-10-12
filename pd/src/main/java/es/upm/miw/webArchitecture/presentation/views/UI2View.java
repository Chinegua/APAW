package es.upm.miw.webArchitecture.presentation.views;

import es.upm.miw.webArchitecture.presentation.models.Model;

public class UI2View implements View{

    @Override
    public void show(Model model) {
        System.out.println("UI2View");
        System.out.println("   " + model.get("log"));
    }

}
