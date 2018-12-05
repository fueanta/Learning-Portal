
package guiModels;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import main.LearningPortal;

import static main.LearningPortal.previousPanel;


public class AdminInitialViewClass extends javax.swing.JPanel {


    public AdminInitialViewClass() {
        previousPanel = this;
        initComponents();
        imageLabel.setIcon(new ImageIcon("C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\others\\newLearningPortal.png"));
        
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        createNewUserButton = new javax.swing.JButton();
        viewAllUserButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        viewTopScorerGraphButton = new javax.swing.JButton();
        createNewCourseButton = new javax.swing.JButton();
        manageQuestionButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 204, 255));

        createNewUserButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        createNewUserButton.setForeground(new java.awt.Color(102, 102, 102));
        createNewUserButton.setText("Create new User");
        createNewUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewUserButtonActionPerformed(evt);
            }
        });

        viewAllUserButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewAllUserButton.setForeground(new java.awt.Color(102, 102, 102));
        viewAllUserButton.setText("View All Users");
        viewAllUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllUserButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutButton.setText("logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        viewTopScorerGraphButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewTopScorerGraphButton.setForeground(new java.awt.Color(102, 102, 102));
        viewTopScorerGraphButton.setText("View Top Scorer Graph");
        viewTopScorerGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTopScorerGraphButtonActionPerformed(evt);
            }
        });

        createNewCourseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createNewCourseButton.setForeground(new java.awt.Color(102, 102, 102));
        createNewCourseButton.setText("Create new Course");
        createNewCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewCourseButtonActionPerformed(evt);
            }
        });

        manageQuestionButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        manageQuestionButton.setForeground(new java.awt.Color(102, 102, 102));
        manageQuestionButton.setText("Manage System");
        manageQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageQuestionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewAllUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createNewCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manageQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(viewTopScorerGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton)
                .addGap(18, 18, 18)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAllUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viewTopScorerGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>                           

    private void createNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        LearningPortal.frame.getContentPane().removeAll();
        LearningPortal.frame.getContentPane().add(new CreateNewMemberClass());
        LearningPortal.frame.setTitle("Create A User...");
        LearningPortal.frame.pack();
    }                                                   

    private void viewAllUserButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        LearningPortal.frame.getContentPane().removeAll();
        LearningPortal.frame.getContentPane().add(new ViewAllMemberClass());
        LearningPortal.frame.setTitle("User Database");
        LearningPortal.frame.pack();
    }                                                 

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               previousPanel = null;
        LearningPortal.frame.getContentPane().removeAll();
        LearningPortal.frame.getContentPane().add(new LoginViewClass());
        LearningPortal.frame.setTitle("Log in here...");
        LearningPortal.frame.pack();
    }                                            

    private void viewTopScorerGraphButtonActionPerformed(java.awt.event.ActionEvent evt) { 
        JFrame frame = new JFrame();
        frame.setTitle("Choose Chart");
        frame.setSize(300, 300);
        frame.getContentPane().add(new ChartOptionClass());
        frame.pack();
        frame.setLocationRelativeTo(null);        
        frame.setVisible(true);
    } 
    private void createNewCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        LearningPortal.frame.getContentPane().removeAll();
        LearningPortal.frame.getContentPane().add(new CreateNewCourseClass());
        LearningPortal.frame.setTitle("Create A Course...");
        LearningPortal.frame.pack();
    }                                                     

    private void manageQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JFrame frame = new JFrame();
        frame.setTitle("Choose Chart");
        frame.setSize(300, 300);
        frame.getContentPane().add(new ManageSystemClass());
        frame.pack();
        frame.setLocationRelativeTo(null);        
        frame.setVisible(true);
    } 


    private javax.swing.JButton createNewUserButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton viewAllUserButton;
    private javax.swing.JButton viewTopScorerGraphButton;
    private javax.swing.JButton createNewCourseButton;
    private javax.swing.JButton manageQuestionButton;
}
