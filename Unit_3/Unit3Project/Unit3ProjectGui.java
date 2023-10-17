/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * For help, visit: http://buckleywiley.com/forum/Code/forum.html
 * Description: Unit 3 project to summarize text difficulty and reading level.
 * Note: Not to be used as submission for project grade, external tools were used. Use the version without a gui for submission.
 */

import javax.swing.*;//Swing is a GUI widget toolkit for Java. It is part of Oracle's Java Foundation Classes – an API for providing a graphical user interface for Java programs. Swing was developed to provide a more sophisticated set of GUI components than the earlier Abstract Window Toolkit.
import java.awt.*;//Contains all of the classes for creating user interfaces and for painting graphics and images. A user interface object such as a button or a scrollbar is called, in AWT terminology, a component. The Component class is the root of all AWT components.
import java.awt.datatransfer.DataFlavor;//The DataFlavor class represents a specific data format that can be transferred between different applications or within the same application. It is used in conjunction with the Transferable interface to provide a way to transfer data between different components or applications.
import java.awt.datatransfer.Transferable;//The Transferable interface is used to represent the data that is being transferred between different components or applications. It defines a set of methods that allow the data to be retrieved in different formats, such as plain text, HTML, or a custom format.
import java.awt.dnd.DnDConstants;//The DnDConstants class defines a set of constants that are used in drag and drop operations. These constants are used to specify the type of drag and drop operation that is being performed, such as copying or moving data.
import java.awt.dnd.DropTarget;//The DropTarget class is used to define a drop target for drag and drop operations. It is typically used in conjunction with the DropTargetListener interface to handle drag and drop events.
import java.awt.dnd.DropTargetDragEvent;//The DnDDropTargetDragEvent class is used to encapsulate the information that is required to process a drag and drop operation. It defines a set of methods that are used to retrieve information about the drag and drop operation, such as the location of the drag and the type of drag and drop operation that is being performed.
import java.awt.dnd.DropTargetDropEvent;//The DropTargetDropEvent class is used to encapsulate the information that is required to process a drop event. It defines a set of methods that are used to retrieve information about the drop event, such as the location of the drop and the type of drag and drop operation that is being performed.
import java.awt.dnd.DropTargetEvent;//The DropTargetEvent class is the base class for the events that are generated when a drop occurs. It defines a set of methods that are used to retrieve information about the drop event, such as the location of the drop and the type of drag and drop operation that is being performed.
import java.awt.dnd.DropTargetListener;//The DropTargetListener interface is used to define the methods that are called when a drop occurs. It defines a set of methods that are used to handle the drop event, such as the location of the drop and the type of drag and drop operation that is being performed.
import java.io.File;//The File interface is used to represent a file or directory on the file system. It defines a set of methods that are used to retrieve information about the file or directory, such as the name, size, and last modified date.
import java.io.FileWriter;//The File Writer class is used to write data to a file. It defines a set of methods that are used to write data to a file, such as a string or an array of bytes.
import java.util.List;//The util list is used to create a list of objects. It defines a set of methods that are used to add, remove, and retrieve objects from the list.
import java.util.Scanner;//The Scanner is used to read input from the keyboard. It defines a set of methods that are used to read input from the keyboard, such as a string or an integer.

public class Unit3ProjectGui extends JFrame implements DropTargetListener {
    static int kindergartenCount = 0;
    static int elementaryCount = 0;
    static int middleSchoolCount = 0;
    static int highSchoolCount = 0;
    static int advancedCount = 0;
    static double totalCount = 0;
    static double totalWords = 0;
    static String kindergartenWords = "";
    static String elementaryWords = "";
    static String middleSchoolWords = "";
    static String highSchoolWords = "";
    static String advancedWords = "";
    private JLabel fileNameLabel;
    private JTextField fileNameField;
    private JButton browseButton;
    private JButton analyzeButton;
    private JButton saveButton;
    private JTextArea outputArea;

