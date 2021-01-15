package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class fajar07176_GUI {
    JFrame Tampilan = new JFrame();
    JLabel judul,nomer,pemilik,merek,warna;
    JTextField nomertext,pemiliktext,merektext,warnatext;
    JButton create,view;
    JRadioButton datamotor,datamobil;
    public fajar07176_GUI(){
        Tampilan.setSize(600, 600);
        Tampilan.setLayout(null);
        Tampilan.getContentPane().setBackground(Color.GREEN);
        judul = new JLabel("CUCI MOBIL & MOTOR");
        judul.setBounds(110, 50, 350, 30);
        judul.setFont(new Font("Times New Roman",Font.BOLD,30));
        Tampilan.add(judul);  
        datamotor = new JRadioButton("Data Motor");
        datamotor.setBounds(170,140,100,30);
        datamotor.setBackground(Color.WHITE);
        Tampilan.add(datamotor);
        datamobil = new JRadioButton("Data Mobil");
        datamobil.setBounds(280,140,100,30);
        datamotor.setBackground(Color.WHITE);
        Tampilan.add(datamobil); 
        nomer = new JLabel("Nomor kendaraan");
        nomer.setBounds(130,180,130,20);
        Tampilan.add(nomer);
        nomertext = new JTextField();
        nomertext.setBounds(130,205,130,30);
        Tampilan.add(nomertext);
        pemilik = new JLabel("Nama Pemilik");
        pemilik.setBounds(130,230,130,30);
        Tampilan.add(pemilik);
        pemiliktext = new JTextField();
        pemiliktext.setBounds(130,255,130,30);
        Tampilan.add(pemiliktext);
        merek = new JLabel("Merek kendaraan");
        merek.setBounds(130,285,130,30);
        Tampilan.add(merek);
        merektext = new JTextField();
        merektext.setBounds(130,310,130,30);
        Tampilan.add(merektext);
        warna = new JLabel("Warna kendaraan");
        warna.setBounds(130,340,130,30);
        Tampilan.add(warna);
        warnatext = new JTextField();
        warnatext.setBounds(130,365,130,30);
        Tampilan.add(warnatext);
        create = new JButton("Create");
        create.setBounds(130,410,160,30);
        create.setBackground(Color.ORANGE);
        Tampilan.add(create);
        view = new JButton("Tampilkan Data");
        view.setBounds(130,445,160,30);
        view.setBackground(Color.ORANGE);
        Tampilan.add(view);
        Tampilan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Tampilan.setVisible(true);
        Tampilan.setLocationRelativeTo(null);
        
        datamotor.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(datamotor.isSelected()){
                   datamobil.setSelected(false);
                }
            }
        });
        datamobil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(datamobil.isSelected()){
                   datamotor.setSelected(false);
                }
            }
        });
        create.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(datamotor.isSelected()){
            String nomor07176   = nomertext.getText();
            String pemilik07176 = pemiliktext.getText();
            String merek07176   = merektext.getText();
            String warna07176   = warnatext.getText();
            fajar07176_allobjctrl.kendaraan07176.insertMotor07176(nomor07176, pemilik07176, merek07176, warna07176);
            JOptionPane.showMessageDialog(null, "Registrasi motor sukses", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();
            }else if(datamobil.isSelected()){
            String nomor07176   = nomertext.getText();
            String pemilik07176 = pemiliktext.getText();
            String merek07176   = merektext.getText();
            String warna07176   = warnatext.getText();
            fajar07176_allobjctrl.kendaraan07176.insertMobil07176(nomor07176, pemilik07176, merek07176, warna07176);
            JOptionPane.showMessageDialog(null, "Registrasi mobil sukses", "information", JOptionPane.INFORMATION_MESSAGE);
            kosong();    
            }else{
                JOptionPane.showMessageDialog(null, "Isi data dahulu", "information", JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        }
    });
        view.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            fajar07176_DataGUI hii = new fajar07176_DataGUI();
            Tampilan.dispose();
        }
    });
    }
     void kosong(){
        nomertext.setText(null);
        pemiliktext.setText(null);
        merektext.setText(null);
        warnatext.setText(null);
    }
}