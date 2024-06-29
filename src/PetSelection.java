import java.awt.*;
import javax.swing.*;

public class PetSelection extends JFrame {

    private JRadioButton dogButton;
    private JRadioButton catButton;
    private JRadioButton birdButton;
    private JRadioButton fishButton;
    private JRadioButton hamsterButton;
    private JLabel imageLabel;

    public PetSelection() {
        // Initialize the frame
        super("Pet Selection");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize the panel for radio buttons and set its layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 5));

        // Initialize and add the radio buttons to the panel
        dogButton = new JRadioButton("Dog");
        catButton = new JRadioButton("Cat");
        fishButton = new JRadioButton("Fish");
        birdButton = new JRadioButton("Bird");
        hamsterButton = new JRadioButton("Hamster");

        panel.add(dogButton);
        panel.add(catButton);
        panel.add(fishButton);
        panel.add(birdButton);
        panel.add(hamsterButton);

        // Group the radio buttons together
        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(fishButton);
        group.add(birdButton);
        group.add(hamsterButton);

        // Initialize the image label
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add the panel and image label to the frame
        add(panel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        // Add an action listener to each radio button
        dogButton.addItemListener(e -> {
            if (dogButton.isSelected()) {
                updateImage("images/dog.jpg");
            }
        });

        catButton.addItemListener(e -> {
            if (catButton.isSelected()) {
                updateImage("images/cat.jpg");
            }
        });

        fishButton.addItemListener(e -> {
            if (fishButton.isSelected()) {
                updateImage("images/fish.jpg");
            }
        });

        birdButton.addItemListener(e -> {
            if (birdButton.isSelected()) {
                updateImage("images/bird.jpg");
            }
        });

        hamsterButton.addItemListener(e -> {
            if (hamsterButton.isSelected()) {
                updateImage("images/hamster.jpg");
            }
        });

        // Set the frame to be visible
        setVisible(true);
    }

    private void updateImage(String imagePath) {
        // Load the image and update the label
        ImageIcon imageIcon = new ImageIcon(imagePath);
        imageLabel.setIcon(imageIcon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PetSelection::new);
    }
}
