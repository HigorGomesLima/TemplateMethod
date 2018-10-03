package templatemethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Tela extends javax.swing.JFrame {
    
    List<Professor> dadosProf;
    List<String> ordem;

    public Tela() {
        initComponents();
        PersistenciaLista dados = new PersistenciaLista();
        dadosProf = dados.getLista();
        ordem = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) grid_Dados.getModel();
        Iterator<Professor> it = dados.getDados();
        while(it.hasNext()){
            Professor aux = it.next();
            String[] x = {aux.getMatricula(),aux.getNome(),aux.getDepartamento(),aux.getTitulacao(),aux.getHorista()};
            model.addRow(x);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Dados = new javax.swing.JTable();
        check_nome = new javax.swing.JCheckBox();
        labe_nome = new javax.swing.JLabel();
        check_matricula = new javax.swing.JCheckBox();
        labe_matricula = new javax.swing.JLabel();
        check_departamento = new javax.swing.JCheckBox();
        labe_departamento = new javax.swing.JLabel();
        check_titulacao = new javax.swing.JCheckBox();
        labe_titulacao = new javax.swing.JLabel();
        check_horista = new javax.swing.JCheckBox();
        labe_horista = new javax.swing.JLabel();
        att = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMain = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Dados Professor");

        grid_Dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Departamento", "Titulação", "Horista"
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
        jScrollPane1.setViewportView(grid_Dados);

        check_nome.setText("Nome");
        check_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_nomeMouseClicked(evt);
            }
        });

        labe_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labe_nome.setText(" ");

        check_matricula.setText("Matricula");
        check_matricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_matriculaMouseClicked(evt);
            }
        });

        labe_matricula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labe_matricula.setText(" ");

        check_departamento.setText("Departamento");
        check_departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_departamentoMouseClicked(evt);
            }
        });

        labe_departamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labe_departamento.setText(" ");

        check_titulacao.setText("Titulacao");
        check_titulacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_titulacaoMouseClicked(evt);
            }
        });

        labe_titulacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labe_titulacao.setText(" ");

        check_horista.setText("Horista");
        check_horista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_horistaMouseClicked(evt);
            }
        });

        labe_horista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labe_horista.setText(" ");

        att.setText("Atualizar");
        att.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attActionPerformed(evt);
            }
        });

        menuMain.setText("Ordenar");
        jMenuBar1.add(menuMain);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(labelTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labe_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_nome)
                        .addGap(36, 36, 36)
                        .addComponent(labe_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_departamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labe_horista, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labe_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_matricula)
                        .addGap(18, 18, 18)
                        .addComponent(labe_titulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(check_titulacao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(att)
                    .addComponent(check_horista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_departamento)
                        .addComponent(labe_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_horista)
                        .addComponent(labe_horista, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_nome)
                        .addComponent(labe_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_titulacao)
                        .addComponent(labe_titulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(att))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(check_matricula)
                        .addComponent(labe_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_nomeMouseClicked
        
        if(this.check_nome.isSelected()){
            ordem.add("nome");
        }else{
            if(ordem.indexOf("nome")>=0)
                ordem.remove(ordem.indexOf("nome"));
        }
        setLabel();
    }//GEN-LAST:event_check_nomeMouseClicked

    private void check_matriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_matriculaMouseClicked
        if(this.check_matricula.isSelected()){
            ordem.add("mat");
        }else{
            if(ordem.indexOf("mat")>=0)
                ordem.remove(ordem.indexOf("mat"));
        }
        setLabel();
    }//GEN-LAST:event_check_matriculaMouseClicked

    private void check_departamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_departamentoMouseClicked
        if(this.check_departamento.isSelected()){
            ordem.add("dep");
        }else{
            if(ordem.indexOf("dep")>=0)
                ordem.remove(ordem.indexOf("dep"));
        }
        setLabel();
    }//GEN-LAST:event_check_departamentoMouseClicked

    private void check_titulacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_titulacaoMouseClicked
        if(this.check_titulacao.isSelected()){
            ordem.add("tit");
        }else{
            if(ordem.indexOf("tit")>=0)
                ordem.remove(ordem.indexOf("tit"));
        }
        setLabel();
    }//GEN-LAST:event_check_titulacaoMouseClicked

    private void check_horistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_horistaMouseClicked
        if(this.check_horista.isSelected()){
            ordem.add("hrs");
        }else{
            if(ordem.indexOf("hrs")>=0)
                ordem.remove(ordem.indexOf("hrs"));
        }
        setLabel();
    }//GEN-LAST:event_check_horistaMouseClicked

    private void attActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attActionPerformed
        for(int i = ordem.size()-1;i >= 0; i--){
            String aux = ordem.get(i);
            switch (aux){
                case "nome":
                    if((i%2 == 1) || (i == 2))
                        dadosProf = new SortNome().insertSort(dadosProf);
                    else
                        dadosProf = new SortNome().insertSortD(dadosProf);
                    break;
                case "dep":
                    if((i%2 == 1) || (i == 2))
                        dadosProf = new SortDepart().insertSort(dadosProf);
                    else
                        dadosProf = new SortDepart().insertSortD(dadosProf);
                    break;
                case "tit":
                    if((i%2 == 1) || (i == 2))
                        dadosProf = new SortTitulacao().insertSort(dadosProf);
                    else
                        dadosProf = new SortTitulacao().insertSortD(dadosProf);
                    break;
                case "hrs":
                    if((i%2 == 1) || (i == 2))
                        dadosProf = new SortHorst().insertSort(dadosProf);
                    else
                        dadosProf = new SortHorst().insertSortD(dadosProf);
                    break;
                case "mat":
                    if((i%2 == 1) || (i == 2))
                        dadosProf = new SortMatricula().insertSort(dadosProf);
                    else
                        dadosProf = new SortMatricula().insertSortD(dadosProf);
                    break;
            }
        }
        plotGrid();
    }//GEN-LAST:event_attActionPerformed

    public void plotGrid(){
        DefaultTableModel model = (DefaultTableModel) grid_Dados.getModel();
        Iterator<Professor> it = dadosProf.iterator();
        while(grid_Dados.getModel().getRowCount() > 0){
            ((DefaultTableModel) grid_Dados.getModel()).removeRow(0);
        }
        while(it.hasNext()){
            Professor aux = it.next();
            String[] x = {aux.getMatricula(),aux.getNome(),aux.getDepartamento(),aux.getTitulacao(),aux.getHorista()};
            model.addRow(x);
        }
    }
    
    public void setLabel(){
        labe_nome.setText("");
        labe_departamento.setText("");
        labe_titulacao.setText("");
        labe_horista.setText("");
        labe_matricula.setText("");
        for(int i = 0;i < ordem.size(); i++){
            String aux = ordem.get(i);
            switch (aux){
                case "nome":
                    labe_nome.setText((i+1)+"");
                    break;
                case "dep":
                    labe_departamento.setText((i+1)+"");
                    break;
                case "tit":
                    labe_titulacao.setText((i+1)+"");
                    break;
                case "hrs":
                    labe_horista.setText((i+1)+"");
                    break;
                case "mat":
                    labe_matricula.setText((i+1)+"");
                    break;
            }
        }
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton att;
    private javax.swing.JCheckBox check_departamento;
    private javax.swing.JCheckBox check_horista;
    private javax.swing.JCheckBox check_matricula;
    private javax.swing.JCheckBox check_nome;
    private javax.swing.JCheckBox check_titulacao;
    private javax.swing.JTable grid_Dados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labe_departamento;
    private javax.swing.JLabel labe_horista;
    private javax.swing.JLabel labe_matricula;
    private javax.swing.JLabel labe_nome;
    private javax.swing.JLabel labe_titulacao;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenu menuMain;
    // End of variables declaration//GEN-END:variables
}
