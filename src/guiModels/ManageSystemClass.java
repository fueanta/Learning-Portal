

package guiModels;

import database.db_handlers.DataProvider;
import database.db_handlers.DataUpdater;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManageSystemClass extends javax.swing.JPanel {

    /** Creates new form AddNewQuestionPanel */
    public ManageSystemClass() {
        initComponents();
        ArrayList<String> courseName = DataProvider.getCourseNames();
        courseCombo.removeAllItems();
        for(String s: courseName){
           courseCombo.addItem(s);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        topLabel = new javax.swing.JLabel();
        selectCourseLabel = new javax.swing.JLabel();
        courseCombo = new javax.swing.JComboBox<>();
        selectTopicLabel = new javax.swing.JLabel();
        topicCombo = new javax.swing.JComboBox<>();
        deleteCourseButton = new javax.swing.JButton();
        deleteTopicButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        topLabel.setBackground(new java.awt.Color(204, 255, 204));
        topLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        topLabel.setForeground(new java.awt.Color(102, 0, 51));
        topLabel.setText("Manage Topic and Course");

        selectCourseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectCourseLabel.setText("Select Course");

        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course 1", "Course 2", "Course 3", " " }));
        courseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboActionPerformed(evt);
            }
        });

        selectTopicLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectTopicLabel.setText("Select Topic");

        topicCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Topic 1", "Topic 2", "Topic 3" }));
        topicCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicComboActionPerformed(evt);
            }
        });

        deleteCourseButton.setBackground(new java.awt.Color(153, 0, 51));
        deleteCourseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteCourseButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteCourseButton.setText("Delete Course");
        deleteCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseButtonActionPerformed(evt);
            }
        });

        deleteTopicButton.setBackground(new java.awt.Color(153, 0, 51));
        deleteTopicButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteTopicButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteTopicButton.setText("Delete Topic");
        deleteTopicButton.setPreferredSize(new java.awt.Dimension(101, 23));
        deleteTopicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTopicButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(topicCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(deleteCourseButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteTopicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(selectTopicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(184, 184, 184)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectTopicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(courseCombo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(topicCombo)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteTopicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>                        

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String id = DataProvider.getCourseId((String)courseCombo.getSelectedItem());
        ArrayList<String> topicName = DataProvider.getTopicTitles(id);
        topicCombo.removeAllItems();
        for(String s: topicName){
           topicCombo.addItem(s);
        }
    }                                           

    private void topicComboActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void deleteCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        int confarmation = DataUpdater.deleteCourse((String)courseCombo.getSelectedItem());
        if(confarmation == 1){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Deleted Successfully !!");
        }
        else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Error !!");
        }
        courseCombo.removeItem((String)courseCombo.getSelectedItem());
    }                                                  

    private void deleteTopicButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        int confarmation = DataUpdater.deleteTopic((String)topicCombo.getSelectedItem());
        if(confarmation == 1){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Deleted Successfully !!");
            topicCombo.removeAllItems();
        }
        else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Error !!");
        }
    }                                                 

    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JButton deleteCourseButton;
    private javax.swing.JButton deleteTopicButton;
    private javax.swing.JLabel selectCourseLabel;
    private javax.swing.JLabel selectTopicLabel;
    private javax.swing.JLabel topLabel;
    private javax.swing.JComboBox<String> topicCombo;

}
