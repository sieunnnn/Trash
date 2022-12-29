package src.multiCampus.assignment.firstAssignment.jdbc;

import java.sql.SQLException;

public class DataAccessException extends RuntimeException{
    public DataAccessException (SQLException e) {
        super(e);
    }
}
