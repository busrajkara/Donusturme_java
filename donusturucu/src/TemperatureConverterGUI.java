import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sıcaklık Dönüştürücü");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(panel);

        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel temperatureLabel = new JLabel("Sıcaklık:");
        temperatureLabel.setFont(new Font("Arial", Font.BOLD, 14));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.LINE_END;
        panel.add(temperatureLabel, constraints);

        JTextField temperatureText = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.LINE_START;
        panel.add(temperatureText, constraints);

        JLabel unitLabel = new JLabel("Birim:");
        unitLabel.setFont(new Font("Arial", Font.BOLD, 14));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.LINE_END;
        panel.add(unitLabel, constraints);

        String[] units = {"Celsius", "Fahrenheit", "Kelvin"};
        JComboBox<String> unitComboBox = new JComboBox<>(units);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.LINE_START;
        panel.add(unitComboBox, constraints);

        JButton convertButton = new JButton("Dönüştür");
        convertButton.setFont(new Font("Arial", Font.BOLD, 12));
        convertButton.setBackground(new Color(70, 130, 180));
        convertButton.setForeground(Color.WHITE);
        convertButton.setToolTipText("Dönüştürmek için tıklayın");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(convertButton, constraints);

        JLabel resultLabel = new JLabel("Sonuçlar:");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.LINE_START;
        panel.add(resultLabel, constraints);

        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);
        resultArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.fill = GridBagConstraints.BOTH;
        panel.add(new JScrollPane(resultArea), constraints);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = temperatureText.getText();
                String unit = (String) unitComboBox.getSelectedItem();
                try {
                    double temperature = Double.parseDouble(input);
                    String results = convertTemperature(temperature, unit);
                    resultArea.setText(results);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Lütfen geçerli bir sayı girin.");
                }
            }
        });
    }

    private static String convertTemperature(double temperature, String unit) {
        double celsius, fahrenheit, kelvin;
        StringBuilder results = new StringBuilder();

        switch (unit) {
            case "Celsius":
                celsius = temperature;
                fahrenheit = (celsius * 9/5) + 32;
                kelvin = celsius + 273.15;
                results.append(String.format("Celsius: %.2f °C\n", celsius));
                results.append(String.format("Fahrenheit: %.2f °F\n", fahrenheit));
                results.append(String.format("Kelvin: %.2f K\n", kelvin));
                break;

            case "Fahrenheit":
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5/9;
                kelvin = celsius + 273.15;
                results.append(String.format("Celsius: %.2f °C\n", celsius));
                results.append(String.format("Fahrenheit: %.2f °F\n", fahrenheit));
                results.append(String.format("Kelvin: %.2f K\n", kelvin));
                break;

            case "Kelvin":
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9/5) + 32;
                results.append(String.format("Celsius: %.2f °C\n", celsius));
                results.append(String.format("Fahrenheit: %.2f °F\n", fahrenheit));
                results.append(String.format("Kelvin: %.2f K\n", kelvin));
                break;
        }
        return results.toString();
    }
}
