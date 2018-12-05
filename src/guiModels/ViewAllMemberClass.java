
package guiModels;

import classModels.Member;
import database.db_handlers.DataProvider;
import database.db_handlers.DataUpdater;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;

import main.LearningPortal;
import others.ResourceProvider;

public class ViewAllMemberClass extends javax.swing.JPanel {
    private static int i=0;

    public ViewAllMemberClass() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(facultyRadioButton);
        group.add(studentRadioButton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        searchByIdLabel = new javax.swing.JLabel();
        searchByIDTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        selectStatusLabel = new javax.swing.JLabel();
        studentRadioButton = new javax.swing.JRadioButton();
        facultyRadioButton = new javax.swing.JRadioButton();
        selectMemberLabel = new javax.swing.JLabel();
        memberCombo = new javax.swing.JComboBox<>();
        photoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        pointLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        pointTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        searchByIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchByIdLabel.setText("Search by ID");

        searchByIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByIDTextFieldActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        selectStatusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectStatusLabel.setText("Select Status");

        studentRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        studentRadioButton.setText("Student");
        studentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRadioButtonActionPerformed(evt);
            }
        });

        facultyRadioButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        facultyRadioButton.setText("Faculty");
        facultyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyRadioButtonActionPerformed(evt);
            }
        });

        selectMemberLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selectMemberLabel.setText("Select Member");

        //memberCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        memberCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberComboActionPerformed(evt);
            }
        });

        photoLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        photoLabel.setText("          photo");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setText("Name");

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        idLabel.setText("ID");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordLabel.setText("Password");

        pointLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pointLabel.setText("Point");

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genderLabel.setText("Gender");

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ageLabel.setText("Age");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLabel.setText("Email");

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchByIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchByIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentRadioButton)
                        .addGap(49, 49, 49)
                        .addComponent(facultyRadioButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectMemberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(memberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(searchByIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchByIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectStatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentRadioButton)
                    .addComponent(facultyRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectMemberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pointTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>                        

    private void searchByIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }                                                        

    private void studentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        /*ArrayList<String> studentsName = DataProvider.getStudentsName();
        memberCombo.removeAllItems();
        for(String s: studentsName){
            memberCombo.addItem(s);
        }
        studentsName.clear();*/
        searchByIDTextField.setText("");
        memberCombo.removeAllItems();
        for (Member member : DataProvider.getList("student")) {
            memberCombo.addItem(member);
        }
    }                                                  

    private void facultyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        /*ArrayList<String> facultyNames = DataProvider.getFacultyNames();
        memberCombo.removeAllItems();
        for(String s:facultyNames){
            memberCombo.addItem(s);
        }
        facultyNames.clear();*/
        searchByIDTextField.setText("");
        memberCombo.removeAllItems();
        for (Member member : DataProvider.getList("faculty")) {
            memberCombo.addItem(member);
        }
    }                                                  

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        memberCombo.removeAllItems();
        Member member = DataProvider.getMember(searchByIDTextField.getText());
        if (member != null) {
            ImageIcon resizeImage = ResourceProvider.resizeImage(member.getDisplayPicture(), 110, 110);
            photoLabel.setIcon(resizeImage);
            nameTextField.setText(member.getName());
            idTextField.setText(member.getId());
            passwordTextField.setText(member.getPassword());
            pointTextField.setText(Integer.toString(member.getPointCount()));
            ageTextField.setText(Integer.toString(member.getAge()));
            genderTextField.setText(member.getGender());
            emailTextField.setText(member.getEmail());

            String status = ResourceProvider.checkStatus(member.getId());
            if (status.equals("Student")) {
                studentRadioButton.setSelected(true);
            }
            else {
                facultyRadioButton.setSelected(true);
            }
        }
        else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Member Not Found !!");
        }
        /*if(DataProvider.getMember(searchByIDTextField.getText()) != null){
            Member member = DataProvider.getMember(searchByIDTextField.getText());
            ImageIcon resizeImage = ResourceProvider.resizeImage(member.getDisplayPicture(), 110, 110);
            photoLabel.setIcon(resizeImage);
            nameTextField.setText(member.getName());
            idTextField.setText(member.getId());
            passwordTextField.setText(member.getPassword());
            pointTextField.setText(Integer.toString(member.getPointCount()));
            ageTextField.setText(Integer.toString(member.getAge()));
            genderTextField.setText(member.getGender());
            emailTextField.setText(member.getEmail());
            memberCombo.removeAllItems();
            memberCombo.addItem(member.getName());
            if(member.getId().charAt(2)== '-'){
                studentRadioButton.setSelected(true);
            }
            else{
                facultyRadioButton.setSelected(true);
            }                    
        }*/

    }                                            

    private void memberComboActionPerformed(java.awt.event.ActionEvent evt) {
        Member member = (Member) memberCombo.getSelectedItem();
        if (member != null) {
            ImageIcon resizeImage = ResourceProvider.resizeImage(member.getDisplayPicture(), 110, 110);
            photoLabel.setIcon(resizeImage);
            nameTextField.setText(member.getName());
            idTextField.setText(member.getId());
            passwordTextField.setText(member.getPassword());
            pointTextField.setText(Integer.toString(member.getPointCount()));
            ageTextField.setText(Integer.toString(member.getAge()));
            genderTextField.setText(member.getGender());
            emailTextField.setText(member.getEmail());

            String status = ResourceProvider.checkStatus(member.getId());
            if (status.equals("Student")) {
                studentRadioButton.setSelected(true);
            }
            else {
                facultyRadioButton.setSelected(true);
            }
        }
        /*String name = (String)memberCombo.getSelectedItem();
        if(DataProvider.getMemberByName(name) != null){
            Member member = DataProvider.getMemberByName(name);
            ImageIcon resizeImage = ResourceProvider.resizeImage(member.getDisplayPicture(), 110, 110);
            photoLabel.setIcon(resizeImage);
            nameTextField.setText(member.getName());
            idTextField.setText(member.getId());
            passwordTextField.setText(member.getPassword());
            pointTextField.setText(Integer.toString(member.getPointCount()));
            ageTextField.setText(Integer.toString(member.getAge()));
            genderTextField.setText(member.getGender());
            emailTextField.setText(member.getEmail());
            memberCombo.addItem(member.getName());
            
            if(member.getId().charAt(2)== '-'){
                studentRadioButton.setSelected(true);
            }
            else{
                facultyRadioButton.setSelected(true);
            }                    
        }*/
        
    }                                           

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(new JDialog(), "Date Updated..!");
        Member member = new Member();
        member.setId(idTextField.getText());
        member.setDisplayPicture((ImageIcon) photoLabel.getIcon()); // need to be changed later
        member.setEmail(emailTextField.getText());
        member.setAge(Integer.parseInt(ageTextField.getText()));
        member.setGender(genderTextField.getText());
        member.setPassword(passwordTextField.getText());
        member.setName(nameTextField.getText());
        DataUpdater.updateMember(member);
    }                                            

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int confirmation = DataUpdater.deleteMember(idTextField.getText());
        if(confirmation != 0){
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Deleted Successfully !!");
            photoLabel.setText("");
            photoLabel.setIcon(null);
            nameTextField.setText("");
            idTextField.setText("");
            passwordTextField.setText("");
            pointTextField.setText("");
            ageTextField.setText("");
            genderTextField.setText("");
            emailTextField.setText("");
            studentRadioButton.setSelected(false);
            facultyRadioButton.setSelected(false);
            memberCombo.removeAllItems();
        }
        else{
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Error !!");
        }
    }                                            

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        LearningPortal.frame.getContentPane().removeAll();
        LearningPortal.frame.getContentPane().add(new AdminInitialViewClass());
        LearningPortal.frame.pack();
    } 

    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton facultyRadioButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JComboBox<Member> memberCombo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel pointLabel;
    private javax.swing.JTextField pointTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchByIdLabel;
    private javax.swing.JTextField searchByIDTextField;
    private javax.swing.JLabel selectMemberLabel;
    private javax.swing.JLabel selectStatusLabel;
    private javax.swing.JRadioButton studentRadioButton;
    private javax.swing.JButton updateButton;
}
