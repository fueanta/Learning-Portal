package specialGUI;

import classModels.Course;
import classModels.Member;
import database.db_handlers.DataProvider;
import guiModels.MembersPortalClass;
import main.LearningPortal;
import others.ResourceProvider;

import static main.LearningPortal.*;

/**
 * Created by Taqui on 5/2/2017.
 */
public class CourseSelectionPanel extends javax.swing.JPanel {

    public CourseSelectionPanel()
    {
        initComponents();
        setCombo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        courseCombo = new javax.swing.JComboBox<>();
        getQuestionButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray), "Available Courses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        courseCombo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        courseCombo.setForeground(new java.awt.Color(0, 51, 51));
        courseCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                courseComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        getQuestionButton.setBackground(new java.awt.Color(51, 255, 51));
        getQuestionButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getQuestionButton.setForeground(new java.awt.Color(255, 255, 255));
        getQuestionButton.setText("Get Questions");
        getQuestionButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                getQuestionButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 19, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(getQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(57, 57, 57))))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void getQuestionButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        frame.setVisible(false);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new QuestionViewClass(((Course) courseCombo.getSelectedItem()).getId()));
        LearningPortal.frame.setTitle("Questions on " + ((Course)courseCombo.getSelectedItem()));
        frame.pack();
        frame.setVisible(true);
        currentCourse = ((Course) courseCombo.getSelectedItem());
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        Member member = currentMember;
        String status = ResourceProvider.checkStatus(member.getId());
        frame.setVisible(false);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new MembersPortalClass(member.getName(),
                member.getId(),member.getPassword(),member.getGender(),member.getAge(),
                member.getPointCount(),member.getEmail(),status,member.getDisplayPicture()));
        frame.setTitle("User View");
        frame.pack();
        frame.setVisible(true);
    }

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void setCombo() {
        for (Course course : DataProvider.getCourses()) {
            courseCombo.addItem(course);
        }
    }

    public static void setPreviousPanel() {
        previousPanel = new CourseSelectionPanel();
    }

    // Variables declaration - do not modify
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<Course> courseCombo;
    private javax.swing.JButton getQuestionButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
