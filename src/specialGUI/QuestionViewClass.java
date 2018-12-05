package specialGUI;

import classModels.Question;
import database.db_handlers.DataProvider;
import guiModels.MembersPortalClass;
import others.GUI_Engine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import static main.LearningPortal.frame;
import static main.LearningPortal.previousPanel;

/**
 * Created by Taqui on 5/1/2017.
 */
public class QuestionViewClass extends javax.swing.JPanel {
    public QuestionViewClass(int courseId)
    {
        setAds();
        CourseSelectionPanel.setPreviousPanel();
        this.courseId = courseId;
        initComponents();
        System.out.println("in QuestionView" + courseId);

        Vector<Question> questions = DataProvider.getQuestionsByCourse(Integer.toString(courseId));
        for (Question question : questions) {
            questionsPanel.add(GUI_Engine.createQuestionDemoPanel(question));
        }
    }

    private void setAds() {
        setPaths();
        setLongPaths();
        startTimer1();
        startTimer2();
        startTimer3();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents()
    {

        noticePanel = new javax.swing.JPanel();
        adLabel_Y = new javax.swing.JLabel();
        aiubLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        adLabel_1 = new javax.swing.JLabel();
        adLabel_2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        questionsPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        noticePanel.setBackground(new java.awt.Color(204, 204, 204));
        noticePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ads by SPONSORS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 51))); // NOI18N

        adLabel_Y.setBackground(new java.awt.Color(153, 153, 153));

        aiubLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        aiubLabel.setForeground(new java.awt.Color(153, 153, 153));
        aiubLabel.setText("POWERED By");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ATL");

        javax.swing.GroupLayout noticePanelLayout = new javax.swing.GroupLayout(noticePanel);
        noticePanel.setLayout(noticePanelLayout);
        noticePanelLayout.setHorizontalGroup(
                noticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adLabel_Y, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(noticePanelLayout.createSequentialGroup()
                                .addGroup(noticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(noticePanelLayout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(aiubLabel))
                                        .addGroup(noticePanelLayout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addComponent(jLabel1)))
                                .addContainerGap(78, Short.MAX_VALUE))
        );
        noticePanelLayout.setVerticalGroup(
                noticePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(noticePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(adLabel_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(aiubLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ads by SPONSORS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 51))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        adLabel_1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Project Submitted By..");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(adLabel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adLabel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adLabel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adLabel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout adPanelLayout = new javax.swing.GroupLayout(adPanel);
        adPanel.setLayout(adPanelLayout);
        adPanelLayout.setHorizontalGroup(
                adPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adPanelLayout.setVerticalGroup(
                adPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        questionsPanel.setBackground(new java.awt.Color(204, 204, 204));
        questionsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray), "Questions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 15), new java.awt.Color(102, 102, 102))); // NOI18N
        questionsPanel.setLayout(new javax.swing.BoxLayout(questionsPanel, javax.swing.BoxLayout.Y_AXIS));
        scrollPanel.setViewportView(questionsPanel);

        backButton.setBackground(new java.awt.Color(0, 51, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 204));
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(adPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(278, 278, 278)))
                                .addComponent(noticePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(noticePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
        );
    }// </editor-fold>

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        frame.setVisible(false);
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new CourseSelectionPanel());
        frame.setTitle("Select Course");
        frame.pack();
        frame.setVisible(true);
        // MembersPortalClass.setPreviousPanel();
    }

    public static void setPreviousPanel() {
        previousPanel = new QuestionViewClass(courseId);
    }

    private void startTimer1() {
        // setAdLabel(1, adLabel_1);
        Timer tim = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setUsLabel(usCounter, adLabel_2);
                usCounter += 1;
                if (usCounter >= usList.length) {
                    usCounter = 0;
                }
            }
        });
        tim.start();
    }

    private void startTimer2() {
        // setAdLabel(1, adLabel_2);
        Timer tim = new Timer(4500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAdLabel(counter, adLabel_1);
                counter += 1;
                if (counter >= list.length) {
                    counter = 0;
                }
            }
        });
        tim.start();
    }

    private void startTimer3() {
        // setLongAdLabel(1, adLabel_Y);
        Timer tim = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLongAdLabel(longCounter, adLabel_Y);
                longCounter += 1;
                if (longCounter >= longList.length) {
                    longCounter = 0;
                }
            }
        });
        tim.start();
    }

    private void setLongAdLabel(int longCounter, JLabel adLabel_y) {
        ImageIcon icon= new ImageIcon(longList[longCounter]);
        Image img =icon.getImage();
        Image newImg=img.getScaledInstance(adLabel_y.getWidth(),adLabel_y.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc=new ImageIcon(newImg);
        adLabel_y.setIcon(newImc);
    }

    private void setAdLabel(int i, JLabel adLabel) {
        ImageIcon icon= new ImageIcon(list[i]);
        Image img =icon.getImage();
        Image newImg=img.getScaledInstance(adLabel.getWidth(),adLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc=new ImageIcon(newImg);
        adLabel.setIcon(newImc);
    }

    private void setUsLabel(int usCounter, JLabel adLabel_1) {
        ImageIcon icon= new ImageIcon(usList[usCounter]);
        Image img =icon.getImage();
        Image newImg=img.getScaledInstance(adLabel_1.getWidth(),adLabel_1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc=new ImageIcon(newImg);
        adLabel_1.setIcon(newImc);
    }

    private void setPaths() {
        list = new String[47];
        String basicPath = "C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\specialGUI\\Ads\\";
        for (int i = 0; i < 47; i++ ) {
            list[i] = basicPath + (i + 1) + ".jpg";
        }
    }

    private void setLongPaths() {
        longList = new String[7];
        String basicPath = "C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\specialGUI\\LongAds\\";
        for (int i = 0; i < 7; i++) {
            longList[i] = basicPath + (i + 1) + ".jpg";
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel adLabel_1;
    private javax.swing.JLabel adLabel_2;
    private javax.swing.JLabel adLabel_Y;
    private javax.swing.JPanel adPanel;
    private javax.swing.JLabel aiubLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel noticePanel;
    private javax.swing.JPanel questionsPanel;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
    private static int courseId;

    private int counter = 0;
    private int usCounter = 0;
    private int longCounter = 0;

    private String[] list;
    private String[] longList;
    private String[] usList = {
            "C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\specialGUI\\Us\\Sabir.jpg",
            "C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\specialGUI\\Us\\Taqui.jpg",
            "C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\specialGUI\\Us\\Lipu.jpg"
    };


    // End of variables declaration
}
