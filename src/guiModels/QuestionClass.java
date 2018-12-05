
package guiModels;

import classModels.Question;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class QuestionClass extends javax.swing.JPanel {

    public QuestionClass()
    {
        this.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        initComponents();
        questionArea.setEditable(true);
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
        likeButton = new javax.swing.JButton();
        answerButton = new javax.swing.JButton();
        attachmentButton = new javax.swing.JButton();

        dpPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout dpPanelLayout = new javax.swing.GroupLayout(dpPanel);
        dpPanel.setLayout(dpPanelLayout);
        dpPanelLayout.setHorizontalGroup(
                dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        dpPanelLayout.setVerticalGroup(
                dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        userNameLabel.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(51, 51, 255));
        userNameLabel.setText("Anonymous User");

        scrollPanePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(153, 153, 153))); // NOI18N

        questionArea.setColumns(20);
        questionArea.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        questionArea.setRows(5);
        scrollPane.setViewportView(questionArea);

        javax.swing.GroupLayout scrollPanePanelLayout = new javax.swing.GroupLayout(scrollPanePanel);
        scrollPanePanel.setLayout(scrollPanePanelLayout);
        scrollPanePanelLayout.setHorizontalGroup(
                scrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane)
        );
        scrollPanePanelLayout.setVerticalGroup(
                scrollPanePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        likeButton.setBackground(new java.awt.Color(51, 255, 0));
        likeButton.setText("Liked it");
        likeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                likeButtonActionPerformed(evt);
            }
        });

        answerButton.setText("Answer Question");
        answerButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                answerButtonActionPerformed(evt);
            }
        });

        attachmentButton.setText("Show Attachment");
        attachmentButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                attachmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(likeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(answerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(attachmentButton)
                                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(answerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(likeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(attachmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(scrollPanePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(dpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPanePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void likeButtonActionPerformed(java.awt.event.ActionEvent evt)
    {

    }

    private void attachmentButtonActionPerformed(java.awt.event.ActionEvent evt)
    {

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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}

