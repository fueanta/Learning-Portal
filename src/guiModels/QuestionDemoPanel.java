package guiModels;

import classModels.Question;
import database.db_handlers.DataUpdater;
import main.LearningPortal;
import specialGUI.AnswerViewClass;
import specialGUI.QuestionViewClass;

import javax.swing.*;

import static main.LearningPortal.currentMember;
import static testDrivers.QuestionViewTestDriver.dframe;

/**
 * Created by Taqui on 5/1/2017.
 */
public class QuestionDemoPanel extends javax.swing.JPanel {

    public QuestionDemoPanel(Question question)
    {
        this.question = question;
        System.out.println("in question demo" + this.question.getId());
        initComponents();
        questionArea.setEditable(false);
        questionArea.setLineWrap(true);
        questionArea.setWrapStyleWord(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        dpPanel = new javax.swing.JPanel();
        dpLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        scrollPanePanel = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        questionArea = new javax.swing.JTextArea();
        buttonPanel = new javax.swing.JPanel();
        attachmentButton = new javax.swing.JButton();
        likeButton = new javax.swing.JButton();
        answerButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(615, 386));

        dpPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout dpPanelLayout = new javax.swing.GroupLayout(dpPanel);
        dpPanel.setLayout(dpPanelLayout);
        dpPanelLayout.setHorizontalGroup(
                dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );
        dpPanelLayout.setVerticalGroup(
                dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        userNameLabel.setFont(new java.awt.Font("Consolas", 1, 15)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(51, 51, 255));
        userNameLabel.setText("Anonymous User");

        scrollPanePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        questionArea.setColumns(20);
        questionArea.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 16)); // NOI18N
        questionArea.setRows(5);
        scrollPane.setViewportView(questionArea);

        javax.swing.GroupLayout scrollPanePanelLayout = new javax.swing.GroupLayout(scrollPanePanel);
        scrollPanePanel.setLayout(scrollPanePanelLayout);
        scrollPanePanelLayout.setHorizontalGroup(
                scrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        scrollPanePanelLayout.setVerticalGroup(
                scrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );

        attachmentButton.setBackground(new java.awt.Color(255, 255, 204));
        attachmentButton.setText("Show Attachment");
        attachmentButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                attachmentButtonActionPerformed(evt);
            }
        });

        likeButton.setBackground(new java.awt.Color(51, 102, 255));
        likeButton.setText("Like");
        likeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                likeButtonActionPerformed(evt);
            }
        });

        answerButton.setBackground(new java.awt.Color(102, 255, 153));
        answerButton.setText("Answer");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(likeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(attachmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(answerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                        .addComponent(attachmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(likeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(scrollPanePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(dpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPanePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void attachmentButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        JDialog dialog = new JDialog();
        JLabel attachmentLabel = new JLabel(question.getAttachment());
        dialog.getContentPane().add(attachmentLabel);
        dialog.setTitle(question.getTitle() + " Attachment");
        dialog.pack();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void likeButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (likeButton.getText().equals("Like")) {
            likeButton.setText("Unlike");
            DataUpdater.likeQuestion(currentMember, question);
        }
        else {
            likeButton.setText("Like");
            DataUpdater.unLikeQuestion(currentMember, question);
        }
    }

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.out.println("im here");
        System.out.println(question.getId());
        JFrame answerFrame = LearningPortal.frame; // replace it with main frame
        answerFrame.setVisible(false);
        answerFrame.getContentPane().removeAll();
        answerFrame.getContentPane().add(new AnswerViewClass(question.getId()));
        answerFrame.setTitle(question.getTitle());
        answerFrame.pack();
        answerFrame.setVisible(true);
    }

    private javax.swing.JButton answerButton;
    private javax.swing.JButton attachmentButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel dpLabel;
    private javax.swing.JPanel dpPanel;
    private javax.swing.JButton likeButton;
    private javax.swing.JTextArea questionArea;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel scrollPanePanel;
    private javax.swing.JLabel userNameLabel;
    private Question question;


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public JButton getAnswerButton() {
        return answerButton;
    }

    public void setAnswerButton(JButton answerButton) {
        this.answerButton = answerButton;
    }

    public JButton getAttachmentButton() {
        return attachmentButton;
    }

    public void setAttachmentButton(JButton attachmentButton) {
        this.attachmentButton = attachmentButton;
    }

    public JPanel getButtonPanel() {
        return buttonPanel;
    }

    public void setButtonPanel(JPanel buttonPanel) {
        this.buttonPanel = buttonPanel;
    }

    public JLabel getDpLabel() {
        return dpLabel;
    }

    public void setDpLabel(JLabel dpLabel) {
        this.dpLabel = dpLabel;
    }

    public JPanel getDpPanel() {
        return dpPanel;
    }

    public void setDpPanel(JPanel dpPanel) {
        this.dpPanel = dpPanel;
    }

    public JButton getLikeButton() {
        return likeButton;
    }

    public void setLikeButton(JButton likeButton) {
        this.likeButton = likeButton;
    }

    public JTextArea getQuestionArea() {
        return questionArea;
    }

    public void setQuestionArea(JTextArea questionArea) {
        this.questionArea = questionArea;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JPanel getScrollPanePanel() {
        return scrollPanePanel;
    }

    public void setScrollPanePanel(JPanel scrollPanePanel) {
        this.scrollPanePanel = scrollPanePanel;
    }

    public JLabel getUserNameLabel() {
        return userNameLabel;
    }

    public void setUserNameLabel(JLabel userNameLabel) {
        this.userNameLabel = userNameLabel;
    }
}
