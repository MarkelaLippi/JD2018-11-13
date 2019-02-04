package by.it.naumenko.project2.java.controller;

import javax.servlet.http.HttpServletRequest;

class ActionDefiner {

    static Actions define(HttpServletRequest request){
        Actions resultat = Actions.INDEX;
        String command = request.getParameter("command");
        if (command!=null && !command.isEmpty()){
            try {
                resultat = Actions.valueOf(command.toUpperCase());
            }
            catch (IllegalArgumentException ignored){

            }
        }
        return resultat;
    }


}
