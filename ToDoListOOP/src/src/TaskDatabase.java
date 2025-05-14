package src;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import static src.InsertUserToDatabase.LocalDatabaseConnect;

public class TaskDatabase {
    public static boolean deleteTask(String taskTitle) {      
        String deleteSQL = "DELETE FROM task WHERE taskTitle = ?";
        
        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement query = connect.prepareStatement(deleteSQL)) {
            
            query.setString(1, taskTitle);
            return query.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean insertTask(Task task) {
    String sql = "INSERT INTO task (taskTitle, taskDescription, taskDeadline, isPriority) VALUES (?, ?, ?, ?)";
    
    try (Connection conn = LocalDatabaseConnect();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, task.getTitle());
        stmt.setString(2, task.getDescription());
        stmt.setTimestamp(3, task.getDeadline());
        stmt.setBoolean(4, task.isPriority());
        
        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    
    public static boolean updateTask(String originalTitle, String newTitle, String newDescription, Date newDeadline, boolean isPriority) {
        String updateSQL = "UPDATE task SET taskTitle = ?, taskDescription = ?, taskDeadline = ?, isPriority = ? WHERE taskTitle = ?";

        try (Connection connect = InsertUserToDatabase.LocalDatabaseConnect();
             PreparedStatement query = connect.prepareStatement(updateSQL)) {

            query.setString(1, newTitle);
            query.setString(2, newDescription);
            query.setTimestamp(3, new java.sql.Timestamp(newDeadline.getTime()));
            query.setBoolean(4, isPriority);
            query.setString(5, originalTitle);

            int rowsAffected = query.executeUpdate();
            return rowsAffected > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean updateTask(String originalTitle, String newTitle, String newDescription, Date newDeadline) {
        // Look up current priority status
        Task task = getTaskByTitle(originalTitle);
        boolean isPriority = task != null && task.isPriority();

        // Call the main version with 5 values
        return updateTask(originalTitle, newTitle, newDescription, newDeadline, isPriority);
    }

    
    public static boolean taskExists(String title) {
        String checkSQL = "SELECT COUNT(*) FROM task WHERE taskTitle = ?";

        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement query = connect.prepareStatement(checkSQL)) {

            query.setString(1, title);
            ResultSet resultSet = query.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    
    private Timestamp deadline;
    
    public static List<Task> getTasksForMonth(int year, int month) {
        String sql = "SELECT * FROM task WHERE YEAR(taskDeadline) = ? AND MONTH(taskDeadline) = ?";
        List<Task> tasks = new ArrayList<>();

        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            
            stmt.setInt(1, year);
            stmt.setInt(2, month);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Task task = new Task(
                    rs.getString("taskTitle"),
                    rs.getString("taskDescription"),
                    rs.getTimestamp("taskDeadline")
                );
                task.setPriority(rs.getBoolean("isPriority"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static List<Task> getTasksForDate(LocalDate date) {
        String sql = "SELECT * FROM task WHERE taskDeadline = ?";
        List<Task> tasks = new ArrayList<>();

        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            
            stmt.setDate(1, java.sql.Date.valueOf(date));
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Task task = new Task(
                    rs.getString("taskTitle"),
                    rs.getString("taskDescription"),
                    rs.getTimestamp("taskDeadline")
                );
                task.setPriority(rs.getBoolean("isPriority"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static List<Task> getAllTasks() {
        String sql = "SELECT * FROM task";
        List<Task> tasks = new ArrayList<>();

        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement stmt = connect.prepareStatement(sql)) {
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Task task = new Task(
                    rs.getString("taskTitle"),
                    rs.getString("taskDescription"),
                    rs.getTimestamp("taskDeadline")
                );
                task.setPriority(rs.getBoolean("isPriority"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }
    
    public Timestamp getDeadline() {
    return deadline;
    }
    
    public static Task getTaskByTitle(String title) {
        String sql = "SELECT * FROM task WHERE taskTitle = ?";
        try (Connection connect = LocalDatabaseConnect();
             PreparedStatement stmt = connect.prepareStatement(sql)) {

            stmt.setString(1, title);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Task task = new Task(
                    rs.getString("taskTitle"),
                    rs.getString("taskDescription"),
                    rs.getTimestamp("taskDeadline")
                );
                task.setPriority(rs.getBoolean("isPriority"));
                return task;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
