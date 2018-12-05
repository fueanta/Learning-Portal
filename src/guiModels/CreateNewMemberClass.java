
package guiModels;

import classModels.Member;
import database.db_handlers.DataUpdater;
import javafx.scene.control.RadioButton;
import main.LearningPortal;
import others.ResourceProvider;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static main.LearningPortal.frame;
import static main.LearningPortal.previousPanel;

public class CreateNewMemberClass extends javax.swing.JPanel {

    String initialPassword = "123456";

    public CreateNewMemberClass() {
        dp = new ImageIcon("C:\\Users\\Taqui\\IdeaProjects\\Learning Portal\\src\\guiModels\\upload dafault.png");
        initComponents();
        setButtonGroups();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        selectStatusLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        studentRadioButton = new javax.swing.JRadioButton();
        facultyRadioButton = new javax.swing.JRadioButton();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        cancelButton = new javax.swing.JButton();
        ageCombo = new javax.swing.JComboBox<>();
        okButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();
        photoUploadLabel = new javax.swing.JLabel();
        selectPhotolabel = new javax.swing.JLabel();
        brouseButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Create New Member");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLabel.setText("Name");

        selectStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectStatusLabel.setText("Select Status");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Select Gender");

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ageLabel.setText("Age");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailLabel.setText("Email");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        studentRadioButton.setText("Student");
        studentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioButtonActionPerformed(evt);
            }
        });

        facultyRadioButton.setText("Faculty");
        facultyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyRadioButtonActionPerformed(evt);
            }
        });

        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setText("Female");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 51, 102));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        ageCombo.setForeground(new java.awt.Color(51, 0, 153));
        ageCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90" }));
        ageCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboActionPerformed(evt);
            }
        });

        okButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okButton.setForeground(new java.awt.Color(0, 51, 102));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        applyButton.setForeground(new java.awt.Color(0, 51, 102));
        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        photoUploadLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        photoUploadLabel.setText("Upload Photo");

        selectPhotolabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        selectPhotolabel.setText("        photo");

        brouseButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        brouseButton.setText("Brouse");
        brouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brouseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photoUploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(ageCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(studentRadioButton)
                                            .addComponent(maleRadioButton))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(femaleRadioButton)
                                            .addComponent(facultyRadioButton)))
                                    .addComponent(selectPhotolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(brouseButton)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentRadioButton)
                    .addComponent(facultyRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(photoUploadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectPhotolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(brouseButton)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>                        

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }                                             

    private void studentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }                                                  

    private void facultyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }                                                  

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }                                               

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }                                                 

    private void ageComboActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }                                              

    private void brouseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        configureBrowseButton();
    }                                            

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        saveData();
        frame.getContentPane().removeAll();
        frame.getContentPane().add(previousPanel);
        frame.pack();
        JOptionPane.showMessageDialog(new JDialog(), "New member has been created.");
    }                                        

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                saveData();
        frame.getContentPane().removeAll();
        frame.getContentPane().add(new CreateNewMemberClass());
        frame.pack();
        JOptionPane.showMessageDialog(new JDialog(), "New member has been created.");
    }                                           

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(previousPanel);
        frame.pack();
    }                                            

    private void setButtonGroups() {
        statusButtonGroup = new ButtonGroup();
        facultyRadioButton.setActionCommand(facultyRadioButton.getText());
        statusButtonGroup.add(facultyRadioButton);
        studentRadioButton.setActionCommand(studentRadioButton.getText());
        statusButtonGroup.add(studentRadioButton);

        genderButtonGroup = new ButtonGroup();
        maleRadioButton.setActionCommand(maleRadioButton.getText());
        genderButtonGroup.add(maleRadioButton);
        femaleRadioButton.setActionCommand(femaleRadioButton.getText());
        genderButtonGroup.add(femaleRadioButton);
    }

    private void configureBrowseButton() {
        selectPhotolabel.setIcon(dp = ResourceProvider.fileChooser(brouseButton, selectPhotolabel.getWidth(), selectPhotolabel.getHeight()));
    }

    private void saveData() {
        Member member = new Member();
        member.setName(nameTextField.getText());
        member.setPassword(initialPassword);
        member.setGender(genderButtonGroup.getSelection().getActionCommand());
        member.setAge(Integer.parseInt(String.valueOf(ageCombo.getSelectedItem())));
        member.setEmail(emailTextField.getText());
        member.setDisplayPicture(dp);
        member.setId(generateMemberId(statusButtonGroup.getSelection().getActionCommand()));
        DataUpdater.createNewMember(member);
    }

    private String generateMemberId(String type) {
        Date date = new Date();
        SimpleDateFormat dateFormat;
        if (type.equals("Faculty")) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd-ss");
            return (dateFormat.format(date));
        }
        else {
            dateFormat = new SimpleDateFormat("yy-hhMMdd-ss");
            return (dateFormat.format(date));
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> ageCombo;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton applyButton;
    private javax.swing.JButton brouseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton facultyRadioButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel photoUploadLabel;
    private javax.swing.JLabel selectPhotolabel;
    private javax.swing.JLabel selectStatusLabel;
    private javax.swing.JRadioButton studentRadioButton;

    private ButtonGroup statusButtonGroup;
    private ButtonGroup genderButtonGroup;
    private ImageIcon dp;
    // End of variables declaration                   
}
