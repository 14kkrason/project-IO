package Classes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class WidmoPanel extends JFrame{
    private JComboBox comboBox1;
    private JButton okButton;
    private JLabel name;
    private JPanel text;
    public JPanel WidmoPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel probki;
    private Baza_danych baza;

    private int iloscProbek;
    private int czestotliwoscProbkowania;
    private int amplituda;

    public WidmoPanel(String text, Baza_danych baza) {
        super(text);
        this.baza = baza;
        for(Nagranie nagranie : baza.nagrania) {
            comboBox1.addItem(nagranie.nazwa);
        }
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iloscProbek = Integer.parseInt(textField1.getText());
                amplituda = Integer.parseInt(textField2.getText());
                czestotliwoscProbkowania = Integer.parseInt(textField3.getText());

                wyswietlWidmo();
            }
        });
    }

    public void wyswietlWidmo() {
        Ramka Okno;
        DTFT Transformata;
        funkcje sygnał;

        double fs; //Parametry próbkowania
        int N;

        double A; //Parametry sygnału
        double f;

        double f_max; //Parametry DTFT
        double f_min;
        double f_krok;

        double[] próbki;
        widmo[] wynik;

        fs = czestotliwoscProbkowania;
        N = iloscProbek;
        A = amplituda;

        f = 20;

        f_max = fs/2;
        f_min = -f_max;
        f_krok = fs/2000;

        Transformata = new DTFT(f_min, f_max, f_krok, fs);
        sygnał = new funkcje(fs,N);

        /*String file = (String) comboBox1.getSelectedItem();
        PlikWave plik = new PlikWave(file + ".wav");
        plik.OtwórzIstniejącyPlik();
        byte[] bytes = plik.PobierzKilkaPróbek(0, N*8);
        /*ByteBuffer buf2 = ByteBuffer.wrap(bytes);
        próbki = new double[N];
        for (int i = 0; i < N; i++)
            próbki[i] = buf2.getDouble(i*8);
         */

        próbki = sygnał.sinus(20, 5);
        wynik = Transformata.ObliczDTFT(próbki);
        Okno = new Ramka(600,600,"Wykres widma",10,10, wynik);
        Okno.UstawMnieNaŚrodku();

        Okno.setVisible(true);

    }

}