    /**
     * This class represents the GUI for the Text Difficulty Analyzer program. It
     * contains components for selecting a file to analyze, analyzing the text,
     * saving the output, and displaying the output. The GUI also supports drag and
     * drop functionality for selecting a file.
     * The GUI is constructed using a JFrame and various Swing components such as
     * JLabel, JTextField, JButton, and JTextArea. Action listeners are added to the
     * buttons to handle user input.
     * The GUI is set up with a BorderLayout, with the input components in the NORTH
     * region and the output component in the CENTER region.
     */
    public Unit3ProjectGui() {
        super("Text Difficulty Analyzer");

        // Set up the GUI components
        fileNameLabel = new JLabel("Enter the file name:");
        fileNameField = new JTextField(20);
        fileNameField.setEditable(false);
        browseButton = new JButton("Browse");
        analyzeButton = new JButton("Analyze");
        saveButton = new JButton("Save");
        outputArea = new JTextArea(20, 40);
        outputArea.setEditable(false);
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));

        // Add the components to the GUI
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(fileNameLabel);
        inputPanel.add(fileNameField);
        inputPanel.add(browseButton);
        inputPanel.add(analyzeButton);
        inputPanel.add(saveButton);
        inputPanel.add(exitButton);
        outputArea = new JTextArea(20, 40);
        outputArea.setEditable(false);
        outputArea.setLineWrap(true); // enable line wrapping
        outputArea.setWrapStyleWord(true); // wrap at word boundaries
        JScrollPane scrollPane = new JScrollPane(outputArea);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(inputPanel, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        // Add action listeners to the GUI components
        browseButton.addActionListener(e -> chooseFile());
        analyzeButton.addActionListener(e -> analyzeText());
        saveButton.addActionListener(e -> saveOutput());

        // Add drag and drop support to the file name field
        fileNameField.setDropTarget(new DropTarget(fileNameField, DnDConstants.ACTION_COPY_OR_MOVE, this));

        // Set up the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void dragEnter(DropTargetDragEvent e) {
        e.acceptDrag(DnDConstants.ACTION_COPY_OR_MOVE);
    }

    public void dragExit(DropTargetEvent e) {
    }

    public void dragOver(DropTargetDragEvent e) {
    }

    public void drop(DropTargetDropEvent e) {
        e.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
        Transferable transferable = e.getTransferable();
        if (transferable.isDataFlavorSupported(DataFlavor.javaFileListFlavor)) {
            /* */try {
                @SuppressWarnings("unchecked")
                List<File> files = (List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                if (files.size() > 0) {
                    fileNameField.setText(files.get(0).getAbsolutePath());
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void dropActionChanged(DropTargetDragEvent e) {
    }

    private void chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            fileNameField.setText(file.getAbsolutePath());
        }
    }

    /**
     * Analyzes the text in the file specified by the user and displays the results
     * in the output area.
     * The results include the original text, level breakdowns, words in each
     * category, total words, total characters,
     * average word length, and reading level.
     */
    private void analyzeText() {
        String fileName = fileNameField.getText();
        String text = textToString(fileName);
        outputArea.setText("");
        outputArea.append("-----------------Original Text:-----------------\n");
        outputArea.append(text + "\n");
        sort(text);
        outputArea.append("-------------------Level Breakdowns-------------------\n");
        outputArea.append("Kindergarten-Level words: " + kindergartenCount + "\n");
        outputArea.append("Elementary-Level words: " + elementaryCount + "\n");
        outputArea.append("Middle-School-Level words: " + middleSchoolCount + "\n");
        outputArea.append("High-School-Level words: " + highSchoolCount + "\n");
        outputArea.append("Advanced-Level words: " + advancedCount + "\n");
        outputArea.append("-------------------Words In Each Category -------------------\n");
        outputArea.append("-------Kindergarten-Level words:-------\n");
        outputArea.append(kindergartenWords + "\n");
        outputArea.append("-------Elementary-Level words:-------\n");
        outputArea.append(elementaryWords + "\n");
        outputArea.append("-------Middle-School-Level words:-------\n");
        outputArea.append(middleSchoolWords + "\n");
        outputArea.append("-------High-School-Level words:-------\n");
        outputArea.append(highSchoolWords + "\n");
        outputArea.append("-------Advanced-Level words:-------\n");
        outputArea.append(advancedWords + "\n");
        outputArea.append("Total words: " + totalWords + "\n");
        outputArea.append("Total Characters: " + totalCount + "\n");
        double averageLength = totalCount / totalWords;
        String readingLevel = "";
        if (averageLength <= 4) {
            readingLevel = "kindergarten";
        } else if (averageLength <= 6) {
            readingLevel = "elementary";
        } else if (averageLength <= 10) {
            readingLevel = "middle school";
        } else if (averageLength <= 14) {
            readingLevel = "high school";
        } else {
            readingLevel = "advanced";
        }
        outputArea.append("-------------------Reading Level-------------------\n");
        outputArea.append(String.format(
                "The average word length in this text is %.2f letters, so it appears to be of %s reading level\n",
                averageLength, readingLevel));
    }

    private void saveOutput() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(outputArea.getText());
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }

        return temp.trim();
    }

    public static void sort(String text) {
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char start = text.charAt(i);
            if (Character.isLetterOrDigit(start)) {
                word += start;

            } else {
                if (word.length() > 0) {
                    totalWords++;
                    totalCount += word.length();
                    if (word.length() <= 4) {
                        kindergartenCount++;
                        kindergartenWords = kindergartenWords + word + " ";
                    } else if (word.length() <= 6) {
                        elementaryCount++;
                        elementaryWords = elementaryWords + word + " ";
                    } else if (word.length() <= 10) {
                        middleSchoolCount++;
                        middleSchoolWords = middleSchoolWords + word + " ";
                    } else if (word.length() <= 14) {
                        highSchoolCount++;
                        highSchoolWords = highSchoolWords + word + " ";
                    } else {
                        advancedCount++;
                        advancedWords = advancedWords + word + " ";
                    }
                }
                word = "";
            }
        }
    }

    /**
     * The main method of the Unit3ProjectGui class.
     * It creates a new instance of the Unit3ProjectGui class and runs it on the
     * event dispatch thread.
     * 
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Unit3ProjectGui();
        });
    }
}
