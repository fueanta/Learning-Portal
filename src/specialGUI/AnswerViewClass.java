package specialGUI;

import classModels.Answer;
import classModels.Question;
import database.db_handlers.DataProvider;
import database.db_handlers.DataUpdater;
import main.LearningPortal;
import others.GUI_Engine;

import javax.swing.*;
import java.util.Objects;
import java.util.Vector;

import static main.LearningPortal.*;
import static testDrivers.QuestionViewTestDriver.dframe;

/**
 * Created by Taqui on 5/1/2017.
 */
public class AnswerViewClass extends javax.swing.JPanel {

    /**
     * Creates new form AnswerViewClass
     */
    public AnswerViewClass(int questionId)
    {
        // QuestionViewClass.setPreviousPanel();
        initComponents();
        submitArea.setEditable(true);
        submitArea.setLineWrap(true);
        submitArea.setWrapStyleWord(false);

        this.questionId = questionId;
        refresh();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        submitPanel = new javax.swing.JPanel();
        submitScrollPane = new javax.swing.JScrollPane();
        submitArea = new javax.swing.JTextArea();
        submitButton = new javax.swing.JButton();
        submittedScrollPanel = new javax.swing.JScrollPane();
        submittedPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        submitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Submit Answer Here", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        submitArea.setColumns(20);
        submitArea.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        submitArea.setRows(5);
        submitScrollPane.setViewportView(submitArea);

        submitButton.setBackground(new java.awt.Color(102, 255, 153));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout submitPanelLayout = new javax.swing.GroupLayout(submitPanel);
        submitPanel.setLayout(submitPanelLayout);
        submitPanelLayout.setHorizontalGroup(
                submitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(submitPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(submitScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submitButton)
                                .addContainerGap())
        );
        submitPanelLayout.setVerticalGroup(
                submitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(submitPanelLayout.createSequentialGroup()
                                .addComponent(submitScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 8, Short.MAX_VALUE))
                        .addGroup(submitPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        submittedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)), "Submitted Answers", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13), new java.awt.Color(102, 102, 102))); // NOI18N
        submittedPanel.setLayout(new javax.swing.BoxLayout(submittedPanel, javax.swing.BoxLayout.Y_AXIS));
        submittedScrollPanel.setViewportView(submittedPanel);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(submittedScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(submitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(submitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submittedScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }// </editor-fold>

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        // JFrame questionFrame = LearningPortal.frame;
        frame.setVisible(false);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new QuestionViewClass(currentCourse.getId()));
        frame.setTitle("Questions");
        frame.pack();
        frame.setVisible(true);
        // CourseSelectionPanel.setPreviousPanel();
    }

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (submitArea.getText() != null && !Objects.equals(submitArea.getText(), "")) {
            Answer answer = new Answer();
            answer.setDescription(submitArea.getText());
            answer.setMemberID(currentMember.getId());
            DataUpdater.createNewPost(answer, questionId);
            submittedPanel.add(GUI_Engine.createAnswerPanel(answer));
            submittedPanel.revalidate();
            submittedPanel.repaint();
        }
    }

    private void refresh() {
        Vector<Answer> answers = DataProvider.getAnswers(Integer.toString(questionId));
        for (Answer answer : answers) {
            submittedPanel.add(GUI_Engine.createAnswerPanel(answer));
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea submitArea;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel submitPanel;
    private javax.swing.JScrollPane submitScrollPane;
    private javax.swing.JPanel submittedPanel;
    private javax.swing.JScrollPane submittedScrollPanel;
    private int questionId;
    // End of variables declaration
}
