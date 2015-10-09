package es.upm.miw.pd.voting;

import es.upm.miw.pd.voting.solution.business.models.daos.DaoFactory;
import es.upm.miw.pd.voting.solution.business.models.daos.memory.DaoFactoryMemory;
import es.upm.miw.pd.voting.solution.presentation.frontController.FrontController;
import es.upm.miw.pd.voting.solution.presentation.frontController.Request;
import es.upm.miw.pd.voting.solution.presentation.frontController.Response;

public class FrontControllerMain {
    private FrontController frontController;

    public FrontControllerMain() {
        frontController = new FrontController();
    }

    public void voting(){
        Request request = new Request();
        Response response = new Response();
        request.setPath("Voting");
        frontController.doGet(request, response);        
    }
    
    public void votingVoteTheme(String themeName, int value) {
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("action", "voteTheme");
        request.getParams().put("themeName", themeName);
        request.getParams().put("value", "" + value);
        request.setPath("Voting");
        frontController.doPost(request, response);
    }

    public void themeManager(){
        Request request = new Request();
        Response response = new Response();
        request.setPath("ThemeManager");
        frontController.doGet(request, response);        
    }
    
    public void themeManagerCreateTheme(String themeName){
        Request request = new Request();
        Response response = new Response();
        request.getParams().put("action", "createTheme");
        request.getParams().put("themeName", themeName);
        request.setPath("ThemeManager");
        frontController.doPost(request, response);
    }
    

    public static void main(String[] args) {
        DaoFactory.setFactory(new DaoFactoryMemory());
        FrontControllerMain main = new FrontControllerMain();
        System.out.println("-------ooo  Voting  ooo----------------------------");
        main.voting();
        System.out.println("-------ooo  ThemeManager  ooo----------------------------");
        main.themeManager();
        main.themeManagerCreateTheme("Tema 1");
        main.themeManagerCreateTheme("Tema 2");
        System.out.println("-------ooo  Home  ooo----------------------------");
        main.votingVoteTheme("Tema 1", 4);
        main.votingVoteTheme("Tema 1", 6);
        main.votingVoteTheme("Tema 1", 5);
        main.votingVoteTheme("Tema 2", 5);
        System.out.println("---------------------ooooo----------------------------");
    }

}
