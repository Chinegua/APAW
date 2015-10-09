package es.upm.miw.webArchitecture.presentation.frontController;

import es.upm.miw.webArchitecture.presentation.models.Model;
import es.upm.miw.webArchitecture.presentation.presenters.UI1Presenter;
import es.upm.miw.webArchitecture.presentation.presenters.UI2Presenter;
import es.upm.miw.webArchitecture.presentation.presenters.UI3Presenter;
import es.upm.miw.webArchitecture.presentation.views.ErrorView;
import es.upm.miw.webArchitecture.presentation.views.UI1View;
import es.upm.miw.webArchitecture.presentation.views.UI2View;
import es.upm.miw.webArchitecture.presentation.views.UI3View;
import es.upm.miw.webArchitecture.presentation.views.View;

public class Dispatcher {

    public void get(Request request, Response response) {
        Model model = new Model();
        String presenter = request.getPath() + "Presenter";
        String nextView = request.getPath() + "View";

        switch (presenter) {
        case "UI1Presenter":
            UI1Presenter uI1Controller = new UI1Presenter();
            nextView = uI1Controller.process(model);
            break;
        case "UI2Presenter":
            UI2Presenter uI2Controller = new UI2Presenter();
            nextView = uI2Controller.process(model);
            break;
        case "UI3Presenter":
            UI3Presenter uI3Controller = new UI3Presenter();
            nextView = uI3Controller.process(model);
            break;
        }
        this.show(nextView, model);
    }

    public void post(Request request, Response response) {
        Model model = new Model();
        String controller = request.getPath() + "Presenter";
        String action = request.getParams().get("action");
        String nextView = request.getPath() + "View";

        switch (controller) {
        case "UI1Presenter":
            UI1Presenter uI1Controller = new UI1Presenter();
            if ("login".equals(action)) {
                // TODO uI1Controller.setters((request.getParams().get("param")));
                nextView = uI1Controller.login(model);
            } else if ("logout".equals(action)) {
                // TODO uI1Controller.setters((request.getParams().get("param")));
                nextView = uI1Controller.logout(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        case "UI2Presenter":
            UI2Presenter uI2Controller = new UI2Presenter();
            if ("action1".equals(action)) {
                // TODO uI2Controller.setters((request.getParams().get("param")));
                nextView = uI2Controller.useCase1(model);
            } else if ("action2".equals(action)) {
                // TODO uI2Controller.setters((request.getParams().get("param")));
                nextView = uI2Controller.useCase2(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        case "UI3Presenter":
            UI3Presenter uI3Controller = new UI3Presenter();
            if ("action3".equals(action)) {
                // TODO uI3Controller.setters((request.getParams().get("param")));
                nextView = uI3Controller.useCase3(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        }
        this.show(nextView, model);
    }

    private void show(String nextView, Model model) {
        View view;
        switch (nextView) {
        case "UI1View":
            view = new UI1View();
            break;
        case "UI2View":
            view = new UI2View();
            break;
        case "UI3View":
            view = new UI3View();
            break;
        default:
            view = new ErrorView();
            model.put("error", "Vista no encontrada: " + nextView);
        }
        view.show(model);
    }

}
