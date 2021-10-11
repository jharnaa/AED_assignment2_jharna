/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarHistory;

/**
 *
 * @author jharnadoda
 */
public class CityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CityJPanel
     */
    CarHistory history;
    private Car c;
    String city;
    public CityJPanel(CarHistory history) {
        initComponents();
        this.history=history;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_search = new javax.swing.JButton();
        text_city = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_city = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search by City");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter City");

        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        table_city.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No", "Company", "Min Seats", "Max Seats", "Manufacturing Year", "Model No", "City", "Maintenance Certificate", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_city);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(text_city, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(text_city, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_search)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        // TODO add your handling code here:
        int i = 0, k=0;
        try
        {
             city = text_city.getText();
        }
        catch(Exception e)
        {
            System.out.println("Some Exception");
            JOptionPane.showMessageDialog(null, "Plese enter correct values");
            i = 1;
        }
         for (Car c : history.getHistory())
        {
            Object data[] = new Object[9];

            
            if(c.getCity().equalsIgnoreCase(city))
            {
              
     
             data[0] = c.getSerial_no();
             data[1] = c.getCompany();
             data[2] = c.getMin_seats();
             data[3] = c.getMax_seats();
             data[4] = c.getManufacturing_year();
             data[5] = c.getModel_no();
             data[6] = c.getCity();
             data[7] = c.getMaintenance_certi();
             data[8] = c.getAvailability();
           
                DefaultTableModel model = (DefaultTableModel)table_city.getModel();
                model.addRow(data);
            }
            
        }
        

    }//GEN-LAST:event_button_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_city;
    private javax.swing.JTextField text_city;
    // End of variables declaration//GEN-END:variables
}
