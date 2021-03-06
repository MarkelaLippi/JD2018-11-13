package by.it.naumenko.project2.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public class CommandLogOut extends Command {
    @Override
    public Actions exequit(HttpServletRequest request, HttpServletResponse response) throws SiteException, SQLException {
        if (!Util.checkUser(request))
            return Actions.LOGIN;

        if (Form.isPost(request)) {
            if (Form.getString(request, "logout") != null) {

               Util.deleteCookie(request,response);
               return Actions.LOGIN;
            }
        }
        return Actions.PROFILE;
    }
}
