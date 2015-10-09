package es.upm.miw.webArchitecture.presentation.presenters;

import es.upm.miw.webArchitecture.presentation.models.Model;

public class UI1Presenter {

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
