package by.it.lobkova.project.java.dao;

import by.it.lobkova.project.java.beans.Goal;
import by.it.lobkova.project.java.beans.Role;
import by.it.lobkova.project.java.beans.Task;
import by.it.lobkova.project.java.beans.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
    private static volatile Dao dao;
    private static int ID_INDEX = 1;

    public IDao<User> user;
    public IDao<Role> role;
    public IDao<Goal> goal;
    public IDao<Task> task;

    public void reset() {
        Connect.reset();
    }

    private Dao() {
        user = new UserDao();
        task = new TaskDao();
        goal = new GoalDao();
        role = new RoleDao();
    }

    public static Dao getDao() {
        if (dao == null) {
            synchronized (Dao.class) {
                if (dao == null) {
                    dao = new Dao();
                }
            }
        }
        return dao;
    }

    static boolean executeUpdate(String sql) throws SQLException {
        try (Connection connection = Connect.getConnection();
             Statement statement = connection.createStatement()) {
             return (ID_INDEX == statement.executeUpdate(sql));
        }
    }

    static long executeCreateAndGetId(String sql) throws SQLException {
        try (Connection connection = Connect.getConnection();
             Statement statement = connection.createStatement()) {
            if (ID_INDEX == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(ID_INDEX);
                }
            }
        }
        return -1;
    }
}
