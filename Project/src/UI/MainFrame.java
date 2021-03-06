package UI;
import LT.Operacoes;
import java.math.BigDecimal;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    static String expression = "";
    static int cont = 0;
    static String m = "Erro";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.ButtonGroup();
        BGI = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        A = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        Bdot = new javax.swing.JButton();
        BDelete = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        Bmais = new javax.swing.JButton();
        Bmenos = new javax.swing.JButton();
        Bmul = new javax.swing.JButton();
        Bdiv = new javax.swing.JButton();
        Bexp = new javax.swing.JButton();
        Bopc = new javax.swing.JButton();
        Bclc = new javax.swing.JButton();
        Brad = new javax.swing.JButton();
        Brad2 = new javax.swing.JButton();
        Bfat1 = new javax.swing.JButton();
        Bpor1 = new javax.swing.JButton();
        Blogn = new javax.swing.JButton();
        Bln = new javax.swing.JButton();
        Bvir = new javax.swing.JButton();
        Bper = new javax.swing.JButton();
        Bcomb = new javax.swing.JButton();
        Barr = new javax.swing.JButton();
        BL = new javax.swing.JButton();
        Bsenx = new javax.swing.JButton();
        Bcosx = new javax.swing.JButton();
        Btgx = new javax.swing.JButton();
        Bsecx = new javax.swing.JButton();
        Bcsecx = new javax.swing.JButton();
        Bctgx = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ab = new javax.swing.JTextArea();
        H = new javax.swing.JLabel();
        BL1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Tema = new javax.swing.JMenu();
        MPitem = new javax.swing.JCheckBoxMenuItem();
        MCitem = new javax.swing.JCheckBoxMenuItem();
        Idioma = new javax.swing.JMenu();
        Pt = new javax.swing.JCheckBoxMenuItem();
        Eng = new javax.swing.JCheckBoxMenuItem();
        Func = new javax.swing.JMenu();
        Trig = new javax.swing.JCheckBoxMenuItem();
        AC = new javax.swing.JCheckBoxMenuItem();
        Log = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        A.setEditable(false);
        A.setColumns(20);
        A.setFont(new java.awt.Font("Arial", 0, 31)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        A.setLineWrap(true);
        A.setRows(2);
        A.setWrapStyleWord(true);
        A.setBorder(null);
        A.setCaretColor(new java.awt.Color(255, 255, 255));
        A.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(A);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        B1.setBackground(new java.awt.Color(162, 181, 205));
        B1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(162, 181, 205));
        B4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(162, 181, 205));
        B7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(162, 181, 205));
        B2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(162, 181, 205));
        B5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(162, 181, 205));
        B8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(162, 181, 205));
        B6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(162, 181, 205));
        B9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(162, 181, 205));
        B3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(162, 181, 205));
        B0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        Bdot.setBackground(new java.awt.Color(162, 181, 205));
        Bdot.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bdot.setText(".");
        Bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdotActionPerformed(evt);
            }
        });

        BDelete.setBackground(new java.awt.Color(255, 165, 79));
        BDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BDelete.setForeground(new java.awt.Color(110, 80, 20));
        BDelete.setText("DEL");
        BDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteActionPerformed(evt);
            }
        });

        Bigual.setBackground(new java.awt.Color(90, 180, 90));
        Bigual.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Bigual.setForeground(new java.awt.Color(0, 70, 0));
        Bigual.setText("=");
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fim(evt);
            }
        });

        Bmais.setBackground(new java.awt.Color(204, 204, 204));
        Bmais.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bmais.setText("+");
        Bmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmaisActionPerformed(evt);
            }
        });

        Bmenos.setBackground(new java.awt.Color(204, 204, 204));
        Bmenos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bmenos.setText("-");
        Bmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmenosActionPerformed(evt);
            }
        });

        Bmul.setBackground(new java.awt.Color(204, 204, 204));
        Bmul.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bmul.setText("x");
        Bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmulActionPerformed(evt);
            }
        });

        Bdiv.setBackground(new java.awt.Color(204, 204, 204));
        Bdiv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bdiv.setText("/");
        Bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdivActionPerformed(evt);
            }
        });

        Bexp.setBackground(new java.awt.Color(204, 204, 204));
        Bexp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bexp.setText("^");
        Bexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BexpActionPerformed(evt);
            }
        });

        Bopc.setBackground(new java.awt.Color(204, 204, 204));
        Bopc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bopc.setText("(");
        Bopc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BopcActionPerformed(evt);
            }
        });

        Bclc.setBackground(new java.awt.Color(204, 204, 204));
        Bclc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bclc.setText(")");
        Bclc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclcActionPerformed(evt);
            }
        });

        Brad.setBackground(new java.awt.Color(204, 204, 204));
        Brad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Brad.setText("²√");
        Brad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BradActionPerformed(evt);
            }
        });

        Brad2.setBackground(new java.awt.Color(204, 204, 204));
        Brad2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Brad2.setText("ª√");
        Brad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Brad2ActionPerformed(evt);
            }
        });

        Bfat1.setBackground(new java.awt.Color(204, 204, 204));
        Bfat1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bfat1.setText("!");
        Bfat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bfat1ActionPerformed(evt);
            }
        });

        Bpor1.setBackground(new java.awt.Color(204, 204, 204));
        Bpor1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bpor1.setText("% de");
        Bpor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bpor1ActionPerformed(evt);
            }
        });

        Blogn.setBackground(new java.awt.Color(204, 204, 204));
        Blogn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Blogn.setText("log");
        Blogn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlognActionPerformed(evt);
            }
        });

        Bln.setBackground(new java.awt.Color(204, 204, 204));
        Bln.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bln.setText("ln");
        Bln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlnActionPerformed(evt);
            }
        });

        Bvir.setBackground(new java.awt.Color(204, 204, 204));
        Bvir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bvir.setText(",");
        Bvir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvirActionPerformed(evt);
            }
        });

        Bper.setBackground(new java.awt.Color(204, 204, 204));
        Bper.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bper.setText("Pn");
        Bper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BperActionPerformed(evt);
            }
        });

        Bcomb.setBackground(new java.awt.Color(204, 204, 204));
        Bcomb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bcomb.setText("C n, p");
        Bcomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcombActionPerformed(evt);
            }
        });

        Barr.setBackground(new java.awt.Color(204, 204, 204));
        Barr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Barr.setText("A n, p");
        Barr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarrActionPerformed(evt);
            }
        });

        BL.setBackground(new java.awt.Color(255, 100, 100));
        BL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BL.setForeground(new java.awt.Color(90, 0, 0));
        BL.setText("L");
        BL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLActionPerformed(evt);
            }
        });

        Bsenx.setBackground(new java.awt.Color(204, 204, 204));
        Bsenx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bsenx.setText("sen x°");
        Bsenx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsenxActionPerformed(evt);
            }
        });

        Bcosx.setBackground(new java.awt.Color(204, 204, 204));
        Bcosx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bcosx.setText("cos x°");
        Bcosx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcosxActionPerformed(evt);
            }
        });

        Btgx.setBackground(new java.awt.Color(204, 204, 204));
        Btgx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Btgx.setText("tg x°");
        Btgx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtgxActionPerformed(evt);
            }
        });

        Bsecx.setBackground(new java.awt.Color(204, 204, 204));
        Bsecx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bsecx.setText("sec x°");
        Bsecx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsecxActionPerformed(evt);
            }
        });

        Bcsecx.setBackground(new java.awt.Color(204, 204, 204));
        Bcsecx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bcsecx.setText("cossec x°");
        Bcsecx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcsecxActionPerformed(evt);
            }
        });

        Bctgx.setBackground(new java.awt.Color(204, 204, 204));
        Bctgx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bctgx.setText("cotg x°");
        Bctgx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BctgxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Bsenx, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bcosx, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Btgx, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Bsecx, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bcsecx, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bctgx, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bpor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Bcomb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Bper, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bfat1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bvir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Barr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bmais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bexp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(B7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Bmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Bopc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Brad2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Bclc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Brad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Blogn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bln, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bsenx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bcosx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btgx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bigual, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blogn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bln, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BL, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Barr, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmais, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bexp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Bopc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bclc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Brad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Bvir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Brad2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bper, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bfat1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsecx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcsecx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bctgx, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bpor1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Ab.setEditable(false);
        Ab.setBackground(new java.awt.Color(153, 153, 153));
        Ab.setColumns(20);
        Ab.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ab.setForeground(new java.awt.Color(255, 255, 255));
        Ab.setLineWrap(true);
        Ab.setRows(5);
        Ab.setWrapStyleWord(true);
        jScrollPane2.setViewportView(Ab);

        H.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        H.setForeground(new java.awt.Color(153, 153, 153));
        H.setText("Histórico");

        BL1.setBackground(new java.awt.Color(255, 100, 100));
        BL1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BL1.setForeground(new java.awt.Color(90, 0, 0));
        BL1.setText("L");
        BL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BL1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(BL1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tema.setText("Tema");

        BG.add(MPitem);
        MPitem.setSelected(true);
        MPitem.setText("Padrão");
        MPitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPitemActionPerformed(evt);
            }
        });
        Tema.add(MPitem);

        BG.add(MCitem);
        MCitem.setText("Claro");
        MCitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCitemActionPerformed(evt);
            }
        });
        Tema.add(MCitem);

        jMenuBar1.add(Tema);

        Idioma.setText("Idioma");

        BGI.add(Pt);
        Pt.setSelected(true);
        Pt.setText("Português");
        Pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PtActionPerformed(evt);
            }
        });
        Idioma.add(Pt);

        BGI.add(Eng);
        Eng.setText("Inglês");
        Eng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngActionPerformed(evt);
            }
        });
        Idioma.add(Eng);

        jMenuBar1.add(Idioma);

        Func.setText("Funcionalidades");

        Trig.setSelected(true);
        Trig.setText("Trigonometria");
        Trig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrigActionPerformed(evt);
            }
        });
        Func.add(Trig);

        AC.setSelected(true);
        AC.setText("Análise combinatória");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        Func.add(AC);

        Log.setSelected(true);
        Log.setText("Logaritmo");
        Log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogActionPerformed(evt);
            }
        });
        Func.add(Log);

        jMenuBar1.add(Func);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        addToExpression("1");
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        addToExpression("2");
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        addToExpression("3");
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        addToExpression("4");
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        addToExpression("5");
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        addToExpression("6");
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        addToExpression("7");
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        addToExpression("8");
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        addToExpression("9");
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
        addToExpression("0");
    }//GEN-LAST:event_B0ActionPerformed

    private void BmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmaisActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "+";
        A.append(" + ");
    }//GEN-LAST:event_BmaisActionPerformed

    private void BmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmenosActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "-";
        A.append(" - ");
    }//GEN-LAST:event_BmenosActionPerformed

    private void BmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmulActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "*";
        A.append(" * ");
    }//GEN-LAST:event_BmulActionPerformed

    private void BdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdivActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "/";
        A.append(" / ");
    }//GEN-LAST:event_BdivActionPerformed

    private void Fim(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fim
        boolean dep_mod = false;
        if (MPitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(204, 204, 204));
        } else if (MCitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(255, 255, 0));
        }  
        if(cont != 0 && cont % 4 == 0) Ab.setText("");
        if(dep_mod) System.out.println("OPERACOES : "+expression);
        if(dep_mod) System.out.println("A.GETTEXT() : "+A.getText());
        if(null == A.getText()) {
            Operacoes O = new Operacoes(expression);
            float resultado = O.main();
            boolean verifica = O.getvalidade();
            if (verifica) {
                String R = defineResult(resultado);
                expression = R;
                A.setText("");
                A.append(R);
            } else {
                A.setText("");
                A.append(m);
                expression = "";
            }
        } else switch (A.getText()) {
            case "Error":
                A.setText("");
                break;
            case "Erro":
                A.setText("");
                break;
            case "":
                A.setText("");
                break;
            default:         
                Ab.append(A.getText()+"\n= ");
                cont++;
                Operacoes O = new Operacoes(expression);
                float resultado = O.main();
                boolean verifica = O.getvalidade();
                if (verifica) {
                    String R = defineResult(resultado);
                    expression = R;
                    A.setText(R);
                    Ab.append(R+"\n\n");
                } else {
                    A.setText("");
                    A.append(m);
                    Ab.append(m+"\n\n");
                    expression = "";
                }   
                break;
        }
        if(dep_mod) System.out.println("OPERACOES FIM : "+expression);
        if(dep_mod) System.out.println("A.GETTEXT() FIM : "+A.getText());
    }//GEN-LAST:event_Fim

    private void BdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdotActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += ".";
        A.append(".");
    }//GEN-LAST:event_BdotActionPerformed

    private void BexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BexpActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "^";
        A.append(" ^ ");
    }//GEN-LAST:event_BexpActionPerformed

    private void BopcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BopcActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "(";
        A.append("(");
    }//GEN-LAST:event_BopcActionPerformed

    private void BclcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclcActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += ")";
        A.append(")");
    }//GEN-LAST:event_BclcActionPerformed

    private void BradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BradActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "r";
        A.append("²√");
    }//GEN-LAST:event_BradActionPerformed

    private void BDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        if (expression != null || !"".equals(expression)) {
            String aux = "";
            String Opf = "";
            char[] Op_char = expression.toCharArray();
            int i = 0;
            A.setText("");
            if (Op_char.length > 1) {
                if (Op_char[Op_char.length - 1] == 'T'
                        || Op_char[Op_char.length - 1] == 'M'
                        || Op_char[Op_char.length - 1] == 'J') {
                    if (MPitem.isSelected()) {
                        Bvir.setBackground(new java.awt.Color(204, 204, 204));
                    } else if (MCitem.isSelected()) {
                        Bvir.setBackground(new java.awt.Color(255, 255, 0));
                    }
                }
            }
            while (i < Op_char.length - 1) {
                if(Op_char[i] == '+'
                        || Op_char[i] == '-'
                        || Op_char[i] == '*'
                        || Op_char[i] == '/'
                        || Op_char[i] == '^'){
                    A.append(" ");
                    aux += Op_char[i];
                    A.append(aux);
                    aux = "";
                    A.append(" ");
                }else if(Op_char[i] == 'r'){
                    aux += "²√";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == ','){
                    aux += ", ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'T'){
                    aux += "P ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'M'){
                    aux += "C ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'J'){
                    aux += "A ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == '!'){
                    aux += "!";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'l'){
                    aux += "ln ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'L'){
                    aux += "log ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'p'){
                    if(Pt.isSelected()) aux += "% de ";
                    else aux += "% of ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'Q'){
                    if(Pt.isSelected()) aux += "sen ";
                    else aux += "sin ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'W'){
                    aux += "cos ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'K'){
                    if(Pt.isSelected()) aux += "tg ";
                    else aux += "tan ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'H'){
                    aux += "sec ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'h'){
                    if(Pt.isSelected()) aux += "cossec ";
                    else aux += "cosec ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'k'){
                    if(Pt.isSelected()) aux += "cotg ";
                    else aux += "cotan ";
                    A.append(aux);
                    aux = "";
                }else if(Op_char[i] == 'R'){
                    aux += "√";
                    A.append(aux);
                    aux = "";
                }else{
                    aux += Op_char[i];
                    A.append(aux);
                    aux = "";
                }
                Opf += Op_char[i];
                i++;
            }
            expression = Opf;
            
        }
    }//GEN-LAST:event_BDeleteActionPerformed

    private void Brad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Brad2ActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "R";
        A.append("√");
    }//GEN-LAST:event_Brad2ActionPerformed

    private void Bpor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bpor1ActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "p(";
        if(Pt.isSelected()) A.append("% de (");
        else A.append("% of (");
    }//GEN-LAST:event_Bpor1ActionPerformed

    private void BlognActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlognActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "L(";
        A.append("log (");
    }//GEN-LAST:event_BlognActionPerformed

    private void BlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlnActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "l(";
        A.append("ln (");
    }//GEN-LAST:event_BlnActionPerformed

    private void BvirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvirActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        if (MPitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(204, 204, 204));
        } else if (MCitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(255, 255, 0));
        }
        expression += ",";
        A.append(", ");
    }//GEN-LAST:event_BvirActionPerformed

    private void BperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BperActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "T";
        A.append("P ");
    }//GEN-LAST:event_BperActionPerformed

    private void BcombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcombActionPerformed
       if("".equals(expression)){
            A.setText("");
        }
        if (MPitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(238, 70, 70));
        } else if (MCitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(255, 20, 20));
        }
        expression += "M";
        A.append("C ");
    }//GEN-LAST:event_BcombActionPerformed

    private void BarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarrActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        if (MPitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(238, 70, 70));
        } else if (MCitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(255, 20, 20));
        }
        expression += "J";
        A.append("A ");
    }//GEN-LAST:event_BarrActionPerformed

    private void MPitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPitemActionPerformed
        //Painel principal
        jPanel1.setBackground(java.awt.SystemColor.controlDkShadow);
        //Area de texto
        A.setBackground(java.awt.SystemColor.controlDkShadow);
        A.setFont(new java.awt.Font("Arial", 0, 31)); // NOI18N
        A.setForeground(new java.awt.Color(255, 255, 255));
        //Histórico 
        //jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        Ab.setBackground(new java.awt.Color(153, 153, 153));
        Ab.setForeground(new java.awt.Color(255, 255, 255));
        H.setBackground(new java.awt.Color(153, 153, 153));
        H.setForeground(new java.awt.Color(153, 153, 153));
        //Painel de números
        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        //Botões
        B0.setBackground(new java.awt.Color(162, 181, 205));
        B1.setBackground(new java.awt.Color(162, 181, 205));
        B2.setBackground(new java.awt.Color(162, 181, 205));
        B3.setBackground(new java.awt.Color(162, 181, 205));
        B4.setBackground(new java.awt.Color(162, 181, 205));
        B5.setBackground(new java.awt.Color(162, 181, 205));
        B6.setBackground(new java.awt.Color(162, 181, 205));
        B7.setBackground(new java.awt.Color(162, 181, 205));
        B8.setBackground(new java.awt.Color(162, 181, 205));
        B9.setBackground(new java.awt.Color(162, 181, 205));
        Bdot.setBackground(new java.awt.Color(162, 181, 205));
        BDelete.setBackground(new java.awt.Color(255, 165, 79));
        BDelete.setForeground(new java.awt.Color(110, 80, 20));
        
        Bigual.setBackground(new java.awt.Color(90, 180, 90));
        Bigual.setForeground(new java.awt.Color(0, 70, 0));
        
        BL.setBackground(new java.awt.Color(255, 100, 100));
        BL.setForeground(new java.awt.Color(90, 0, 0));
        
        BL1.setBackground(new java.awt.Color(255, 100, 100));
        BL1.setForeground(new java.awt.Color(90, 0, 0));
        
        Bmais.setBackground(new java.awt.Color(204, 204, 204));
        Bmenos.setBackground(new java.awt.Color(204, 204, 204));
        Bmul.setBackground(new java.awt.Color(204, 204, 204));
        Bdiv.setBackground(new java.awt.Color(204, 204, 204));
        Brad.setBackground(new java.awt.Color(204, 204, 204));
        Brad2.setBackground(new java.awt.Color(204, 204, 204));
        Bexp.setBackground(new java.awt.Color(204, 204, 204));
        Bopc.setBackground(new java.awt.Color(204, 204, 204));
        Bclc.setBackground(new java.awt.Color(204, 204, 204));
        Bpor1.setBackground(new java.awt.Color(204, 204, 204));
        Bfat1.setBackground(new java.awt.Color(204, 204, 204));
        Blogn.setBackground(new java.awt.Color(204, 204, 204));
        Bln.setBackground(new java.awt.Color(204, 204, 204));
        Bvir.setBackground(new java.awt.Color(204, 204, 204));
        Bper.setBackground(new java.awt.Color(204, 204, 204));
        Bcomb.setBackground(new java.awt.Color(204, 204, 204));
        Barr.setBackground(new java.awt.Color(204, 204, 204));
        Bsenx.setBackground(new java.awt.Color(204, 204, 204)); 
        Bcosx.setBackground(new java.awt.Color(204, 204, 204)); 
        Btgx.setBackground(new java.awt.Color(204, 204, 204)); 
        Bsecx.setBackground(new java.awt.Color(204, 204, 204)); 
        Bcsecx.setBackground(new java.awt.Color(204, 204, 204)); 
        Bctgx.setBackground(new java.awt.Color(204, 204, 204)); 
    }//GEN-LAST:event_MPitemActionPerformed

    private void MCitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCitemActionPerformed
        //Painel principal
        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        //Area de texto
        A.setBackground(new java.awt.Color(240, 240, 240));
        A.setFont(new java.awt.Font("Arial", 0, 31)); // NOI18N
        A.setForeground(java.awt.SystemColor.controlDkShadow);
        //Histórico 
        //jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.controlDkShadow, 3));
        jPanel3.setBackground(java.awt.SystemColor.controlDkShadow);
        Ab.setBackground(new java.awt.Color(214, 214, 214));
        Ab.setForeground(java.awt.SystemColor.controlDkShadow);
        H.setBackground(java.awt.SystemColor.controlDkShadow);
        H.setForeground(new java.awt.Color(214, 214, 214));
        //Painel de números
        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.controlDkShadow, 3));
        //Botões
        B0.setBackground(new java.awt.Color(220, 220, 220));
        B1.setBackground(new java.awt.Color(220, 220, 220));
        B2.setBackground(new java.awt.Color(220, 220, 220));
        B3.setBackground(new java.awt.Color(220, 220, 220));
        B4.setBackground(new java.awt.Color(220, 220, 220));
        B5.setBackground(new java.awt.Color(220, 220, 220));
        B6.setBackground(new java.awt.Color(220, 220, 220));
        B7.setBackground(new java.awt.Color(220, 220, 220));
        B8.setBackground(new java.awt.Color(220, 220, 220));
        B9.setBackground(new java.awt.Color(220, 220, 220));
        Bdot.setBackground(new java.awt.Color(220, 220, 220));
        BDelete.setBackground(new java.awt.Color(255, 165, 0));
        BDelete.setForeground(new java.awt.Color(255, 255, 255));
        
        
        Bigual.setBackground(new java.awt.Color(15, 255, 15));
        Bigual.setForeground(new java.awt.Color(255, 255, 255));
        
        BL.setBackground(new java.awt.Color(255, 15, 15));
        BL.setForeground(new java.awt.Color(255, 255, 255));
        
        BL1.setBackground(new java.awt.Color(255, 15, 15));
        BL1.setForeground(new java.awt.Color(255, 255, 255));
        
        Bmais.setBackground(new java.awt.Color(255, 255, 0));
        Bmenos.setBackground(new java.awt.Color(255, 255, 0));
        Bmul.setBackground(new java.awt.Color(255, 255, 0));
        Bdiv.setBackground(new java.awt.Color(255, 255, 0));
        Brad.setBackground(new java.awt.Color(255, 255, 0));
        Brad2.setBackground(new java.awt.Color(255, 255, 0));
        Bexp.setBackground(new java.awt.Color(255, 255, 0));
        Bopc.setBackground(new java.awt.Color(255, 255, 0));
        Bclc.setBackground(new java.awt.Color(255, 255, 0));
        Bpor1.setBackground(new java.awt.Color(255, 255, 0));
        Bfat1.setBackground(new java.awt.Color(255, 255, 0));
        Blogn.setBackground(new java.awt.Color(255, 255, 0));
        Bln.setBackground(new java.awt.Color(255, 255, 0));
        Bvir.setBackground(new java.awt.Color(255, 255, 0));
        Bper.setBackground(new java.awt.Color(255, 255, 0));
        Bcomb.setBackground(new java.awt.Color(255, 255, 0));
        Barr.setBackground(new java.awt.Color(255, 255, 0)); 
        Bsenx.setBackground(new java.awt.Color(255, 255, 0)); 
        Bcosx.setBackground(new java.awt.Color(255, 255, 0)); 
        Btgx.setBackground(new java.awt.Color(255, 255, 0)); 
        Bsecx.setBackground(new java.awt.Color(255, 255, 0)); 
        Bcsecx.setBackground(new java.awt.Color(255, 255, 0)); 
        Bctgx.setBackground(new java.awt.Color(255, 255, 0)); 
    }//GEN-LAST:event_MCitemActionPerformed

    private void BLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLActionPerformed
        A.setText("");
        expression = "";   
        if (MPitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(204, 204, 204));
        } else if (MCitem.isSelected()) {
            Bvir.setBackground(new java.awt.Color(255, 255, 0));
        }
    }//GEN-LAST:event_BLActionPerformed

    private void BsenxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsenxActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "Q(";
        if(Pt.isSelected()) A.append("sen (");
        else A.append("sin (");
    }//GEN-LAST:event_BsenxActionPerformed

    private void BcosxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcosxActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "W(";
        A.append("cos (");
    }//GEN-LAST:event_BcosxActionPerformed

    private void BtgxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtgxActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "K(";
        if(Pt.isSelected()) A.append("tg (");
        else A.append("tan (");
    }//GEN-LAST:event_BtgxActionPerformed

    private void BsecxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsecxActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "H(";
        A.append("sec (");
    }//GEN-LAST:event_BsecxActionPerformed

    private void BcsecxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcsecxActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "h(";
        if(Pt.isSelected()) A.append("cossec (");
        else A.append("cosec (");
    }//GEN-LAST:event_BcsecxActionPerformed

    private void BctgxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BctgxActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "k(";
        if(Pt.isSelected()) A.append("cotg (");
        else A.append("cotan (");
    }//GEN-LAST:event_BctgxActionPerformed

    private void Bfat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bfat1ActionPerformed
        if("".equals(expression)){
            A.setText("");
        }
        expression += "!";
        A.append("!");
    }//GEN-LAST:event_Bfat1ActionPerformed

    private void PtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PtActionPerformed
        Bpor1.setText("% de");
        Bsenx.setText("sen x°");
        Btgx.setText("tg x°");
        Bcsecx.setText("cossec x°");
        Bctgx.setText("cotg x°");
        BL.setText("L");
        BL1.setText("L");
        
        H.setText("Histórico");
        setTitle("Calculadora");
        
        Tema.setText("Tema");
        MPitem.setText("Padrâo");
        MCitem.setText("Claro");
        
        Idioma.setText("Idioma");
        Pt.setText("Português");
        Eng.setText("Inglês");
        
        Func.setText("Funcionalidades");
        Trig.setText("Trigonometria");
        AC.setText("Análise combinatória");
        Log.setText("Logaritmo");
        
        m = "Erro";
        A.setText("");
        Ab.setText("");
        expression = "";
    }//GEN-LAST:event_PtActionPerformed

    private void EngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngActionPerformed
        Bpor1.setText("% of");
        Bsenx.setText("sin x°");
        Btgx.setText("tan x°");
        Bcsecx.setText("cosec x°");
        Bctgx.setText("cotan x°");
        BL.setText("C");
        BL1.setText("C");
        
        H.setText("Log");
        setTitle("Calculator");
        
        Tema.setText("Theme");
        MPitem.setText("Default");
        MCitem.setText("Light");
        
        Idioma.setText("Language");
        Pt.setText("Portuguese");
        Eng.setText("English");
        
        Func.setText("Functionalities");
        Trig.setText("Trigonometry");
        AC.setText("Combinatorial analysis");
        Log.setText("Logarithm");
        
        m = "Error";
        A.setText("");
        Ab.setText("");
        expression = "";
    }//GEN-LAST:event_EngActionPerformed

    private void TrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrigActionPerformed
        if(Trig.isSelected()){
            Bsenx.setEnabled(true);
            Bcosx.setEnabled(true);
            Btgx.setEnabled(true);
            Bsecx.setEnabled(true);
            Bcsecx.setEnabled(true);
            Bctgx.setEnabled(true);
        }else{
            Bsenx.setEnabled(false);
            Bcosx.setEnabled(false);
            Btgx.setEnabled(false);
            Bsecx.setEnabled(false);
            Bcsecx.setEnabled(false);
            Bctgx.setEnabled(false);
        }
    }//GEN-LAST:event_TrigActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        if(AC.isSelected()){
            Barr.setEnabled(true);
            Bcomb.setEnabled(true);
            Bper.setEnabled(true);
            Bvir.setEnabled(true);
            Bfat1.setEnabled(true);
        }else{
            Barr.setEnabled(false);
            Bcomb.setEnabled(false);
            Bper.setEnabled(false);
            Bvir.setEnabled(false);
            Bfat1.setEnabled(false);
        }
    }//GEN-LAST:event_ACActionPerformed

    private void LogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogActionPerformed
        if(Log.isSelected()){
            Bln.setEnabled(true);
            Blogn.setEnabled(true);
        }else{
            Bln.setEnabled(false);
            Blogn.setEnabled(false);
        }
    }//GEN-LAST:event_LogActionPerformed

    private void BL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BL1ActionPerformed
        Ab.setText("");
        cont = 0;
    }//GEN-LAST:event_BL1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    public static javax.swing.JTextArea defineExpressionArea(javax.swing.JTextArea Ab, String R){
        String aux = "";
        int i = 0;
        char[] c = R.toCharArray();
        while(i < c.length){
            if(c[i] != ' '){
                aux += c[i];
            }else{
                Ab.append(aux);
                aux = "";
            }
            i++;
        }
        Ab.append(" =");
        Ab.append("\n");
        return Ab;
    }
    
    private String defineResult(float resultado){
        String resultadoS = "";
        //Verifica se o resultado possue o Notação cientifica
        char[] resultadoChar = Float.toString(resultado).toCharArray();
        boolean verifica = false;
        for(int i = 0; i < resultadoChar.length; i++){
            if(resultadoChar[i] == 'E'){
                verifica = true;
                break;
            }
        }
        if(verifica){
            BigDecimal Rbd = new BigDecimal(Float.toString(resultado));
            resultadoS = Rbd.toPlainString();
        }else{
            resultadoS = Float.toString(resultado);
        }
        return resultadoS;
    }
    
    private void addToExpression(String s){
        if("".equals(expression)){
            A.setText("");
        }
        expression += s;
        A.append(s);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea A;
    private javax.swing.JCheckBoxMenuItem AC;
    private javax.swing.JTextArea Ab;
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BDelete;
    private javax.swing.ButtonGroup BG;
    private javax.swing.ButtonGroup BGI;
    private javax.swing.JButton BL;
    private javax.swing.JButton BL1;
    private javax.swing.JButton Barr;
    private javax.swing.JButton Bclc;
    private javax.swing.JButton Bcomb;
    private javax.swing.JButton Bcosx;
    private javax.swing.JButton Bcsecx;
    private javax.swing.JButton Bctgx;
    private javax.swing.JButton Bdiv;
    private javax.swing.JButton Bdot;
    private javax.swing.JButton Bexp;
    private javax.swing.JButton Bfat1;
    private javax.swing.JButton Bigual;
    private javax.swing.JButton Bln;
    private javax.swing.JButton Blogn;
    private javax.swing.JButton Bmais;
    private javax.swing.JButton Bmenos;
    private javax.swing.JButton Bmul;
    private javax.swing.JButton Bopc;
    private javax.swing.JButton Bper;
    private javax.swing.JButton Bpor1;
    private javax.swing.JButton Brad;
    private javax.swing.JButton Brad2;
    private javax.swing.JButton Bsecx;
    private javax.swing.JButton Bsenx;
    private javax.swing.JButton Btgx;
    private javax.swing.JButton Bvir;
    private javax.swing.JCheckBoxMenuItem Eng;
    private javax.swing.JMenu Func;
    private javax.swing.JLabel H;
    private javax.swing.JMenu Idioma;
    private javax.swing.JCheckBoxMenuItem Log;
    private javax.swing.JCheckBoxMenuItem MCitem;
    private javax.swing.JCheckBoxMenuItem MPitem;
    private javax.swing.JCheckBoxMenuItem Pt;
    private javax.swing.JMenu Tema;
    private javax.swing.JCheckBoxMenuItem Trig;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
