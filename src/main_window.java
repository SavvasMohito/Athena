
//Code written by Savvas Mantzouranidis
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class main_window extends javax.swing.JFrame {

    public main_window() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        ReadUsers();
        ReadSubjs();
        ReadStudSubjs();
        LoggedOut();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butg = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exlabel = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        amtxt = new javax.swing.JTextField();
        tmhmatxt = new javax.swing.JTextField();
        extxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        mysubtable1 = new javax.swing.JScrollPane();
        mysubtable = new javax.swing.JTable();
        mysublabel = new javax.swing.JLabel();
        deikthslabel = new javax.swing.JLabel();
        deikthstxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subtable = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        dhltab = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        dhltable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        allsubtable = new javax.swing.JTable();
        eisagwgiBut = new javax.swing.JButton();
        ypovoliBut = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        afaireshbut = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        extable = new javax.swing.JTable();
        exep = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        subupbut = new javax.swing.JButton();
        newsubpanel = new javax.swing.JPanel();
        newsubtitle = new javax.swing.JLabel();
        newsubnamet = new javax.swing.JLabel();
        newsubext = new javax.swing.JLabel();
        newsubproapt = new javax.swing.JLabel();
        newsubex = new javax.swing.JComboBox<>();
        newsubsep = new javax.swing.JSeparator();
        newsubproap = new javax.swing.JComboBox<>();
        newsubname = new javax.swing.JTextField();
        newsubbut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        teachertable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        teacherbut = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usert = new javax.swing.JTextField();
        loginbut = new javax.swing.JButton();
        logoutbut = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        passt = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        loginradiobutton = new javax.swing.JRadioButton();
        registerradiobutton = new javax.swing.JRadioButton();
        regaml = new javax.swing.JLabel();
        regamt = new javax.swing.JTextField();
        regnamel = new javax.swing.JLabel();
        registerbut = new javax.swing.JButton();
        regnamet = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Athena");
        setMaximumSize(new java.awt.Dimension(850, 700));
        setMinimumSize(new java.awt.Dimension(850, 700));
        setPreferredSize(new java.awt.Dimension(850, 700));
        setResizable(false);

        tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabs.setToolTipText("");
        tabs.setEnabled(false);
        tabs.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Ονοματεπώνυμο:");

        amlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        amlabel.setText("ΑΕΜ:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Τμήμα:");

        exlabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        exlabel.setText("Εξάμηνο:");

        nametxt.setEditable(false);

        amtxt.setEditable(false);

        tmhmatxt.setEditable(false);

        extxt.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Αναλυτικά στοιχεία συνδεδεμένου χρήστη");

        mysubtable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mysubtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ΚΩΔΙΚΟΣ", "ΜΑΘΗΜΑ", "ΕΞΑΜΗΝΟ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mysubtable.setRowHeight(20);
        mysubtable1.setViewportView(mysubtable);
        if (mysubtable.getColumnModel().getColumnCount() > 0) {
            mysubtable.getColumnModel().getColumn(0).setResizable(false);
            mysubtable.getColumnModel().getColumn(0).setPreferredWidth(10);
            mysubtable.getColumnModel().getColumn(1).setResizable(false);
            mysubtable.getColumnModel().getColumn(1).setPreferredWidth(350);
            mysubtable.getColumnModel().getColumn(2).setResizable(false);
            mysubtable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        mysublabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mysublabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mysublabel.setText("Τα δηλωμένα μαθήματα μου");

        deikthslabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        deikthslabel.setText("Δείκτης Προόδου:");

        deikthstxt.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(mysublabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tmhmatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 119, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(amlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(exlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(extxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deikthslabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deikthstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addComponent(mysubtable1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amlabel)
                    .addComponent(amtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exlabel)
                    .addComponent(extxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deikthslabel)
                    .addComponent(deikthstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tmhmatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(mysublabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mysubtable1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("ΑΡΧΙΚΗ", jPanel1);

        subtable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        subtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ΚΩΔΙΚΟΣ", "ΜΑΘΗΜΑ", "ΕΞ.", "ΗΜ/ΝΙΑ ΒΑΘ.", "ΒΑΘΜΟΣ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subtable.setRowHeight(20);
        jScrollPane1.setViewportView(subtable);
        if (subtable.getColumnModel().getColumnCount() > 0) {
            subtable.getColumnModel().getColumn(0).setResizable(false);
            subtable.getColumnModel().getColumn(0).setPreferredWidth(10);
            subtable.getColumnModel().getColumn(1).setResizable(false);
            subtable.getColumnModel().getColumn(1).setPreferredWidth(300);
            subtable.getColumnModel().getColumn(2).setResizable(false);
            subtable.getColumnModel().getColumn(2).setPreferredWidth(10);
            subtable.getColumnModel().getColumn(3).setResizable(false);
            subtable.getColumnModel().getColumn(4).setResizable(false);
            subtable.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Λίστα βαθμολογιών των μαθημάτων σου");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
        );

        tabs.addTab("ΒΑΘΜΟΛΟΓΙΕΣ", jPanel2);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Επίλεξε μάθημα και πάτα \"Εισαγωγή στη Δήλωση\". Όριο δηλωμένων μαθημάτων: 7");

        dhltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ΚΩΔΙΚΟΣ", "ΜΑΘΗΜΑ", "ΕΞΑΜΗΝΟ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dhltable.setRowHeight(15);
        jScrollPane4.setViewportView(dhltable);
        if (dhltable.getColumnModel().getColumnCount() > 0) {
            dhltable.getColumnModel().getColumn(0).setResizable(false);
            dhltable.getColumnModel().getColumn(0).setPreferredWidth(10);
            dhltable.getColumnModel().getColumn(1).setResizable(false);
            dhltable.getColumnModel().getColumn(1).setPreferredWidth(350);
            dhltable.getColumnModel().getColumn(2).setResizable(false);
            dhltable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        allsubtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ΚΩΔΙΚΟΣ", "ΜΑΘΗΜΑ", "ΕΞΑΜΗΝΟ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allsubtable.setRowHeight(15);
        jScrollPane5.setViewportView(allsubtable);
        if (allsubtable.getColumnModel().getColumnCount() > 0) {
            allsubtable.getColumnModel().getColumn(0).setResizable(false);
            allsubtable.getColumnModel().getColumn(0).setPreferredWidth(10);
            allsubtable.getColumnModel().getColumn(1).setResizable(false);
            allsubtable.getColumnModel().getColumn(1).setPreferredWidth(350);
            allsubtable.getColumnModel().getColumn(2).setResizable(false);
            allsubtable.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        eisagwgiBut.setText("ΕΙΣΑΓΩΓΗ");
        eisagwgiBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiButActionPerformed(evt);
            }
        });

        ypovoliBut.setText("ΤΕΛΙΚΗ ΥΠΟΒΟΛΗ ΔΗΛΩΣΗΣ");
        ypovoliBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ypovoliButActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Τα μαθήματα/δήλωση μου");

        afaireshbut.setText("ΑΦΑΙΡΕΣΗ");
        afaireshbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afaireshbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dhltabLayout = new javax.swing.GroupLayout(dhltab);
        dhltab.setLayout(dhltabLayout);
        dhltabLayout.setHorizontalGroup(
            dhltabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dhltabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dhltabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addComponent(jScrollPane4)
                    .addGroup(dhltabLayout.createSequentialGroup()
                        .addComponent(eisagwgiBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(afaireshbut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ypovoliBut))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        dhltabLayout.setVerticalGroup(
            dhltabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dhltabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dhltabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eisagwgiBut)
                    .addComponent(ypovoliBut)
                    .addComponent(jLabel16)
                    .addComponent(afaireshbut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("ΔΗΛΩΣΕΙΣ", dhltab);

        extable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        extable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ΚΩΔΙΚΟΣ", "ΜΑΘΗΜΑ", "ΠΡΟΑΠ."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        extable.setRowHeight(20);
        jScrollPane2.setViewportView(extable);
        if (extable.getColumnModel().getColumnCount() > 0) {
            extable.getColumnModel().getColumn(0).setResizable(false);
            extable.getColumnModel().getColumn(0).setPreferredWidth(20);
            extable.getColumnModel().getColumn(1).setResizable(false);
            extable.getColumnModel().getColumn(1).setPreferredWidth(300);
            extable.getColumnModel().getColumn(2).setResizable(false);
            extable.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        exep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ΕΞΑΜΗΝΟ:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Δείτε την λίστα μαθημάτων, επιλέγοντας το εξάμηνο που σας ενδιαφέρει");

        subupbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subupbut.setText("Ενημέρωση");
        subupbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subupbutActionPerformed(evt);
            }
        });

        newsubpanel.setEnabled(false);

        newsubtitle.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        newsubtitle.setText("Εισαγωγή Μαθήματος Στο Πρόγραμμα Σπουδών");

        newsubnamet.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newsubnamet.setText("Όνομα Μαθήματος:");

        newsubext.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newsubext.setText("Εξάμηνο:");

        newsubproapt.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newsubproapt.setText("Προαπαιτούμενο Μάθημα:");

        newsubex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        newsubname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        newsubbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        newsubbut.setText("Καταχώρηση");
        newsubbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsubbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newsubpanelLayout = new javax.swing.GroupLayout(newsubpanel);
        newsubpanel.setLayout(newsubpanelLayout);
        newsubpanelLayout.setHorizontalGroup(
            newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsubpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newsubsep)
                    .addGroup(newsubpanelLayout.createSequentialGroup()
                        .addGroup(newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newsubpanelLayout.createSequentialGroup()
                                .addGroup(newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newsubnamet)
                                    .addGroup(newsubpanelLayout.createSequentialGroup()
                                        .addComponent(newsubext)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newsubex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(newsubpanelLayout.createSequentialGroup()
                                        .addComponent(newsubproapt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newsubproap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(newsubbut, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(newsubname, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        newsubpanelLayout.setVerticalGroup(
            newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newsubpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newsubtitle)
                .addGap(3, 3, 3)
                .addComponent(newsubsep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsubname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newsubnamet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newsubpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newsubbut)
                    .addComponent(newsubproapt)
                    .addComponent(newsubproap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newsubext)
                    .addComponent(newsubex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(subupbut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(newsubpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subupbut))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newsubpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabs.addTab("ΕΞΑΜΗΝΟΛΟΓΙΟ", jPanel4);

        teachertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ΑΜ ΦΟΙΤ.", "ΚΩΔ. Μ.", "ΜΑΘΗΜΑ", "ΗΜ/ΝΙΑ ΒΑΘ.", "ΒΑΘΜΟΣ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(teachertable);
        if (teachertable.getColumnModel().getColumnCount() > 0) {
            teachertable.getColumnModel().getColumn(0).setResizable(false);
            teachertable.getColumnModel().getColumn(1).setResizable(false);
            teachertable.getColumnModel().getColumn(1).setPreferredWidth(50);
            teachertable.getColumnModel().getColumn(2).setResizable(false);
            teachertable.getColumnModel().getColumn(2).setPreferredWidth(350);
            teachertable.getColumnModel().getColumn(3).setResizable(false);
            teachertable.getColumnModel().getColumn(3).setPreferredWidth(100);
            teachertable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Εισαγωγή/Τροποποίηση Βαθμολογιών");

        teacherbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        teacherbut.setText("ΟΡΙΣΤΙΚΗ ΥΠΟΒΟΛΗ ΒΑΘΜΩΝ");
        teacherbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addComponent(jSeparator8)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(teacherbut)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherbut)
                .addGap(35, 35, 35))
        );

        tabs.addTab("ΕΙΣΑΓ. ΒΑΘΜ.", jPanel3);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Χρήσιμες πληροφορίες σχετικά με το τμήμα και την εφαρμογή \"ΑΘΗΝΆ\"");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 2, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setText("Η συγκεκριμένη εφαρμογή αναπτύχθηκε στα πλαίσια του μαθήματος Μηχανική Λογισμικού το Νοέμβριο του 2019. Ο στόχος της είναι αποκλειστικά εκπαιδευτικός και δεν προορίζεται για κανονική χρήση. \nΟμάδα ανάπτυξης: 21 (Γιαλαντσίδης, Μπάρδι, Μαντζουρανίδης)");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setMaximumSize(new java.awt.Dimension(645, 70));
        jTextArea1.setPreferredSize(new java.awt.Dimension(645, 65));
        jScrollPane6.setViewportView(jTextArea1);

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel17.setText("Σχετικά με την Εφαρμογή");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Το Τμήμα «Μηχανικών Πληροφορικής και Ηλεκτρονικών Συστημάτων» του Διεθνούς Πανεπιστημίου της Ελλάδος (ΔΙ.ΠΑ.Ε) προήλθε από την συνένωση των τμημάτων «Μηχανικών Πληροφορικής» και «Ηλεκτρονικών Μηχανικών» την άνοιξη του 2019 και θα υποδεχτεί πρωτοετείς φοιτητές το Σεπτέμβριο του 2019.\n\nΟι εγκαταστάσεις του Τμήματος στη Σίνδο Θεσσαλονίκης, περιλαμβάνουν 9 αίθουσες θεωρητικής διδασκαλίας, 2 αμφιθέατρα και 20 αίθουσες εργαστηρίων με σύγχρονο και κατάλληλο εξοπλισμό.\n\nΤο Τμήμα είναι άρτια στελεχωμένο καθώς το διδακτικό του προσωπικό αποτελείται από 30 μέλη ΔΕΠ και 6 μέλη ΕΔΙΠ και συγκαταλέγεται ανάμεσα στα μεγαλύτερα του ΔΙ.ΠΑ.Ε.\n\nΗ διάρκεια του πρώτου κύκλου σπουδών του Τμήματος έχει οριστεί σε δέκα (10) ακαδημαϊκά εξάμηνα σύμφωνα με το ΦΕΚ 2657/1-7-2019/τ.Β και η εφαρμογή του αντίστοιχου Προγράμματος Προπτυχιακών Σπουδών ορίζεται από το ακαδημαϊκό έτος 2019-20.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setPreferredSize(new java.awt.Dimension(645, 230));
        jScrollPane7.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                    .addComponent(jSeparator7)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tabs.addTab("ΠΛΗΡΟΦΟΡΙΕΣ", jPanel5);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("\"ΑΘΗΝΆ\" - ΠΛΑΤΦΟΡΜΑ ΕΞΥΠΗΡΕΤΗΣΗΣ ΦΟΙΤΗΤΩΝ ΤΜΗΜΑΤΟΣ Μ.Π.Η.Σ.");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Password:");

        loginbut.setBackground(new java.awt.Color(153, 255, 153));
        loginbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        loginbut.setForeground(new java.awt.Color(51, 51, 51));
        loginbut.setText("LOG IN");
        loginbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutActionPerformed(evt);
            }
        });

        logoutbut.setBackground(new java.awt.Color(255, 153, 153));
        logoutbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutbut.setForeground(new java.awt.Color(51, 51, 51));
        logoutbut.setText("LOG OUT");
        logoutbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbutActionPerformed(evt);
            }
        });

        jLabel12.setText("Test Users: it172278, it163217, it151234, stoug");

        jLabel13.setText("Test Password: 1234");

        butg.add(loginradiobutton);
        loginradiobutton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        loginradiobutton.setSelected(true);
        loginradiobutton.setText("Login");
        loginradiobutton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        loginradiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginradiobuttonActionPerformed(evt);
            }
        });

        butg.add(registerradiobutton);
        registerradiobutton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        registerradiobutton.setText("Register");
        registerradiobutton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        registerradiobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerradiobuttonActionPerformed(evt);
            }
        });

        regaml.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regaml.setText("AM:");

        regnamel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regnamel.setText("Ονομ/νυμο:");

        registerbut.setBackground(new java.awt.Color(51, 153, 255));
        registerbut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        registerbut.setForeground(new java.awt.Color(51, 51, 51));
        registerbut.setText("REGISTER");
        registerbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(loginradiobutton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(usert, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(passt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel13)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(registerradiobutton)
                                        .addGap(24, 24, 24)
                                        .addComponent(regaml)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regamt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(regnamel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regnamet, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(loginbut)
                                        .addGap(18, 18, 18)
                                        .addComponent(logoutbut))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(registerbut)
                                        .addGap(51, 51, 51))))
                            .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logoutbut)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(usert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(loginradiobutton)
                                .addComponent(passt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(loginbut, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerradiobutton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regnamel)
                        .addComponent(regamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(regaml)
                        .addComponent(regnamet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerbut, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutActionPerformed

        for (int i = 0; i < studsCount(); i++) {
            if (usert.getText().equals(studs[i].getUsername()) && passt.getText().equals("1234")) {
                LoggedIn();
                curUser = studs[i];
                nametxt.setText(studs[i].getName());
                amtxt.setText(studs[i].getAm());
                tmhmatxt.setText(studs[i].getTmhma());
                extxt.setText(studs[i].getEx());

                //Load Vathmologies
                DefaultTableModel model = (DefaultTableModel) subtable.getModel();
                model.setRowCount(0);
                int armath = 0;
                int sum = 0;
                try {
                    for (int j = 0; j < vathmoi.length; j++) {
                        if (vathmoi[j][0].equals(studs[i].getAm())) {
                            for (int k = 0; k < subjs.length; k++) {
                                if (subjs[k] != null && vathmoi[j][1].equals(subjs[k].getCode())) {
                                    Object[] row = {vathmoi[j][1], subjs[k].getName(), subjs[k].getEx(), vathmoi[j][3], vathmoi[j][2]};
                                    model.addRow(row);

                                    //Calculate Deikth Proodou
                                    if (!(vathmoi[j][2].equals("-"))) {
                                        sum += Integer.parseInt(vathmoi[j][2]);
                                    }
                                    armath++;
                                }
                            }

                        }
                    }
                    int deikths = 0;
                    deikths = (int) (Double.parseDouble((df2.format(sum / (double) armath))) * 100);
                    deikthstxt.setText(String.valueOf(deikths));
                } catch (Exception ex) {
                    Logger.getLogger(main_window.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Load My Subjects
                model = (DefaultTableModel) mysubtable.getModel();
                model.setRowCount(0);
                try {
                    for (int j = 0; j < vathmoi.length; j++) {
                        if (vathmoi[j][0].equals(studs[i].getAm()) && vathmoi[j][4].equals("1")) {
                            for (int k = 0; k < subjs.length; k++) {
                                if (subjs[k] != null && vathmoi[j][1].equals(subjs[k].getCode())) {
                                    Object[] row = {vathmoi[j][1], subjs[k].getName(), subjs[k].getEx()};
                                    model = (DefaultTableModel) mysubtable.getModel();
                                    model.addRow(row);
                                    model = (DefaultTableModel) dhltable.getModel();
                                    model.addRow(row);
                                }
                            }

                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(main_window.class.getName()).log(Level.SEVERE, null, ex);
                }

                //Load All Subjects
                model = (DefaultTableModel) allsubtable.getModel();
                model.setRowCount(0);
                boolean flag;
                try {
                    for (int j = 0; j < subjs.length; j++) {
                        flag = true;
                        for (int k = 0; k < vathmoi.length; k++) {
                            if (subjs[j] != null && subjs[j].getCode().equals(vathmoi[k][1]) && vathmoi[k][4].equals("0")) {
                                if (Integer.parseInt(vathmoi[k][2]) < 5) {
                                    Object[] row = {subjs[j].getCode(), subjs[j].getName(), subjs[j].getEx()};
                                    model.addRow(row);
                                    flag = false;
                                    break;
                                } else {
                                    flag = false;
                                }
                            } else if (subjs[j] != null && subjs[j].getCode().equals(vathmoi[k][1]) && vathmoi[k][4].equals("1")) {
                                flag = false;
                                continue;
                            }
                        }
                        if (flag) {
                            for (int k = 0; k < vathmoi.length; k++) {
                                if (subjs[j] != null) {
                                    if (!subjs[j].getProap().equals("")) {
                                        if (subjs[j].getProap().equals(vathmoi[k][1])) {
                                            if (vathmoi[k][2].equals("-")) {
                                                continue;
                                            } else {
                                                if (Integer.parseInt(vathmoi[k][2]) >= 5) {
                                                    Object[] row = {subjs[j].getCode(), subjs[j].getName(), subjs[j].getEx()};
                                                    model.addRow(row);
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        Object[] row = {subjs[j].getCode(), subjs[j].getName(), subjs[j].getEx()};
                                        model.addRow(row);
                                        break;
                                    }
                                }

                            }

                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(main_window.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (usert.getText().equals("stoug") && passt.getText().equals("1234")) {
                LoggedIn();
                TeacherLoggedIn();
                nametxt.setText(stoug.getName());
                tmhmatxt.setText(stoug.getTmhma());
            }

        }

    }//GEN-LAST:event_loginbutActionPerformed

    private void logoutbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbutActionPerformed
        LoggedOut();
    }//GEN-LAST:event_logoutbutActionPerformed

    private void ypovoliButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ypovoliButActionPerformed
        for (int i = 0; i < newSubs.length; i++) {
            newSubs[i] = "";
        }
        for (int i = 0; i < dhltable.getRowCount(); i++) {
            newSubs[i] = (String) dhltable.getValueAt(i, 0);
        }

        boolean flag;
        int j = 0;
        while (!newSubs[j].equals("") && j < newSubs.length) {
            flag = true;
            for (int i = 0; i < vathmoi.length; i++) {
                if (vathmoi[i][0].equals(curUser.getAm()) && vathmoi[i][1].equals(newSubs[j])) {
                    vathmoi[i][1] = newSubs[j];
                    vathmoi[i][2] = "-";
                    vathmoi[i][3] = "#";
                    vathmoi[i][4] = "1";
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int i = 0; i < vathmoi.length; i++) {
                    if (vathmoi[i][0].equals("")) {
                        vathmoi[i][0] = curUser.getAm();
                        vathmoi[i][1] = newSubs[j];
                        vathmoi[i][2] = "-";
                        vathmoi[i][3] = "#";
                        vathmoi[i][4] = "1";
                        break;
                    }
                }
            }
            j++;
        }

        try {
            BufferedWriter csvwriter = new BufferedWriter(new FileWriter("./src/students_subjs.csv"));

            for (int i = 0; i < vathmoi.length; i++) {
                if (!(vathmoi[i][0].equals(""))) {
                    csvwriter.append(vathmoi[i][0]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoi[i][1]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoi[i][2]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoi[i][3]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoi[i][4]);
                    //if (!(vathmoi[i + 1][0].equals(""))) {
                    csvwriter.append("\n");
                    //}
                }
            }
            csvwriter.close();

        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }
        for (int i = 0; i < newSubs.length; i++) {
            newSubs[i] = "";
        }
        DefaultTableModel model = (DefaultTableModel) mysubtable.getModel();
        model.setRowCount(0);
        model = (DefaultTableModel) dhltable.getModel();
        model.setRowCount(0);
        model = (DefaultTableModel) subtable.getModel();
        model.setRowCount(0);
        loginbut.doClick();
    }//GEN-LAST:event_ypovoliButActionPerformed

    private void eisagwgiButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiButActionPerformed
        if (dhltable.getRowCount() < 7) {
            int selrow = allsubtable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) dhltable.getModel();
            String code = (String) allsubtable.getValueAt(selrow, 0);
            String math = (String) allsubtable.getValueAt(selrow, 1);
            String ex = (String) allsubtable.getValueAt(selrow, 2);
            //System.out.println(code + math + ex);
            Object[] row = {code, math, ex};
            model.addRow(row);

        }
    }//GEN-LAST:event_eisagwgiButActionPerformed

    private void teacherbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherbutActionPerformed
        //System.out.println(teachertable.getRowCount());
        for (int i = 0; i < teachertable.getRowCount(); i++) {
            vathmoiNew[i][0] = (String) teachertable.getValueAt(i, 0);
            vathmoiNew[i][1] = (String) teachertable.getValueAt(i, 1);
            vathmoiNew[i][2] = (String) teachertable.getValueAt(i, 4);
            if (!vathmoi[i][2].equals((String) teachertable.getValueAt(i, 4))) {
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = new Date();
                vathmoiNew[i][3] = (String) dateFormat.format(date);
            } else {
                vathmoiNew[i][3] = (String) teachertable.getValueAt(i, 3);
            }

            vathmoiNew[i][4] = vathmoi[i][4];
//            for (int j = 0; j < subjs.length; j++) {
//                if (((String) teachertable.getValueAt(i, 2)).equals(subjs[j].getName())) {
//                    vathmoiNew[i][1] = subjs[j].getCode();
//                }
//            }
        }

        try {
            BufferedWriter csvwriter = new BufferedWriter(new FileWriter("./src/students_subjs.csv"));
            for (int i = 0; i < vathmoiNew.length; i++) {
                if (!(vathmoiNew[i][0].equals(""))) {
                    csvwriter.append(vathmoiNew[i][0]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoiNew[i][1]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoiNew[i][2]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoiNew[i][3]);
                    csvwriter.append(",");
                    csvwriter.append(vathmoiNew[i][4]);
                    if (!(vathmoiNew[i + 1][0].equals(""))) {
                        csvwriter.append("\n");
                    }
                }
            }
            csvwriter.close();
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }
        DefaultTableModel model = (DefaultTableModel) teachertable.getModel();
        model.setRowCount(0);
        loginbut.doClick();
    }//GEN-LAST:event_teacherbutActionPerformed

    private void loginradiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginradiobuttonActionPerformed
        //regaml.setEnabled(false);
        regamt.setEnabled(false);
        //regnamel.setEnabled(false);
        regnamet.setEnabled(false);
        registerbut.setEnabled(false);

        usert.setEnabled(true);
        passt.setEnabled(true);
        loginbut.setEnabled(true);
    }//GEN-LAST:event_loginradiobuttonActionPerformed

    private void registerbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbutActionPerformed
        try {
            BufferedWriter csvwriter = new BufferedWriter(new FileWriter("./src/users_info.csv", true));
            csvwriter.append("\n");
            csvwriter.append("s,it");
            csvwriter.append(regamt.getText());
            csvwriter.append(",");
            csvwriter.append(regamt.getText());
            csvwriter.append(",");
            csvwriter.append(regnamet.getText());
            csvwriter.append(",ΜΗΧΑΝΙΚΩΝ ΠΛΗΡΟΦΟΡΙΚΗΣ ΚΑΙ ΗΛΕΚΤΡΟΝΙΚΩΝ ΣΥΣΤΗΜΑΤΩΝ,1");
            csvwriter.close();
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

        usert.setText("it" + regamt.getText());
        regamt.setText("");
        regnamet.setText("");
        passt.setText("1234");
        ReadUsers();
        loginradiobutton.doClick();
        loginbut.doClick();

    }//GEN-LAST:event_registerbutActionPerformed

    private void registerradiobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerradiobuttonActionPerformed
        //regaml.setEnabled(false);
        regamt.setEnabled(true);
        //regnamel.setEnabled(false);
        regnamet.setEnabled(true);
        registerbut.setEnabled(true);

        usert.setEnabled(false);
        passt.setEnabled(false);
        loginbut.setEnabled(false);
    }//GEN-LAST:event_registerradiobuttonActionPerformed

    private void afaireshbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afaireshbutActionPerformed

        for (int i = 0; i < vathmoi.length; i++) {
            if (vathmoi[i][0].equals(curUser.getAm()) && vathmoi[i][1].equals(dhltable.getValueAt(dhltable.getSelectedRow(), 0))) {
                vathmoi[i][0] = "";
                vathmoi[i][1] = "";
                vathmoi[i][2] = "";
                vathmoi[i][3] = "";
                vathmoi[i][4] = "";
            }
        }
        DefaultTableModel model = (DefaultTableModel) dhltable.getModel();
        model.removeRow(dhltable.getSelectedRow());
    }//GEN-LAST:event_afaireshbutActionPerformed

    private void subupbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subupbutActionPerformed
        int exam = exep.getSelectedIndex() + 1;

        switch (exam) {
            case 1:
                fillExTable("1");
                break;
            case 2:
                fillExTable("2");
                break;
            case 3:
                fillExTable("3");
                break;
            case 4:
                fillExTable("4");
                break;
            case 5:
                fillExTable("5");
                break;
            case 6:
                fillExTable("6");
                break;
            case 7:
                fillExTable("7");
                break;
            default:
                System.out.println("combobox error");
        }
    }//GEN-LAST:event_subupbutActionPerformed

    private void newsubbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsubbutActionPerformed
        String proap;
        //for (int i = 0; i < subjs.length; i++) {
        //if (subjs[i] == null) {
        if (newsubproap.getSelectedIndex() == 0) {
            proap = "#";
        } else {
            proap = (String) newsubproap.getSelectedItem();
        }
        //subjs[i] = new Mathima(genCode((String) newsubex.getSelectedItem()), newsubname.getText(), (String) newsubex.getSelectedItem(), proap);
        //System.out.println(genCode((String) newsubex.getSelectedItem()) + newsubname.getText() + (String) newsubex.getSelectedItem() + proap);

        try {
            BufferedWriter csvwriter = new BufferedWriter(new FileWriter("./src/mathimata.csv", true));
            csvwriter.append("\n");
            csvwriter.append(genCode((String) newsubex.getSelectedItem()));
            csvwriter.append(",");
            csvwriter.append(newsubname.getText());
            csvwriter.append(",");
            csvwriter.append((String) newsubex.getSelectedItem());
            csvwriter.append(",");
            csvwriter.append(proap);
            csvwriter.close();
        } catch (Exception e) {
            System.out.println("exception :" + e.getMessage());
        }

        //break;
        //}
        //}
        exep.setSelectedIndex(newsubex.getSelectedIndex());
        loginbut.doClick();
        subupbut.doClick();
    }//GEN-LAST:event_newsubbutActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_window().setVisible(true);
            }
        });
    }

    private void ReadUsers() {
        String csvFile = "./src/users_info.csv";
        String line = "";
        String cvsSplitBy = ",";

        int i = 0;

        try ( BufferedReader br = new BufferedReader(new FileReader((csvFile), StandardCharsets.UTF_8))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] cusers = line.split(cvsSplitBy);
                //System.out.println(cusers[0] + " " + cusers[1] + " " + cusers[2] + " " + cusers[3] + " " + cusers[4] + " " + cusers[5]);

                if (cusers[0].equals("s")) {
                    studs[i] = new Student(cusers[1], cusers[2], cusers[3], cusers[4], cusers[5]);
                    i++;
                } else if (cusers[0].equals("t")) {
                    stoug = new Teacher(cusers[1], cusers[3], cusers[4]);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ReadSubjs() {
        String csvFile = "./src/mathimata.csv";
        String line = "";
        String cvsSplitBy = ",";
        int i = 0;

        try ( BufferedReader br = new BufferedReader(new FileReader((csvFile), StandardCharsets.UTF_8))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] csubjs = line.split(cvsSplitBy);

                subjs[i] = new Mathima(csubjs[0], csubjs[1], csubjs[2], csubjs[3]);
                i++;
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ReadStudSubjs() {
        String csvFile = "./src/students_subjs.csv";
        String line = "";
        String cvsSplitBy = ",";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 3; j++) {
                vathmoi[i][j] = "";
            }
        }
        int i = 0;

        try ( BufferedReader br = new BufferedReader(new FileReader((csvFile), StandardCharsets.UTF_8))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] usubjs = line.split(cvsSplitBy);
                //System.out.println(csubjs[0] + " " + csubjs[1] + " " + csubjs[2]);

                vathmoi[i][0] = usubjs[0];
                vathmoi[i][1] = usubjs[1];
                vathmoi[i][2] = usubjs[2];
                vathmoi[i][3] = usubjs[3];
                vathmoi[i][4] = usubjs[4];
                i++;
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void LoggedIn() {
        ReadUsers();
        ReadSubjs();
        ReadStudSubjs();

        //loginbut.setEnabled(false);
        usert.setEnabled(false);
        passt.setEnabled(false);
        logoutbut.setEnabled(true);
        tabs.setEnabled(true);
        amlabel.setVisible(true);
        amtxt.setVisible(true);
        exlabel.setVisible(true);
        extxt.setVisible(true);
        deikthstxt.setVisible(true);
        deikthslabel.setVisible(true);
        mysublabel.setVisible(true);
        mysubtable1.setVisible(true);
        tabs.setEnabledAt(1, true);
        tabs.setEnabledAt(2, true);
        tabs.setEnabledAt(4, false);
        loginradiobutton.setEnabled(false);
        registerradiobutton.setEnabled(false);
        regnamet.setEnabled(false);
        regamt.setEnabled(false);
        registerbut.setEnabled(false);
    }

    private void LoggedOut() {
        loadproap = true;
        newsubproap.removeAllItems();

        tabs.setEnabled(false);
        usert.setEnabled(true);
        passt.setEnabled(true);
        loginbut.setEnabled(true);
        logoutbut.setEnabled(false);
        loginradiobutton.setEnabled(true);
        registerradiobutton.setEnabled(true);
        regnamet.setEnabled(false);
        regamt.setEnabled(false);
        registerbut.setEnabled(false);
        tabs.setSelectedIndex(0);

        usert.setText("");
        passt.setText("");
        nametxt.setText("");
        amtxt.setText("");
        tmhmatxt.setText("");
        extxt.setText("");
        deikthstxt.setText("");

        for (int i = 0; i < newSubs.length; i++) {
            newSubs[i] = "";
        }
        curUser = null;
        for (int i = 0; i < vathmoi.length; i++) {
            for (int j = 0; j < 5; j++) {
                vathmoi[i][j] = "";
            }
        }

        DefaultTableModel model = (DefaultTableModel) subtable.getModel();
        model.setRowCount(0);
        model = (DefaultTableModel) extable.getModel();
        model.setRowCount(0);
        model = (DefaultTableModel) mysubtable.getModel();
        model.setRowCount(0);
        model = (DefaultTableModel) allsubtable.getModel();
        model.setRowCount(0);
        model = (DefaultTableModel) dhltable.getModel();
        model.setRowCount(0);

        EnablePanel(newsubpanel, false);
    }

    private void EnablePanel(JPanel panel, Boolean isEnabled) {
        panel.setVisible(isEnabled);

        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JPanel) {
                EnablePanel((JPanel) component, isEnabled);
            }
            component.setVisible(isEnabled);
        }
    }

    private void TeacherLoggedIn() {
        if (loadproap) {
            EnablePanel(newsubpanel, true);
            newsubproap.addItem("-");
            for (int i = 0; i < subjs.length; i++) {
                if (subjs[i] != null) {
                    newsubproap.addItem(subjs[i].getCode());
                }
            }
            loadproap = false;
        }

        newsubname.setText("");
        newsubex.setSelectedIndex(0);
        newsubproap.setSelectedIndex(0);

        for (int i = 0; i < vathmoiNew.length; i++) {
            for (int j = 0; j < 5; j++) {
                vathmoiNew[i][j] = "";
            }
        }

        amlabel.setVisible(false);
        amtxt.setVisible(false);
        exlabel.setVisible(false);
        extxt.setVisible(false);
        deikthslabel.setVisible(false);
        deikthstxt.setVisible(false);
        mysublabel.setVisible(false);
        mysubtable1.setVisible(false);
        tabs.setEnabledAt(1, false);
        tabs.setEnabledAt(2, false);
        tabs.setEnabledAt(4, true);

        //Fill Teacher Table
        DefaultTableModel model = (DefaultTableModel) teachertable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < studsCount(); i++) {
            for (int j = 0; j < vathmoi.length; j++) {
                if (vathmoi[j][0].equals(studs[i].getAm())) {
                    for (int k = 0; k < subjs.length; k++) {
                        if (subjs[k] != null && vathmoi[j][1].equals(subjs[k].getCode())) {
                            Object[] row = {vathmoi[j][0], subjs[k].getCode(), subjs[k].getName(), vathmoi[j][3], vathmoi[j][2]};
                            model.addRow(row);
                        }
                    }
                }
            }
        }
    }

    private void fillExTable(String tex) {
        DefaultTableModel model = (DefaultTableModel) extable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < subjs.length; i++) {
            if (subjs[i] != null) {
                String ex = subjs[i].getCode().substring(1, 2);
                if (ex.equals(tex)) {
                    Object[] row = {subjs[i].getCode(), subjs[i].getName(), subjs[i].getProap()};
                    model.addRow(row);
                }
            }
        }
    }

    private String genCode(String ex) {
        int count = 0;
        for (int i = 0; i < subjs.length; i++) {
            if (subjs[i] != null && subjs[i].getCode().substring(1, 2).equals(ex)) {
                count++;
            }
        }
        return "s" + ex + String.valueOf(count + 1);
    }

    private int studsCount() {
        int count = 0;
        for (int i = 0; i < studs.length; i++) {
            if (studs[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static DecimalFormat df2 = new DecimalFormat("#.##");

    public Student studs[] = new Student[10];
    public Mathima subjs[] = new Mathima[40];
    public String vathmoi[][] = new String[50][5];
    public Teacher stoug;
    public String newSubs[] = new String[7];
    public Student curUser;
    public String vathmoiNew[][] = new String[50][5];
    public boolean loadproap;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton afaireshbut;
    private javax.swing.JTable allsubtable;
    private javax.swing.JLabel amlabel;
    private javax.swing.JTextField amtxt;
    private javax.swing.ButtonGroup butg;
    private javax.swing.JLabel deikthslabel;
    private javax.swing.JTextField deikthstxt;
    private javax.swing.JPanel dhltab;
    private javax.swing.JTable dhltable;
    private javax.swing.JButton eisagwgiBut;
    private javax.swing.JComboBox<String> exep;
    private javax.swing.JLabel exlabel;
    private javax.swing.JTable extable;
    private javax.swing.JTextField extxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton loginbut;
    private javax.swing.JRadioButton loginradiobutton;
    private javax.swing.JButton logoutbut;
    private javax.swing.JLabel mysublabel;
    private javax.swing.JTable mysubtable;
    private javax.swing.JScrollPane mysubtable1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton newsubbut;
    private javax.swing.JComboBox<String> newsubex;
    private javax.swing.JLabel newsubext;
    private javax.swing.JTextField newsubname;
    private javax.swing.JLabel newsubnamet;
    private javax.swing.JPanel newsubpanel;
    private javax.swing.JComboBox<String> newsubproap;
    private javax.swing.JLabel newsubproapt;
    private javax.swing.JSeparator newsubsep;
    private javax.swing.JLabel newsubtitle;
    private javax.swing.JPasswordField passt;
    private javax.swing.JLabel regaml;
    private javax.swing.JTextField regamt;
    private javax.swing.JButton registerbut;
    private javax.swing.JRadioButton registerradiobutton;
    private javax.swing.JLabel regnamel;
    private javax.swing.JTextField regnamet;
    private javax.swing.JTable subtable;
    private javax.swing.JButton subupbut;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JButton teacherbut;
    private javax.swing.JTable teachertable;
    private javax.swing.JTextField tmhmatxt;
    private javax.swing.JTextField usert;
    private javax.swing.JButton ypovoliBut;
    // End of variables declaration//GEN-END:variables
}
