package es.upm.miw.webArchitecture.presentation.controllers;

import es.upm.miw.webArchitecture.presentation.models.Model;

public class UI1Controller {

    public String process(Model model) {
        model.put("log", "UI1Controller:process");
        return "UI1View";
    }

    public String login(Model model) {
        model.put("log", "UI1Controller:login");
        return "UI1View";
    }

    public String logout(Model model) {
        model.put("log", "UI1Controller:logout");
        return "UI1View";
    }

}
