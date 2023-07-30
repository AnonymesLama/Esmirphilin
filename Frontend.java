import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MietverwaltungGUI {
    private JFrame mainFrame;
    private JList<Mietobjekt> mietobjekteList;
    private DefaultListModel<Mietobjekt> listModel;
    private JButton addButton;

    public MietverwaltungGUI() {
        mainFrame = new JFrame("Mietverwaltung");
        mainFrame.setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        mietobjekteList = new JList<>(listModel);
        mietobjekteList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane listScrollPane = new JScrollPane(mietobjekteList);
        mainFrame.add(listScrollPane, BorderLayout.CENTER);

        mietobjekteList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Mietobjekt selectedMietobjekt = mietobjekteList.getSelectedValue();
                if (selectedMietobjekt != null) {
                    showDetailDialog(selectedMietobjekt);
                }
            }
        });

        addButton = new JButton("Neues Mietobjekt hinzufügen");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAddMietobjektDialog();
            }
        });
        mainFrame.add(addButton, BorderLayout.SOUTH);

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);
        mainFrame.setVisible(true);
    }

    private void showDetailDialog(Mietobjekt mietobjekt) {
        JFrame detailDialog = new JFrame("Mietobjekt Details");
        detailDialog.setLayout(new GridLayout(18, 2));

        JLabel kaltmieteLabel = new JLabel("Kaltmiete:");
        JLabel kaltmieteValue = new JLabel(String.valueOf(mietobjekt.getKaltmiete()));

        JLabel warmmieteLabel = new JLabel("Warmmiete:");
        JLabel warmmieteValue = new JLabel(String.valueOf(mietobjekt.getWarmmiete()));

        JLabel raeumeLabel = new JLabel("Räume:");
        JLabel raeumeValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel wohnflaecheLabel = new JLabel("Wohnfläche:");
        JLabel wohnflaecheValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel stockwerkeLabel = new JLabel("Stockwerke:");
        JLabel stockwerkeValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel wgEignungLabel = new JLabel("WG-Eignung:");
        JLabel wgEignungValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel fruehestesEinzugsdatumLabel = new JLabel("frühestes Einzugdatum:");
        JLabel fruehestesEinzugsdatumValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel kellerLabel = new JLabel("Keller:");
        JLabel kellerValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel balkonLabel = new JLabel("Balkon:");
        JLabel balkonValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel badfensterLabel = new JLabel("Badfenster:");
        JLabel badfensterValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel kuechenfensterLabel = new JLabel("Küchenfenster:");
        JLabel kuechenfensterValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel aufzugLabel = new JLabel("Aufzug:");
        JLabel aufzugValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel rollstuhleignungLabel = new JLabel("Rollstuhleingang:");
        JLabel rollstuhleignungValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel einbaukuecheLabel = new JLabel("Einbauküche:");
        JLabel einbaukuecheValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel badewanneLabel = new JLabel("Badewanne:");
        JLabel badewanneValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel moebeliertLabel = new JLabel("möbeliert:");
        JLabel moebeliertValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        JLabel vermLabel = new JLabel("Vermieter:");
        JLabel vermValue = new JLabel(String.valueOf(mietobjekt.getRaeume()));

        detailDialog.add(kaltmieteLabel);
        detailDialog.add(kaltmieteValue);
        detailDialog.add(warmmieteLabel);
        detailDialog.add(warmmieteValue);
        detailDialog.add(raeumeLabel);
        detailDialog.add(raeumeValue);
        detailDialog.add(wohnflaecheLabel);
        detailDialog.add(wohnflaecheValue);
        detailDialog.add(stockwerkeLabel);
        detailDialog.add(stockwerkeValue);
        detailDialog.add(wgEignungLabel);
        detailDialog.add(wgEignungValue);
        detailDialog.add(fruehestesEinzugsdatumLabel);
        detailDialog.add(fruehestesEinzugsdatumValue);
        detailDialog.add(kellerLabel);
        detailDialog.add(kellerValue);
        detailDialog.add(balkonLabel);
        detailDialog.add(balkonValue);
        detailDialog.add(badfensterLabel);
        detailDialog.add(badfensterValue);
        detailDialog.add(kuechenfensterLabel);
        detailDialog.add(kuechenfensterValue);
        detailDialog.add(aufzugLabel);
        detailDialog.add(aufzugValue);
        detailDialog.add(rollstuhleignungLabel);
        detailDialog.add(rollstuhleignungValue);
        detailDialog.add(einbaukuecheLabel);
        detailDialog.add(einbaukuecheValue);
        detailDialog.add(badewanneLabel);
        detailDialog.add(badewanneValue);
        detailDialog.add(moebeliertLabel);
        detailDialog.add(moebeliertValue);
        detailDialog.add(vermLabel);
        detailDialog.add(vermValue);
        
        detailDialog.pack();
        detailDialog.setVisible(true);
    }

    private void showAddMietobjektDialog() {
        JFrame addDialog = new JFrame("Neues Mietobjekt hinzufügen");
        addDialog.setLayout(new GridLayout(18, 2));

        JLabel kaltmieteLabel = new JLabel("Kaltmiete:");
        JTextField kaltmieteField = new JTextField();

        JLabel warmmieteLabel = new JLabel("Warmmiete:");
        JTextField warmmieteField = new JTextField();

        JLabel raeumeLabel = new JLabel("Räume:");
        JTextField raeumeField = new JTextField();

        JLabel wohnflaecheLabel = new JLabel("Wohnfläche:");
        JTextField wohnflaecheField = new JTextField();

        JLabel stockwerkeLabel = new JLabel("Stockwerke:");
        JTextField stockwerkeField = new JTextField();

        JLabel wgEignungLabel = new JLabel("WG-Eignung:");
        JCheckBox wgEignungField = new JCheckBox();

        JLabel fruehestesEinzugsdatumLabel = new JLabel("frühestes Einzugsdatum:");
        JTextField fruehestesEinzugsdatumField = new JTextField();

        JLabel kellerLabel = new JLabel("Keller:");
        JCheckBox kellerField = new JCheckBox();

        JLabel balkonLabel = new JLabel("Balkon:");
        JCheckBox balkonField = new JCheckBox();

        JLabel badfensterLabel = new JLabel("Badfenster:");
        JCheckBox badfensterField = new JCheckBox();

        JLabel kuechenfensterLabel = new JLabel("Küchenfenster:");
        JCheckBox kuechenfensterField = new JCheckBox();

        JLabel aufzugLabel = new JLabel("Aufzug:");
        JCheckBox aufzugField = new JCheckBox();

        JLabel rollstuhleignungLabel = new JLabel("Rollstuhleingang:");
        JCheckBox rollstuhleignungField = new JCheckBox();

        JLabel einbaukuecheLabel = new JLabel("Einbauküche:");
        JCheckBox einbaukuecheField = new JCheckBox();

        JLabel badewanneLabel = new JLabel("Badewanne:");
        JCheckBox badewanneField = new JCheckBox();

        JLabel moebeliertLabel = new JLabel("möbeliert:");
        JCheckBox moebeliertField = new JCheckBox();

        JLabel vermLabel = new JLabel("Vermieter:");
        JTextField vermField = new JTextField();

        JButton saveButton = new JButton("Speichern");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double kaltmiete = Double.parseDouble(kaltmieteField.getText());
                    double warmmiete = Double.parseDouble(warmmieteField.getText());
                    double raeume = Double.parseDouble(raeumeField.getText());
                    double wohnflaeche = Double.parseDouble(wohnflaecheField.getText());
                    double stockwerke = Double.parseDouble(stockwerkeField.getText());
                    boolean wgEignung  = Boolean.parseBoolean(wgEignungField.getText());
                    String fruehestesEinzugsdatum = fruehestesEinzugsdatumField.getText();
                    boolean keller = Boolean.parseBoolean(kellerField.getText());
                    boolean balkon = Boolean.parseBoolean(balkonField.getText());
                    boolean badfenster = Boolean.parseBoolean(badfensterField.getText());
                    boolean kuechenfenster = Boolean.parseBoolean(kuechenfensterField.getText());
                    boolean aufzug = Boolean.parseBoolean(aufzugField.getText());
                    boolean rollstuhleignung = Boolean.parseBoolean(rollstuhleignungField.getText());
                    boolean einbaukueche = Boolean.parseBoolean(einbaukuecheField.getText());
                    boolean badewanne = Boolean.parseBoolean(badewanneField.getText());
                    boolean moebeliert = Boolean.parseBoolean(moebeliertField.getText());
                    String verm = vermField.getText();

                    Mietobjekt newMietobjekt = new Mietobjekt(kaltmiete, warmmiete, raeume, wohnflaeche, stockwerke, fruehestesEinzugsdatum, keller, balkon, badfenster, kuechenfenster, aufzug, rollstuhleignung, einbaukueche, badewanne, moebeliert, verm);

                    listModel.addElement(newMietobjekt);
                    addDialog.dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(addDialog, "Ungültige Eingabe.", "Fehler",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton cancelButton = new JButton("Abbrechen");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDialog.dispose();
            }
        });

        addDialog.add(kaltmieteLabel);
        addDialog.add(kaltmieteField);
        addDialog.add(warmmieteLabel);
        addDialog.add(warmmieteField);
        addDialog.add(raeumeLabel);
        addDialog.add(raeumeField);
        addDialog.add(wohnflaecheLabel);
        addDialog.add(wohnflaecheField);
        addDialog.add(stockwerkeLabel);
        addDialog.add(stockwerkeField);
        addDialog.add(wgEignungLabel);
        addDialog.add(wgEignungField);
        addDialog.add(fruehestesEinzugsdatumLabel);
        addDialog.add(fruehestesEinzugsdatumField);
        addDialog.add(kellerLabel);
        addDialog.add(kellerField);
        addDialog.add(balkonLabel);
        addDialog.add(balkonField);
        addDialog.add(badfensterLabel);
        addDialog.add(badfensterField);
        addDialog.add(kuechenfensterLabel);
        addDialog.add(kuechenfensterField);
        addDialog.add(aufzugLabel);
        addDialog.add(aufzugField);
        addDialog.add(rollstuhleignungLabel);
        addDialog.add(rollstuhleignungField);
        addDialog.add(einbaukuecheLabel);
        addDialog.add(einbaukuecheField);
        addDialog.add(badewanneLabel);
        addDialog.add(badewanneField);
        addDialog.add(moebeliertLabel);
        addDialog.add(moebeliertField);
        addDialog.add(vermLabel);
        addDialog.add(vermField);

        addDialog.add(saveButton);
        addDialog.add(cancelButton);

        addDialog.pack();
        addDialog.setVisible(true);
    }
}
