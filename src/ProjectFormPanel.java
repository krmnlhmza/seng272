import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ProjectFormPanel extends JPanel {


    JTextField txt_ProjectName, txt_Team_Leader, txt_Start_Date;
    JComboBox<String> cb_Team_Size, cb_Project_Type;


    public ProjectFormPanel() {
        setLayout(new GridLayout(6, 2, 10, 10));

        txt_ProjectName = new JTextField();
        txt_Team_Leader = new JTextField();
        txt_Start_Date = new JTextField();

        String[] teamSizes = {"1-3", "4-6", "7-10", "10+"};
        cb_Team_Size = new JComboBox<>(teamSizes);

        String[] projectTypes = {"Web", "Mobile", "Desktop", "API"};
        cb_Project_Type = new JComboBox<>(projectTypes);


        add(new JLabel("Project Name:")); add(txt_ProjectName);
        add(new JLabel("Team Leader:"));  add(txt_Team_Leader);
        add(new JLabel("Team Size:"));    add(cb_Team_Size);
        add(new JLabel("Project Type:")); add(cb_Project_Type);
        add(new JLabel("Start Date:"));   add(txt_Start_Date);


        JButton btnSave = new JButton("Save");
        JButton btnClear = new JButton("Clear");
        add(btnSave);
        add(btnClear);



        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txt_ProjectName.setText("");
                txt_Team_Leader.setText("");
                txt_Start_Date.setText("");
                cb_Team_Size.setSelectedIndex(0);
                cb_Project_Type.setSelectedIndex(0);
            }
        });


        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                save_proces();
            }
        });
    }


    private void save_proces() {
        String name = txt_ProjectName.getText();
        String leader = txt_Team_Leader.getText();
        String date = txt_Start_Date.getText();


        if(name.isEmpty() || leader.isEmpty() || date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the fields!");
            return;
        }


        try { //I used copyfast for write file and time format.
            FileWriter writer = new FileWriter("projects_lab1.txt", true);
            String recordTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

            writer.write("=== Project Entry ===\n");
            writer.write("Project Name : " + name + "\n");
            writer.write("Team Leader  : " + leader + "\n");
            writer.write("Team Size    : " + cb_Team_Size.getSelectedItem() + "\n");
            writer.write("Project Type : " + cb_Project_Type.getSelectedItem() + "\n");
            writer.write("Start Date   : " + date + "\n");
            writer.write("Record Time  : " + recordTime + "\n");
            writer.write("======\n\n");

            writer.close();
            JOptionPane.showMessageDialog(this, "Successfully saved!");

        } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}