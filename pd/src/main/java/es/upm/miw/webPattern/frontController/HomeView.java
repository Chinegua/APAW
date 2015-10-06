package es.upm.miw.webPattern.frontController;

public class HomeView implements View {

    @Override
    public void show(Model model) {
        System.out.println("Home Page \n   msg: " + model.get("msg"));
    }

}
