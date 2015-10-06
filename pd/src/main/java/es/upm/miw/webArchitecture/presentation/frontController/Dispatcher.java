package es.upm.miw.webArchitecture.presentation.frontController;

import es.upm.miw.webArchitecture.presentation.controllers.UI1Controller;
import es.upm.miw.webArchitecture.presentation.controllers.UI2Controller;
import es.upm.miw.webArchitecture.presentation.controllers.UI3Controller;
import es.upm.miw.webArchitecture.presentation.models.Model;
import es.upm.miw.webArchitecture.presentation.views.ErrorView;
import es.upm.miw.webArchitecture.presentation.views.UI1View;
import es.upm.miw.webArchitecture.presentation.views.UI2View;
import es.upm.miw.webArchitecture.presentation.views.UI3View;
import es.upm.miw.webArchitecture.presentation.views.View;

public class Dispatcher {

    public void get(Request request, Response response) {
        Model model = new Model();
        String controller = request.getPath() + "Controller";
        String nextView = request.getPath() + "View";

        switch (controller) {
        case "UI1Controller":
            UI1Controller uI1Controller = new UI1Controller();
            nextView = uI1Controller.process(model);
            break;
        case "UI2Controller":
            UI2Controller uI2Controller = new UI2Controller();
            nextView = uI2Controller.process(model);
            break;
        case "UI3Controller":
            UI3Controller uI3Controller = new UI3Controller();
            nextView = uI3Controller.process(model);
            break;
        }
        this.show(nextView, model);
    }

    public void post(Request request, Response response) {
        Model model = new Model();
        String controller = request.getPath() + "Controller";
        String action = request.getParams().get("action");
        String nextView = request.getPath() + "View";

        switch (controller) {
        case "UI1Controller":
            UI1Controller uI1Controller = new UI1Controller();
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
        case "UI2Controller":
            UI2Controller uI2Controller = new UI2Controller();
            if ("useCase1".equals(action)) {
                // TODO uI2Controller.setters((request.getParams().get("param")));
                nextView = uI2Controller.useCase1(model);
            } else if ("useCase2".equals(action)) {
                // TODO uI2Controller.setters((request.getParams().get("param")));
                nextView = uI2Controller.useCase2(model);
            } else {
                model.put("error", "Acción no permitida: " + action);
            }
            break;
        case "UI3Controller":
            UI3Controller uI3Controller = new UI3Controller();
            if ("useCase3".equals(action)) {
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
