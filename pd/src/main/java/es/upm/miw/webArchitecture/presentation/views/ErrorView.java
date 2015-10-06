package es.upm.miw.webArchitecture.presentation.views;

import es.upm.miw.webArchitecture.presentation.models.Model;

public class ErrorView implements View {

    @Override
    public void show(Model model) {
        System.out.println("ErrorView \n  error: "+ model.get("error"));
    }

}
