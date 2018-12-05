package guiModels;

import classModels.*;
import database.db_handlers.DataProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import database.db_handlers.DataUpdater;
import main.LearningPortal;
import others.GUI_Engine;
import others.ResourceProvider;
import specialGUI.AnswerViewClass;

import javax.swing.*;

import static main.LearningPortal.frame;
import static main.LearningPortal.previousPanel;

public class AddNewQuestionClass extends javax.swing.JPanel {

    /** Creates new form AddNewQuestionPanel */
    public AddNewQuestionClass() {
        initComponents();
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(false);

        attachment = new ImageIcon("C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\guiModels\\noAttachment.png");

        hashMap = DataProvider.getCourseWiseTopics();
        courseCombo.removeAllItems();
        System.out.println("blabla");
        for(Course course : hashMap.keySet()) {
            courseCombo.addItem(course);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        topLabel = new javax.swing.JLabel();
        selectCourseLabel = new javax.swing.JLabel();
        courseCombo = new javax.swing.JComboBox<>();
        selectTopicLabel = new javax.swing.JLabel();
        topicCombo = new javax.swing.JComboBox<>();
        availableQuestionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        attachmentButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        topLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        topLabel.setForeground(new java.awt.Color(102, 102, 102));
        topLabel.setText("Add new Question");

        selectCourseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectCourseLabel.setText("Select Course");

        courseCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                courseComboActionPerformed(evt);
            }
        });

        selectTopicLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectTopicLabel.setText("Select Topic");

        topicCombo.setSelectedItem(topicCombo);
        topicCombo.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                topicComboItemStateChanged(evt);
            }
        });
        topicCombo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                topicComboActionPerformed(evt);
            }
        });

        availableQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        availableQuestionLabel.setForeground(new java.awt.Color(0, 102, 102));
        availableQuestionLabel.setText("Available Questions On This Topic");

        questionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        questionList.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                questionListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(questionList);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "ASK HERE IF NOT FOUND ON THE RECORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 0))); // NOI18N

        submitButton.setBackground(new java.awt.Color(204, 204, 0));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setForeground(new java.awt.Color(0, 51, 51));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                submitButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        attachmentButton.setBackground(new java.awt.Color(0, 255, 153));
        attachmentButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        attachmentButton.setForeground(new java.awt.Color(0, 51, 51));
        attachmentButton.setText("Attach");
        attachmentButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                attachmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(attachmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(attachmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        backButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 102, 0));
        backButton.setText("Back to Portal");
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(selectCourseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(courseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(selectTopicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(topicCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(availableQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(173, 173, 173)
                                                .addComponent(backButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(topLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(courseCombo)
                                        .addComponent(selectCourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(selectTopicLabel)
                                        .addComponent(topicCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(availableQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );
    }// </editor-fold>

    private void newQuestionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }                                                    

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {
        topicCombo.removeAllItems();
        for(Topic topic : hashMap.get((Course)courseCombo.getSelectedItem())){
           topicCombo.addItem(topic);
        }
    }                                           

    private void topicComboActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void questionListMouseClicked(java.awt.event.MouseEvent evt) {
        Question selectedQuestion = questionList.getSelectedValue();
        Answer answer = DataProvider.getBestAnswer(Integer.toString(selectedQuestion.getId()));
        JDialog answerView = new JDialog();
        if (answer != null) {
            answerView.getContentPane().add(GUI_Engine.createAnswerPanel(answer));
        } else {
            answerView.getContentPane().add(new JLabel(new ImageIcon(getClass().getResource("noBest.png"))));
        }
        answerView.setTitle(selectedQuestion.getTitle());
        answerView.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        answerView.pack();
        answerView.setVisible(true);
    }                                         

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextArea1.getText() != null && !jTextArea1.getText().equals("")) {
            JOptionPane.showMessageDialog(new JDialog(), "Question has been submitted");
            Question question = new Question();
            question.setTitle(((Topic)topicCombo.getSelectedItem()).getTitle() + " related Question");
            question.setDescription(jTextArea1.getText());
            question.setId(DataProvider.generateId("QUESTION"));
            question.setAttachment(attachment);
            question.setMemberID(LearningPortal.currentMember.getId());

            System.out.println(LearningPortal.currentMember.getId());
            System.out.println(((Topic)topicCombo.getSelectedItem()).getId());

            DataUpdater.createNewQuestion(question, ((Topic)topicCombo.getSelectedItem()).getId());
        }
    }                                            

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        frame.getContentPane().removeAll();
        frame.getContentPane().add(LearningPortal.previousPanel);
        frame.pack();
    }

    private void attachmentButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        attachment = ResourceProvider.fileChooser(attachmentButton, 515, 370);
    }

    private void topicComboItemStateChanged(java.awt.event.ItemEvent evt)
    {
        if (topicCombo.getSelectedItem() != null) {
            Vector<Question> questions = DataProvider.getQuestionsByTopic(Integer.toString((((Topic)topicCombo.getSelectedItem())).getId()));
            Question[] questionsArr = new Question[questions.size()];
            for(int i = 0; i < questions.size(); i++) {
                questionsArr[i] = questions.elementAt(i);
                questionsArr[i].setDescription("[" + (i + 1) + "] " + questionsArr[i].getDescription());
            }
            questionList.setModel(new javax.swing.AbstractListModel<Question>() {
                public int getSize() { return questionsArr.length; }
                public Question getElementAt(int i) { return questionsArr[i]; }
            });
        }
    }

    private javax.swing.JButton attachmentButton;
    private javax.swing.JLabel availableQuestionLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<Course> courseCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<Question> questionList;
    private javax.swing.JLabel selectCourseLabel;
    private javax.swing.JLabel selectTopicLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel topLabel;
    private javax.swing.JComboBox<Topic> topicCombo;
    private HashMap<Course, Vector<Topic>> hashMap;

    private ImageIcon attachment;

}
