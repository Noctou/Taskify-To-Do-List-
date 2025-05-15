package src;

import com.formdev.flatlaf.FlatDarkLaf;

import src.PromptWindows.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

import java.time.ZoneId;
import java.time.LocalDate;
import java.util.HashMap;

import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;

public class TaskifyApp extends javax.swing.JFrame {
    
    private String currentUser;

    private Map<LocalDate, List<Task>> tasksByDate = new HashMap<>();
    private Map<String, Task> tasksByTitle = new HashMap<>();
    
    public TaskifyApp(String username) {
        this.currentUser = username;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Taskify");
        currentUsername.setText(username);
        prioritizedContainer.setLayout(new BoxLayout(prioritizedContainer, BoxLayout.Y_AXIS));
        prioritizedContainer.setBackground(new Color(60, 60, 60));
        prioritizedContainer.setPreferredSize(new Dimension(600, 300));
        loadTasksFromDatabase();
        updateCalendarDisplay();
    }
    
    public JTabbedPane getTaskEntries() {
        revalidate();
        repaint();
        return taskEntries;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        tabPanel = new javax.swing.JTabbedPane();
        menuPanel = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        currentUsername = new javax.swing.JLabel();
        introductoryText = new javax.swing.JLabel();
        editInfoButton = new javax.swing.JButton();
        prioritizedContainer = new javax.swing.JPanel();
        tasksPanel = new javax.swing.JPanel();
        taskListContainer = new javax.swing.JPanel();
        taskEntries = new javax.swing.JTabbedPane();
        addTaskButton = new javax.swing.JButton();
        removeTaskButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        prioritizeButton = new javax.swing.JButton();
        calendarPanel = new javax.swing.JPanel();
        calendarContainer = new javax.swing.JPanel();
        calendar = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(39, 39, 39));

        tabPanel.setBackground(new java.awt.Color(102, 102, 102));
        tabPanel.setForeground(new java.awt.Color(255, 255, 255));
        tabPanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabPanel.setToolTipText("");
        tabPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabPanel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        menuPanel.setBackground(new java.awt.Color(51, 51, 51));
        menuPanel.setForeground(new java.awt.Color(255, 255, 255));
        menuPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logOutButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Log out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        currentUsername.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        currentUsername.setForeground(new java.awt.Color(255, 255, 255));
        currentUsername.setText("[Username here]");

        introductoryText.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        introductoryText.setText("Currently Logged In as:");

        editInfoButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        editInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        editInfoButton.setText("Edit Info");
        editInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInfoButtonActionPerformed(evt);
            }
        });

        prioritizedContainer.setBackground(new java.awt.Color(51, 51, 51));
        prioritizedContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        prioritizedContainer.setMaximumSize(new java.awt.Dimension(500, 300));
        prioritizedContainer.setPreferredSize(new java.awt.Dimension(600, 300));

        javax.swing.GroupLayout prioritizedContainerLayout = new javax.swing.GroupLayout(prioritizedContainer);
        prioritizedContainer.setLayout(prioritizedContainerLayout);
        prioritizedContainerLayout.setHorizontalGroup(
            prioritizedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        prioritizedContainerLayout.setVerticalGroup(
            prioritizedContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(introductoryText)
                    .addComponent(currentUsername)
                    .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editInfoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                .addGap(53, 53, 53)
                .addComponent(prioritizedContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prioritizedContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(introductoryText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currentUsername)
                        .addGap(18, 18, 18)
                        .addComponent(editInfoButton)
                        .addGap(18, 18, 18)
                        .addComponent(logOutButton)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tabPanel.addTab("Menu", menuPanel);

        tasksPanel.setBackground(new java.awt.Color(51, 51, 51));
        tasksPanel.setForeground(new java.awt.Color(255, 255, 255));
        tasksPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        taskListContainer.setBackground(new java.awt.Color(51, 51, 51));
        taskListContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        taskEntries.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        javax.swing.GroupLayout taskListContainerLayout = new javax.swing.GroupLayout(taskListContainer);
        taskListContainer.setLayout(taskListContainerLayout);
        taskListContainerLayout.setHorizontalGroup(
            taskListContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskEntries, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        taskListContainerLayout.setVerticalGroup(
            taskListContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(taskEntries, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        addTaskButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        addTaskButton.setForeground(new java.awt.Color(255, 255, 255));
        addTaskButton.setText("Add");
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });

        removeTaskButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        removeTaskButton.setForeground(new java.awt.Color(255, 255, 255));
        removeTaskButton.setText("Done");
        removeTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTaskButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        prioritizeButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        prioritizeButton.setForeground(new java.awt.Color(255, 255, 255));
        prioritizeButton.setText("Prioritize");
        prioritizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioritizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tasksPanelLayout = new javax.swing.GroupLayout(tasksPanel);
        tasksPanel.setLayout(tasksPanelLayout);
        tasksPanelLayout.setHorizontalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tasksPanelLayout.createSequentialGroup()
                        .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(editButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(prioritizeButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taskListContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        tasksPanelLayout.setVerticalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tasksPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(addTaskButton)
                        .addGap(18, 18, 18)
                        .addComponent(editButton)
                        .addGap(18, 18, 18)
                        .addComponent(prioritizeButton))
                    .addGroup(tasksPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(taskListContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeTaskButton)
                .addContainerGap())
        );

        tabPanel.addTab("Tasks", tasksPanel);

        calendarPanel.setBackground(new java.awt.Color(51, 51, 51));

        calendarContainer.setBackground(new java.awt.Color(51, 51, 51));
        calendarContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        javax.swing.GroupLayout calendarContainerLayout = new javax.swing.GroupLayout(calendarContainer);
        calendarContainer.setLayout(calendarContainerLayout);
        calendarContainerLayout.setHorizontalGroup(
            calendarContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendar, javax.swing.GroupLayout.DEFAULT_SIZE, 1032, Short.MAX_VALUE)
        );
        calendarContainerLayout.setVerticalGroup(
            calendarContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout calendarPanelLayout = new javax.swing.GroupLayout(calendarPanel);
        calendarPanel.setLayout(calendarPanelLayout);
        calendarPanelLayout.setHorizontalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(calendarContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        calendarPanelLayout.setVerticalGroup(
            calendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(calendarContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tabPanel.addTab("Calendar", calendarPanel);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        AddTaskWindow addWindow = new AddTaskWindow(this, this.currentUser);
        addWindow.setVisible(true);
    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void removeTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTaskButtonActionPerformed
        int selectedIndex = taskEntries.getSelectedIndex();
    if (selectedIndex != -1) {
        String taskTitle = taskEntries.getTitleAt(selectedIndex);

        // Remove the "★ " prefix if present
        String cleanTitle = taskTitle.startsWith("★ ") ? taskTitle.substring(2) : taskTitle;

        Task taskToDelete = tasksByTitle.get(cleanTitle.toLowerCase());
        if (taskToDelete == null) {
            JOptionPane.showMessageDialog(this, "Task not found.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you done with " + cleanTitle + "? It will be removed.",
                "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = TaskDatabase.deleteTask(cleanTitle);
            if (success) {
                taskEntries.remove(selectedIndex);

                LocalDate deadline = taskToDelete.getDeadline().toLocalDateTime().toLocalDate();
                List<Task> tasksOnDate = tasksByDate.get(deadline);
                if (tasksOnDate != null) {
                    tasksOnDate.remove(taskToDelete);
                    if (tasksOnDate.isEmpty()) {
                        tasksByDate.remove(deadline);
                    }
                }
                tasksByTitle.remove(cleanTitle.toLowerCase());

                // Optional: Remove from prioritized panel if it exists
                for (Component comp : prioritizedContainer.getComponents()) {
                    if (comp instanceof JLabel label && label.getText().equals(cleanTitle)) {
                        prioritizedContainer.remove(label);
                        break;
                    }
                }
                prioritizedContainer.revalidate();
                prioritizedContainer.repaint();

                JOptionPane.showMessageDialog(this, "Task deleted successfully.");

                refreshCalendarHighlighting();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete task from database.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to remove.");
        }
    }//GEN-LAST:event_removeTaskButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Task selectedTask = getCurrentlySelectedTask();
        if(selectedTask != null) {
            new EditTaskWindow(this, selectedTask).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task first!");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        new LogIn().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void editInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInfoButtonActionPerformed
        EditUserDetails editWindow = new EditUserDetails(currentUser);
        editWindow.setVisible(true);
    }//GEN-LAST:event_editInfoButtonActionPerformed

    private void prioritizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioritizeButtonActionPerformed
        Task selectedTask = getCurrentlySelectedTask();
        if (selectedTask == null) {
            JOptionPane.showMessageDialog(this, "Please select a task to prioritize.");
            return;
        }

        selectedTask.setPriority(true);
        String currentTitle = selectedTask.getTitle();

        boolean updated = TaskDatabase.updateTask(
            currentTitle,
            currentTitle,
            selectedTask.getDescription(),
            selectedTask.getDeadline(),
            true
        );

        if (updated) {
            int selectedIndex = taskEntries.getSelectedIndex();

            if (!currentTitle.startsWith("★ ")) {
                taskEntries.setTitleAt(selectedIndex, "★ " + currentTitle);
            }

            JLabel priorityLabel = new JLabel("  ★ " + currentTitle);
            priorityLabel.setForeground(Color.MAGENTA);
            prioritizedContainer.add(priorityLabel);
            prioritizedContainer.revalidate();
            prioritizedContainer.repaint();
            

            JOptionPane.showMessageDialog(this, "Task marked as priority.");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update priority in database.");
        }
    }//GEN-LAST:event_prioritizeButtonActionPerformed

    private Task getCurrentlySelectedTask() {
        int selectedIndex = taskEntries.getSelectedIndex();
        if (selectedIndex == -1) return null;

        String title = taskEntries.getTitleAt(selectedIndex);
        if (title.startsWith("★ ")) {
            title = title.substring(2);  // Remove star prefix
        }

        for (List<Task> taskList : tasksByDate.values()) {
            for (Task task : taskList) {
                if (task.getTitle().equals(title)) {
                    return task;
                }
            }
        }
        return null;
    }
    
    public void removeTaskFromMaps(String oldTitle) {
        Task task = tasksByTitle.remove(oldTitle);
        if(task != null && task.getDeadline() != null) {
            LocalDate oldDate = task.getDeadline().toLocalDateTime().toLocalDate();
            List<Task> tasksOnDate = tasksByDate.get(oldDate);
            if(tasksOnDate != null) {
                tasksOnDate.remove(task);
                if(tasksOnDate.isEmpty()) {
                    tasksByDate.remove(oldDate);
                }
            }
        }
    }

    public void addTaskToMaps(Task task) {
        tasksByTitle.put(task.getTitle(), task);
        LocalDate newDate = task.getDeadline().toLocalDateTime().toLocalDate();
        tasksByDate.computeIfAbsent(newDate, k -> new ArrayList<>()).add(task);
    }
    
    public void addTaskToPanel(Task task) {
        JPanel taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        taskPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        taskPanel.setBackground(new Color(60, 60, 60));

        JLabel descLabel = new JLabel("<html><b>Description:</b> " + task.getDescription() + "</html>");
        descLabel.setName("descriptionLabel");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
        String formatted = task.getDeadline() != null ? format.format(task.getDeadline()) : "None";

        JLabel deadlineLabel = new JLabel("<html><b>Deadline:</b> " + formatted + "</html>");
        deadlineLabel.setName("deadlineLabel");

        descLabel.setForeground(Color.WHITE);
        deadlineLabel.setForeground(Color.WHITE);

        taskPanel.add(descLabel);
        taskPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        taskPanel.add(deadlineLabel);

        String displayTitle = task.isPriority() ? "★ " + task.getTitle() : task.getTitle();
        taskEntries.addTab(displayTitle, taskPanel);    
        taskEntries.setSelectedComponent(taskPanel);
        tasksByTitle.put(task.getTitle(), task);
    }
       
    public void loadTasksFromDatabase() {
        tasksByDate.clear();
        tasksByTitle.clear();

        try(Connection connect = InsertUserToDatabase.LocalDatabaseConnect();
             Statement statement = connect.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT taskTitle, taskDescription, taskDeadline, isPriority FROM task")) {

            while(resultSet.next()) {
                String title = resultSet.getString("taskTitle");
                String description = resultSet.getString("taskDescription");
                java.sql.Date deadline = resultSet.getDate("taskDeadline");

                Task task = new Task(title, description, new java.sql.Timestamp(deadline.getTime()));
                task.setPriority(resultSet.getBoolean("isPriority"));
                tasksByTitle.put(title, task);

                addTaskToPanel(task);
    
                if(deadline != null) {
                    LocalDate localDate = deadline.toLocalDate();
                    tasksByDate.computeIfAbsent(localDate, k -> new ArrayList<>())
                              .add(task);
                }
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        taskEntries.revalidate();
        taskEntries.repaint();
        
        loadPrioritizedTasks();
    }
    
    private void updateCalendarDisplay() {
        calendar.getDayChooser().addDateEvaluator(new TaskDateEvaluator(tasksByDate));

        calendar.updateUI();

        calendar.addPropertyChangeListener("calendar", evt -> {
            Date selectedDate = calendar.getDate();
            if(selectedDate != null) {
                showTasksForDate(selectedDate);
            }
        });
    }
    
    private void showTasksForDate(Date date) {
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        java.util.List<Task> tasks = tasksByDate.get(localDate);

        if(tasks != null && !tasks.isEmpty()) {
            StringBuilder message = new StringBuilder("Tasks for " + localDate.toString() + ":\n\n");
            for(Task task : tasks) {
                message.append("• ").append(task.getTitle());
                if(task.isCompleted()) {
                    message.append(" (Completed)");
                }
                message.append("\n");
            }
            JOptionPane.showMessageDialog(this, message.toString());
        } else {
            JOptionPane.showMessageDialog(this, "No tasks for " + localDate.toString());
        }
    }

    public class TaskDateEvaluator implements com.toedter.calendar.IDateEvaluator {
        private Date currentDateBeingEvaluated;
        private Map<LocalDate, List<Task>> tasksByDate;
        public TaskDateEvaluator(Map<LocalDate, List<Task>> tasksByDate) {
            this.tasksByDate = tasksByDate;
        }

        @Override
        public boolean isSpecial(Date date) {
            currentDateBeingEvaluated = date;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            LocalDate localDate = LocalDate.of(year, month, day);
            return tasksByDate.containsKey(localDate);
        }

        @Override
        public Color getSpecialForegroundColor() {
            return Color.WHITE;
        }

        @Override
        public Color getSpecialBackroundColor() {
            if(currentDateBeingEvaluated == null) return null;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(currentDateBeingEvaluated);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            LocalDate localDate = LocalDate.of(year, month, day);
            List<Task> tasks = tasksByDate.getOrDefault(localDate, new ArrayList<>());
            boolean hasIncomplete = tasks.stream().anyMatch(task -> !task.isCompleted());

            return hasIncomplete ? new Color(0, 150, 0) : new Color(100, 100, 100);
        }

        @Override
        public String getSpecialTooltip() {
            return "Tasks due";
        }

        @Override public boolean isInvalid(Date date) { return false; }
        @Override public Color getInvalidForegroundColor() { return null; }
        @Override public Color getInvalidBackroundColor() { return null; }
        @Override public String getInvalidTooltip() { return null; }
    }
    
    public void refreshCalendarHighlighting() {
        loadAllTasksForCalendar();

        Date currentDate = calendar.getDate();
        Calendar tempCal = Calendar.getInstance();
        tempCal.add(Calendar.DAY_OF_MONTH, 1);
        calendar.setDate(tempCal.getTime());
        calendar.setDate(currentDate);

        calendar.getDayChooser().addDateEvaluator(new TaskDateEvaluator(tasksByDate));

        calendar.getDayChooser().repaint();
        calendar.repaint();
    }
    
    private void loadAllTasksForCalendar() {
        tasksByDate.clear();
        List<Task> allTasks = TaskDatabase.getAllTasks();
        for(Task task : allTasks) {
            LocalDate deadline = task.getDeadline().toLocalDateTime().toLocalDate();
            tasksByDate.computeIfAbsent(deadline, k -> new ArrayList<>()).add(task);
        }
    }
    
    private void loadPrioritizedTasks() {
        prioritizedContainer.removeAll();
        
        JLabel header = new JLabel(" Prioritized Tasks:");
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Monospaced", Font.BOLD, 12));
        prioritizedContainer.add(header);

        for(Task task : tasksByTitle.values()) {
            if(task.isPriority()) {
                JLabel priorityLabel = new JLabel(" ★ " + task.getTitle());
                priorityLabel.setForeground(Color.MAGENTA);
                priorityLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));
                prioritizedContainer.add(priorityLabel);
            }
        }
        prioritizedContainer.revalidate();
        prioritizedContainer.repaint();
    }
    
    public static void main(String args[]) {
        FlatDarkLaf.setup();
        
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch( Exception ex ) {
            System.err.println("Failed to initialize LaF");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTaskButton;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JPanel calendarContainer;
    private javax.swing.JPanel calendarPanel;
    private javax.swing.JPanel container;
    private javax.swing.JLabel currentUsername;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editInfoButton;
    private javax.swing.JLabel introductoryText;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton prioritizeButton;
    private javax.swing.JPanel prioritizedContainer;
    private javax.swing.JButton removeTaskButton;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTabbedPane taskEntries;
    private javax.swing.JPanel taskListContainer;
    private javax.swing.JPanel tasksPanel;
    // End of variables declaration//GEN-END:variables
}
